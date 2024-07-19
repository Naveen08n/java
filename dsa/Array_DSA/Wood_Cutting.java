package Array_DSA;

public class Wood_Cutting {
	static int foundcount(int[] ht, int m) {
		int wc=0;
		for(int i=0;i<ht.length;i++) {
			if(ht[i]>m) {
				wc +=ht[i]-m;
			}
		}
		return m;
	}
	static int machineHeight(int[] ht, int b) {
		int max=0;
		for(int i=1;i<ht.length;i++) {
			if(ht[i]>max) {
				max=ht[i];
			}
		}
		
		int l=0,h=max,m=0;
		while(l<=h) {
			m=(l+h)/2;
			int wc=foundcount(ht, m);
			if(wc==b || l==m ) {
				return m;
			}else if(wc>b) {
				l=m;
			}else {
				h=m;
			}
		}
		return -1;
		
		
	}

	public static void main(String[] args) {
		int[] ht= {20,15,10,17};
		int b=5;
		System.out.println(machineHeight(ht,b));

	}

}
