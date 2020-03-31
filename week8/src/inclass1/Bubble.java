package inclass1;

public class Bubble {

	int[] data = {5,2,3,8,1};
	
	//Ascending order
	public int[] sort(int[] data){
		int len = data.length;
		
		for(int pass = 1; pass<len; pass++){
			System.out.println("Pass =  " + pass);
			for (int compares = 0; compares<len-pass;compares++){
				System.out.println(compares);
				if(data[compares] > data[compares+1]){
					//swap
					int temp = data[compares];
					data[compares] = data[compares+1];
					data[compares+1] = temp;
				}
			}
		}
		return data;
	}
	
	//Descending order
		public int[] sortDesc(int[] data){
			int len = data.length;
			
			for(int pass = 1; pass<len; pass++){
				System.out.println("Pass =  " + pass);
				for (int compares = 0; compares<len-pass;compares++){
					System.out.println(compares);
					if(data[compares] <  data[compares+1]){
						//swap
						int temp = data[compares];
						data[compares] = data[compares+1];
						data[compares+1] = temp;
					}
				}
			}
			return data;
		}
	
	public void printData(){
		for(int i = 0; i < data.length; i++){
			System.out.println(data[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The unsorted order:");
		Bubble bubble = new Bubble();
		bubble.printData();
		
		System.out.println("The sorted data:");
		bubble.sort(bubble.data);
		bubble.printData();
		
		System.out.println("The sorted data (Descending):");
		bubble.sortDesc(bubble.data);
		bubble.printData();
	}

}
