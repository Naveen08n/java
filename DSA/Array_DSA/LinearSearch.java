package Array_DSA;
class Linear_Search{
	int print(int[] arr,int key) {
		for(int i=0;i<arr.length;i++)	{
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
}
public class LinearSearch {

	public static void main(String[] args) {
		Linear_Search ls=new Linear_Search();
		int[] arr= {1,2,4,5};
		int res=ls.print(arr, 5);
		System.out.println(res);

	}

}
