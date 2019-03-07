import java.util.Scanner;

public class main{
  public static void main(String[] args) {
    Bank banque=new Bank();
    banque.nom="Dexia";
    String action="";
    while(!action.equals("stop")){
    Scanner input=new Scanner(System.in);
    System.out.println("action?");
     action=input.nextLine();
    switch (action) {
      case "add":
        banque.addAccount();
      break;
      case "delete":
        banque.deleteAccount();
      break;
      case "display":
        banque.display();
      break;
      default:
        System.out.println("oups");
      break;
    }
  }
  }
}
