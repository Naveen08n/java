package Array_DSA;
class BinarySearch{
	int print(int[] arr,int key) {
		int l=0,h=arr.length-1,mid=0;
		 while(l<=h) {
			 mid=(l+h)/2;
			 if(key==arr[mid]) {
				 return mid;
			 }else if(key<arr[mid]) {
				l=0;
				h=mid-1;
			 }else {
				 h=arr.length-1;
				 l=mid+1;
			 }
		 }
		
		
		return -1;
	}
}
public class Binary_Search {

	public static void main(String[] args) {
		BinarySearch ls=new BinarySearch();
		int[] arr= {1,2,4,5};
		int res=ls.print(arr, 5);
		System.out.println(res);


	}

}
