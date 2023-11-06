//import java.sql.Array;
import java.util.Scanner;

class Test1 {
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    n = sc.nextInt();
    int array[] = new int[n];
    System.out.println("Enter values of array");
    for (int p = 0; p < n; p++)
      array[p] = sc.nextInt();
    System.out.println("the  values of array befor sorting is: ");
    for (int i = 0; i < n; i++)
      System.out.print(" " + array[i]);

    for (int i = 0; i < n; i++) /// noi of cycles / iteration
    {
      for (int s = i + 1; s < n - 1; s++) {
        if (array[i] > array[s]) {
          int u = array[i];
          array[i] = array[s];
          array[s] = u;
        }
      }
    }
    System.out.println("after soritng array elements are :");
    for (int i = 0; i < n; i++)
      System.out.print(" " + array[i]);
  }

}