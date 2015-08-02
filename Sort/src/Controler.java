
public class Controler {
	
	private DocumentGenerator docGen;
	private Sort bSort;

	public Controler() {
		this.docGen = new DocumentGenerator();
		this.bSort = new Sort();
	}
	
	public void OrderDocument(){
		docGen.CreateUnorderedDoc();
		docGen.loadRandomInt();
		int[] intArray = bSort.BubbleSort(docGen.getIntArray());
		for(int i = 0;i<3000;i++){
			int num = intArray[i];
			System.out.println(num);
		}
		docGen.setIntArray(intArray);
		docGen.CreateOrderedDoc();
	}
	
	public void alreadyOrderedDocument(){
		docGen.loadRandomIntOrdered();
		bSort.BubbleSort(docGen.getIntArray());
		docGen.CreateOrderedDoc();
	}
}
