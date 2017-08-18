package zoho.set3;

//Find if a String2 is substring of String1. If it is, return the index of the first occurrence. else return -1.
//
//Eg 1:Input:
//        String 1: test123string
//         String 2: 123
//        Output: 4
//Eg 2: Input:
//        String 1: testing12
//        String 2: 1234 
//        Output: -1

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubStringCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String parent = "test12";
		String child = "1234";
		Pattern pattern = Pattern.compile(child);
		Matcher matcher = pattern.matcher(parent);
		if(matcher.find()) {
			System.out.println(matcher.start());
		}
		else
			System.out.println(-1);
	}

}
