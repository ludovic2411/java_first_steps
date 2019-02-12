import java.util.Scanner;

public class jedi{
  public static Boolean findJedi(String jedis[],String name){
    Boolean isJedi=false;
    for (String key :jedis ) {
      if (key.toLowerCase().equals(name.toLowerCase())) {
        isJedi=true;
        break;
      }else{
        isJedi=false;
      }
    }
    return isJedi;
  }

  public static void main(String[] args) {
    String jedis[]={"Yoda","Obi-Wan","Windu","Qui-Gon"};
    String jedi;
    String s1;
    Boolean isJedi;
    Scanner sc=new Scanner(System.in);

    jedi=sc.nextLine();
    System.out.println(jedi);
    isJedi=findJedi(jedis, jedi);
    if (isJedi) {
      System.out.println("Bonjour maître "+jedi);
    }else if (!isJedi && jedi.equals("Anakin")) {
      System.out.println("C'est un affront que vous me faites là");
    }else{
      System.out.println("Vous n'êtes pas encore maître jedi, pas de quoi tuer des jeunes padawans pour autant");
    }

  }
}
