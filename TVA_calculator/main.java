import java.util.Scanner;

public class main  {
  public static void main(String[] args) {
    final double TAUX_TVA=1.21;
    double prixHorsTVA;
    double prixTVA;
    Scanner sc=new Scanner(System.in);
    prixHorsTVA=sc.nextDouble();
    prixTVA=prixHorsTVA*TAUX_TVA;
    System.out.println(prixTVA);

  }

}
