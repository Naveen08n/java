
public class Frequent {

	public static void main(String[] args) {
		int i,j;
		int[] arr= {1,2,3,4,2,5,2,4,1};
		int[] fre=new int[arr.length];
		
		int visited =-1;
		for(i =0;i<arr.length;i++) {
			int count =1;
			for( j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					fre[j]=visited;
				}
				
			}
			if(fre[i]!=visited) {
				fre[i]=count;
				
			}
		}
		System.out.println("Element | Frequency ");
		for(i=0;i<fre.length;i++) {
			if(fre[i]!=visited) {
				System.out.println("   "+arr[i]+"        "+fre[i]);
			}
			System.out.println();
		}
	}

}
