class NewNodes{
	int data;
	NewNodes next;
	
	NewNodes(int data){
		this.data=data;
		this.next=null;
	}
}

class Linkedlist1{
	NewNodes head;
	void PrintList() {
		NewNodes curr=head;
		while(curr!=null) {
			System.out.println(curr.data);
			curr=curr.next;
		}
	}
	void add(int e) {
		NewNodes temp=new NewNodes(e);
		if(head==null) {
			head=temp;
		}else {
			NewNodes curr=head;
			while(curr.next!=null) {
				curr=curr.next;
			}
			curr.next=temp;
		}
	}
	
	
	void addFirst(int e) {
		NewNodes temp=new NewNodes(e);
		if(head==null) {
			head=temp;
		}else {
			temp.next=head;
			head=temp;
		}
	}
}



public class Add_first_LL {

	public static void main(String[] args) {
		Linkedlist1 ll=new Linkedlist1();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		
		ll.addFirst(5);
		ll.addFirst(2);
		ll.PrintList();
		
		

	}

}
