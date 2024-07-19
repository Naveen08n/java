package Array_DSA;


class Span{
	int Span_value(int[] arr) {
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return max-min;
		
	}
}
public class Span_Num {

	public static void main(String[] args) {
		Span s=new Span();
		int[] arr= {2,4,55,63,5,62,14,44};
		System.out.println(s.Span_value(arr));

	}

}
