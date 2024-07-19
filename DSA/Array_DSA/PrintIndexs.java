package Array_DSA;

public class PrintIndexs {
	static int[] firstLastIndex(int[] arr,int key) {
		int[] res= {-1,-1};
		int l=0,h=arr.length-1,mid=0;
		while(l<=h) {
			mid=(l+h)/2;
			if(key==arr[mid]) {
				res[0]=mid;
				h=mid-1;
			}else if(arr[mid]<key) {
				l=mid+1;
			}else {
				h=mid-1;
			}
		}
		l=0;
		h=arr.length-1;
		mid=0;

		while(l<=h) {
			mid=(l+h)/2;
			if(key==arr[mid]) {
				res[1]=mid;
				l=mid+1;
			}else if(key<arr[mid]) {
				l=mid+1;
			}else {
				h=mid-1;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,4,4,4,4,4,7};
		int key=4;
		System.out.println(firstLastIndex(arr,key));


	}

}
