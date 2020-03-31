package inclass2;

public class Bubble {

	String[] data={"cat","Apple","apple","George","NEIT"};
	
	//Ascending order
	public String[] sort(String[] data){
		long start,stop,elapsed;
		start = System.currentTimeMillis();
		
		int len = data.length;
		
		for(int pass=1; pass<len; pass++){
			System.out.println("Pass = " + pass);
			for(int compares=0; compares<len-pass; compares++){
				System.out.println(compares);
				if(data[compares].compareTo(data[compares+1]) > 0){
					//swap
					String temp = data[compares];
					data[compares] = data[compares+1];
					data[compares+1] = temp;
				}
			}
		}
		
		stop = System.currentTimeMillis();
		elapsed = stop-start;
		System.out.println("Elapse: " + elapsed);
		
		return data;
	}
	
	//Descending order
		public String[] sortDesc(String[] data){
			long start,stop,elapsed;
			start = System.currentTimeMillis();
			
			int len = data.length;
			
			for(int pass=1; pass<len; pass++){
				System.out.println("Pass = " + pass);
				for(int compares=0; compares<len-pass; compares++){
					System.out.println(compares);
					if(data[compares].compareTo(data[compares+1]) < 0){
						//swap
						String temp = data[compares];
						data[compares] = data[compares+1];
						data[compares+1] = temp;
					}
				}
			}
			
			stop = System.currentTimeMillis();
			elapsed = stop-start;
			System.out.println("Elapse: " + elapsed);
			
			return data;
		}
	
	public void printData(){
		for(int i= 0;i<data.length; i++){
			System.out.println(data[i]);
		}
	}
	
	public static void main(String[] args){
		System.out.println("The unsorted order:");
		Bubble bubble = new Bubble();
		bubble.printData();
		
		System.out.println("The sorted order:");
		bubble.sort(bubble.data);
		bubble.printData();
		
		System.out.println("The sorted order(Descending)");
		bubble.sortDesc(bubble.data);
		bubble.printData();
	}
}
