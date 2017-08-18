package zoho.set1;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;

public class PrintNumbersBasedOnWeight implements Comparator<Entry<Integer, Integer>>{
	
	public static int findWeight(int x) {
		int y = (int) Math.sqrt(x);
		if(y*y == x)
			return 5;
		if(x%12 == 0)
			return 4;
		if(x%2 == 0)
			return 3;
		return 0;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Entry<Integer, Integer>> nums = new ArrayList<>();
		nums.add(new SimpleEntry(10, findWeight(10)));
		nums.add(new SimpleEntry(36, findWeight(36)));
		nums.add(new SimpleEntry(54, findWeight(54)));
		nums.add(new SimpleEntry(89, findWeight(89)));
		nums.add(new SimpleEntry(12, findWeight(12)));
		Collections.sort(nums, new PrintNumbersBasedOnWeight());
		for(Entry<Integer, Integer> e : nums) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

	@Override
	public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
		// TODO Auto-generated method stub
		if(o1.getValue() < o2.getValue())
			return -1;
		else if(o1.getValue() > o2.getValue())
			return 1;
		return 0;
	}

}

//Given a set of numbers like <10, 36, 54,89,12> we want to find sum of weights based on the following conditions
//1. 5 if a perfect square
//2. 4 if multiple of 4 and divisible by 6
//3. 3 if even number
//
//And sort the numbers based on the weight and print it as follows
//
//<10,its_weight>,<36,its weight><89,its weight>