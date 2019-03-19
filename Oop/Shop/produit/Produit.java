package produit;

public abstract class Produit{
    private int reference;
    private String libelle;
    private double prixUnitaire;
    private int stock;

    public Produit(int reference, String libelle, double prixUnitaire, int stock){
        this.libelle=libelle;
        this.reference=reference;
        this.prixUnitaire=prixUnitaire;
        this.stock=stock;
    }

}