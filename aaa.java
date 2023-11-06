import java.util.*;

class RemovingDuplicates {
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    n = sc.nextInt();
    int array[] = new int[n];
    
    RemovingDuplicates r = new RemovingDuplicates();
    System.out.println("array elements before removing duplicates");
    for (int i = 0; i < n; i++)
      System.out.println(" " + array[i]);
    r.method(array, n);
  }

  void read(int array[],int n)
  {
    System.out.println("Enter values of array");
    for (int p = 0; p < n; p++)
      array[p] = sc.nextInt();
  }
  void method(int array[], int n) {

    for (int i = 0; i < n; i++) {
      //int j = 0;
      for (int s = i + 1; s < n; s++) {
        if (array[i] == array[s]) {
          for (int r = s + 1; r <= n - 1; r++)
            array[r - 1] = array[r];
          n = n - 1;
          s--;
        }
      }
    }
    System.out.println("array elements after removing duplicates");
    for (int i = 0; i < n; i++)
      System.out.print(" " + array[i]);
  }

}
 