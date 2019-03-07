import java.util.Hashtable;
import java.util.Scanner;
import java.time.LocalDate;


public class Bank{
  String nom;
  Hashtable <String, Account> comptes=new Hashtable <String, Account>() ;
  Scanner sc=new Scanner(System.in);

  public void addAccount(){
    Account newAccount;
    Person titulaire;
    String date;

    titulaire=new Person();
    System.out.println("nom du titulaire");
    titulaire.nom=sc.next();
    System.out.println("prenom du titulaire");
    titulaire.prenom=sc.next();
    System.out.println("date de naissance: yyyy-mm-dd");
    date=sc.next();
    titulaire.dateNaissance=LocalDate.parse(date);

    newAccount=new Account();
    System.out.println("numero du compte");
    newAccount.numero=sc.next();
    newAccount.titulaire=titulaire;
    System.out.println("solde");
    Double solde=sc.nextDouble();
    newAccount.solde=solde;
    System.out.println(newAccount.numero+newAccount.titulaire.nom+newAccount.titulaire.prenom);
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
