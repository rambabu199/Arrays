import java.sql.Array;
import java.util.*;
 
class Test1 {
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    n = sc.nextInt();
    int array[] = new int[n];
    System.out.println("Enter values of array");
    for (int p = 0; p < n; p++)
      array[p] = sc.nextInt();
    Test1 t = new Test1();
    for (int i = 0; i < n; i++)
      System.out.println(" " + array[i]);
    
      t.reverse(array);  //   just we sending array i.e starting address
    for (int i = 0; i < n; i++)
      System.out.print(" " + array[i]);
  }
void reverse(int arr[])
  {
    // to know no of elements in an array
    // operator---> length  used for arrays
    // arrayname.length
    //length()--> used of string
    for(int i=0;i<arr.length/2;i++)
      {
        int h=arr[i];
        arr[i]=arr[arr.length-1-i];   // n-1-i
        arr[arr.length-1-i]=h;
      }
   // for(i=0;i<arr.length;i++)
    //System.out.print(" " + arra[i]);
  }
 
}
  import java.sql.Array;
import java.util.*;
 
class Test1 {
  public static void main(String[] args) {
    Test1 t = new Test1();
    t.read();// controller transfer to line 14 i.e read()
  }
 
  void read() {
    Test1 t1 = new Test1();
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    n = sc.nextInt();
    int array[] = new int[n];
    System.out.println("Enter values of array");
    for (int p = 0; p < n; p++)
      array[p] = sc.nextInt();
 
    t1.display(array); // controller transfer to line 48 i.e display()
 
    t1.reverse(array); // just we sending array i.e starting address
 
    // this line transfer controller to line no 34
    t1.display(array);// controller transfer to line 48 i.e display()
 
  }
 
  void reverse(int arr[]) {
    // to know no of elements in an array
    // operator---> length used for arrays
    // arrayname.length
    // length()--> used of string
    for (int i = 0; i < arr.length / 2; i++) {
      int h = arr[i];
      arr[i] = arr[arr.length - 1 - i]; // n-1-i
      arr[arr.length - 1 - i] = h;
    }
    // for(i=0;i<arr.length;i++)
    // System.out.print(" " + arra[i]);
  }
 
  void display(int h[]) {
    for (int i = 0; i < h.length; i++)
      System.out.print(" " + h[i]);
  }
}

import java.sql.Array;
import java.util.*;
 
class Test1 {
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    n = sc.nextInt();
    int array[] = new int[n];
    System.out.println("Enter values of array");
    for (int p = 0; p < n; p++)
      array[p] = sc.nextInt();
    Test1 t = new Test1();
    for (int i = 0; i < n; i++)
      System.out.println(" " + array[i]);
    
      t.reverse(array);  //   just we sending array i.e starting address
    for (int i = 0; i < n; i++)
      System.out.print(" " + array[i]);
  }
void reverse(int arr[])
  {
    // to know no of elements in an array
    // operator---> length  used for arrays
    // arrayname.length
    //length()--> used of string
    for(int i=0;i<arr.length/2;i++)
      {
        int h=arr[i];
        arr[i]=arr[arr.length-1-i];   // n-1-i
        arr[arr.length-1-i]=h;
      }
   // for(i=0;i<arr.length;i++)
    //System.out.print(" " + arra[i]);
  }
 
}