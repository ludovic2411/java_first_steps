package animal;


public class Dog extends Animal{

  public Dog(String name,int age,Boolean canSwim){
    super(name,age,canSwim);
  }

  public void woof(){
    System.out.println("woof");
  }
}
