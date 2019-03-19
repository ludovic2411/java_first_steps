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
        //le prix de l'objet à sa création
    }

    public String getLibelle(){
      return this.libelle;
    }

    public double getPrix(){
      return this.prixUnitaire;
    }

    public  int getStock(){
      return this.stock;
    }

    public void setStock(int stock){
      this.stock=stock;
      if (this.stock<5) {
        System.out.println("renouveler le stock");
      }
    }

    public void setprix( double nouveauPrix){
      double prixOriginal=this.getPrix();
      if (nouveauPrix>prixOriginal) {
        this.prixUnitaire=nouveauPrix;
      }else {
        System.out.println("le prix doit toujours être supérieur au prix original");
      }
    }

}
