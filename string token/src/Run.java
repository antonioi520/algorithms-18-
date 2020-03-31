import java.util.*;
import java.util.concurrent.TimeUnit;

public class Run {
	public static void processString(String string){
		String substring = "";
		for(int i = string.length(); i>=0; i--){
			if(i==0 || Character.toString(string.charAt(i-1)).matches("[ ]")){
				for(int x = substring.length(); x>0; x--){
					System.out.print(substring.charAt(x-1));
				}
				System.out.println();
				substring = "";
			}
			else{
				substring += string.charAt(i-1);
			}
		}
	}
	
	public static void timer(){
		long startTime = System.nanoTime();
		processString("My name is Antonio");
		long endTime = System.nanoTime();
		
		long difference = endTime - startTime;
		System.out.println ("Execution Time in Nanoseconds " + TimeUnit.NANOSECONDS.convert(difference, TimeUnit.NANOSECONDS));
        System.out.println ("Execution Time in Microseconds " + TimeUnit.MICROSECONDS.convert(difference, TimeUnit.NANOSECONDS));
        System.out.println ("Execution Time in Milliseconds " + TimeUnit.MILLISECONDS.convert(difference, TimeUnit.NANOSECONDS));
        System.out.println ("Execution Time in Seconds " + TimeUnit.SECONDS.convert(difference, TimeUnit.NANOSECONDS));
        
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner keyboard = new Scanner(System.in);
		//System.out.println("Enter your name");
		//String name = keyboard.nextLine()
        
        /* with functions
        String name = "Antonio is my name";
		String nameArray[] = name.split(" ")''
		
		for(int i=1; i < nameArray.length + 1; i++){
			String test2 = nameArray[nameArray.length - i];
			System.out.println(test2);
		}
        */
		timer();
		
		
		
		
		
	}

}
