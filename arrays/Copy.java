
public class Copy {


	public static void main(String[] args) {
		int arr[]= {1,3,4,5,6};
		int arr2[]= new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			arr2[i]=arr[i];
			
		}
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr2[i]+ " ");
		}

	}

}
