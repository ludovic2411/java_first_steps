import java.util.Scanner;

public class main{
  public static void main(String[] args) {
    int answer;
    int attempts=0;
    final int MAX=5;
    String name1;
    String name2;
    Scanner sc=new Scanner(System.in);
    int guess=0;
    System.out.println("votre nom");
    name1=sc.nextLine();
    System.out.println("le nombre à deviner");
    answer=sc.nextInt();
    System.out.println("votre nom");
    name2=sc.next();
    if (answer>=1 && answer <=100) {
       while (guess!=answer&&attempts<MAX) {
         System.out.println("tapez un nombre");
         guess=sc.nextInt();
         attempts++;
         if (guess<answer) {
           System.out.println("plus grand");
         }else if (guess==answer) {
           System.out.println("Vous avez gagné en "+attempts+" tentatives par "+name2+" au nombre fixé par "+name1);
         }else {
           System.out.println("plus petit");
         }
       }
    }else{
      System.out.print("not a valid number");
    }
  }
}
