
public class Bulles{
  public static void main(String[] args) {
    Boolean modif=true;
    int tab[]={2,9,4,1,28,96,8,8,14,145,7,54,78,69,45,1,0,87,958,457,56,257,698,154,75};
    final int longTab=tab.length;

    while (modif) {
      modif=false;
      for (int i=0;i<longTab-1 ;i++ ) {
        if (tab[i]>tab[i+1]) {
          int temp=tab[i];
          tab[i]=tab[i+1];
          tab[i+1]=temp;
          modif=true;
        }
      }
    }
    for (int key :tab ) {
      System.out.println(key);
    }
  }
}
