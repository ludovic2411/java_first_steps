import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    String action="";
    Scanner input=new Scanner(System.in);
    String productName[]={"","banane","kiwi","chicons","aubergines","tomates",
    "pâtes","fraises","café","coca","thé",
    "vin","cigarettes","chocolat","lasagnes","ganta",
    "poisson","poivrons","sel","poivre", "saucisse"};
    Double priceList []={0.00,2.20,2.15,1.85,2.70,
    3.20,2.40,3.50,1.90,2.15,
    1.40,8.10,5.50,3.75,4.00,
    11.10,8.99,4.00,0.70,0.55,7.50};
    final int RANGE=productName.length;
    Product productList []=new Product[RANGE];
  }
}
