import java.io.*;

public class Main implements Reader,Writer,File{

  void readFile(FileInputStream i){
    System.out.println("ok");
  }
  public void writeFile(FileInputStream i){
    try {
      String [] s={"Hello","Ciao","Hola","Wilkomen"};
      for (String key :s ) {
        key+="\n";
        byte [] b=key.getBytes();
        i.write(b);
      }
      System.out.println("success from interface");
      i.close();
    } catch(Exception e) {
      System.out.println(e);
    }
  }

  public static void main(String[] args )throws FileNotFoundException{
    FileOutputStream myFile=new FileOutputStream(File.fileName);
    FileInputStream filteToRead=new FileInputStream(File.fileName);

  }

}
