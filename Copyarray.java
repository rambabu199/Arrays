
/*Write a java program to copy all elements from one array to another array. */
import java.util.*;

class Copyarray {

  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    n = sc.nextInt();
    int array[] = new int[n];
    System.out.println("Enter values of array");
    for (int p = 0; p < n; p++)
      array[p] = sc.nextInt();
    int array2[] = new int[n];
    for (int i = 0; i < n; i++)
      array2[i] = array[i];
    System.out.println("the  values of array1 :");
    for (int i = 0; i < n; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println("\nthe  values of array2 :");
    for (int i = 0; i < n; i++) {
      System.out.print(array2[i] + " ");
    }

  }
}