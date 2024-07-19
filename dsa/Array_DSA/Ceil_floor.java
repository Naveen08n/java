package Array_DSA;
class CeilFloor{
	int ceil(int[] arr,int key) {
		int l=0,h=arr.length-1,mid=0;
		while(l<=h) {
			mid=(l+h)/2;
			if(key==arr[mid]) {
				return arr[mid];
			}else if(key<arr[mid]) {
				h=mid-1;
			}else {
				l=mid+1;
			}
		}
		if(l<arr.length) {
			return arr[l];
		}else {
			return -1;
		}
	}
	int floor(int[] arr,int key) {
		int l=0,h=arr.length-1,mid=0;
		while(l<=h) {
			mid=(l+h)/2;
			if(key==arr[mid]) {
				return arr[mid];
			}else if(key<arr[mid]) {
				h=mid-1;
				l=0;
			}else {
				l=mid+1;
			}
		}
		if(h>=0) {
			return arr[h];
		}else {
			return -1;
		}
	}
}
public class Ceil_floor {

	public static void main(String[] args) {
		CeilFloor c=new CeilFloor();
		int[] arr= {1,3,6,45,87,89,98};
		System.out.println(c.ceil(arr,97 ));
		System.out.println(c.floor(arr, -1));
	}

}
