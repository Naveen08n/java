class Nodes{
	int data;
	Nodes next;
	Nodes(int data){
		this.data=data;
		this.next=null;
	}
	
}

class Linkedl{
	Nodes head;
	void printlist() {
		if(head==null) {
		}else {
			Nodes curr=head;
			while(curr!=null) {
				System.out.print(curr.data+" ");
				curr=curr.next;
			}	
		}	
	}
	int size() {
		Nodes curr=head;
		int count=0;
		while(curr!=null) {
			/*
			 * if(curr.next==null) { return count; }
			 */
			curr=curr.next;
			count++;
		}
		return count;
	}
	
	/*
	 * int middle(Nodes head) { int len=getlen(head); Nodes temp=head; int
	 * mid=len/2; while (mid > 0) { temp = temp.next; mid--; } return temp.data;
	 * 
	 * }
	 */
	void add(int e) {
		Nodes temp=new Nodes(e);
		if(head==null) {
			head=temp;
		}else{
			Nodes curr=head;
			while(curr.next!=null) {
				curr=curr.next;
			}
			curr.next=temp;
		}	
	}
}




public class Middle_LL {

	public static void main(String[] args) {
		Linkedl ll=new Linkedl();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		System.out.println(ll.size());
		//System.out.println(ll.middle(head[0]));

		ll.printlist();
			
	
		

	}

}
