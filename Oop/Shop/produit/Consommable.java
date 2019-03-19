package produit;

import java.time.*;

public class Consommable extends Produit implements Remboursable{

    private LocalDate datePeremption;
    private Boolean discountable;

    public Consommable(int reference, String libelle, double prixUnitaire, int stock,Boolean discountable){
        super(reference,libelle,prixUnitaire,stock);
        //date de péremption par défaut
        this.datePeremption=LocalDate.parse("2020-01-01");
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
