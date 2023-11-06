
/*Write a java program to count the total number of negative elements in an array.*/
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
    int count = 0;
    for (int i = 0; i < n; i++) {
      if (array[i] < 0)
        count++;
    }
    System.out.println("the count of negitive numbers in array is: " + count);
  }
}