package inclass3;

public class Quick {

	void quicksort(Object[] data){
		if(data.length < 2)
			return;
		int max = 0;
		//find the largest element and put it at the end of the data
		for (int i = 1; i < data.length; i++)
			if( ((Comparable)data[max]).compareTo(data[i]) < 0 )
				max = i;			
		swap(data, data.length-1, max);
		quicksort(data, 0, data.length-2);	
	}
	
	void quicksort(Object[] data, int first, int last){
		int lower = first + 1, upper = last;
		swap(data, first, (first+last)/2);
		Comparable bound = (Comparable)data[first];
		
		while(lower <= upper){
			while(bound.compareTo(data[lower]) > 0)
				lower++;
			while(bound.compareTo(data[upper]) < 0)
				upper--;
			if(lower < upper)
				swap(data, lower++, upper--);
			else
				lower++;
		}
		swap(data, upper, first);
		
		if(first<upper-1)
			quicksort(data,first,upper-1);
		if(upper+1 < last)
			quicksort(data,upper+1,last);
	}
	
	void swap(Object[] data, int first, int second){
		Object temp = new Object();
		temp = data[first];
		data[first] = data[second];
		data[second] = temp;
	}
	
	void display(Object[] data){
		for (int i=0; i<data.length; i++){
			System.out.println(data[i]);
		}
	}
	
	public static void main(String[] args){
//		Integer[] data = new Integer[11];
//		data[0] = new Integer(8);
//		data[1] = new Integer(5);
//		data[2] = new Integer(4);
//		data[3] = new Integer(7);
//		data[4] = new Integer(6);
//		data[5] = new Integer(1);
//		data[6] = new Integer(6);
//		data[7] = new Integer(3);
//		data[8] = new Integer(8);
//		data[9] = new Integer(12);
//		data[10] = new Integer(10);
		
		Integer[] data = new Integer[5];
		data[0] = new Integer(5);
		data[1] = new Integer(2);
		data[2] = new Integer(3);
		data[3] = new Integer(8);
		data[4] = new Integer(1);
		
		Quick quick = new Quick();
		quick.quicksort(data);
		quick.display(data);
	}
	
}
