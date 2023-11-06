
/*Write a java program to count frequency of each element in an array.*/
import java.util.*;

class Frequency {
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
    int visited[] = new int[n];
    for (int i = 0; i < n; i++)
      visited[i] = -1;

    for (int i = 0; i < n; i++) {
      int count = 1;
      for (int j = i + 1; j < n; j++) {
        if (array[i] == array[j] && visited[j] == -1) {
          count = count + 1;
          visited[j] = 0;
        }
      }
      if (visited[i] != 0)
        System.out.println("\n" + array[i] + " frequencny is " + count);
    }

  }
}
