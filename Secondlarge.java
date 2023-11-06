/*Write a Java program to find the second largest element in an array.*/

import java.util.Scanner;

class Secondlarge {
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    n = sc.nextInt();
    int array[] = new int[n];
    System.out.println("Enter values of array");
    for (int p = 0; p < n; p++)
      array[p] = sc.nextInt();
    for (int i = 0; i < n; i++) {
      for (int s = i + 1; s < n; s++) {
        if (array[i] > array[s]) {
          int u = array[i];
          array[i] = array[s];
          array[s] = u;
        }
      }
    }
    System.out.println("the second largest element of array is: " + array[n - 2]);
  }

}