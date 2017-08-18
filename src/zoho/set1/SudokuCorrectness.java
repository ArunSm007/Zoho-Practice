package zoho.set1;

//Given a 9×9 sudoku we have to evaluate it for its correctness. 
//We have to check both the sub matrix correctness and the whole sudoku correctness

import java.util.Arrays;

public class SudokuCorrectness {
	public static int[][] sudBox = { { 2, 4, 8, 3, 9, 5, 7, 1, 6 },
            						 { 5, 7, 1, 6, 2, 8, 3, 4, 9 },
            						 { 9, 3, 6, 7, 4, 1, 5, 8, 2 },
            						 { 6, 8, 2, 5, 3, 9, 1, 7, 4 },
            						 { 3, 5, 9, 1, 7, 4, 6, 2, 8 },
						             { 7, 1, 4, 8, 6, 2, 9, 5, 3 }, 
						             { 8, 6, 3, 4, 1, 7, 2, 9, 5 },
						             { 1, 9, 5, 2, 8, 6, 4, 3, 7 }, 
						             { 4, 2, 7, 9, 5, 3, 8, 6, 1 } };
	public static boolean[] temp = new boolean[9];
	
	public static boolean checkHorizontal(int i, int j) {
		Arrays.fill(temp, false);
		while(j < 9) {
			if(temp[sudBox[i][j] - 1])
				return false;
			temp[sudBox[i][j] - 1] = true;
			j++;
		}
		return true;
	}
	
	public static boolean checkVertical(int i, int j) {
		Arrays.fill(temp, false);
		while(i < 9) {
			if(temp[sudBox[i][j] - 1])
				return false;
			temp[sudBox[i][j] - 1] = true;
			i++;
		}
		return true;
	}
	
	public static boolean checkSubSquare(int i, int j) {
		Arrays.fill(temp, false);
		for(int k = i; k < i + 3; k++)
			for(int l = j; l < j + 3; l++) {
				if(temp[sudBox[l][j] - 1])
					return false;
				temp[sudBox[i][j] - 1] = true;
			}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		for(i = 0; i < 9; i++) {
			if(!checkHorizontal(0, i) || !checkVertical(i, 0)) {
				System.out.println("Invalid");
				return;
			}
		}
		for(i = 0; i < 9; i += 3) {
			for(j = 0; j < 9; j += 3) {
				if(!checkHorizontal(i, j)) {
					System.out.println("Invalid");
					return;
				}
			}
		}
		System.out.println("Valid");
	}

}