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
