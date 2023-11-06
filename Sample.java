import java.util.*;

class Sample {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of rows:");
    int r = sc.nextInt();
    System.out.println("enter the size of coloumns:");
    int c = sc.nextInt();
    int arr[][] = new int[r][c];
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
  }
}