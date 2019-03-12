package animal;

public class Animal{
  private String name;
  private int age;
  private Boolean canSwim;
  public Animal(String name,int age,Boolean canSwim){
    this.name=name;
    this.age=age;
    this.canSwim=canSwim;
  }
  public String getName(){
    return this.name;
  }
  public int getAge(){
    return this.age;
  }
  public Boolean canSwim(){
    if (this.canSwim) {
      return true;
    }else {
      return false;
    }
  }
}
