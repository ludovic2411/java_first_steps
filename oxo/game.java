import java.util.Scanner;

public class game{

  public static void display(char[][] array){
    System.out.println("|-|-|-|");
    System.out.println("|"+array[0][0]+"|"+array[0][1]+"|"+array[0][2]+"|");
    System.out.println("|"+array[1][0]+"|"+array[1][1]+"|"+array[1][2]+"|");
    System.out.println("|"+array[2][0]+"|"+array[2][1]+"|"+array[2][2]+"|");
    System.out.println("|-|-|-|");
  }

  public static void fill(char[][] array){
    for(int u=0;u<array.length;u++){
      for (int v=0;v<array[0].length;v++) {
        array[u][v]='-';
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    char input='a';
    char grid[][]=new char[3][3];
    int count=0;
    Boolean win=false;
    String player1="";
    String player2="";
    final char x='X';
    final char o='O';
    final int LIMIT1=grid.length;
    final int LIMIT2=grid[0].length;

    fill(grid);

    System.out.println("joueur1");
    player1=sc.nextLine();
    System.out.println("joueur2");
    player2=sc.nextLine();

    do {
      count++;
      if ((count%2)==0) {
        System.out.println(player2+" plays");
      }else {
        System.out.println(player1+" plays");
      }
      System.out.println("entrez une lettre: o ou x");
      try {
        input=sc.next().charAt(0);
        input=Character.toUpperCase(input);
        if (input ==o||input ==x) {
          System.out.println("column");
          int column=sc.nextInt();
          System.out.println("row");
          int row=sc.nextInt();
          if ((row>-1 && row<LIMIT1 && grid[row][column]=='-') || (column>-1 && column<LIMIT2&& grid[row][column]=='-')) {
              grid[row][column]=input;
              display(grid);
              if (grid[0][0]==o && grid[0][1]==x &&grid[0][2]==o) {
                win=true;
              }else if (grid[1][0]==o && grid[1][1]==x &&grid[1][2]==o) {
                win=true;
              }else if (grid[2][0]==o && grid[2][1]==x &&grid[2][2]==o) {
                win=true;
              }else if (grid[0][0]==o && grid[1][0]==x &&grid[2][0]==o) {
                win=true;
              }else if (grid[0][1]==o && grid[1][1]==x &&grid[2][1]==o) {
                win=true;
              }else if (grid[0][2]==o && grid[1][2]==x &&grid[2][2]==o) {
                win=true;
              }else if (grid[0][0]==o && grid[1][1]==x &&grid[2][2]==o) {
                win=true;
              }else if (grid[2][0]==o && grid[1][1]==x &&grid[0][2]==o) {
                win=true;
              }
              if (win&&(count%2)==0){
                System.out.println(player2+" win");
              }else if (win&&(count%2)!=0) {
                System.out.println(player1+" win");
              }
          }else {
            System.out.println("out of range");
          }
        }else {
          System.out.println("please insert x or o");
        }
      } catch(Exception e) {
        System.out.println("insert a string");
      }
    } while (!win && count<9);
  }
}
