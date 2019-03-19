package produit;

public class NonConsommable extends Produit implements Remboursable{
    int dureeVie;
    Boolean discountable;
    public NonConsommable(int reference, String libelle, double prixUnitaire, int stock,int dureeVie,Boolean discountable){
        super(reference,libelle,prixUnitaire,stock);
        this.dureeVie=dureeVie;
        this.discountable=discountable;
    }

    private Boolean checkDiscount(){
      return this.discountable;
    }

    public void discount(double taux){
      if (this.checkDiscount()) {
        System.out.println("discount of "+taux+" %");
        System.out.println("Payez "+this.getPrix()*taux);
      }
    }
}
