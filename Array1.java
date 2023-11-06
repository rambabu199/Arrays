class Array1 {

  public static void main(String args[]) {
    int arr[] = { 22, 35, 44, 13 };
    Array1 obj = new Array1();

    for (int i = 0; i < 4; i++)
      System.out.print(arr[i]);
    obj.derive(arr, 4);
  }

  void derive(int arr[], int s) {
    for (int m = 0; m < s; m++)
      arr[m] = arr[m] * 2;
    for (int n = 0; n < s; n++)
      System.out.print(arr[n]);
  }
}