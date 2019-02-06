import java.util.Scanner;

public class main  {

  public static void main(String[] args) {
    String forme;
    double aire=0,perimetre=0,cote1=0,cote2=0,cote3=0,base=0,hauteur=0;
    Boolean equilateral;
    Scanner sc=new Scanner(System.in);


    System.out.println("la forme");
    forme=sc.nextLine();

    switch (forme) {
      case "carre":
        System.out.println("la base?");
        base=sc.nextDouble();
        hauteur=base;
        aire=base*hauteur;;
        perimetre=base*4;
        break;
      case "triangle":
        System.out.println("la base?");
        base=sc.nextDouble();
        System.out.println("la hauteur?");
        hauteur=sc.nextDouble();
        aire=(base*hauteur)/2;
        System.out.println("Equilatéral?");
        equilateral=sc.nextBoolean();
        if (equilateral==true) {
          forme="triangle équilatéral";
          perimetre=base*3;
        }else{
          System.out.println("côté 1");
          cote1=sc.nextDouble();
          System.out.println("côté2");
          cote2=sc.nextDouble();
          System.out.println("côté3");
          cote3=sc.nextDouble();
          perimetre=cote1+cote2+cote3;
        }
        break;
      case "rectangle":
        System.out.println("la base?");
        base=sc.nextDouble();
        System.out.println("la hauteur?");
        hauteur=sc.nextDouble();
        aire=base*hauteur;;
        perimetre=(base+hauteur)*2;
        break;
      default:
        System.out.println("error");

    }
    System.out.println("Le "+forme+" a une aire de "+aire+" et un périmètre de "+perimetre);
  }

}
