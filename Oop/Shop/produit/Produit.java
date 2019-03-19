package produit;

public abstract class Produit{
    private int reference;
    private String libelle;
    private double prixUnitaire;
    private int stock;

    public Produit(){
        System.out.println("a product has been created");
    }

}