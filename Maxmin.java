
/*Write a Java program to find the maximum and minimum elements in an array.*/
import java.util.*;

class Maxmin {

  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    n = sc.nextInt();
    int array[] = new int[n];
    System.out.println("Enter values of array");
    for (int p = 0; p <= n-1; p++)
      array[p] = sc.nextInt();
    int max = array[0];
    int min = array[0];
    //System.out.println("the ");
    for (int i = 1; i < n; i++) {
      if (array[i] > max)
        max = array[i];
      else if (array[i] < min)
        min = array[i];

    }
    System.out.println("the minimun value in the array is " + min);
    System.out.println("the maximun value in the array is " + max);

  }
}