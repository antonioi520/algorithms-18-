package midterm;
import java.util.Arrays;
import java.util.Random;
import sun.misc.Queue;



public class BankSimulation {
	static Random rd = new Random();
	static int Option(int percents[]){
		int i = 0, perc, choice = Math.abs(rd.nextInt()) % 100 + 1;
		for (perc = percents[0]; perc < choice; perc += percents[i+1], i++);
		return i;
	}
	public static void main(String args[]){
		int[] arrivals = {15,20,25,10,30};
		int[] service = {0,0,0,10,5,10,10,0,15,25,10,15};
		int[] clerks = {0,0,0,0}; //hint: vary this set from 6 clerk entries to 1
		int clerksSize = clerks.length;
		int customers, t, i, numOfMinutes = 100, x = 0;
		double maxWait = 0.0, thereIsLine = 0.0, currWait = 0.0;
		Queue simulQ = new Queue();
		for (t = 1; t <= numOfMinutes; t++){
			System.out.print(" t = " + t);
			for (i = 0; i < clerksSize; i++) //after each minute subtract
				if (clerks[i] < 60) 		 //at most 60 seconds of time
					clerks[i] = 0;			 //left to service the current
				else clerks[i] -= 60;        //customer by clerk i 
			customers = Option(arrivals);
			for (i = 0; i < customers; i++){ //enqueue all new customers
				x = Option(service)*10;      //or rather service time they require
				simulQ.enqueue(new Integer(x));
				currWait += x;
			}
			//dequeue customers when clerks are available
			for(i = 0; i < clerksSize && !simulQ.isEmpty();)
				if (clerks[i] < 60){
					try{
						x = ((Integer) simulQ.dequeue()).intValue();
					} catch (InterruptedException e){
						e.printStackTrace();
					}
					//assign more than 1 customer
					clerks[i] += x; // to a clerk if service time
					currWait -= x; // is still below 60 sec
				}
				else i++;
			if(!simulQ.isEmpty()){
				thereIsLine++;
				double waitTime = ((long)(currWait/6.0)) / 10.0;
				System.out.println(" wait = " + waitTime + ";");
				if (maxWait < currWait)
					maxWait = currWait;
			}
			else System.out.println(" wait = 0;");
		}
		double percLine = thereIsLine/numOfMinutes*100.0;
		double maxTime = maxWait/60.0;
		System.out.println("\nFor " + clerksSize + " clerks, there was a line " 
					+ percLine + "% of the time;\n"
					+ "maximum wait time was " + maxTime + " min.");
	}
}
