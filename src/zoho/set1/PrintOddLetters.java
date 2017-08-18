package zoho.set1;

public class PrintOddLetters {
	
	public static void print(String st) {
		int length = st.length() - 1;
		for(int i = 0; i <= length; i++) {
			for(int j = 0; j <= length; j++) {
				if(i == j || length - i == j)
					System.out.print(st.charAt(j));
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print("PROGRAM");
	}

}

/*
Print the word with odd letters as

P     M
 R   A
  O R
   G
  O R
 R   A
P     M 
		
*/