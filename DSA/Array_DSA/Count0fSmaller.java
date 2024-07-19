package Array_DSA;

public class Count0fSmaller {
	static int countSmallofElements(int[] arr,int key) {
		int l=0,h=arr.length-1,mid=0;
		while(l<=h) {
			mid=(l+h)/2;
			if(key==arr[mid]) {
				while(mid+1<arr.length && arr[mid+1]==key) {
					mid++;
				}
				break;
			}else if(key<arr[mid]) {
				h=mid-1;
			}else {
				l=mid+1;
			}
		}
			if(arr[mid]>key) {
				return mid;
			}else {
				return mid+1;
			}
	}


	public static void main(String[] args) {
		int[] arr= {2,3,4,6,9,11,23,23,40};
		int key=24;
		System.out.println(countSmallofElements(arr,key));
		
	}

	

}
