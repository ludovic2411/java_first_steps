

public class suite{
  public static void main(String[] args) {
    int suite[]=new int[25];
    final int LIMIT=suite.length;
    int somme=0;
    suite[0]=0;
    suite[1]=1;

    for (int i=2;i<LIMIT ;i++ ) {
      somme=suite[0]+suite[1];
      suite[i]=i+suite[i-1];
    }
    for (int key :suite ) {
      System.out.println(key);
    }
  }
}
