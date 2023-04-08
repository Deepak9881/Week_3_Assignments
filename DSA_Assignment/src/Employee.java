import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeService [] em= new EmployeeService [10];
		System.out.println("Welcome to Canara Bank!!!"+"\n\n"+"1) Create Employee  \r\n" + 
				"2) display Employee Data \r\n" + 
				"3) sortEmployee depend on sal \r\n" + 
				"4) sortEmployee depend on firstname\r\n" + 
				"5) sortEmployee depend on lastname \r\n" + 
				"6) Delete Employee by id  switch remaining elements to left");
		
		System.out.println("Enter the number of operation to be performed");
		int num=sc.nextInt();
		
		switch(num) {
		case 1: 
		}
	}

}

