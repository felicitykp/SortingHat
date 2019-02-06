
public class BubbleSort extends PapaSort{

	//data
	
	
	//constructor
	public BubbleSort(int[] l, String name) {
		super(l, name);
	}
	
	//behaviors / methods
	private boolean bubbleIt(int end) {
		boolean didSwap = false;
		for(int i = 0; i < end; i++) {
			if(super.getElement(i) > super.getElement(i + 1)) {
				swap(i+1, i);
				didSwap = true;
			}
		}
		return didSwap;
	}

	public void executeAlgorithm() {
		boolean notDone = true;
		int bubbleEnd = super.getList().length-1;
		
		do {
			notDone = bubbleIt(bubbleEnd);
			if(notDone) {
				bubbleEnd -= 1;
			}
		} while(notDone && bubbleEnd >= 1);
	}
	
	

}
