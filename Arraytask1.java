package array;

public class Arraytask1 
{
	 public static int thirdSmallest(int[] a) {
         int temp;
         
         for (int i = 0; i < a.length; i++)
         {
            for (int j = i + 1; j < a.length; j++) 
            {
               if (a[i] > a[j])
               {
                  temp = a[i];
                  a[i] = a[j];
                  a[j] = temp;
               }
            }
         }
        
         return a[2];
      }
      public static void main(String args[]) {
         int arr[] = { 15,18,44, 12, 21, 13, 9 };
         System.out.println("Third Minimun Number in Array : " +thirdSmallest(arr));
      }

	
}
