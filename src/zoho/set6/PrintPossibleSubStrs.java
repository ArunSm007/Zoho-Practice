package zoho.set6;

public class PrintPossibleSubStrs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcd";
		for(int i = 1; i < str.length(); i++) {
			for(int j = 0; j + i < str.length(); j++)
				System.out.println(str.substring(j, j+i));
		}
	}

}
