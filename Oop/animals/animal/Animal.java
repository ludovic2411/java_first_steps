package animal;

public class Animal{
  private String name;
  private int age;
  private Boolean canSwim;
  public Animal(){
    System.out.println("animal is born");
  }
  public String getName(){
    return this.name;
  }
  public int getAge(){
    return this.age;
  }
  public Boolean canSwim(Animal animal){
    if (this.canSwim) {
      return true;
    }else {
      return false;
    }
  }
}
