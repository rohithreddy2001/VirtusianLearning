package first;

public class BinarySearch {
	public static int binarySearch(int[] a1,int queary,int lo,int hi) {
        while (lo <= hi) {
            int mid = lo + (hi - 1) / 2;
            if(a1[mid] == queary)
                return mid;
            if(a1[mid] < queary)
                lo = mid + 1;
            else
                hi = mid - 1;
        }
        return -1;
    }

	public static void main(String[] args) {
		BinarySearch search = new BinarySearch();
		int[] a1 = {1,2,3,3,4,5};
		
		System.out.println(search.binarySearch(a1, 4, 0, a1.length-1));
		
	}

}




