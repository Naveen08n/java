package Array_DSA;

public class BitonicSearch {
	static int ascedingBinarySearch(int[] arr, int key, int range) {
		int l=0,h=range,mid=0;
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
	static int descedingBinarySearch(int[] arr, int key, int range) {
		int l=range,h=arr.length-1,mid=0;
		 while(l<=h) {
			 mid=(l+h)/2;
			 if(key==arr[mid]) {
				 return mid;
			 }else if(key<arr[mid]) {
				l=mid+1;
			 }else {
				 h=mid-1;
			 }
		 }
		return -1;
	}
	static int searchBitonic(int[] arr,int key,int bIndex) {
		if(key==arr[bIndex] ){
			return bIndex;
		}
		if(key>arr[bIndex]) {
			return -1;
		}
		int res=ascedingBinarySearch(arr,key,bIndex-1);
		if(res!=-1) {
			return res;
		}
		int res1=descedingBinarySearch(arr,key, bIndex);
		if(res1!=-1) {
		return -1;
		}
		return -1;
	}
	static int findBitonicPoint(int[] arr) {
		int l=0,r=arr.length-1,mid=0;
		while(l<=r) {
			mid=(l+r)/2;
			if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]) {
				return mid;
			}else if(arr[mid]>arr[mid-1]&&arr[mid]<arr[mid+1]) {
				l=mid;
			}else {
				r=mid;
			}
		}
		
		return 0;
		
	}
	public static void main(String[] args) {
		int[] arr= {2,3,4,5,10,9,8,1};
		int b=10;
		int bIndex=findBitonicPoint(arr);
		System.out.println(searchBitonic(arr,b,bIndex));
	}

}
