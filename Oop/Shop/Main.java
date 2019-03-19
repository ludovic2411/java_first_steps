import magasin.Magasin;
import client.Client;
import produit.Produit;

public class Main{
    public static void main(String[] args) {
    Magasin shop=new Magasin();
    shop.insertProductNons(11,"Poudre à lessiver",16.50,16,5,false);
    shop.insertProductNons(12,"Oridanteur",1250.99,8,3,true);
    shop.insertProductCons(13, "coca", 2.50, 5, false);
    shop.insertProductCons(14,"Bananes",0.90,10,true);
    shop.insertClient("Amaury","foo@bar.com");
    //shop.displayArticles();
    //shop.displayClients();
    shop.buy("foo@bar.com","Poudre à lessiver");
    }
}
