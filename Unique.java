
/*Write a java program to print all unique elements in the array.*/
import java.util.*;

class Unique {
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
    System.out.println("\nthe  unique values of array is: ");
    for (int i = 0; i < n; i++) {
      int j;
      for ( j = 0; j <i; j++) 
        if (array[i] == array[j])
          break;
        if(i==j)
          System.out.print(" " + array[i]);
      

    }
  }
}
