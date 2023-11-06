
/*Write a Java program to find the common elements between two arrays*/
import java.util.*;

class Commonarray {
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array1");
    n = sc.nextInt();
    int array[] = new int[n];
    System.out.println("Enter values of array1");
    for (int p = 0; p < n; p++)
      array[p] = sc.nextInt();
    System.out.println("Enter size of array2");
    int n2 = sc.nextInt();
    int array2[] = new int[n2];
    System.out.println("Enter values of array2");
    for (int p = 0; p < n2; p++)
      array2[p] = sc.nextInt();
    System.out.println("the common values of 2 arrays are \n");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
       // System.out.println(array[i]+" "+ array2[j]);
        if (array[i] == array2[j])
          System.out.println(" " + array2[j]);
      }
    }
  }
}