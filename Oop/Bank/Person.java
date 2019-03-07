import java.time.LocalDate;

public class Person{
  String nom;
  String prenom;
  LocalDate dateNaissance;

  public Person(String nom, String prenom, LocalDate dateNaissance){
    System.out.println("construct");
    this.nom=nom;
    this.prenom=prenom;
    this.dateNaissance=dateNaissance;
  }


}
