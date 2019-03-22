package repositories;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import annotations.Champ;
import annotations.Entity;
import annotations.Except;

public class Repository<T, TKey> {
	public void create(T obj) throws IllegalArgumentException, IllegalAccessException, NoSuchMethodException, SecurityException, InvocationTargetException
	{
//		Annotation e = null;
		Entity e = null;
		List<String> listChamp = new ArrayList<>();
		List <Object> listData = new ArrayList<>();
		Class<? extends Object> type = obj.getClass();
		if(type.isAnnotationPresent(Entity.class)) {
				e = type.getAnnotation(Entity.class);
				System.out.println("coucou");

			for (Field field : type.getDeclaredFields()) {
				if (field.isAnnotationPresent(Except.class) == false) {
					if (field.isAnnotationPresent(Champ.class)) {
						Champ c = field.getAnnotation(Champ.class);
						System.out.print(c.name() + " : ");
						listChamp.add(c.name());
					}
					else {
						System.out.print(field.getName() + " : ");
						listChamp.add(field.getName());
					}
					Method method = type.getDeclaredMethod("get" + capitalize(field.getName()), null);
					System.out.println(method.invoke(obj, null));
					listData.add(method.invoke(obj, null));
				}
			}

		}

		Insert(e, listChamp, listData);

	}

	public String capitalize(String word) {
		String s = "" + word.toUpperCase().charAt(0);
		s += word.substring(1);
		return s;
	}

	public void Insert(Entity e, List<String> listChamp, List<Object> listData) {

		String insertInto = ("INSERT INTO " + e.entity() + " (" );


		for(int i = 0; i < listChamp.size(); i++) {
			if(i < listChamp.size() -1) {
				insertInto += (listChamp.get(i) + ", ");
			}else {
				insertInto += (listChamp.get(i)+ ") ");
			}
		}
		insertInto += ("\nVALUES (");
		for(int i = 0; i < listData.size(); i++) {

			if(i < listData.size() -1) {
				if(listData.get(i).getClass().equals(String.class)) {
					insertInto += ("'" + listData.get(i) + "'" + ", ");
				}else {
					insertInto += (listData.get(i) + ", ");
				}

			}else {
				if(listData.get(i).getClass().equals(String.class)) {
					insertInto += ("'" + listData.get(i) + "'" + ") ");
				}else {
					insertInto += (listData.get(i)+ ") ");
				}
			}
		}
		System.out.println(insertInto);

		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileWriter("insert.txt",true));
			pw.println(insertInto + "\n");

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		finally {
			if (pw != null) {
				pw.close();
			}
		}
	}
}
