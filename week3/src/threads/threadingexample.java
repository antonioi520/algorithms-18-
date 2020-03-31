package threads;

import java.util.LinkedList;
import java.util.List;

public class threadingexample {
	
	public static void main(String[] args){
		List<String> myList = new LinkedList<>();
		threadsample t1 = new threadsample(myList);
		t1.start();
		//t1.stop();
		
		//threadsample t2 = new threadsample();
		//t2.start();
	}
}
