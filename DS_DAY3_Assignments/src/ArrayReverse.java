import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arr[]= new int[10];
		int arr1[]= new int[10];
		System.out.println("Enter the array elements");
		for(int i=0; i<10; i++)
		{
			arr[i]= sc.nextInt();
		}
		int count =9;
		for(int i=0; i<10; i++)
		{ 
			arr1[count]=arr[i];
		    count--;
		}
		
	System.out.println(Arrays.toString(arr1));



	}

}
