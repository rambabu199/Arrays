import java.util.*;

class Example2 {
  public static void main(String[] args) {
    // Dyamic array with dymanic data
    int n; // n variable to store number of elements in array
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    n = sc.nextInt();
    int array[] = new int[n];
    System.out.println("Enter values of array");
    for (int p = 0; p < n; p++)
      array[p] = sc.nextInt();
    for (int i = 0; i < n; i++)
      System.out.println("value:" + array[i]);
  }
}