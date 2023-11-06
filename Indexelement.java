
/*Write a Java program to find the index of an array element.*/
import java.util.*;

class Indexelement {
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
    System.out.println("\n enter the value of array to find index : ");
    int d = sc.nextInt();
    for (int i = 0; i < n; i++) {
      if (array[i] == d) {
        System.out.print("\nthe index value of given" + d + "is" + i);
      } /*
         * else
         * System.out.println("value not in array");
         */
    }
  }
}