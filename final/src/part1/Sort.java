package part1;

import java.util.Arrays;

public class Sort {
	String[] finalStr;
	public static String sortString(String data){
		if (data == " "){ return " "; } // return empty string if no input string
		String[] str = data.split("\\s+"); // put each word into an array separated by a space
		int[] strNumber = new int[str.length]; //create an array to put the numbers in from the words
		for(int x = 0; x < str.length; x++){
			strNumber[x] = numbers(str[x]); //puts the numbers into the array
		}
		Arrays.sort(strNumber); //sort it from least to greatest
		
		int len = strNumber.length;
		
		String[] finalStr = new String[len]; //create array to store the sorted string
		for (int pass = 0; pass < len; pass++){ //pass through the numbers in strNumber array
			for (int compares = 0; compares < str.length; compares++){ 		//pass through the words, 
				if (strNumber[pass] == numbers(str[compares])){         		//take the number from the word, 
					finalStr[pass] = str[compares];					   		//and compare it to the order of the numbers from strNumber array
				}
			}
		}
		
		String result = "";
		for(int i= 0;i<finalStr.length; i++){
			result += finalStr[i] + " ";
			
		}
		return result;
	}
	//extract number from word
	public static int numbers(String str) {
		int test = 0;
		String number = "";
		for (int x = 0; x < str.length(); x++) {
			char chrs = str.charAt(x);
			if (Character.isDigit(chrs)) {
				number += chrs;
				test = Integer.parseInt(number);
			}
		}
		return test;
	}
	public static void main(String[] args){
		String str1 = "is2 Thi1s T4est 3a";
		Sort test = new Sort();
		System.out.println(test.sortString(str1));
		
	}
}
