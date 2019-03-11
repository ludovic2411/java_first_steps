
public class Courant extends Account{
  private double credit;

  public Courant(String numero,double solde,Person titulaire,double credit){
    super(numero,solde,titulaire);
    this.credit=credit;
  }

  public double getCredit(){
    return this.credit;
  }
 

@Override
public void retrait() {
	// TODO Auto-generated method stub
	
}

}
