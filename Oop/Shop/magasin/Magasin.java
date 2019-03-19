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
}
