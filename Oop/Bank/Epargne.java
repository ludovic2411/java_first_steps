import java.time.LocalDate;
import java.util.*;

public class Epargne extends Account{

  double interet;

  public Epargne(String numero,double solde,Person titulaire){
    super(numero,solde, titulaire);
  }

  public void retrait(double montant){
    System.out.println("U can't retrieve money with this account");
  }
}
