public abstract class Account{
  private String numero;
  private double solde;
  private Person titulaire;

  public Account(String numero,Double solde,Person titulaire){
    this.numero=numero;
    this.solde=solde;
    this.titulaire=titulaire;
  }

  public void depot(double montant){
    this.solde+=montant;
  }

  double getSolde(){
    return this.solde;
  }

  public abstract void retrait();


}
