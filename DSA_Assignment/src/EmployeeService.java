
public class EmployeeService {
	static int empId;
    String fname, lname;
	float sal;
	
	static int count=0;
	
	
	static{
		count+=1;
	   empId=count;
	}

	
	
	public EmployeeService(String fname, String lname, float sal) {
		this.empId= count;
		this.fname = fname;
		this.lname = lname;
		this.sal = sal;
	}



	
	
	




	@Override
	public String toString() {
		return "EmployeeService [fname=" + fname + ", lname=" + lname + ", sal=" + sal + "]";
	}
	
	


}
