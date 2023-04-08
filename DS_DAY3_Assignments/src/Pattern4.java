
public class Pattern4 {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i%2==0 &&j==0 ) {System.out.print("1"+" ");continue;}
				else if(i%2!=0 && j==0) {System.out.print("0"+" ");continue;}
				 if(i%2==0)
					 { if( j>0 && j%2!=0)
				{System.out.print("0"+" ");
			}
				else if(j>0 && j%2==0) {
					System.out.print("1"+" ");
				}
					 }
				 else {if( j>0 && j%2!=0)
					{System.out.print("1"+" ");
					}
						else if(j>0 && j%2==0) {
							System.out.print("0"+" ");
						}
							
					 
				 }
				}
			System.out.println();
		}

	}

}
