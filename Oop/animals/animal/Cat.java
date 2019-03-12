package animal;


public class Cat extends Animal{

  public Cat(String name,int age,Boolean canSwim){
    super(name,age,canSwim);
  }

  public void meow(){
    System.out.println("miaou");
  }
}
