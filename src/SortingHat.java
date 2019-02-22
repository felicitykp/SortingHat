import java.util.Arrays;

public class SortingHat {

	public static void main(String[] args) {
		
		//variable setup
		int howMany = 1000;
		int[] nums0 = getRandom(howMany);
//		int[] nums0 = getAscendingOrder(howMany);
//		int[] nums0 = getDescendingOrder(howMany);
//		int[] nums0 = getAverageOrder(howMany); 
		int[] nums1 = nums0.clone();
		int[] nums2 = nums0.clone();
		int[] nums3 = nums0.clone();
		int[] nums4 = nums0.clone();

		//print original
		System.out.println("Original: " + Arrays.toString(nums0) + "\n");
		
		//sorting setup
		SelectionSort sSort = new SelectionSort(nums0, "Selection Sort");
		BubbleSort bSort = new BubbleSort(nums1, "Bubble Sort");
		InsertionSort iSort = new InsertionSort(nums2, "Insertion Sort");
		MergeSortNR mSort = new MergeSortNR(nums3, "Merge Sort NR");
		MergeSortR mRSort = new MergeSortR(nums4, "Merge Sort R");
		
		//sort
 		doTiming(sSort);
 		doTiming(bSort);
		doTiming(iSort);
		doTiming(mSort);
		doTiming(mRSort);
		
		//checklist
		System.out.println();
		listCheck(nums0, "Selection Sort");
		listCheck(nums1, "Bubble Sort");
		listCheck(nums2, "Insertion Sort");
		listCheck(nums3, "Merge Sort NR");
		listCheck(nums4, "Merge Sort R");
		
		//print final *(may max out terminal)
//		System.out.println("\nFinal: " + Arrays.toString(nums4));

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
	
	public static void listCheck(int[] l, String name) {
		boolean error = false;
		for (int i = 0; i < l.length - 1; i++) {
			if(l[i] > l[i+1]) {
				error = true;
			}
		}
		
		if(error == false) {
			System.out.println(name + " is all good");
		} else {
			System.out.println(name + " is messed up");
		}
	}

}
