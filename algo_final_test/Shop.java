import java.util.Scanner;

public class Shop{
  public static void main(String[] args) {
    int nbClients=0;
    Double prixTotal=0.00;
    String action;
    Double productList[][]=new Double[21][21];
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

    for (int i=0;i<22 ;i++ ) {
      productList[i][1]=0.00;
    }
  }
}
