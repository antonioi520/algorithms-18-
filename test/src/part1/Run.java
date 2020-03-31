package part1;
import java.util.Random;
import java.util.Scanner;
public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		//r.nextInt(65536);
		
		System.out.println("Please enter number of virtual addresses to generate");
		int number = keyboard.nextInt();
		
		int testAddress = 19986;
		int testOffset = testAddress % 4096;
		int testPage = testAddress / 4096;
		System.out.println("Test address equal to example");
		System.out.println("The address " + testAddress + " contains: page number = " + testPage + " offset = " + testOffset);
		System.out.println();
		
		for(int i = 0; i < number; i++){
			int address = r.nextInt(65536);
			int offset = address % 4096; 	
			int page = address / 4096;
			System.out.println("The address " + address + " contains: page number = " + page + " offset = " + offset);
		}
		keyboard.close();
	}

}
