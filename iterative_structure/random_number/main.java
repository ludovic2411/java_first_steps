import java.util.Scanner;

public class main{
  public static void main(String[] args) {
    int answer;
    int attempts=0;
    Scanner sc=new Scanner(System.in);
    int guess=0;
    answer=sc.nextInt();
    if (answer>=1 && answer <=100) {
      guess=sc.nextInt();
       while (guess!=answer) {
         System.out.println("tapez un nombre");
         attempts++;
         if (guess<answer) {
           System.out.println("plus grand");
         }else if (guess==answer) {
           System.out.println("Vous avez gagné en "+attempts+" tentatives");
         }else {
           System.out.println("plus petit");
         }
       }
    }else{
      System.out.print("not a valid number");
    }
  }
}
