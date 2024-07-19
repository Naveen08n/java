package Array_DSA;
class Sec_Lar{
	int seclar(int[] arr) {
		int max1=0,max2=0;
		if(arr[0]>arr[1]) {
			max1=arr[0];
			max2=arr[1];
		}else {
			max1=arr[1];
			max2=arr[0];
		}
		for(int i=2;i<arr.length;i++) {
			if(arr[i]>max1) {
				max2=max1;
				max1=arr[i];
			}else if(arr[i]>max2) {
				max2=arr[i];
			}
		}
		return max2;
	}

	int secsmal(int[] arr) {
		int min1=0,min2=0;
		if(arr[0]>arr[1]) {
			min1=arr[1];
			min2=arr[0];
		}else {
			min1=arr[0];
			min2=arr[1];
		}
		for(int i=2;i<arr.length;i++) {
			if(arr[i]<min1) {
				min2=min1;
				min1=arr[i];
			}else if(arr[i]<min2) {
				min2=arr[i];
			}
		}
		return min2;
	}
}
public class Second_Largest {

	public static void main(String[] args) {
		Sec_Lar sc=new Sec_Lar();
		int[] arr= {13,-4,-5,6,98,46,76};
		System.out.println("lar "+sc.seclar(arr));
		System.out.println(sc.secsmal(arr));

	}

}
