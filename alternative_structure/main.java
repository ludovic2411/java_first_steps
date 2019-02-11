import java.util.Scanner;


public class main{
  public static void main(String[] args) {
    Boolean majeur;
    final int ageMin=18;
    int age;
    Scanner sc=new Scanner(System.in);
    System.out.print("Votre âge?");
    age=sc.nextInt();
    Boolean ageCorrect=(age>=ageMin)? true:false;
    System.out.println(ageCorrect);

  }
}
