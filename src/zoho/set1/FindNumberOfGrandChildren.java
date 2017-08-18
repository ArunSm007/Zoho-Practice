package zoho.set1;

public class FindNumberOfGrandChildren {
	
	public static String[] child, parent;
	
	public static int findChild(String str) {
		int count = 0;
		for(int i = 0; i < parent.length; i++) {
			if(parent[i].equals(str)) {
				count += 1;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child = new String[] {"luke", "wayne", "rooney", "shaw"};
		parent = new String[] {"shaw", "rooney", "ronaldo", "rooney"};
		String searchName = "rooney";
		int res = 0;
		for(int i = 0; i < child.length; i++) {
			if(parent[i].equals(searchName)) {
				res += findChild(child[i]);
			}
		}
		System.out.println(res);
	}

}
//Given a two dimensional array of string like
//
//<”luke”, “shaw”>
//<”wayne”, “rooney”>
//<”rooney”, “ronaldo”>
//<”shaw”, “rooney”> 
//Where the first string is “child”, second string is “Father”. And given “ronaldo” we have to find his no of grandchildren Here “ronaldo” has 2 grandchildren. So our output should be 2.