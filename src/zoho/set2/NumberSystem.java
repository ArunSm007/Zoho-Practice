package zoho.set2;

import java.util.HashMap;
import java.util.Map;

//Form a number system with only 3 and 4. Find the nth number of the number system.
//Eg.) 
//The numbers are: 3, 4, 33, 34, 43, 44, 333, 334, 343, 344, 433, 434, 443, 444, 3333, 3334, 3343, 3344, 3433, 3434, 3443, 3444 ….

public class NumberSystem {
	
	public static Map<Long,String> numbers = new HashMap<>();
	
	public static String getNumber(long n) {
		String temp = "";
		long j = 2;
		for(long i = 0; i <= n; i++) {
			if(i == n)
				return numbers.get(i);
			temp = numbers.get(i);
			numbers.put(j++,temp+"3");
			numbers.put(j++,temp+"4");
		}
		return "";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numbers.put(0L,"3");
		numbers.put(1L,"4");
		System.out.println(getNumber(1000L));
	}

}
