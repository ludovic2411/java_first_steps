import java.time.LocalDate;

public class Person{
  private String nom;
  private String prenom;
  private LocalDate dateNaissance;

  public Person(String nom, String prenom, LocalDate dateNaissance){
    System.out.println("personne enregistrée");
    this.nom=nom;
    this.prenom=prenom;
    this.dateNaissance=dateNaissance;
  }

  @Override
  public String toString(){
    return String.format(" Nom de la personne: %s",this.nom,this.prenom);
  }

  public String getName(){
    return this.nom;
  }

  public String getPrenom(){
      return this.prenom;
  }

  public LocalDate getDateNaissance(){
    return this.dateNaissance;
  }


}
