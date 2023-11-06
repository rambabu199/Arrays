
/*Write a java program to reverse the array elements.*/
import java.util.*;

class Reverse {

  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    n = sc.nextInt();
    int array[] = new int[n];
    System.out.println("Enter values of array");
    for (int p = 0; p < n; p++)
      array[p] = sc.nextInt();    
    for(int i=0;i<n/2;i++)
      {
        int temp=array[i];
        array[i]=array[n-1-i];
        array[n-1-i]=temp;
      }
    System.out.println("reverse of array is:");
    for(int i=0;i<n;i++)
      {
        System.out.println(" "+array[i]);
      }
      
  }
}
