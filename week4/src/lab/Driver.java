package lab;

import java.util.concurrent.TimeUnit;

public class Driver {
public static void main(String[] args) {
		
		timer();

        
        
	}

public static void timer(){
	long startTime = System.nanoTime();
	ArrayStack as = new ArrayStack(2);
	for(int i = 0; i < 1000000; i++){
		
		
		as.push(i);
		
	    
	    System.out.println("Array Stack: ");
	    System.out.println("Size: " + as.size()); 
	    System.out.println("Pop: " + as.pop());        
	    System.out.println("Size: " + as.size());        
	    System.out.println("Pop: " + as.pop());  
	}
	long endTime = System.nanoTime();
	
	long difference = endTime - startTime;
	System.out.println ("Execution Time in Nanoseconds " + TimeUnit.NANOSECONDS.convert(difference, TimeUnit.NANOSECONDS));
    System.out.println ("Execution Time in Microseconds " + TimeUnit.MICROSECONDS.convert(difference, TimeUnit.NANOSECONDS));
    System.out.println ("Execution Time in Milliseconds " + TimeUnit.MILLISECONDS.convert(difference, TimeUnit.NANOSECONDS));
    System.out.println ("Execution Time in Seconds " + TimeUnit.SECONDS.convert(difference, TimeUnit.NANOSECONDS));
    
}
}