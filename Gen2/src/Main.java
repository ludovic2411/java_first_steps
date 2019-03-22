import java.lang.reflect.InvocationTargetException;

import models.Person;
import models.Sushi;
import repositories.Repository;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Repository<Person, Long> personRepo = new Repository<Person, Long>();
		Repository<Sushi, Long> sushiRepo = new Repository<Sushi, Long>();
		Person p = new Person();
		p.setId(1l);
		p.setFirstName("Bob");
		
		Sushi s1 = new Sushi();
		s1.setId(2l);
		s1.setName("Mackito");
		s1.setPrice(50.0);
		try {
			personRepo.create(p);
			System.out.println("\n-----------------------------------");
			sushiRepo.create(s1);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
