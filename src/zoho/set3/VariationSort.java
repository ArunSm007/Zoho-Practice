package zoho.set3;

//Write a program to sort the elements in odd positions in descending order and elements in ascending order
//
//Eg 1: Input: 13,2 4,15,12,10,5
//        Output: 13,2,12,10,5,15,4
//Eg 2: Input: 1,2,3,4,5,6,7,8,9
//        Output: 9,2,7,4,5,6,3,8,1

public class VariationSort {
	
	public static void oddSort(int num[]) {
		int temp;
		for(int i = 0; i < num.length - 1; i++)
			for(int j = i+1; j < num.length; j++) {
				if(num[i] < num[j] && i % 2 == 0 && j % 2 == 0) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
				else if(num[i] > num[j] && i % 2 != 0 && j % 2 != 0) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
		oddSort(num);
		for(int i : num)
			System.out.print(i+" ");
	}

}
