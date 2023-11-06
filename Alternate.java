
/*Write a java  to Print the Alternate Elements in an Array*/
///hagagsjss
///sgsuyghsbjksb
///sgbkjsb
import java.util.*;

class Alternate {
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    n = sc.nextInt();
    int array[] = new int[n];
    System.out.println("Enter values of array");
    for (int p = 0; p < n; p++)
      array[p] = sc.nextInt();
    System.out.println("the  values of array is: ");
    for (int i = 0; i < n; i++)
      System.out.print(" " + array[i]);
    System.out.println("\nthe  alternate values of array is: ");
    for (int i = 0; i < n; i = i + 2)
      System.out.print(" " + array[i]);

  }
}