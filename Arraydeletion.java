import java.util.*;
class Arraydeletion{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the size of array");
    int n=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<=n-1;i++)
      arr[i]=s.nextInt();
    for(int i=0;i<=n-1;i++)
     System.out.print(arr[i]);
    System.out.println();
    System.out.println("enter the postion to delete");
    int pos=s.nextInt();
    for(int k=pos;k<n-1;k++)
      arr[k]=arr[k+1];
    for(int i=0;i<=n-2;i++)
     System.out.print(arr[i]);
  }
}