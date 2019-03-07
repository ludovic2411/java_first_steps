import java.util.Hashtable;
import java.util.Scanner;
import java.time.LocalDate;



public class Bank{
  String nom;
  Hashtable <String, Account> comptes;
  Scanner sc=new Scanner(System.in);

  public Bank(String nom){
    this.nom=nom;
    this.comptes=new Hashtable <String, Account>();
  }

  public void addAccount(){

    //créer le titulaire
    System.out.println("nom du titulaire");
    String nom=sc.next();
    System.out.println("prenom du titulaire");
    String prenom=sc.next();
    System.out.println("date de naissance: yyyy-mm-dd");
    String date=sc.next();
    Person newTitulaire=new Person(nom,prenom,LocalDate.parse(date));
    //création du compte
    System.out.println("numero du compte");
    String accountNumber=sc.next();
    Double solde=0.00;
    Account newAccount=new Account(accountNumber,solde,newTitulaire);
    comptes.put(newAccount.numero,newAccount);
    System.out.println("enregistrement terminé");

  }

  public void deleteAccount(){
    String id;
    System.out.println("entrez l'id du compte à supprimer");
    id=sc.next();
    comptes.remove(id);
  }

  public void display(){
    System.out.println(comptes);
  }
}
