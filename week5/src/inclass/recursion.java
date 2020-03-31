package inclass;

public class recursion {
	public static void main(String[] args){
		double y = power(5.6, 2); //function using recursion
		double x = forPower(5.6, 2); //function using for loop
		
		System.out.println(y);
		System.out.println(x);
	}

	static double power(double x, int n) {
		// TODO Auto-generated method stub
		if( n == 0 )
			return 1;
		//else
		return x * power(x, n-1); //remove -1 to create stack overflow - not enough memory
	}
	
	static double forPower(double x, int n) {
		// TODO Auto-generated method stub
		double result = 1; 
		if( n > 0 ){ //else return 1
			for (result = x; n > 1; --n){ 
				result *= x; 
			}
		}
		return result;

	}
}
