
/*Write a java program to calculate Sum of Two matrices*/
import java.util.*;

class Sumof2Matrix {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the  rows in Matrix1 :");
    int r1 = sc.nextInt();
    System.out.println("enter the coloumns in Matrix1:");
    int c1 = sc.nextInt();
    System.out.println("enter the  rows in Matrix1:");
    int r2 = sc.nextInt();
    System.out.println("enter the coloumns in Matrix1:");
    int c2 = sc.nextInt();
    int arr1[][] = new int[r1][c1];
    int arr2[][] = new int[r2][c2];
    if (r1 == r2 && c1 == c2) {
      System.out.println("enter the elements of 1st Matrix:");
      for (int i = 0; i < r1; i++) {
        for (int j = 0; j < c1; j++) {
          arr1[i][j] = sc.nextInt();
        }
      }
      System.out.println("enter the elements of 2nd Matrix:");
      for (int i = 0; i < r2; i++) {
        for (int j = 0; j < c2; j++) {
          arr2[i][j] = sc.nextInt();
        }
      }
      System.out.println("the elements of the 1st Matrix:");
      for (int i = 0; i < r1; i++) {
        for (int j = 0; j < c1; j++) {
          System.out.print(" " + arr1[i][j]);
        }
        System.out.println();
      }
      System.out.println("the elements of the 2nd Matrix:");
      for (int i = 0; i < r2; i++) {
        for (int j = 0; j < c2; j++) {
          System.out.print(" " + arr2[i][j]);
        }
        System.out.println();
      }
      int arr3[][] = new int[r1][c1];
      for (int i = 0; i < r1; i++) {
        for (int j = 0; j < c1; j++) {
          arr3[i][j] = arr1[i][j] + arr2[i][j];
        }
      }
      System.out.println("the elements in 3rd matrix:");
      for (int i = 0; i < r1; i++) {
        for (int j = 0; j < c1; j++) {
          System.out.print(" " + arr3[i][j]);
        }
        System.out.println();
      }
    }
  }
}
