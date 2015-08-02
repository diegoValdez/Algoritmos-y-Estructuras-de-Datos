
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
		bSort.BubbleSort(docGen.getIntArray());
		docGen.CreateOrderedDoc();
	}
	
	public void alreadyOrderedDocument(){
		
	}
}
