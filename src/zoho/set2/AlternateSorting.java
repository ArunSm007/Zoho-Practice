package zoho.set2;

//Alternate sorting: Given an array of integers, rearrange the array in such a way that the first element is first maximum and second element is first minimum.
//
//Eg.) Input  : {1, 2, 3, 4, 5, 6, 7}
//     Output : {7, 1, 6, 2, 5, 3, 4} 

public class AlternateSorting {
	//Sort method
	public static void sort(int a[]) {
		for(int i = 0; i < a.length - 1; i++)
			for(int j = i+1; j < a.length; j++) {
				if(a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1, 2, 3, 4, 5, 6, 7};
//		Arrays.sort(a); 
		sort(a);
		int i, j;
		for(i = a.length - 1, j = 0; i!=j; i--,j++) {
			System.out.print(a[i]+" "+a[j]+" ");
		}
		System.out.println(a[i]);
	}

}
