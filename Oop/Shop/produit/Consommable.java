package produit;

import java.time.*;

public class Consommable extends Produit{

    private LocalDate datePeremption;

    public Consommable(int reference, String libelle, double prixUnitaire, int stock){
        super(reference,libelle,prixUnitaire,stock);
        //date de péremption par défaut
        this.datePeremption=LocalDate.parse("2020-01-01");
    }

}
