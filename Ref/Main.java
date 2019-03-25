import java.lang.reflect.Method;

public class Main{

  public static void main(String[] args) {
    Example ex=new Example();
    try {
      Class c=ex.getClass();
      System.out.println(c);
      Method meth=c.getMethod("hello");
      System.out.println(meth);
      Annotation ann=meth.getAnnotation(Annotation.class);
      System.out.println(ann);
      System.out.println(ann.i());
      System.out.println(ann.str());
    } catch(Exception e) {
      System.out.println(e);
    }

  }
}
