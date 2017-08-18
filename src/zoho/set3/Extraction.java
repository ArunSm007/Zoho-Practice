package zoho.set3;

//Write a program to give the following output for the given input
//
//Eg 1: Input: a1b10
//       Output: abbbbbbbbbb
//Eg: 2: Input: b3c6d15
//          Output: bbbccccccddddddddddddddd
//The number varies from 1 to 99.

public class Extraction {
	
	public static void extract(String str) {
		String con = "";
		String num = "";
		for(int i = 0; i < str.length();) {
			con = new String("");
			num = new String("");
			while(i < str.length() && Character.isAlphabetic(str.charAt(i))){
				con += Character.toString(str.charAt(i++));
			}
			while(i < str.length() && Character.isDigit(str.charAt(i))){
				num += Character.toString(str.charAt(i++));
			}
			for(int j = new Integer(num); j > 0; j--) {
				System.out.print(con);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		extract("b100c6d15");
	}

}
