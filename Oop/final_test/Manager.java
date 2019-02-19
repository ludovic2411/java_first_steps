import java.util.Scanner;

class Manager{
  Double rendu;
  Double prixTotal;
  Double recetteJour;
  int nbClient;

  Manager(Double r, Double pt, Double rj, int nc){
    rendu=r;
    prixTotal=pt;
    recetteJour=rj;
    nbClient=nc;
  }

   Product [] fillList (Product [] array, String [] nameList,Double [] priceList){
    for (int i=0;i<array.length ;i++ ) {
      array[i]=new Product(i,nameList[i],priceList[i],0);
    }
    return array;
  }

  Boolean inputValidator(int id,Product [] array){
    final int RANGE=array.length;
    if (id>0 && id<RANGE) {
      return true;
    }else {
      return false;
    }
  }

  void addProduct(Product [] array){
    System.out.println("Entrez l'id du produit");
    Scanner sc=new Scanner(System.in);
    try {
      int id=sc.nextInt();
      if (inputValidator(id,array)) {
        for (int i=0;i<array.length ;i++ ) {
          if (i==id) {
            System.out.println("acheter "+array[i].name+" pour "+array[i].price+" ?");
            System.out.println("y/n pour confirmer ou annuler");
            String confirm=sc.nextLine();
            if (confirm.equals("y")) {
              prixTotal+=array[i].price;
              recetteJour+=prixTotal;
              System.out.println("produit ajouté");
              break;
            }else if(confirm.equals("n")){
              System.out.println("commande annulée");
              break;
            }
          }
        }
      }else {
        System.out.println("Aucun produit n'a l'id "+id);
      }
    } catch(Exception e) {
      System.out.println("Entrez un id valide: cela doit être un nombre entier");
    }
  }

  void display(Product [] array){
    for (Product key :array ) {
      if (key.nbAchat>0) {
        System.out.println("Vous avez acheté "+key.nbAchat+" * "+key.name+" à "+key.price+" pièce");
      }
    }
    System.out.println(prixTotal);
  }

  void clean(Product  []array){
    for (Product key :array ) {
      key.nbAchat=0;
      prixTotal=0.00;
    }
    System.out.println("client suivant");
  }
  void endDay(){
    System.out.println(nbClient+" clients reçus aujourd'hui"+" recette totale: "+recetteJour);
  }
}
