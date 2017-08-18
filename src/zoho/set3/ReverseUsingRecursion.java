package zoho.set3;

//Using Recursion reverse the string such as
//
//Eg 1: Input: one two three
//      Output: three two one
//Eg 2: Input: I love india
//      Output: india love I 

public class ReverseUsingRecursion {
	
	public static String recursiveReverse(String str) {
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				return recursiveReverse(str.substring(i+1))+" "+str.substring(0, i); 
			}
		}
		return str;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I love india";
		System.out.println(recursiveReverse(str));
	}

}
