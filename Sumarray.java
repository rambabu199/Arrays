
/*Write a java program to find the sum of all array elements*/
import java.util.*;

class Sumarray {

  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    n = sc.nextInt();
    int array[] = new int[n];
    System.out.println("Enter values of array");
    for (int p = 0; p < n; p++)
      array[p] = sc.nextInt();
    int sum=0;
    for(int i=0;i<n;i++)
      sum=sum+array[i];
    System.out.println("the sum of all elements in array="+sum);
  }
}
