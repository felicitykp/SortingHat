import java.util.Arrays;

public class SelectionSort extends PapaSort{
	
	//data
	
	//constructor
	public SelectionSort(int[] l, String name) {
		super(l, name);
	}
	
	//behaviors / methods
	
	public void executeAlgorithm() {
		for(int j = 0; j < super.getList().length - 1; j++) {
			int bigNum = super.getElement(0);
			int bigLoc = 0;
			for(int i = 0; i < super.getList().length - j; i++) {
				if(bigNum < super.getElement(i)) {
					bigNum = super.getElement(i);
					bigLoc = i;
				}
			}
		swap(bigLoc, super.getList().length - 1 - j);
		}
	}

}
