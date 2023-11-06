
/*Write a Java program to remove duplicate elements from an array.*/
import java.util.*;

class Duplicate {
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    n = sc.nextInt();
    int array[] = new int[n];
    System.out.println("Enter values of array");
    for (int p = 0; p < n; p++)
      array[p] = sc.nextInt();
    System.out.println("the  values of arraybefore removing duplicates");
    for (int i = 0; i < n; i++)
      System.out.print(" " + array[i]);

    for (int i = 0; i < n; i++) {
      int j = 0;
      for (int s = i+ 1; s < n; s++) {
        if (array[i] == array[s]) {
          for (int r = s + 1; r <= n - 1; r++)
            array[r - 1] = array[r];
          n = n - 1;
          s--;

        }

      }

    }
    System.out.println("\n after removing duplicate array elements are :");
    for (int i = 0; i < n; i++)
      System.out.print(" " + array[i]);
  }

}