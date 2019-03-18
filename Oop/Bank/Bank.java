import java.time.LocalDate;
import java.util.*;



public class Bank{
  String nom;
  Hashtable <String, Account> comptes;
  Scanner sc=new Scanner(System.in);
  String typeCompte;

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
    //compte épargne ou compte courant
    System.out.println("type de compte");
    typeCompte=sc.next();
    if (typeCompte.equals("epargne")) {
      System.out.println("fixer un taux d'intérêt");
      double interet=sc.nextDouble();
      Account newAccount=new Epargne(accountNumber,solde,newTitulaire,interet);
      comptes.putIfAbsent(newAccount.getNumero(),newAccount);
      System.out.println("enregistrement terminé");
    }else if (typeCompte.equals("courant")) {
      //fixe le crédit disponible
      System.out.println("fixer le crédit possible pour ce compte");
      double credit=sc.nextDouble();
      Account newAccount=new Courant(accountNumber,solde,newTitulaire,credit);
      comptes.putIfAbsent(newAccount.getNumero(),newAccount);
      System.out.println("enregistrement terminé");
    }

  }

  public Account selectAccount(){
    System.out.println("entrez le numéro du compte");
    String numCompte=sc.next();
    return this.comptes.get(numCompte);
  }

  public void deleteAccount(){
    String id;
    System.out.println("entrez l'id du compte à supprimer");
    id=sc.next();
    comptes.remove(id);
  }

  public void addMoney(){
    //selectionne le comptes
    Account selectedAccount=this.selectAccount();
    System.out.println(selectedAccount.getNumero());
    //le montant à déposer
    System.out.println("montant à déposer");
    double montant=sc.nextDouble();
    selectedAccount.depot(montant);
    System.out.println("Vous avez maintenant "+selectedAccount.getSolde()+" sur votre compte");

  }

  public void retrieveMoney(){
    Account selectedAccount=this.selectAccount();
    //le montant à déposer
    System.out.println("montant à retirer");
    double montant=sc.nextDouble();
    selectedAccount.retrait(montant);
    System.out.println("Vous avez maintenant "+selectedAccount.getSolde()+" sur votre compte");
  }

  public void display(){
    for (Map.Entry key :this.comptes.entrySet() ) {
      System.out.println(key.getKey()+" "+key.getValue());
    }
  }

  public void showInterestRate(){
    Account selectedAccount=this.selectAccount();
    selectedAccount.showInteret();
  }

  public void showDetails(){
    Account selectedAccount=this.selectAccount();
    selectedAccount.showDetails();
  }

  @Override
  public String toString(){
    return String.format("Banque %s",this.nom);
  }
}
