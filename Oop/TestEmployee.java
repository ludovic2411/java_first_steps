import java.util.Scanner;

class Employee{
  int id;
  String name;
  Double salary;

  void insertRecord(int i, String n, Double s){
    id=i;
    name=n;
    salary=s;
  }
  void displayrecord(){
    System.out.println("Voici "+name+" qui gagne "+salary+" par mois"+", il a l'id"+id);
  }
}

class TestEmployee{
  public static void main(String[] args) {
    String personnal[]={"lagertha","Ivar","Alfred"};
    Employee team[]=new Employee[3];
    final int LENGTH=personnal.length;
    Scanner sc=new Scanner(System.in);

    for(int i=0;i<LENGTH;i++){
      team[i]=new Employee();
      System.out.println("salary for employee nr"+i);
      Double new_salary=sc.nextDouble();
      team[i].insertRecord(i,personnal[i],new_salary);
    }
    for (Employee key :team ) {
      key.displayrecord();
    }
  }
}
