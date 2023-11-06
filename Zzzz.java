import java.util.Scanner;

class Zzzz {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number of rows");
    int r = sc.nextInt();
    System.out.println("enter number of columns");
    int c = sc.nextInt();

    System.out.println("enetr the elements of an array");
    int array[][] = new int[r][c];
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; c++) {
        array[i][j] = sc.nextInt();
      }
    }
    System.out.println("the elements of an array are");
    // output
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }

  }
}