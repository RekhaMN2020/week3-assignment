//Assignment 3
package week3.assignments;
import java.util.Arrays;
public class MissingElementInArray {
public static void main(String[] args) {
	
			// Here is the input
			int[] arr = {1,2,3,4,7,6,8};

			// Sort the array	
			
			Arrays.sort(arr);
			
			int a=arr.length;
			// loop through the array (start i from arr[0] till the length of the array)
			for(int i=0;i<a-1;i++)
			{
				if(arr[i+1]-arr[i]!=1)
				{
					System.out.print("The missing number from the array list is"+" ");
					System.out.println(arr[i]+1);
				}
			
			}				
}
}
