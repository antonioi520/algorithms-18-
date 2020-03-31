package test;

public class Driver {
	public static void main(String[] args){
		
	
	 ArrayQueue aq = new ArrayQueue(15);

     aq.enqueue(10);
     aq.enqueue(11);
     aq.enqueue(1);
     aq.enqueue(0);
     aq.enqueue(5);
     
     System.out.println("Array Queue: ");
     System.out.println("Size: " + aq.size()); 
     System.out.println("Dequeue: " + aq.dequeue());    
     System.out.println("Size: " + aq.size()); 
     System.out.println("Dequeue: " + aq.dequeue()); 
	}
}
