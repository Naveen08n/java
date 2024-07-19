import java.util.Scanner;

public class Occurrence {

	    static void Occurences(int[] arr, int k){
	        
	        int count=0;
	        
	        for(int i=0;i<arr.length;i++){
	            //for(int j=i+1;j<arr.length;j++){
	                if(arr[i]==k){
	                    count++;
	                }
	            //}
	        }
	        System.out.println(count);
	        
	    }

	    
		public static void main(String[] args) {
		    
		    Scanner scan=new Scanner(System.in);
		    int n=scan.nextInt();
		    
		    int[] arr=new int[n];
		    for(int i=0;i<arr.length;i++){
		        arr[i]=scan.nextInt();
		    }
		    
		    int k=scan.nextInt();
		    
		    Occurences(arr,k);
		    

		//	System.out.println();
		}
	}

