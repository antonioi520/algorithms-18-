package lab;


public class Sort {

	
	
	public static Object[] sort(Object[] data) {
		long start, stop, elapsed;
		start = System.nanoTime();
		
		int len = data.length;
		
		for(int pass = 1; pass < len; pass++) {
			for(int compares = 0; compares < len - pass; compares++) {
				if(((Comparable)data[compares]).compareTo(data[compares+1]) > 0) {
					Object temp = new Object();
					temp = data[compares];
					data[compares] = data[compares+1];
					data[compares+1] = temp;
				}
			}
		}
		
		stop = System.nanoTime();
		elapsed = stop - start;
		
		System.out.println("Sorting took " + elapsed + " nanoseconds");
		
		return data;
	}
	
}
