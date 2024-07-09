class NewNode{
	int data;
	NewNode next;
	
	NewNode(int data){
		this.data=data;
		this.next=null;
	}
}

class Linkedlist2{
	NewNode head,curr;
	int count=0;
	
	void PrintList() {
		NewNode curr=head;
		while(curr!=null) {
			System.out.print(curr.data+ " ");
			curr=curr.next;
		}
	}
	void add(int e) {
		NewNode temp=new NewNode(e);
		if(head==null) {
			head=temp;
		}else {
			NewNode curr=head;
			while(curr.next!=null) {
				curr=curr.next;
			}
			curr.next=temp;
		}
	}
	
	
	void addFirst(int e) {
		NewNode temp=new NewNode(e);
		if(head==null) {
			head=temp;
		}else {
			temp.next=head;
			head=temp;
		}
	}
	void addSecond(int index,int element){
	    NewNode temp=new NewNode(element);
	    if(index==0){
	        addFirst(element);
	    }else{
	        NewNode curr=head;
	        int count=0;
	        while(count<index-1){
	            curr=curr.next;
	            count++;
	        }
	            temp.next=curr.next;
	            curr.next=temp;
	    }
	}
	void addAll(int[] arr) {
		for(int element:arr) {
			add(element);
		}
	}
	void removeFirst() {
		if(head==null) {
			
		}else if(head.next==null) {
			head=null;
		}else if(head.next!=null) {
			curr=head;
			head=head.next;
			curr.next=null;
			
		}
	}
	void removeLast() {
		if(head==null) {
			
		}else if(head.next==null) {
			head=null;
			
		}else if(head.next!=null) {
			curr=head;
			while(curr.next.next!=null) {
				curr=curr.next;
			}
			curr.next=null;
		}
	}
	int IndexOf(int element) {
		curr=head;
		int count=0;
		while(curr!=null) {
			if(curr.data==element) {
				return count;
			}
			curr=curr.next;
			count++;
		}
		return -1;
	}

	int LastIndex() {
		curr=head;
		int count=0;
		while(curr!=null) {
			if(curr.next==null) {
				return count;
			}
			curr=curr.next;
			count++;
		}
		return -1;
	}

	int LastIndexof(int element) {
		curr=head;
		int count=0;
		int index=-1;
		while(curr!=null) {
			if(curr.data==element) {
				index=count;
			}
			curr=curr.next;
			count++;
		}
		return index;
	}
	int size() {
		curr=head;
		int count=0;
		while(curr!=null) {
			curr=curr.next;
			count++;
		}
		return count; 
	}

}



public class Add_Second_LL {

	public static void main(String[] args) {
		Linkedlist2 ll=new Linkedlist2();
		/*
		 * int[] arr= {1,2,3,4,5};
		 * 
		 * ll.addAll(arr);
		 */
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(20);
		
		int[] arr= {1,2,3,4,5};
		ll.addAll(arr);
		ll.removeLast();;
		//System.out.println(ll.IndexOf(20));
		System.out.println(ll.LastIndex());
		//System.out.println(ll.LastIndexof(20));
		//System.out.println(ll.size());
		//ll.removeFirst();
		//ll.removeElementOfIndex();
		//ll.addFirst(5);
		//ll.addFirst(2);
		//ll.addSecond(1,1);
		ll.PrintList();
		//ll.removeFirst(10);
		//ll.PrintList();

		
		

	}

}
