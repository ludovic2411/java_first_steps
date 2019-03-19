package magasin;

import client.*;
import produit.*;
import java.util.*;

public class Magasin{

    private String nom;
    private double solde;
    private Hashtable <String,Client> clientList;
    private HashSet <Produit> articles;

    public Magasin(){
      this.nom="Colruyt";
      this.solde=100000.00;
      this.clientList=new Hashtable <String,Client>();
      this.articles=new HashSet();
    }

    public void insertProductCons(int reference, String libelle, double prixUnitaire, int stock,Boolean discountable){
      articles.add(new Consommable(reference, libelle, prixUnitaire, stock, discountable));
    }

    public void insertProductNons(int reference, String libelle, double prixUnitaire, int stock,int dureeVie,Boolean discountable){
      articles.add(new NonConsommable(reference,libelle,prixUnitaire,stock,dureeVie,discountable));
    }

    public void insertClient(String nom, String mail){
      Client newClient=new Client(nom,mail);
      clientList.put(newClient.getMailClient(),newClient);
    }

    public void displayClients(){
      for (Map.Entry key:this.clientList.entrySet() ) {
        System.out.println(key.getKey()+"  "+key.getValue());
      }
    }
    public void displayArticles(){
    for (Produit key :articles ) {
      System.out.println(key.getLibelle()+" prix: "+key.getPrix()+" stock:  "+key.getStock());
      }
    }
    public void buy(){
    System.out.println("buy");
    }
}
