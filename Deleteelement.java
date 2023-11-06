
/*Write a java program to delete an element from an array at a specified position*/
import java.util.*;

class Deleteelement {
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
    System.out.println("\n enter the position to delete: ");
    int pos1 = sc.nextInt();
    for (int i = pos1 + 1; i <= n - 1; i++) {
      array[i - 1] = array[i];
    }
    array[n - 1] = 0;
    System.out.println("the  values of array after deletion is: ");
    for (int i = 0; i < n; i++)
      System.out.print(" " + array[i]);

  }
}