package test;

import java.util.Arrays;

public class ArrayQueue {
	private int[] data;
	private int head;
	private int tail;
	
	public ArrayQueue(int size) {
		data = new int[size];
		clear();
	}
	
	public void clear() {
		Arrays.fill(data, -1);
		head = 0;
		tail = 0;
	}
	
	public void enqueue(int element) {
		checkArrayRoom();
		int dataSize = this.size();
		data[dataSize] = element;
		tail++;
	}
	
	public int dequeue() {
		int result = -1;
		if(tail != head) {
			result = data[head];
			data[head] = -1;
			head = head + 1;
		}
		return result;
	}
	
	public int size() {
		if(head == tail)
			return 0;
		else 
			return (tail - head);
	}
	
	public boolean find(int element) {
		for(int i = 0; i < data.length; i++) {
			if(data[i] == element) {
				return true;
			}
		}
		return false;
	}
	
	public int indexOf(int element) {
		for(int i = 0; i < data.length; i++) {
			if(data[i] == element) {
				return i;
			}
		}
		return -1;
	}
	
	public void checkArrayRoom() {
		// in case the array is not big enough to push another element
		if(tail >= data.length) {
			int temp[] = new int[data.length * 2];
			for(int i = 0; i < data.length; i++) {
				temp[i] = data[i];
			}
			data = temp;
		}
	}

}
