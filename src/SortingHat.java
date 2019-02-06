import java.util.Arrays;

public class SortingHat {

	public static void main(String[] args) {
		
		//variable setup
		int howMany = 100000;
//		int[] nums0 = getRandom(howMany);
//		int[] nums0 = getAscendingOrder(howMany);
//		int[] nums0 = getDescendingOrder(howMany);
		int[] nums0 = getAverageOrder(howMany);  
		int[] nums1 = nums0.clone();
		int[] nums2 = nums0.clone();

		//print original
		System.out.println("Original: " + Arrays.toString(nums0) + "\n");
		
		//sorting setup
		SelectionSort sSort = new SelectionSort(nums0, "Selection Sort");
		BubbleSort bSort = new BubbleSort(nums1, "Bubble Sort");
		InsertionSort iSort = new InsertionSort(nums2, "Insertion Sort");
		
		//sort
		doTiming(sSort);
		doTiming(bSort);
		doTiming(iSort);
		
		//print final *(may max out terminal)
//		System.out.println("\nFinal: " + Arrays.toString(nums0));

	} 
	
	//behaviors / methods
	public static void doTiming(PapaSort s) {
		long start = System.currentTimeMillis();
		long start2 = System.nanoTime();
		
		s.executeAlgorithm();
		
		long end = System.currentTimeMillis();
		long end2 = System.nanoTime();
		
		long theTime = end - start;
		long theTime2 = end2 - start2;
		
		if(s.getLength() < 100) {
			System.out.println("Time for " +  s.getSortName() + " on " + s.getLength() + " numbers is " + theTime2 + " nano seconds");
		} else {
			System.out.println("Time for " + s.getSortName() + " on " + s.getLength() + " numbers is " + theTime + " miliseconds");
		}
	}
	
	public static int[] getRandom(int n) {
		int[] nList = new int[n];
		for (int i = 0; i < nList.length; i++) {
			nList[i] = (int)(Math.random() * 1000);
		}
		return nList;
	}
	
	public static int[] getAscendingOrder(int n) {
		int[] nList = new int[n];
		for (int i = 0; i < nList.length; i++) {
			nList[i] = i + 1;
		}
		return nList;
	}
	
	public static int[] getDescendingOrder(int n) {
		int[] nList = new int[n];
		for (int i = 0; i < nList.length; i++) {
			nList[i] = nList.length - i;
		}
		return nList;
	}
	
	public static int[] getAverageOrder(int n) {
		int[] nList = new int[n];
		for (int i = nList.length; i > 0; i--) {
			nList[nList.length - i] = i;
		}
		return nList;
	}
	

}
