class Node5{
	int data;
	Node5 next;
	Node5(int data){
		this.data=data;
		this.next=null;
	}
}
class Circular{
	Node5 head,curr;
	void add(int e) {
		Node5 temp=new Node5(e);
		if(head==null) {
			head=temp;
			head.next=head;
		}else {
			curr=head;
			while(curr.next!=head) {
				curr=curr.next;
			}
			curr.next=temp;
			temp.next=head;
		}
	}
	void add_E_frist(int e) {
		Node5 temp=new Node5(e);
		if(head==null) {
			head=temp;
			head.next=head;
		}else {
		
			temp.next=head.next;
			head.next=temp;
			int t=temp.data;
			temp.data=head.data;
			head.data=t;
			
		}
	}
	void addFirst(int e) {
		Node5 temp=new Node5(e);
		if(head==null) {
			head=temp;
			head.next=head;
		}else if(head!=null) {
			curr=head.next;
			while(curr.next!=head) {
				curr=curr.next;
			}
			curr.next=temp;
			temp.next=head;
			head=temp;
		}
		
	}
	void print() {
		/*
		 * if(head!=null) { curr=head.next; System.out.println(head.data);
		 * while(curr!=head) { System.out.print(curr.data+" "); curr=curr.next; } }
		 */
		if(head!=null) {
			curr=head;
			do {
				System.out.print(curr.data+ " ");
				curr=curr.next;
			}while(curr!=head);
		
		}
	}
	void addLast(int e) {
		Node5 temp=new Node5(e);
		if(head==null) {
			head=temp;
			head.next=head;
		}else if(head!=null) {
			curr=head;
			while(curr.next!=head) {
				curr=curr.next;
			}
			curr.next=temp;
			temp.next=head;
		}
	}
	void add_E_Last(int e) {
		Node5 temp=new Node5(e);
		if(head==null) {
			head=temp;
			head.next=head;
		}else {
			temp.next=head.next;
			head.next=temp;
			int t=temp.data;
			temp.data=head.data;
			head.data=t;
			head=head.next;
			}
	}
	void removeFirst() {
		if(head==null) {
			
		}else if(head==head.next) {
			head=null;
		}else {
			curr=head;
			while(curr.next!=head) {
				curr=curr.next;
			}
			curr.next=head.next;
			head=head.next;
		}
	}
	void remove_E_First() {
		if(head==null) {
			
		}else if(head==head.next) {
			head=null;
		}else {
			int t=head.data;
			head.data=head.next.data;
			head.next.data=t;
			head.next=head.next.next;
		}
	}
	void removeLast() {
		if(head==null) {
			
		}else if(head==head.next) {
			head=null;
		}else {
			curr=head;
			while(curr.next.next!=head) {
				curr=curr.next;
			}
			curr.next=head;
		}
		
	}
	void addSorted(int e) {
		Node5 temp=new Node5(e);
		int count=0;
		if(head==null) {
			head=temp;
		}else if(temp.data<head.data) {
			temp.next=head;
			head=temp;
		}
		else {
			curr=head;
			while(curr.next!=head && curr.next.data<temp.data) {
					curr=curr.next;
				}
				temp.next=curr.next;
				curr.next=temp;
			}
		
	}

}
public class Circular_linkedlist {

	public static void main(String[] args) {
		Circular c=new Circular();
		/*
		 * c.head=new Node5(10); c.head.next=new Node5(20); c.head.next.next=new
		 * Node5(30); c.head.next.next.next=c.head;
		 */
		c.add(3);
		c.add(8);
		//c.addFirst(7);
		c.add_E_frist(4);
		c.addLast(10);
		//c.addLast(12);
		c.add_E_Last(15);
		//c.removeFirst();
		//c.remove_E_First();
		//c.removeLast();
		c.addSorted(12);
		
		c.print();
	}

}
