import java.util.Arrays;

public class SortNumber{

  static int []sortArray(int array[]){
     Arrays.sort(array);
     return array;
  }

  public static void main(String[] args) {
    int myArray[]={4,90,12,22,-6,115,16};
    System.out.println(myArray);
    myArray=sortArray(myArray);
    for (int key :myArray ) {
      System.out.println(key);
    }
  }
}
