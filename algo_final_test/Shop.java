import java.util.Scanner;

public class Shop{

  static Boolean inputValidator(int productId){
    if (productId>=1&&productId<22) {
      return true;
    }else {
      return false;
    }
  }

  void display(String productName[],Double productList[][],double recetteTotale){
    for (int i=1;i<22 ;i++ ) {
      if (productList[i][0]>0) {
        System.out.println("Vous avez acheté "+productList[i][0]+" "+productName[i]+" vous devez payer "+recetteTotale);
      }
    }
  }

  public static void main(String[] args) {
    int nbClients=0;
    //prix pour chaque client
    Double prixTotal=0.00;
    // recette du jour
    Double recetteJour=0.00;
    String action="";
    Double productList[][]=new Double[21][21];
    Scanner sc=new Scanner(System.in);
    //premier indice:prix second indice: nombre de fois acheté
    String productName[]={"","banane","kiwi","chicons","aubergines","tomates",
    "pâtes","fraises","café","coca","thé",
    "vin","cigarettes","chocolat","lasagnes","ganta",
    "poisson","poivrons","sel","poivre", "saucisse"};

    productList[0][0]=0.00;
    productList[1][0]=0.95;
     productList[2][0]=4.99;
     productList[3][0]=5.81;
     productList[4][0]=17.52;
     productList[5][0]=6.49;
     productList[6][0]=10.25;
     productList[7][0]=1.19;
     productList[8][0]=2.36;
     productList[9][0]=14.05;
     productList[10][0]=16.00;
     productList[11][0]=2.99;
     productList[12][0]=6.75;
     productList[13][0]=6.45;
     productList[14][0]=78.12;
     productList[15][0]=4.55;
     productList[16][0]=4.95;
     productList[17][0]=6.96;
     productList[18][0]=1.70;
     productList[19][0]=6.96;
     productList[20][0]=5.96;

    for (int i=0;i<21 ;i++ ) {
      productList[i][1]=0.00;
    }

    while (!action.equals("stop")) {
      System.out.println("votre action?=enter pour commencer ou stop pour arrêter");
      action=sc.nextLine();
      if (action.equals("enter")) {
        nbClients+=1;
        while(!action.equals("reset")){
          System.out.println("votre action?");
          action=sc.next();
          switch (action) {
            case "add":
              System.out.println("entrez l'id du produit");
              try {
                int choix=sc.nextInt();
                if (inputValidator(choix)) {
                  for (int i=1;i<21 ;i++ ) {
                    if (i==choix) {
                      prixTotal+=productList[i][0];
                      recetteJour+=productList[i][0];
                      productList[i][0]+=1.00;
                      System.out.println("produit ajouté");
                      break;
                    }
                  }
                }else{
                  System.out.println("pas d'article avec l'id "+choix);
                }
              } catch(Exception e) {
                System.out.println("entrez un id valide");
              }
              break;
            case "reset":
              System.out.println("reset");
              break;
              default:
                System.out.println("action non valide");
                break;
          }
        }
      } else if (action.equals("stop")) {
        System.out.println("fin de la journée");
      }
    }
  }
}
