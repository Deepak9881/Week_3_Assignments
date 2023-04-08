package day3;

//public class accept4 {

//}
import java.util.*;
//accept 4 digits number from user and display in words
public class accept4{
Scanner sc = new Scanner(System.in);
public void accept(){
	 int i;
	 i=sc.nextInt();
	 
		 switch(i) {
	 case 1:
	 System.out.println("one");
	 break;
	 case 2:
	 System.out.println("Two");
	 break;
	 case 3:
	 System.out.println("three");
	 case 4:
	 System.out.println("four1");
	 break;
	 default:
		 System.out.println("plese input valid input ");
		 
}}
public static void main(String []args)
{
accept4 c=new accept4();
c.accept();
}
}