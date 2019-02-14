import java.util.Scanner;

class Account{
  int id;
  String name;
  Double amount;

  void insert(int i,String n,Double amt){
    id=i;
    name=n;
    amount=amt;
  }

  void deposit(Double amt){
    amount+=amt;
  }

  void withdraw(Double amt){
    if (amount<amt) {
      System.out.println("You can't withdraw more money");
    }else{
      amount-=amt;
    }
  }
    void checkAmount(Double amt){
      System.out.println("You have an amount of"+amt+" on your account");
    }
    void display(){
      System.out.println("The account"+id+" made by"+name+" is provided with "+amount+" euros");
    }

  }

class TestAccount{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String choice="";
    Account account=new Account();
    Double money;

    while (!choice.equals("stop")) {
      System.out.println("which action do you want to perform?");
      choice=sc.nextLine();
      switch (choice) {
        case "create":
          System.out.println("create");
          break;
        case "add":
        System.out.println("add");
          break;
        case "withdraw":
        System.out.println("withdraw");
          break;
        case "check":
          System.out.println("check");
          break;
        case "display":
        System.out.println("display");
          break;
        default:
          System.out.println("enter a valide action: create,add,withdraw,display,check");
      }
    }

  }
}
