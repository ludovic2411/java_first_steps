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

  public double getSolde(){
    return this.solde;
  }

  public String getNumero(){
    return this.numero;
  }

  public double setSolde(double montant){
    return this.solde=montant;
  }

  public abstract void retrait(double montant);

}
