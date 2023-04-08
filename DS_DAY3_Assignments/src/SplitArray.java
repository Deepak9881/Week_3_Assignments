import java.util.Arrays;
import java.util.Scanner;

public class SplitArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arr[]= new int[10];
		int arr1[]= new int[5];
		int arr2[]= new int[5];
		System.out.println("Enter the array elements");
		for(int i=0; i<10; i++)
		{
			arr[i]= sc.nextInt();
		}
		
	     for(int i=0; i<10; i++) {
	    	 if(i< 5) {
	    		 arr1[i]=arr[i];
	    	 }
	    	 else {
	    		 arr2[i-5]=arr[i];
	    	 }
	     }
	     System.out.println(Arrays.toString(arr));
	     System.out.println("Array after spliting");
	     System.out.println(Arrays.toString(arr1));
	     System.out.println(Arrays.toString(arr2));
	     
	}

}
