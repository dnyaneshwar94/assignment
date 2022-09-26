package array;

public class Arraytask6
{
	 public static void avgOfNum(int arr[], int n)
	 {
	        double sum = 0;
	        for (int i = 0; i + 1 < n; i++)
	        {
	        	sum = arr[i] + arr[i + 1];
	            double avg = sum / 2;
	            System.out.print(avg + " , ");
	        }
	    }

	   public static void main(String[] args)
	   {
	       int arr[] = { 20, 10, 40, 30, 25 };
	       int n = arr.length;
	       avgOfNum(arr, n);
	    }

}
