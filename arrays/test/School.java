

public class School{
  public static void main(String[] args) {
    //toutes les notes
    Double notes[][];
    //les moyennes
    Double studentList[];
    Double moyenne=0.00;
    int tableau=0;

    notes=new Double[6][10];
    studentList=new Double[6];
    final int LIMIT_COLUMN=studentList.length;
    final int LIMIT_ROW=10;

    for (int i=0;i<LIMIT_COLUMN ;i++ ) {
      Double somme=0.00;
      for (int u=0;u<LIMIT_ROW ;u++ ) {
        notes[i][u]=(Math.random())*100;
        somme+=notes[i][u];
      }
      studentList[i]=somme;
    }

    for (int i=0;i<LIMIT_COLUMN ;i++ ) {
      moyenne=studentList[i]/10;
      System.out.println(moyenne);
    }

  }
}
