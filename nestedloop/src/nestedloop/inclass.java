package nestedloop;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class inclass {
		public static int rowSize;
		public static int columnSize;
		
		public static void generateGrid(){
	        Random r = new Random();
			boolean[][] bossGrid = new boolean[columnSize][rowSize];
			int col = r.nextInt(rowSize - 1) + 1;
			int row = r.nextInt(columnSize - 1) + 1;
			
			bossGrid[col][row] = true;
			findBoss(bossGrid);
		}
		
		public static void printGrid(boolean[][] bossGrid){
			for(int i =0; i<rowSize; i++){
				for(int x=0;x<columnSize;x++){
					if(bossGrid[i][x] == false){
						System.out.print(" O ");
					}
					else{
						System.out.print(" X ");
					}
				}
			}
		}
		
		public static void findBoss(boolean[][] bossGrid){
			System.out.println();
			for(int i = 0; i<rowSize; i++){
				for (int x = 0; x<columnSize;x++){
					if(bossGrid[i][x] == true){
						System.out.println("Boss is in row " + ++i + " column " + ++x);
						return;
					}
				}
			}
		}
		
		public static void timer(){
			long startTime = System.nanoTime();
			generateGrid();
			long endTime = System.nanoTime();
			
			long difference = endTime - startTime;
			System.out.println ("Execution Time in Nanoseconds " + TimeUnit.NANOSECONDS.convert(difference, TimeUnit.NANOSECONDS));
	        System.out.println ("Execution Time in Microseconds " + TimeUnit.MICROSECONDS.convert(difference, TimeUnit.NANOSECONDS));
	        System.out.println ("Execution Time in Milliseconds " + TimeUnit.MILLISECONDS.convert(difference, TimeUnit.NANOSECONDS));
	        System.out.println ("Execution Time in Seconds " + TimeUnit.SECONDS.convert(difference, TimeUnit.NANOSECONDS));
	        
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*//start timer
		long length = 1000000000L;
        long start = System.nanoTime();
        
		
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        
        //enter how big the grid is and how many times to run
        System.out.println("Enter row length");
        int rowLength = keyboard.nextInt();
        System.out.println("Enter column length");
        int columnLength = keyboard.nextInt();
        System.out.println("Enter how many times to run the program");
        int run = keyboard.nextInt();
        
        int outputRow = 0;
		int outputColumn = 0;
		
		
		//find boss
		for(int i=0; i<run; i++){ //how many times it will run
			//randomize where boss is on grid
	        int bossRow = r.nextInt(rowLength-1) + 1;
	      	int bossColumn = r.nextInt(columnLength-1) + 1;
	      	
			//output location
      		System.out.println("The boss is on row " + outputRow + " and column " + outputColumn);
      		
      		//end timer
	        long end = System.nanoTime();    
	        long difference = end - start;      
	        //output timer results
	        System.out.println ("Execution Time in Nanoseconds " + TimeUnit.NANOSECONDS.convert(difference, TimeUnit.NANOSECONDS));
	        System.out.println ("Execution Time in Microseconds " + TimeUnit.MICROSECONDS.convert(difference, TimeUnit.NANOSECONDS));
	        System.out.println ("Execution Time in Milliseconds " + TimeUnit.MILLISECONDS.convert(difference, TimeUnit.NANOSECONDS));
	        System.out.println ("Execution Time in Seconds " + TimeUnit.SECONDS.convert(difference, TimeUnit.NANOSECONDS));
	        
      		
	        for(int x=0;x<rowLength;x++){	//find row		
				for(int y=0;y<columnLength;y++){ //find column
					if (x==bossRow){
						outputRow = x;
					}
					if (y==bossColumn){
						outputColumn = y;
					}			
				}		
			}  
	    }
		*/
		for(int i=0; i<100; i++){//how many times it will run
		rowSize = 16;
		columnSize = 16;
		timer();
		}
	}

}

//asymptotic complexity = quadratic (n^2) 