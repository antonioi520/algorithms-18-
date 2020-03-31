package lab;

import java.util.Arrays;

public class ArrayStack {
	private int[] data;
	private int tail;
	private int head;
	
	public ArrayStack(int size) {
		data = new int[size];
		clear();
	}
	
	public void clear() {
		Arrays.fill(data, -1);
		head = 0;
		tail = 0;
	}
	
	public void push(int element) {
		checkArrayRoom();
		int dataSize = this.size();
		data[dataSize] = element;
		tail++;
	}
	
	public int pop() {
		int result = -1;
		if(tail != head) {
			int dataSize = this.size() - 1;
			result = data[dataSize];
			data[dataSize] = -1;
			tail--;
		}
		return result;
	}
	
	public int size() {
		return tail;
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
