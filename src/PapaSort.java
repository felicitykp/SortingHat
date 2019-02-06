import java.util.Arrays;

public abstract class PapaSort {

	//data
	private int[] myList;
	private String whichSort;
	
	//constructors
	public PapaSort(int[] l, String sortName) {
		myList = l;
		whichSort = sortName;
	}
	
	//behaviors / methods
	public void swap(int pos1, int pos2) {
		int temp = myList[pos2];
		myList[pos2] = myList[pos1];
		myList[pos1] = temp;
	}
	
	public String toString() {
		String s = "";
		s += whichSort + ": ";
		s += Arrays.toString(myList);
//		System.out.println("in Papa To String s is: ");
		return s;
	}
	
	//accessor methods
	public int[] getList() {
		return myList;
	}
	
	public int getElement(int whichE) {
		return myList[whichE];
	}
	
	public void setElement(int whichE, int val) {
		myList[whichE] = val;
	}
	
	public int getLength() {
		return myList.length;
	}
	
	public String getSortName() {
		return whichSort;
	}
	
	public abstract void executeAlgorithm();
}
