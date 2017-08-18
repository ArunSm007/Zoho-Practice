package zoho.set4;

//Input:
//Number of elements in set1: 4
//Elements are: 9, 9, 9, 9
//Number of elements in set 2: 3
//Elements are: 1,1,1
//Output:
//1, 0, 1, 1, 0
//Input:
//Number of elements in set1: 11
//Elements are: 7,2,3,4,5,3,1,2,7,2,8
//Number of elements in set 2: 3
//Elements are: 1,2,3
//Output: 7,2,3,4,5,3,1,2,8,5,1

public class ArrayAddition {

	public static int addArrays(int[] a1, int[] a2, int[] res) {
		int rem = 0;
		int temp;
		int i = 0, j = 0;
		for (i = a1.length - 1, j = a2.length - 1; i >= 0 && j >= 0; i--, j--) {
			temp = a1[i] + a2[j] + rem;
			res[i] = temp % 10;
			rem = temp / 10;
		}
		while (i >= 0) {
			temp = a1[i] + rem;
			res[i] = temp % 10;
			rem = temp / 10;
			--i;
		}
		return rem;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = new int[] { 7, 2, 3, 4, 5, 3, 1, 2, 7, 2, 8 };
		int[] a2 = new int[] { 1, 2, 3 };
		int[] res = new int[Math.max(a1.length, a2.length)];
		int rem;
		if (a1.length >= a2.length)
			rem = addArrays(a1, a2, res);
		else
			rem = addArrays(a2, a1, res);
		if (rem != 0)
			System.out.print(rem + " ");
		for (int i : res)
			System.out.print(i + " ");
	}

}
