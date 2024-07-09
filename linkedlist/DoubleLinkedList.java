class Nodess{
	int data;
	Nodess prev;
	Nodess next;
	
	Nodess(int data){
		this.data=data;
		this.prev=null;
		this.next=null;
	}
}
class DoubleLL{
	Nodess head,curr;
	Nodess tail;
	void add(int element) {
		Nodess temp=new Nodess(element);
		if(head==null) {
			head=temp;
			tail=temp;	
		}else {
			tail.next=temp;
			temp.prev=tail;
			tail=temp;
		}
	}
	void printAll() {
		curr=head;
		while(curr!=null) {
			System.out.print(curr.data+ " ");
			curr=curr.next;
		}
	}
	void printReverse() {
		curr=tail;
		while(curr!=null) {
			System.out.print(curr.data+ " ");
			curr=curr.prev;
		}
	}
	void addFirst(int e) {
		Nodess temp=new Nodess(e);
		if(head==null) {
			head=tail=temp;
		}else {
			temp.next=head;
			head.prev=temp;
			head=temp;
		}
	}
	void addIndex(int index,int element) {
		Nodess temp=new Nodess(element);
		int count=0;
		curr=head; 
		while(count<index-1) {
			curr=curr.next;
			count++;
		}
		curr.next.prev=temp;
		temp.next=curr.next;
		curr.next=temp;
		temp.prev=curr;
		
	}
	void addAll(int[] arr) {
		for(int elements : arr) {
			add(elements);
		}
	}
	void removeFirst() {
		if(head==null) {
		}else if(head.next==null) {
			head=null;
			tail=null;
		}else if(head.next!=null){
			curr=head;
			head=head.next;
			curr.next=null;
			head.prev= null;
			
		}
	}
	void removeLast() {
		if(head==null) {
			
		}else if(head.next==null) {
			head=null;
			tail=null;
		}else if(head.next!=null) {
			curr=tail;
			tail=tail.prev;
			tail.next=null;
			curr.prev=null;
			
		}
	}
	void addLast(int e){
        Nodess temp=new Nodess(e);
        if(head==null){
            head=tail=temp;
        }else {
        	curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=temp;
            temp.prev=tail;
            tail=temp;
            tail.next=null;
        }
        
    }
}

public class DoubleLinkedList {

	public static void main(String[] args) {
	DoubleLL dll=new DoubleLL();
	
	dll.add(10);
	dll.add(20);
	dll.add(30);
	dll.addFirst(5);
	dll.addLast(6);
	dll.addIndex(2, 25);
	dll.printAll();

	/*int[] arr= {1,2,3,4};
	dll.addAll(arr);
	
	System.out.println();
	dll.printAll();
	System.out.println();
	dll.removeFirst();
	dll.removeLast();
	dll.printAll();

	dll.printReverse();
	
	/*
	 * System.out.println(dll.head.data); System.out.println(dll.tail.data);
	 */
		

	}

}
