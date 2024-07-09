class Nodesss{
	int data;
	Nodesss next;
	
	Nodesss(int data){
		this.data=data;
		this.next=null;
	}	
}
class LinkedLists{
	Nodesss head;
	void PrintLList() {
		Nodesss curr=head;
		
		while(curr!= null) {
			
			System.out.println(curr.data);
			curr=curr.next;
		}
	}
}
public class Linkedlist_Demo {
	
	public static void main(String[] args) {
		LinkedLists ll=new LinkedLists();
		Nodesss p1=new Nodesss(10);
		Nodesss p2=new Nodesss(20);
		Nodesss p3=new Nodesss(30);
		Nodesss p4=new Nodesss(40);
		
		p1.next=p2;
		p2.next=p3;
		p3.next=p4;
		
		
		ll.head=p1;
		ll.PrintLList();

		
		
		 
	}

}
