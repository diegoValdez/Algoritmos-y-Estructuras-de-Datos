
import java.util.*;


public class Controller {
	
	private Stack<Letter> thisLetter;
	private BinaryHeap<BinaryTree<Letter>> fullTree ;
		
	
	public Controller(String word){
		thisLetter = new Stack<Letter>();
		createLetterStack(word);
		sort();
		setFullTree(new BinaryHeap<BinaryTree<Letter>>());
		createBinaryHeap();	
	}
	
	public void PrintLetters(){
		ListIterator<Letter> ListItr = thisLetter.listIterator() ;
		while (ListItr.hasNext()){
			System.out.println(ListItr.next().toString()+"\n");
			
		}
	}
	
	public void printFirst(){
		System.out.println(thisLetter.peek().toString()+"\n");
	}
	
	public void printTree(){
		System.out.println(fullTree.toString());
	}
	
	public void createLetterStack(String word){
		Stack<String> charsInWord = new Stack<String>();
		word = word.toUpperCase();
		for (int i = 0; i<word.length(); i++){
			String thisChar = String.valueOf(word.charAt(i));
			charsInWord.add(thisChar);
		}
		int size = charsInWord.size();
		
		for (int i=0; i<size; i++){
			Letter newLetter = new Letter(1, charsInWord.pop());
			if (i==0){
				thisLetter.add(newLetter);
			}
			else if (thisLetter.contains(newLetter)){
				//thisLetter.get(thisLetter.search(newLetter)-1).plusOne();
				for (int j=0; j<thisLetter.size();j++){
					if (thisLetter.get(j).equals(newLetter)) thisLetter.get(j).plusOne();
				}
			}
			else{
				thisLetter.push(newLetter);
			}
		}
	}
	
	public void sort(){
		
		boolean flag = true;   // set flag to true to begin first pass
		Letter temp;   			//holding variable
		
		while ( flag ){
			flag= false;    //set flag to false awaiting a possible swap
			for( int j=1;  j < thisLetter.size();  j++ ){
				Letter firstLetter = thisLetter.get(j-1);
				Letter secondLetter = thisLetter.get(j);
				if ( firstLetter.compareTo(secondLetter) == -1){   // change to > for ascending sort
					temp = firstLetter;                //swap elements
					thisLetter.setElementAt(secondLetter, j-1);;
					thisLetter.setElementAt(temp,j);
					flag = true;              //shows a swap occurred  
				} 
			} 
		}
	}
	
	public void createBinaryHeap(){
		BinaryHeap<BinaryTree<Letter>> toCreate = new BinaryHeap<BinaryTree<Letter>>();
		int size = thisLetter.size();
		for (int i=0; i<size; i++){
			BinaryTree<Letter> newTree = new BinaryTree<Letter>(thisLetter.get(i));
			toCreate.add(newTree);
		}
	
		for (int i=1; i<size; i++){
			int left = toCreate.get(toCreate.leftIndex(i)).getValue().getTimes();
			int right = toCreate.get(toCreate.rightIndex(i)).getValue().getTimes();
			if (left<right) toCreate.swap(toCreate.leftIndex(i), toCreate.rightIndex(i));
		}
		for (int i=1; i<size; i++){
			if (toCreate.hasLeftChild(i)){
				toCreate.get(i).setLeft(toCreate.get(toCreate.leftIndex(i)));
			}
			else if (toCreate.hasRightChild(i)){
				toCreate.get(i).setRight(toCreate.get(toCreate.rightIndex(i)));
			}
		}
		setFullTree(toCreate);
	}

	public BinaryHeap<BinaryTree<Letter>> getFullTree() {
		return fullTree;
	}

	public void setFullTree(BinaryHeap<BinaryTree<Letter>> fullTree) {
		this.fullTree = fullTree;
	}
}
