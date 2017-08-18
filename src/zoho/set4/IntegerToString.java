package zoho.set4;

//To output the given string for the given input which is an integer.
//Input: 1
//Output: A
//Input: 26
//Output: Z
//Input : 27
//Output: AA
//Input: 28:
//Output: AB
//Input: 1000
//Output: ALL

public class IntegerToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		String out = "";
		for(int i = 1; i < 100; i++) {
			x = i;
			while(x > 0) {
				if(x%26 == 0) {
					out = out.concat("Z");
					--x;
				}
				else {
					out = out.concat(""+(char)('A'+(x%26 - 1)));
				}
				x /= 26;
			}
			System.out.println(new StringBuffer(out).reverse());
			out = "";
		}
	}

}
