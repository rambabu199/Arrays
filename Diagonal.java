
/*Write a java program to print diagonal elements of a matrix*/
import java.util.*;

class Diagonal {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of rows:");
    int r = sc.nextInt();
    System.out.println("enter the size of coloumns:");
    int c = sc.nextInt();
    int arr[][] = new int[r][c];
    if (r == c) {
      System.out.println("enter the elements of array:");
      for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
          arr[i][j] = sc.nextInt();
        }
      }
      System.out.println("the elements of the array:");
      for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
          System.out.print(" " + arr[i][j]);
        }
        System.out.println();
      }

      System.out.println("the left diagonal elements of the array:");
      for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
          if (i == j)
            System.out.print(" " + arr[i][j]);
        }
        System.out.println();
      }
      System.out.println("the right diagonal elements of the array:");
      for (int i = 0; i < r; i++) {
        for (int j = c - 1; j >= 0; j--) {
          if (i + j == (r - 1))
            System.out.print(" " + arr[i][j]);
        }
        System.out.println();
      }
    }
  }
}
