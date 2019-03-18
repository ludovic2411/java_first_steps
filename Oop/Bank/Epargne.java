import java.time.LocalDate;
import java.util.*;

public class Epargne extends Account{

  private double interet;

  public Epargne(String numero,double solde,Person titulaire,double interet){
    super(numero,solde, titulaire);
    this.interet=interet/100;
    System.out.println("compte Epargne crée");
  }

  public void retrait(double montant){
    System.out.println("U can't retrieve money with this account");
  }

  public void showInteret(){
    double sd=this.getSolde();
    double prevSd=this.getSolde();
    sd*=interet;
    prevSd+=sd;
    System.out.println("Vous gagnerez "+
    sd+" euros d'intérêts par an et aurez "+prevSd+" euro sur votre compte épargne");
  }
}
