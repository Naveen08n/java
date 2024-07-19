package Array_DSA;
class Search{
	int search(int[] a,int key) {
		int l=0,h=a.length-1,mid=0;
		while(l<=h) {
			mid=(l+h)/2;
			if(key==a[mid]) {
				return mid;
			}else if(a[l]<=a[mid]) {
				if(key>=a[l]&&key<a[mid]) {
					h=mid-1;
				}else {
					l=mid+1;
				}
			}else {
					if(key>a[mid]&&key<=a[h]) {
						l=mid-1;
					}else {
						h=mid+1;
					}
				}
			}
		
		return -1;
		
	}
}
public class SearchRotatedArray {

	public static void main(String[] args) {
		Search s=new Search();
		int[] a= {4,5,6,7,8,2,3};
		System.out.println(s.search(a,5));
	}

}
