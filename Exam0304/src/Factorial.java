
public class Factorial {
  
	
	public static void fact(int i) {
		int fact=1;
		int j=i;
		if(i==1) {
			System.out.println("Factorial of "+ i+ " is: "+fact);
		} else {
		while(j>1) {
			fact= fact*j;
			j--;
		}
		System.out.println("Factorial of "+ i+ " is: "+fact);
		}
		
	}
	public static void main(String[] args) {
		
	  for(int i=1; i<=10; i++) {
		  fact(i);
	  }

	}
  
}
