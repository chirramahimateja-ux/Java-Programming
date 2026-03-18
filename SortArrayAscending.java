import java.util.*;
public class SortArrayAscending
{
   public static void main(String[] args)
   {
     int[] arr = {5, 2, 9, 1, 7};

     System.out.println("Original Array: " + Arrays.toString(arr));

     Arrays.sort(arr);

     System.out.println("Sorted Array (Ascending): " + Arrays.toString(arr));
   }
}
