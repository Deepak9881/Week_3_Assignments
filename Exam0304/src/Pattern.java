
public class Pattern {

	public static void main(String[] args) {
		int count=5;
		int k=0;
		for(int i=0; i<6; i++) {
			for(int j=0; j<=(2*i); j++) {
				if (j==0) {
					k=count;
					System.out.print(count);
					count--;
					continue;}
			      if(j<=(2*i)/2) {
			    	  k++;
			    	  System.out.print(k);
			      }
			      else if(j>(2*i)/2) {
			    	  k--;
			    	  System.out.print(k);
			      }
			
				}
			System.out.println();
		}

	}

}
