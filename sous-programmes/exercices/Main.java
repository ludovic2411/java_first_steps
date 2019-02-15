
class Main {
   public static void main(String[] args){
      String tabChaine[] = {"Bonjour", "Guten Tag", "Hello", "Namaskar", "Annyong haseyo", "Hej", "Buenos días", "Kalimera", "Aloha", "Konnichi wa", "Ave", "Goede morgen"};
      int longChaine[];
      int longMot;
      final int SIZE=tabChaine.length;
      longChaine=new int[SIZE];
      for (int i=0;i<SIZE ;i++ ) {
        longMot=calculNombreCaracteres(tabChaine[i]);
        longChaine[i]=longMot;
        System.out.println(longChaine[i]);
      }


   }

   public static int calculNombreCaracteres (String chaineChar){
      int longueurChaine = chaineChar.length();
      return longueurChaine;
   }
}
