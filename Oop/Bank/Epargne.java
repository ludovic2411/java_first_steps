import java.time.LocalDate;
import java.util.*;

public class Epargne extends Account{

  Double interet;
  Scanner sc=new Scanner(System.in);
  //créer le titulaire
  String nom=sc.next();
  String prenom=sc.next();
  String date=sc.next();
  Person newTitulaire=new Person(nom,prenom,LocalDate.parse(date));

  public Epargne(){
    super("CV56",0,00,newTitulaire);
  }

}
