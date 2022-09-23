
public class MinFinder {
	public static void main(String[] args) {
		int ar[]= {1,2,4,6};
		System.out.println(findMinElem(ar));
		
		
	}
	static int findMinElem(int[] ar) {
		int min=ar[0];
		for(int item:ar)
			min=Math.min(item, min);
	
	return min;
	}
	static String findMinElem(String[] ar) {
		String s1=ar[0];
		for(String item:ar) {
			if(s1.compareTo(item)>0)
				s1=item;
		}
		return s1;
	}
}
