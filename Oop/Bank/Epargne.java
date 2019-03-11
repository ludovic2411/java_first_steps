import java.time.LocalDate;
import java.util.*;

public class Epargne extends Account{

  Double interet;

  public Epargne(String numero,Double solde,Person titulaire){
    this.numero=numero;
    this.solde=solde;
    this.titulaire=titulaire;
  }
}
