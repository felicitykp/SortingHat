
public class MergeSortNR extends PapaSort{

	//data
	
	//constructor
	public MergeSortNR(int[] l, String sortName) {
		super(l, sortName);
	}

	//behaviors / methods
	public void executeAlgorithm() {
		for (int j = 1, e = 0; Math.pow(2.0, (double)(e)) <= this.getLength(); j *= 2, e++) {
		
			for (int i = 0; i+1 <= this.getLength() - 1; i += j*2) {
				if( i+(j*2)-1 < this.getLength()) {
					merge(i, i+j-1, i+j, i+(j*2-1));
				} else {
					merge(i, i+j-1, i+j, this.getLength()-1);
				}
				
				
			}
		}
	}
	
	
	public void merge(int start1, int end1, int start2, int end2) {
		int l1 = start1;
		int l2 = start2;
		int[] temp = new int[ (end1 - start1 + 1) + (end2 - start2 + 1) ];
		int tPointer = 0;
		
		while(l1 <= end1 && l2 <= end2) {
			if(this.getElement(l1) <= this.getElement(l2)) {
				temp[tPointer] = this.getElement(l1);
				l1++;
			} else {
				temp[tPointer] = this.getElement(l2);
				l2++;
			}
			tPointer++;
		}
		
		for(int tp = tPointer; tp < temp.length; tp++) {
			if(l1 <= end1) {
				temp[tp] = this.getElement(l1);
				l1++;
			} else {
				temp[tp] = this.getElement(l2);
				l2++;
			}
		}
		
		
		for(int i = start1, t = 0; i <= end2; i++, t++) {
			this.setElement(i, temp[t]);
		}
	}

}
