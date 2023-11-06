
/*Write a java program to count the total number of duplicate elements in an array.*/
import java.util.*;

class Countduplicate {
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
    int count = 0;
    for (int i = 0; i < n; i++) {
      for (int s = i + 1; s < n; s++) {
        if (array[i] == array[s]) {
          count++;
          break;
        }

      }

    }
    System.out.println("\n the count of duplicate elements in array are :" + count);
  }

}