
public class Courant extends Account{
  private double credit;

  public Courant(String numero,double solde,Person titulaire,double credit){
    super(numero,solde,titulaire);
    this.credit=credit;
  }

  public double getCredit(){
    return this.credit;
  }

public void retrait(double montant) {
  double sd=this.getSolde();
  sd-=montant;
  System.out.println(montant+" euros ont été retirés");
  this.setSolde(sd);
	}

}
