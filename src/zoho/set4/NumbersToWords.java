package zoho.set4;

public class NumbersToWords {
	
	public static String[] singles = { "ZERO", "ONE ", "TWO ", "THREE ", "FOUR ", "FIVE ", "SIX ", "SEVEN ", "EIGHT ", "NINE " };
	
	public static String[] tens = { "", "", "TWENTY ", "THIRTY ", "FOURTY ", "FIVETY ", "SIXTY ", "SEVENTY ", "EIGHTY ", "NINETY "};
	
	public static String[] twos = { "TEN ", "ELEVEN ", "TWELVE ", "THIRTEEN ", "FOURTEEN ", "FIVETEEN ", "SIXTEEN ", "SEVENTEEN ", "EIGHTEEN ", "NINETEEN " };
	
	public static void twoPrint(String str) {
		if(str.length() == 2) {
			if(str.charAt(0) == '1') {
				System.out.print(twos[str.charAt(1) - '0']);
				return;
			}
			else {
				System.out.print(tens[str.charAt(0) - '0']);
			}
			if(str.charAt(1) != '0')
				System.out.print(singles[str.charAt(1) - '0']);
		}
		else {
			System.out.print(singles[str.charAt(0) - '0']);
		}
	}
	
	public static void print(String str) {
		if(str.length() == 3) {
			System.out.print(singles[str.charAt(0) - '0'] + "HUNDRED ");
			str = str.substring(1);
			if(str.charAt(0) != '0' || str.charAt(1) != '0') {
				System.out.print("AND ");
			}
		}
		twoPrint(str);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i <= 999; i++) {
			print(i+"");
			System.out.println();
		}
	}

}
