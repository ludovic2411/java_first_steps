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
    Manager manager=new Manager(0.00,0.00,0.00,0);

    productList=manager.fillList(productList,productName,priceList);
    while (!action.equals("stop")) {
      System.out.println("entrez enter pour enregistrer un nouveau client la journée et stop pour la terminer");
      action=input.next();
      if (action.equals("enter")) {
        manager.nbClient++;
        while (!action.equals("reset")) {
          System.out.println("entrez add pour ajouter un produit et reset pour passer au client suivant");
          action=input.next();
          switch (action) {
            case "add":
              manager.addProduct(productList);
            break;
            case "reset":
            manager.display(productList);
            manager.clean(productList);
            break;
            default:
              System.out.println("entrez une commande invalide: add ou reset");
            break;
          }
        }
      }else if (action.equals("stop")) {
        manager.endDay();
      }else{
        System.out.println("action invalide");
      }
    }

  }
}
