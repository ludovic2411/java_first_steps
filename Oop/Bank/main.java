import java.util.Scanner;

public class main{
  public static void main(String[] args) {
    Bank banque=new Bank("dexia");
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
        String banqueNom=banque.toString();
        System.out.println(banqueNom);
      break;
      case "select":
        System.out.println("action sur le compte?: add ou retrieve ou interest");
        String subAction=input.next();
        if (subAction.equals("add")) {
          banque.addMoney();
        }else if (subAction.equals("retrieve")) {
        banque.retrieveMoney();
      }else if (subAction.equals("interest")) {
        banque.showInterestRate();
      }
      break;
      default:
        System.out.println("oups");
      break;
    }
  }
  }
}
