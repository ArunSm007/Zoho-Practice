package zoho.set4;

//To find the print the pattern:
//Ip: n=5
//Op:
//1
//1 1
//2 1
//1 2 1 1
//1 1 1 2 2 1

public class PrintThePattern {
	
	public static String generate(String prev) {
		String next = "";
		int j = 0;
		for(int i = 0; i < prev.length(); i = j) {
			j = i+1;
			while(j < prev.length() && prev.charAt(j) == prev.charAt(i)) {
				j++;
			}
			next += Integer.toString(j - i) + prev.charAt(i);
		}
		return next;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String next = "1";
		int n = 6;
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < next.length(); j++)
				System.out.print(next.charAt(j)+" ");
			System.out.println();
			next = new String(generate(next));
		}
	}

}
