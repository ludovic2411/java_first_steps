import animal.*;

public class Main{
  public static void main(String[] args) {
    Cat ivy=new Cat("Ivy",3,false);
    Dog rex=new Dog("rex",5,false);
    Fish blup=new Fish("hoopy",1,true);

    System.out.println(ivy.getName()+ivy.getAge());
    if (ivy.canSwim()) {
      System.out.println(ivy.getName()+" can swim");
    }else {
      System.out.println(ivy.getName()+" will sink like the Titanic");
    }

    System.out.println(rex.getName()+rex.getAge());
    if (rex.canSwim()) {
      System.out.println(rex.getName()+" can swim");
    }else {
      System.out.println(rex.getName()+" will sink like the Titanic");
    }

    System.out.println(blup.getName()+blup.getAge());
    if (blup.canSwim()) {
      System.out.println(blup.getName()+" can swim");
    }else {
      System.out.println(blup.getName()+" will sink like the Titanic");
    }


  }
}
