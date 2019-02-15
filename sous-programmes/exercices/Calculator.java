import java.util.Scanner;

public class Calculator{

   static Double sum(Double a,Double b){
    return a+b;
  }

   static Double sub(Double a,Double b){
    return a-b;
  }

  static Double mult(Double a, Double b){
    return a*b;
  }

  static Double div(Double a, Double b){
    return a/b;
  }

  public static void main(String[] args) {
    String action="";
    Double firstArg;
    Double secondArg;
    Scanner sc=new Scanner(System.in);
    Double result=0.00;
    System.out.println("Calculator on");

    while (!action.equals("close")) {
      System.out.println("select an action");
      action=sc.nextLine();
      switch (action) {
        case "add":
          System.out.println("first arg");
          firstArg=sc.nextDouble();
          System.out.println("second arg");
          secondArg=sc.nextDouble();
          result=sum(firstArg,secondArg);
        break;
        case "sub":
          System.out.println("first arg");
          firstArg=sc.nextDouble();
          System.out.println("second arg");
          secondArg=sc.nextDouble();
          result=sub(firstArg,secondArg);
        break;
        case "mult":
          System.out.println("first arg");
          firstArg=sc.nextDouble();
          System.out.println("second arg");
          secondArg=sc.nextDouble();
          result=mult(firstArg,secondArg);
        break;
        case "div":
          System.out.println("first arg");
          firstArg=sc.nextDouble();
          System.out.println("second arg");
          secondArg=sc.nextDouble();
          result=div(firstArg,secondArg);
        break;
        default:
          System.out.println("select a valid action");
        break;
      }
      System.out.println(result);
    }

  }
}
