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
      if(vitesseConducteur>vitesseMaxZone){
        difference=vitesseConducteur-vitesseMaxZone;
        //on est en infraction
        if(difference>=10 && difference<30){
          amende=53+(difference*11);
          System.out.print("Vous paierez"+amende+"euros avec une décheance de"+decheancePermis+"et un retrait "+retraitPermis);
        }else if (difference>=20 && difference<30) {
          amende=53+(difference*11);
          decheancePermis="possible de 8jours à 5 ans";
          retraitPermis="possible";
          System.out.print("Vous paierez"+amende+"euros avec une décheance de"+decheancePermis+"et un retrait "+retraitPermis);
        }else if (difference>=30){
            amende=53+(difference*11);
            decheancePermis="obligatoire de 8 jours à 5ans";
            retraitPermis="possible";
            System.out.print("Vous paierez"+amende+"euros avec une décheance de"+decheancePermis+"et un retrait "+retraitPermis);
        }else{
          //Si la différence est inférieure à 30km/h
          amende=53;
          System.out.print("Vous paierez"+amende+"euros avec une décheance de"+decheancePermis+"et un retrait "+retraitPermis);
        }
      }else{
        //en règle
        System.out.print("aucune infraction");
      }


    }else{
      //vitesse max de plus de 30
      if(vitesseConducteur>vitesseMaxZone){
        //on est en infraction
        difference=vitesseConducteur-vitesseMaxZone;
        if (difference>=10 && difference<30){
          amende=53+(difference*6);
          System.out.print("Vous paierez"+amende+"euros avec une décheance de"+decheancePermis+"et un retrait "+retraitPermis);
        }else if (difference>=30 && difference<40){
          amende=53+(difference*6);
          decheancePermis="Possible de 8 jours à 5ans";
          retraitPermis="possible";
          System.out.print("Vous paierez"+amende+"euros avec une décheance de"+decheancePermis+"et un retrait "+retraitPermis);
        }else if (difference>=40) {
          amende=53+(difference*6);
          retraitPermis="possible";
          decheancePermis="possible";
          System.out.print("Vous paierez"+amende+"euros avec une décheance de"+decheancePermis+"et un retrait "+retraitPermis);
        }else {
          amende=53;
          System.out.print("Vous paierez"+amende+"euros avec une décheance de"+decheancePermis+"et un retrait "+retraitPermis);
        }
      }else{
        System.out.print("aucune infraction");
      }
    }

  }
}
