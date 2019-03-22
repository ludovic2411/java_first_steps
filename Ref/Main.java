import java.lang.reflect.Method;

public class Main{

  public static void main(String[] args) {
    Example ex=new Example();
    try {
      Class c=ex.getClass();
      Method meth=c.getMethod("hello");
      Annotation ann=meth.getAnnotations(Annotation.class);
      System.out.println(meth);
    } catch(Exception e) {
      System.out.println(e);
    }

  }
}
