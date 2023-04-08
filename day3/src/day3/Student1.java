import java.util.Scanner;
//package day3;

public class Student1 
{
	int temp=0;
int m1, m2, m3;
String Name;
Scanner sc= new Scanner(System.in);

public void DataEntry()
{	
	System.out.println("Enter Name");
	Name=sc.next();	
	System.out.println("Enter Marks of m1");
	m1=sc.nextInt();
	if(m1>temp)
	{
	
	}
	else {
		System.out.println("Please provide +ve Marks");
		
	}
	System.out.println("Enter Marks of m2");
	m2=sc.nextInt();
	System.out.println("Enter Marks of m3");
	m3=sc.nextInt();
}
public void Avg()
{
	int avg;
	avg=(m1+m2+m3)/3;
	System.out.println("Average is"+avg);
}
public static void main(String []args)
{
	Student1 s = new Student1();
	s.DataEntry();
	s.Avg();
	

}




}