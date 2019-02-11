import java.util.Scanner;

public class main{
  public static void main(String[] args) {
    int vitesseConducteur;
    int vitesseMaxZone;
    int amende;
    int difference;
    String decheancePermis="rien";
    String retraitPermis="rien";
    Scanner sc=new Scanner(System.in);

    System.out.print("Vitesse du conducteur");
    vitesseConducteur=sc.nextInt();
    System.out.print("vitesse autorisée");
    vitesseMaxZone=sc.nextInt();

    if (vitesseMaxZone==30) {
      //zone30
      if(vitesseConducteur>=vitesseMaxZone){
        System.out.print("infraction");
      }else{
        System.out.print("aucune infraction");
      }


    }else{
      //vitesse max de plus de 30
      if(vitesseConducteur>=vitesseMaxZone){
        System.out.print("infraction");
      }else{
        System.out.print("aucune infraction");
      }
    }

  }
}
