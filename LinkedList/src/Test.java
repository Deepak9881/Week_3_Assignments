
public class Test {

	public static void main(String[] args) {
			
		LinkedList l = new LinkedList();  // l zero  
		
		l.insertNode(15); 
		
		l.insertNode(78);  // 2nd 
		
		l.insertNode(20);  // 
		l.insertNode(34);
		l.insertNode(56);
		l.insertNode(45);
		l.insertNode(89);  //4 end 
		l.displayNode();
		l.insertNode(85 ,2); // 15 78 85 20  89
		l.displayNode();
		l.deleteNode(6);
		l.displayNode();
	

	}

}





