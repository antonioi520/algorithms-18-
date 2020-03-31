package fibonacci;

public class fibonacci {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//initialize how many times to calculate -> O(2)
		int fibonacciCount = 15;
		int [] fibonacciSeries = new int[fibonacciCount];
		fibonacciSeries[0] = 0;
		fibonacciSeries[1] = 1;
		//stores the series and initialize i -> O(N)
		for(int i=2; i < fibonacciCount; i++){
            fibonacciSeries[i] = fibonacciSeries[i-1] + fibonacciSeries[i-2];
        }
		//prints the series -> O(N)
        for(int i=0; i< fibonacciCount; i++){
                System.out.print(fibonacciSeries[i] + " ");
        }
        
        //O(2N)
        //asymptotic complexity is linear / O(N)
	}

}
