package zoho.set4;

//Print the given pattern:
//Input:
//N= 3, M=3
//Output:
//X X X
//X 0 X
//X X X
//
//Input:
//N=4 M=5
//Output:
//X X X X
//X 0 0 X
//X 0 0 X
//X 0 0 X
//X X X X
//
//Input:
//N=6 M=7
//X X X X X X
//X 0 0 0 0 X
//X 0 X X 0 X
//X 0 X X 0 X
//X 0 X X 0 X
//X 0 0 0 0 X
//X X X X X X

public class PrintAlternateRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 6, M = 7;
		char[][] mat = new char[M + 1][N + 1];
		char ch = 'X';
		int j = 0, k = 0;
		for(int i = 1; i <= M/2 + 1; i++) {
			for(j = i; j <= N + 1 - i; j++) {
				mat[i][j] = ch;
			}
			j--;
			for(k = i + 1; k <= M - i + 1; k++) {
				mat[k][j] = ch;
			}
			k--;
			while(j >= i)
				mat[k][j--] = ch;
			j++;
			while(k > i)
				mat[k--][j] = ch;
			if(ch == 'X')
				ch = '0';
			else
				ch = 'X';
		}
		for(int i = 1; i <= M; i++) {
			for(j = 1; j <= N; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}

}
