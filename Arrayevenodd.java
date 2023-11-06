//Write the java program to rearrange array elements like place all odd numbers first and then even numbers
 
import java.util.*;
 
class Oddeven
  {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Declare the array size");
      int n=sc.nextInt();
      Oddeven eve=new Oddeven();
      System.out.println("Enter the array elements");
      int a[]=new int[n];
      int i;
      for(i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("Array elements before arrangement");
      for(i=0;i<n;i++)
        {
          System.out.println(a[i]);
        }
      eve.oddeve(a);
      System.out.println("Array elements after arrangement is");
      for(i=0;i<n;i++)
        {
          System.out.println(a[i]);
        }
    }
    void oddeve(int b[])
    {
      int even=b.length-1;
      int odd=0;
      int c[]=new int[b.length];
      for(int k=0;k<b.length;k++)
        {
          if((b[k]%2)==0)
          {
            c[even]=b[k];
            even--;
          }
          if((b[k]%2)!=0)
          {
            c[odd]=b[k];
            odd++;
          }
        }
      for(int k=0;k<b.length;k++)
        {
          b[k]=c[k];
        }
    }
  }