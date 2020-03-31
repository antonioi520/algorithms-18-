package inclass;

public class Driver {
	
	public static void main(String args[]){
		IntSLList li = new IntSLList();
		li.addToHead(8);
		li.addToHead(7);
		li.addToHead(5);
		li.addToTail(20);
		li.addToTail(20);
		li.addToTail(8);
		li.addToHead(-12);
		li.printAll();
		System.out.println();
		System.out.println("Sum:");
		li.sum();
		System.out.println("Max:");
		li.max();
		System.out.println("Min:");
		li.min();
		System.out.println();
		System.out.println("Remove Duplicates");
		li.removeDuplicates();
		li.printAll();
		System.out.println();
		System.out.println("Remove Median");
		li.removeMedian();
		li.printAll();
	}
}
