class LinkedList{
	Node head;
	
	
	public void insertNode(int value) {
		Node newNode = new Node(value);
		if (head==null){
			head = newNode;
		}
		else {
			Node temp=head;
			while(temp.next !=null) { 
				temp=temp.next;
			}
		     temp.next= newNode;
		}
		}
	
	public void insertNode(int value, int pos) {                                                                       
		Node newNode = new Node(value);
		Node temp;
		if(pos==1) {
			temp= head;
		    head=newNode;
		    head.next= temp;  
		    }
		else {
			Node temp1;
			temp=head;
			int count=1;
			while(temp.next!=null && count<pos) {
				temp=temp.next;
				count++;
			}
			     temp1= temp.next;
			     temp.next= newNode;
			     newNode.next=temp1;
		}
	}
	public void deleteNode(int pos) {
		Node temp=head;
		if(pos==1) {
			head=temp.next;
		}
		else {
			int count = 1;
			temp=head;
			Node temp1=temp.next;
			while(temp1.next!=null && count<pos-1) {
				temp=temp.next;
				temp1 = temp.next;
				count++;
			}
			
			temp.next= temp1.next;                         
			
			
		}
	}
	
	public void displayNode() {
		Node temp=head;
		if(temp.next == null) {
			System.out.print(temp.data+" ");
		}
		else {
			while(temp.next!=null) {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println(temp.data+" ");
		}
	}
	
	}
