import java.util.Scanner;

public class main{
  public static void main(String[] args) {
  int i=0;
  int somme=0;
  double moyenne=0;
  int nombreElem=0;
  int[][] tableauEntier={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
  final int LENGTH=tableauEntier.length;
  //somme =78 et moyenne=6

    for (int[]key :tableauEntier ) {
      for (int subKey :key ) {
        somme+=subKey;
        nombreElem++;
      }
    }
    moyenne=somme/nombreElem;
    System.out.println("la somme vaut "+somme+" et la moyenne vaut"+moyenne);
   }
}
