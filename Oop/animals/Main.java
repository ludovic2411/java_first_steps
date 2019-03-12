import animal.*;

public class Main{
  public static void main(String[] args) {
    Cat ivy=new Cat();
    Dog rex=new Dog();
    Fish blup=new Fish();

    ivy.meow();
    rex.woof();
    System.out.println(blup.blub());

  }
}
