import java.lang.*;  //import statements...
import  java.lang.annotation.Retention;  // import  Retention of annotation class
import java.lang.annotation.RetentionPolicy; // import  RetentionPolicy of annotation class
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
public @interface Annotation{
  String str();
  int i();
}
