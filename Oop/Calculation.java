
class Calculation{
  void suite(){
    int suite[]=new int[10];
    int suiteAddition[]=new int[10];

    for (int i=0;i<suite.length ;i++ ) {
      suite[i]=i;
    }

    for (int i=0;i<suiteAddition.length ;i++ ) {
      suiteAddition[i]=i+(i-1);
    }
    for (int key :suiteAddition ) {
      System.out.println(key);
    }
  }
  public static void main(String[] args) {
    new Calculation().suite();

  }
}
