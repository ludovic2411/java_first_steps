package produit;

public class NonConsommable extends Produit{
    int dureeVie;
    public NonConsommable(int reference, String libelle, double prixUnitaire, int stock,int dureeVie){
        super(reference,libelle,prixUnitaire,stock);
        this.dureeVie=dureeVie;
    }
}
