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
    void checkAmount(){
      System.out.println("You have an amount of"+amount+" on your account");
    }
    void display(){
      System.out.println("The account"+id+" made by"+name+" is provided with "+amount+" euros");
    }
      Boolean isRegistered(){
      if (id==0&&name==null) {
        return false;
      }else {
        return true;
      }
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
      choice=sc.nextLine().trim();
      switch (choice) {
        case "create":
          System.out.println("account number");
          int id=sc.nextInt();
          System.out.println("name");
          String name=sc.next();
          money=0.00;
          account.insert(id,name,money);
          account.display();
          break;
        case "add":
          if (account.isRegistered()) {
            System.out.println("amount");
            money=sc.nextDouble();
            account.deposit(money);
            account.checkAmount();
          }else{
            System.out.println("You must create an account before adding money");
          }
          break;
        case "withdraw":
          if (account.isRegistered()) {
            System.out.println("amount");
            money=sc.nextDouble();
            account.withdraw(money);
            account.checkAmount();
          }else{
            System.out.println("You must create an account before withdrawing money");
          }
          break;
        case "check":
          if (account.isRegistered()) {
            account.checkAmount();
          }else {
            System.out.println("You must create an account before checking money");
          }
          break;
        case "display":
          if (account.isRegistered()) {
            account.display();
          }else{
            System.out.println("You haven't created an account yet");
          }
          break;
        default:
          System.out.println("enter a valide action: create,add,withdraw,display,check");
      }
    }

  }
}
