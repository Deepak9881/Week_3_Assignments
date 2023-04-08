import java.util.Scanner;

public class EmployeeOperation {
static int i=0;
	
	
	public static void acceptData(EmployeeService[] arr) {
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter employee details");
	    String fname= sc.nextLine();
	    String lname=sc.nextLine();
	    float sal= sc.nextFloat();
	    arr[i]= new EmployeeService(fname, lname, sal);
	    i++;
	   System.out.println("Account has been created");
		}
	
	
	
	
	}

