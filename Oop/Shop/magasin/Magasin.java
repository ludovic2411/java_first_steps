package magasin;

import client.*;
import produit.*;
import java.util.Hashtable;

public class Magasin{

    private String nom;
    private double solde;
    private Hashtable <String,Client> clientList=new Hashtable <String,Client>();
    private Hashtable <String, Produit> articles=new Hashtable <String,Produit>();

    public Magasin(){

    }
}
