package zoho.set5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

//Find the union intersection of two list and also find except (remove even elements from list1 and odd elements from list2)
//Input
//
//List 1: 1,3,4,5,6,8,9
//List 2: 1, 5,8,9,2
//
//Union: 1, 3,4,5,6,8,9,2
//Intersection: 1,5,8,9
//Except: 1, 3, 5,9,8,2 

public class UnionIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list1 = new LinkedList<>(Arrays.asList(1, 3, 4, 5, 6, 8, 9));

		List<Integer> list2 = new LinkedList<>(Arrays.asList(1, 5, 8, 9, 2));

		List<Integer> list3 = new ArrayList<>(list1);
		list3.retainAll(list2);

		System.out.println("Intersection : " + list3.toString());

		Set<Integer> set = new HashSet<>(list1);
		set.addAll(list2);

		List<Integer> list4 = new ArrayList<>(set);
		System.out.println("Union : " + list4.toString());

		for (int x = 0; x < list1.size();) {
			if (list1.get(x) % 2 == 0)
				list1.remove(x);
			else
				x++;
		}

		for (int x = 0; x < list2.size();) {
			if (list2.get(x) % 2 != 0)
				list2.remove(x);
			else
				x++;
		}

		System.out.println(list1);
		System.out.println(list2);
	}

}
