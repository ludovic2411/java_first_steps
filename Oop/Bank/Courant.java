import java.math.*;

public class Courant extends Account{
  private double credit;

  public Courant(String numero,double solde,Person titulaire,double credit){
    super(numero,solde,titulaire);
    this.credit=credit;
    System.out.println("compte courant crée");
  }

  public double getCredit(){
    return this.credit;
  }

public void retrait(double montant) {
  double sd=this.getSolde();
  double difference=sd-montant;
  difference=Math.abs(difference);
  if (sd>montant || this.credit>difference) {
    sd-=montant;
    System.out.println(montant+" euros ont été retirés");
    this.setSolde(sd);
  }else{
    System.out.println("you don't have enough money");
    }
	}

  public void showInteret(){
    System.out.println("this account doesn't have any interest rate");
  }

}
