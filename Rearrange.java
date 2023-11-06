import java.util.*;

class Rearrange {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    int n = sc.nextInt();
    int array[] = new int[n];
    System.out.println("Enter values of array");
    for (int p = 0; p < n; p++) {
      if (array[p] <= 2)
        array[p] = sc.nextInt();
      else
        System.out.println("please enter below 2");
    }
    Rearrange r = new Rearrange();
    r.arrange(array);
    System.out.println("the values of array after arrange");
    for (int i = 0; i < n; i++)
      System.out.print(" " + array[i]);
  }

  void arrange(int arr[]) {
    int t = 0, o = 0, z = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 2)
        t++;
      else if (arr[i] == 1)
        o++;
      else if (arr[i] == 0)
        z++;

    }
    for (int i = 0; i < arr.length; i++) {
      if (i < t)
        arr[i] = 2;
      else if (i < t + z)
        arr[i] = 0;
      else
        arr[i] = 1;
    }
  }
}