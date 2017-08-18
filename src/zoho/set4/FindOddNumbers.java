package zoho.set4;

//To find the odd numbers in between the range.
//Input:
//2
//15
//Output:
//3,5,7,9,11,13

public class FindOddNumbers {

	public static void findOdd(int x, int y) {
		if(x+1 % 2 == 0)
			x += 2;
		else
			x++;
		while(x < y) {
			System.out.print(x+" ");
			x += 2;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2, y = 15;
		findOdd(x, y);
	}

}
