import java.util.Scanner;

public class LarSmaIndex {

	    static int largest(int[] arr){
	        int max=Integer.MIN_VALUE, maxIndex=0;
	        for(int i=0;i<arr.length;i++){
	            if(arr[i]>max){
	                max=arr[i];
	                maxIndex=i;
	            }
	            
	        }
	        System.out.println("MaxIndex "+ maxIndex);
	        return max;
	    }
	    
	    static int smallest(int[] arr){
	        int min=Integer.MAX_VALUE, minIndex=1;
	        for(int i=0;i<arr.length;i++){
	            if(arr[i]<min){
	                min=arr[i];
	                minIndex=i;
	            }
	        }
	        System.out.println("MinIndex "+ minIndex);
	        return min;
	    }
	    
		public static void main(String[] args) {
		    
		    Scanner scan=new Scanner(System.in);
		    int n=scan.nextInt();
		    
		    int[] arr=new int[n];
		    for(int i=0;i<arr.length;i++){
		        arr[i]=scan.nextInt();
		    }
		    
		    int res=largest(arr);
		    System.out.println("largest values "+ res);
		    
			int res1=smallest(arr);
			System.out.println("Smallest values "+ res1);
		}
	}


