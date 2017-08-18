package zoho.set5;

//Find the largest possible prime number with given no
//Input
//5
//4691
//Output:
//9461

public class LargestPrime {
	
	static int max = 0;
	
	public static boolean isPrime(int x) {
		for(int i = 2; i <= x/2; i++)
			if(x%i == 0)
				return false;
		return true;
	}
	
	public static void findLargestPrime(String curr, String next) {
		if(next.length() == 0) {
			int temp = Integer.parseInt(curr);
			if(isPrime(temp) && max < temp)
				max = temp;
		}
		else {
			for(int i = 0; i < next.length(); i++) {
				findLargestPrime(curr + next.charAt(i), next.substring(0, i)+next.substring(i+1));
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findLargestPrime("", "4619");
		System.out.println(max);
	}

}
