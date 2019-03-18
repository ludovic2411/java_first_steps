import java.time.LocalDate;
import java.util.*;

public class Epargne extends Account{

  double interet;

  public Epargne(String numero,double solde,Person titulaire){
    super(numero,solde, titulaire);
    System.out.println("compte Epargne crée");
  }

  public void retrait(double montant){
    System.out.println("U can't retrieve money with this account");
  }

  public void showInteret(){
    interet=0.0025;
    double sd=this.getSolde();
    double prevSd=this.getSolde();
    sd*=interet;
    prevSd+=sd;
    System.out.println("Vous gagnerez "+
    sd+"d'intérêts par an et aurez "+prevSd+"sur votre compte épargne");
  }
}
