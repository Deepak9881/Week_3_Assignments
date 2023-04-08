import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String name, role;
		int wickets;
		Player arr[]= new Player[2];
		System.out.println("Enter the player details");
		for(int i=0; i<2; i++) {
			System.out.println("Enter name");
			name= sc.nextLine();
			System.out.println("Enter the no of wickets");
			wickets= sc.nextInt();
			sc.nextLine();
			System.out.println("Entet the role of player");
			role= sc.nextLine();
			arr[i]= new Player( name, wickets, role);
		}
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		if(arr[0].wickets>arr[1].wickets) {
			System.out.println(arr[0].name);
		}	
		System.out.println(arr[1].name);

	}

}
