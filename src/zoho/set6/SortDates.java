package zoho.set6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortDates implements Comparator<SortDates>{
	
	int day, month, year;
	
	public SortDates() {
		// TODO Auto-generated constructor stub
	}
	
	public SortDates(int d, int m, int y) {
		// TODO Auto-generated constructor stub
		day = d;
		month = m;
		year = y;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<SortDates> dates = new ArrayList<>();
		
		SortDates obj = new SortDates(20, 1, 2014);
		dates.add(obj);
		
		obj = new SortDates(25, 3, 2010);
		dates.add(obj);
		
		obj = new SortDates(3, 12, 1676);
		dates.add(obj);
		
		obj = new SortDates(18, 11, 1982);
		dates.add(obj);
		
		obj = new SortDates(19, 4, 2015);
		dates.add(obj);
		
		obj = new SortDates(9, 7, 2015);
		dates.add(obj);
		
		Collections.sort(dates, new SortDates());
		
		for(SortDates d : dates) {
			System.out.println(d.day+" "+d.month+" "+d.year);
		}
	}
	
	@Override
	public int compare(SortDates o1, SortDates o2) {
		// TODO Auto-generated method stub
		if(o1.year < o2.year)
			return -1;
		else if(o1.year == o2.year && o1.month < o2.month)
			return -1;
		else if(o1.year == o2.year && o1.month == o2.month && o1.day < o2.day)
			return -1;
		return 1;
	}

}
