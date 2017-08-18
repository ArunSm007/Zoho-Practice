package zoho.set1;

public class MatrixSearch {

	public static char c[][] = {{ 'w', 'e', 'T', 'o', 'O' }, 
								{ 'M', 'E', 'T', 'O', 'Z' },
								{ 'O', 'H', 'O', 'C', 'O' },
								{ 'R', 'P', 'O', 'R', 'A' },
								{ 'T', 'I', 'O', 'n', ' ' } };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Too";
		int i = 0, j = 0, k = 0;
		boolean flag = false, flag1 = false, flag3 = false;
		for(i = 0; i < 5; i++) {
			for(j = 0; j < 5; j++) {
				// Check diagonally
				if(i+str.length() <= 5 && j+str.length() <= 5) {
					flag3 = true;
					for(k = 0; k < str.length() && flag3; k++) {
						if(Character.toLowerCase(c[i+k][j+k]) == Character.toLowerCase(str.charAt(k)))
							flag3 = true;
						else
							flag3 = false;
					}
					if(flag3) {
						System.out.println(i+" "+j+"\n"+(i+k-1)+" "+(j+k-1));
						return;
					}
				}
				// Check horizontally
				if(j+str.length() <= 5) {
					flag = true;
					for(k = 0; k < str.length() && flag; k++) {
						if(Character.toLowerCase(c[i][j+k]) == Character.toLowerCase(str.charAt(k)))
							flag = true;
						else
							flag = false;
					}
					if(flag) {
						System.out.println(i+" "+j+"\n"+i+" "+(j+k-1));
						return;
					}
				}
				// Check vertically
				if(i+str.length() <= 5) {
					flag1 = true;
					for(k = 0; k < str.length() && flag1; k++) {
						if(Character.toLowerCase(c[i+k][j]) == Character.toLowerCase(str.charAt(k)))
							flag1 = true;
						else
							flag1 = false;
					}
					if(flag1) {
						System.out.println(i+" "+j+"\n"+(i+k-1)+" "+(j));
						return;
					}
				}
			}
		}
	}

}

// Save the string “WELCOMETOZOHOCORPORATION” in a two dimensional array and
// search for substring like “too” in the two dimensional string both from left
// to right and from top to bottom.
//
// w e L C O
// M E T O Z
// O H O C O
// R P O R A
// T I O n
// And print the start and ending index as
//
// Start index : <1,2>
//
// End index: <3, 2>