
public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<5; i++) {
			for(int j=1; j<5-i; j++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			if(i>=1 && i<4) {
			for(int k=0; k<(2*i-1); k++) {
				System.out.print(" ");
			}
			}if(i==4)
				{			for(int k=0; k<(2*i-1); k++) {
					System.out.print("*");
				}
}
			
			if(i>0) {
				System.out.print("*");
			}
			System.out.println();
			}
		}
	}
