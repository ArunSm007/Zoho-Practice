package zoho.set4;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;

//To find the factors of the numbers given in an array and to sort the numbers in descending order according to the factors present in it.
//Input:
//Given array : 8, 2, 3, 12, 16
//Output:
//12, 16, 8, 2, 3

public class FactorSort {

	public static int findFactors(int x) {
		int count = 1;
		if (x == 0)
			return Integer.MAX_VALUE;
		if (x == 1)
			return count;
		for (int i = 2; i <= x / 2; i++) {
			if (x % i == 0)
				count++;
		}
		return count + 1;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Entry<Integer, Integer>> nums = new ArrayList<>();
		nums.add(new SimpleEntry(8, findFactors(8)));
		nums.add(new SimpleEntry(2, findFactors(2)));
		nums.add(new SimpleEntry(3, findFactors(3)));
		nums.add(new SimpleEntry(12, findFactors(12)));
		nums.add(new SimpleEntry(16, findFactors(16)));
		Collections.sort(nums, new Comparator<Entry<Integer, Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				// TODO Auto-generated method stub
				if (o1.getValue() > o2.getValue()) {
					return -1;
				}
				if (o1.getValue() < o2.getValue()) {
					return 1;
				}
				if (o1.getKey() > o2.getKey()) {
					return 1;
				}
				if (o1.getKey() < o2.getKey()) {
					return -1;
				}
				return 0;
			}
		});
		for (Entry<Integer, Integer> en : nums) {
			System.out.println(en.getKey()/* + " " + en.getValue()*/);
		}
	}

}
