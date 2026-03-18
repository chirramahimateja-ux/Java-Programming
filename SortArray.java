class SortArray
{
  public static void main(String[] args)
  {
     int[] arr = {1, 6, 8, 3, 2, 5};

     for (int i = 0; i < arr.length; i++)
     {
       for (int j = i + 1; j < arr.length; j++)
       {
          if (arr[i] > arr[j])
          {
             int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
          }
       }
     }

     System.out.println("Sorted Array in Ascending Order:");

     for (int arr2 : arr)
     {
       System.out.print(arr2 + " ");
     }
  }
}
