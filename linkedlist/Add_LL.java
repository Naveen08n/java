class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
		this.next=null;
	}
}

class Linkedlist{
	Node head;
	void add(int e) {
		Node temp=new Node(e);
		if(head == null) {
			head=temp;
		}else {
			Node curr=head;
			while(curr.next!=null) {
			curr=curr.next;
			}
			curr.next=temp;
		}
	}
	void PrintLList() {
		Node curr=head;
		
		while(curr!= null) {
			
			System.out.println(curr.data);
			curr=curr.next;
		}
	}
}

public class Add_LL {

	public static void main(String[] args) {
		Linkedlist ll=new Linkedlist();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		
		ll.PrintLList();
		
		
	}

}
