package lab;

public class recursionLab {
	public static void main(String[] args){
		String test = "hello world";
		System.out.println(reverse(test));
		System.out.println(reverse("abcd"));
		System.out.println(reverse("12345"));
		
		System.out.println();
		System.out.println(lookAndSayOutput(10,"1"));
	}
	
	public static String reverse(String string){
		int lengthOfString = string.length();
		if (lengthOfString == 0){
			return string;
		}
		return reverse(string.substring(1)) + string.charAt(0);		
	}
	
	public static String lookAndSay(String x, int y){ //x = starting value   y = iterations
		if (x.length() == y)
			  {
			    return String.valueOf(x.length()) + x.charAt(0);
			  }
		final char first = x.charAt(0);
		if (first == x.charAt(y)){
			return lookAndSay(x, y + 1);
		}
		else{
			return String.valueOf(x.substring(0, y).length()) +
					first + lookAndSay(x.substring(y), 0);
		}
	}
	
	public static String lookAndSayOutput(int x, String y){
		if (x <= 0){
			return y;
		}
		else{
			return y + " " + lookAndSayOutput(x - 1, lookAndSay(y, 0));
		}
	}
}
