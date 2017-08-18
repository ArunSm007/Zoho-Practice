package zoho.set6;

//Given a string of integers find out all the possible words that can made out of it in continuous order. Eg: 11112
//
//ans: AAAAB
//AKAB
//AAKB
//AAAL etc.

public class PrintPossibleWords {

	public static void printPossible(String curr, String prev) {
		if(prev.length() == 0) {
			System.out.println(curr);
		}
		else {
			printPossible(curr + (char)('A' - 49 + prev.charAt(0)), prev.substring(1));
			if(prev.length() >= 2) {
				if(Integer.parseInt(prev.substring(0, 2)) <= 26)
					printPossible(curr + (char)('A' - 1 + Integer.parseInt(prev.substring(0, 2))), prev.substring(2));
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPossible("", "16312");
	}

}
