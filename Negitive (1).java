import java.sql.Array;
import java.util.*;

class Negitive {
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    n = sc.nextInt();
    int array[] = new int[n];
    System.out.println("Enter values of array");
    for (int p = 0; p < n; p++)
      array[p] = sc.nextInt();
    System.out.println("the  values of array before :");
    for (int i = 0; i < n; i++)
      System.out.println(" " + array[i]);
    Negitive t = new Negitive();
    t.validate(array);
    System.out.println("the  values of array after :");
    for (int i = 0; i < n; i++)
      System.out.println(" " + array[i]);
  }

  void validate(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < 0)
        arr[i] = 0;
    }
  }

}
