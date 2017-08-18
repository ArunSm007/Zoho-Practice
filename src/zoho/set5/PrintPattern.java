package zoho.set5;

import java.util.ArrayList;
import java.util.List;

//1
//2 4
//3 5 7
//6 8 10 12

public class PrintPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> counted = new ArrayList<Integer>();
		for(int i = 1; i <= 7; i++) {
			int j = i;
			while(counted.contains(j)) {
				j++;
			}
			for(int k = 1; k <= i; k++) {
				counted.add(j);
				System.out.print(j+" ");
				j += 2;
			}
			System.out.println();
		}
	}
}
