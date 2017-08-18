package zoho.set3;

//Given two sorted arrays, merge them such that the elements are not repeated
//
//Eg 1: Input:
//        Array 1: 2,4,5,6,7,9,10,13
//        Array 2: 2,3,4,5,6,7,8,9,11,15
//       Output:
//       Merged array: 2,3,4,5,6,7,8,9,10,11,13,15 

public class MergeTwoArrays {
	
	public static int merge(int[] a1, int[] a2, int[] output) {
		int i = 0, j = 0, k = 0;
		while(i < a1.length && j < a2.length) {
			if(a1[i] < a2[j]) {
				output[k++] = a1[i++];
			}
			else if(a1[i] > a2[j]) {
				output[k++] = a2[j++];
			}
			else {
				output[k++] = a1[i++];
				j++;
			}
		}
		while(i < a1.length) {
			output[k++] = a1[i++];
		}
		while(j < a2.length) {
			output[k++] = a2[j++];
		}
		return k;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = {2, 4, 5, 6, 7, 9, 10, 13};
		int[] a2 = {2, 3, 4, 5, 6, 7, 8, 9, 11, 15};
		int[] output = new int[a1.length + a2.length];
		int end = merge(a1, a2, output);
		for(int i = 0; i < end; i++)
			System.out.print(output[i]+" ");
	}

}
