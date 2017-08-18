package zoho.set5;

public class MatrixRotation {
	
	public static void rotate(int mat[][], int[][] res) {
		for(int i = 0; i < mat.length; i++) {
			for(int j = i; j < mat[i].length - i - 1; j++) {
				res[i][j+1] = mat[i][j];
				res[mat.length - i - 1][j] = mat[mat.length - 1 - i][j+1];
				res[j][i] = mat[j+1][i];
				res[j+1][mat[i].length - i - 1] = mat[j][mat[i].length - i - 1];
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int[][] res = new int[mat.length][mat[0].length];
		for(int i = 0; i < mat.length; i++) {
			res[i][i] = mat[i][i];
		}
		rotate(mat, res);
		for(int[] i : res) {
			for(int j : i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
