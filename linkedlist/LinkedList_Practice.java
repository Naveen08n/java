class Nodes5{
	int data;
	Nodes5 next;
	Nodes5(int data){
		this.data=data;
		this.next=null;
	}
}
class LLP{
	Nodes5 head,curr;
	void addAll(int[] arr) {
		for(int e :arr) {
			add(e);
		}
	}
	void add(int e) {
		Nodes5 temp=new Nodes5(e);
		if(head==null) {
			head=temp;
		}else if(head.next==null) {
			head.next=temp;
			temp.next=null;
		}else if(head.next!=null) {
			curr=head;
			while(curr.next!=null) {
				curr=curr.next;
			}
			curr.next=temp;
			temp.next=null;
		}
	}
	void print() {
		curr=head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
	}
	void to_Sorted(int[] arr) {
		curr=head;
		while(curr!=null) {
			Nodes5 index=curr.next;
			while(index!=null) {
				if(curr.data>index.data) {
					int t= curr.data;
					curr.data=index.data;
					index.data=t;
					//curr=head;
				}
				index=index.next;
			}
			curr=curr.next;
		}
	}
	void sumOfAll(int[] arr) {
		int sum=0,r=1;
		curr=head;
		while(curr!=null) {
			sum += curr.data;
			curr=curr.next;
		}
		System.out.println("\n"+sum);
	}
	void prime_Number(int[] arr) {
		curr=head;
		int count=0,index=0;
		while(curr!=null) {
			for(int i=1;i<=curr.data;i++) {
				if(curr.data%i==0) {
					index=curr.data;
					count++;
				}
			}
			if(count==2) {
				System.out.println("prime"+index);
			}
			else {
				System.out.println("not prime");
			}

		}
	}
	void lar_Num(int[] arr) {
		curr=head;
		int lar=curr.data;
		while(curr!=null) {
			//Nodes5 temp=new Nodes5(e);
			if(curr.data>lar) {
				lar=curr.data;
				//curr=curr.next;
			}
			curr=curr.next;
		}
		System.out.println("\n"+lar);
	}
	int sec_lar(int[] arr) {
		curr=head.next.next;
		int max1=0,max2=0;
		if(curr.data>curr.next.data) {
			max1=curr.data;
			max2=curr.next.data;
		}else {
			max2=curr.data;
			max1=curr.next.data;
		}
		while(curr!=null) {
			if(curr.data>max1) {
				max2=max1;
				max1=curr.data;
			}else if(curr.data>max2) {
				max2=curr.data;
			}
			curr=curr.next;
		}
		return max2;
	}
	int sec_Small(int[] arr) {
		curr=head.next.next;
		int min1=0,min2=0;
		if(curr.data>curr.next.data) {
			min1=curr.next.data;
			min2=curr.data;
		}else {
			min1=curr.data;
			min2=curr.next.data;
		}
		while(curr!=null) {
			if(curr.data<min1) {
				min2=min1;
				min1=curr.data;
			}else if(curr.data<min2) {
				min2=curr.data;
			}
			curr=curr.next;
		}
		return min2;
		
	}
	int span(int[] arr) {
		int max=arr[0];
		int min=Integer.MAX_VALUE;
		curr=head;
		while(curr!=null) {
			if(curr.data>max) {
				max=curr.data;
			}
			if(curr.data<min) {
				min=curr.data;
			}
			curr=curr.next;
		}
		return max-min;
	}
	int linearSearch(int[] arr, int key) {
		curr=head;
		int count=0;
		while(curr!=null) {
			if(curr.data==key) {
				return count;
			}
			count++;
			curr=curr.next;
		}
		
		return -1;
		
	}
	int BinearSearch(int[] arr,int key) {
		curr=head;
		int l=0,h=arr.length-1,mid=0;
			while( l<=h) {
				mid=(l+h)/2;
				if(key==arr[mid]) {
					return mid;
				}else if(key<arr[mid]) {
					l=0;
					h=mid-1;
				}else {
					h=arr.length-1;
					l=0;
				}
				curr=curr.next;
			}
		return -1;
		
	}

}
public class LinkedList_Practice {

	public static void main(String[] args) {
		LLP l=new LLP();
		int arr[]= {2,3,1,9,-4};
		l.addAll(arr);
		l.to_Sorted(arr);
		l.print();
		//l.prime_Number(arr);
		//l.sumOfAll(arr);
		//l.lar_Num(arr);
		//System.out.println("\n"+l.span(arr));
		//l.prime_Number(5);
		//System.out.println(l.linearSearch(arr, 0));
		//System.out.println("\n"+l.BinearSearch(arr, 0));
		//System.out.println("\n "+l.sec_lar(arr));
		//System.out.println("\n "+l.sec_Small(arr));
		
	}

}
