package zoho.set5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//5 problem given we have to solve at least 3
//Program 1:
//Help john to find new friends in social network
//Input:
//3
//Mani 3 ram raj guna
//Ram 2 kumar Kishore
//Mughil 3 praveen Naveen Ramesh
//Output:
//Raj guna kumar Kishore praveen Naveen Ramesh

public class FindFriends {
	
	public static void find(Map<String, List<String>> prof, Set<String> result) {
		boolean flag;
		for(Entry<String, List<String>> ent : prof.entrySet()) {
			for(String val : ent.getValue()) {
				flag = false;
				for(String key : prof.keySet()) {
					if(key.equalsIgnoreCase(val))
						flag = true;
				}
				if(!flag)
					result.add(val);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, List<String>> profiles = new HashMap<>();
		List<String> name = new ArrayList<>();
		name.add("ram");
		name.add("raj");
		name.add("guna");
		profiles.put("Mani", name);
		name = new ArrayList<>();
		name.add("kumar");
		name.add("Kishore");
		profiles.put("Ram", name);
		name = new ArrayList<>();
		name.add("praveen");
		name.add("Naveen");
		name.add("Ramesh");
		profiles.put("Mughil", name);
		Set<String> result = new LinkedHashSet<>();
		find(profiles, result);
		for(String name1 : result) {
			System.out.print(name1 + " ");
		}
	}

}
