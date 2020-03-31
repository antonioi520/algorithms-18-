package threads;

import java.util.List;
import java.util.UUID;

public class threadsample extends Thread{
	
	List<String> myList = null;
	public threadsample(List<String> list){
		this.myList=list;
	}
	
	public void run(){
		while(!Thread.interrupted()){
			String uuid = UUID.randomUUID().toString();
			myList.add(uuid);
			super.run();
			System.out.println(Thread.currentThread().getName() + " says added " + uuid);
		}
	}
}
