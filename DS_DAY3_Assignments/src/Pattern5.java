
public class Pattern5 {

	public static void main(String[] args) {

	for(int i=0; i<10; i++) {
        	 if(i<5) {
        		for(int j=0; j<i; j++) {
        			System.out.print(" ");
        		}
        		for(int k=i; k<5; k++) {
        			System.out.print("*"+" ");
        		}
        	 }
        	 else {
        		 for(int j=9-i; j>0; j--) {
        			 System.out.print(" ");
        		 }
        		 
        		 for(int k=1; k<=i-4; k++) {
        			 System.out.print("*"+" ");
        		 }
        		 }
        	 
        	 System.out.println();}
         }
	}


