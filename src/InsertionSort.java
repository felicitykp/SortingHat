
public class InsertionSort extends PapaSort{

	//data
	
	//constructor
	public InsertionSort(int[] l, String sortName) {
		super(l, sortName);
	}

	//behaviors / methods
	public void executeAlgorithm() {
		for(int i = 1; i < this.getLength(); i++) {
			int j = i;
			while(j > 0 && this.getElement(j) < this.getElement(j-1)) {
				swap(j, j-1);
				j--;
			}
		}
		
	}

}
