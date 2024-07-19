package Arrays_programming;
import java.util.Arrays;
import java.util.Scanner;
class Sorted{
	int[] sortedResultant(int[] arr1,int[] arr2) {
		int[] arr=new int[arr1.length+arr2.length];
		int k=0,i=0,j=0;
			/*for(int i=0;i<arr.length;i++) {
				arr2[i]=arr[i];
			}
			for(int i=0;i<arr1.length;i++) {
				arr2[arr.length+i]=arr1[i];
			}
			for(int i=0;i<arr2.length;i++) {
				Arrays.sort(arr2);
				System.out.print(arr2[i]+" ");
			}*/
		while(i<arr1.length && j<arr2.length){
				if(arr2[j]<=arr1[i]){
					arr[k]=arr2[j];
					k++;
					j++;
				}else {
					arr[k]=arr1[i];
					i++;
					k++;
				}
		}
		while(j<arr2.length) {
			arr[k]=arr2[j];
			k++;
			j++;
		}
		while(i<arr1.length) {
			arr[k]=arr1[i];
			i++;
			k++;
		}
		return arr;
	}

}
public class TwoarraysSorted {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Sorted s=new Sorted();
		int n=scan.nextInt();
		int[] arr1=new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=scan.nextInt();
		}
		int m=scan.nextInt();
		int[] arr2=new int[m];
		for(int i=0;i<m;i++) {
			arr2[i]=scan.nextInt();
		}
		int[] arr=s.sortedResultant(arr1, arr2);
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}

	}

}
