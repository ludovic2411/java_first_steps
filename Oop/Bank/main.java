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
        switch (subAction) {
          case "add":
            banque.addMoney();
          break;
          case "retrieve":
            banque.retrieveMoney();
          break;
          case "interest":
            banque.showInterestRate();
          break;
          default:
            System.out.println("unknown command");
          break;
        }
      break;
      default:
        System.out.println("oups");
      break;
    }
  }
  }
}
