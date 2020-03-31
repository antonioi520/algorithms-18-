package part2;

import java.util.Random;
import java.util.Scanner;

public class LFU {	
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int frames = 0;
		int fault = 0;
		int ref_len = 100;
		int reference[];
		reference = new int [ref_len];
		int frame[];
		boolean flag = true;
		int mem_layout[][];
		//int cache [];
		
		//get number of frames
		System.out.println("Enter number of page frames available");
		frames = keyboard.nextInt();
		
		//validate number of frames is between 2 and 7
		while(frames > 7 || frames < 2){
			System.out.println("Please enter a valid number");
			frames = keyboard.nextInt();
		}
		
		mem_layout = new int[ref_len][frames];
		frame = new int[frames];
		int count[]=new int[frames];

		//cache = new int [frames];
		
		for(int i = 0; i < frames; i++){
			frame[i] = -1;
			count[i] = 0;
		}
		//fill reference with pages
		for(int i = 0; i < ref_len; i++)
        {
			int address = r.nextInt(65536);
			int page = address / 4096;
			reference[i] = page;
        }
		
		for(int i=0; i<ref_len; i++)
        {
            flag = true;
            
        System.out.println("No. of page faults : "+fault);
        keyboard.close();		

        }
		
	}
}
	

