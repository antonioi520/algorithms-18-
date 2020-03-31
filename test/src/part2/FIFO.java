package part2;
import java.util.Random;
import java.util.Scanner;

public class FIFO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int frames = 0;
		int fault = 0;
		int pointer = 0;
		int ref_len = 100;
		int buffer[];
		int reference[];
		reference = new int [ref_len];
		int mem_layout[][];
		
		//get number of frames
		System.out.println("Enter number of page frames available");
		frames = keyboard.nextInt();
		
		//validate number of frames is between 2 and 7
		while(frames > 7 || frames < 2){
			System.out.println("Please enter a valid number");
			frames = keyboard.nextInt();
		}
		
		mem_layout = new int[ref_len][frames];
		buffer = new int[frames];
		
		//fill reference with pages
		for(int i = 0; i < ref_len; i++)
        {
			int address = r.nextInt(65536);
			int page = address / 4096;
            reference[i] = page;
        }
		
		System.out.println();
        for(int i = 0; i < ref_len; i++)
        {
         int search = -1;
         for(int j = 0; j < frames; j++)   //sets search to be equal to page if no page is available to replace and moves to next frame
         {
          if(buffer[j] == reference[i])
          {
           search = j;
           break;
          } 
         }
         if(search == -1)                   //replaces page and increments fault 
         {
          buffer[pointer] = reference[i];  
          fault++;
          pointer++;
          if(pointer == frames)
           pointer = 0;
         }
            for(int j = 0; j < frames; j++)
                mem_layout[i][j] = buffer[j];
        }
        System.out.println("Page Reference");
        for(int i = 0; i < ref_len; i++){
        	System.out.printf("%3d ", reference[i]);
        }
        System.out.println();
        System.out.println();
        System.out.println("Frames");
        //output layout of frames and how they change
        for(int i = 0; i < frames; i++)
        {
            for(int j = 0; j < ref_len; j++)
                System.out.printf("%3d ",mem_layout[j][i]);
            System.out.println();
        }
        
        System.out.println("The number of Faults: " + fault);
        keyboard.close();
	}

}
