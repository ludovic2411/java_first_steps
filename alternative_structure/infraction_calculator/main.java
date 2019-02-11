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
        difference=vitesseConducteur-vitesseMaxZone;
        //on est en infraction
        if(difference>10 && difference<30){
          amende=53+(difference*11);
        }else if (difference>=20 && difference<30) {
          amende=53+(difference*11);
          decheancePermis="possible de 8jours à 5 ans";
          retraitPermis="possible";
        }else if (difference>=30){
            amende=53+(difference*11);
            decheancePermis="obligatoire de 8 jours à 5ans";
            retraitPermis="possible";
        }else{
          //Si la différence est inférieure à 30km/h
          amende=53;
        }
      }else{
        //en règle
        System.out.print("aucune infraction");
      }


    }else{
      //vitesse max de plus de 30
      if(vitesseConducteur>=vitesseMaxZone){
        //on est en infraction
        difference=vitesseConducteur-vitesseMaxZone;
      }else{
        System.out.print("aucune infraction");
      }
    }

  }
}
