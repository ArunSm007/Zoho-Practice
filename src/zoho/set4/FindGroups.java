package zoho.set4;

//To find the number of groups and output the groups:
//Explanation: To find the sum of the elements in the groups and that sum should be divisible by input X and the groups should be limited to range with X numbers.
//If X is 3, then the group should have only 2 elements and 3 elements from the array whose sum is divisible by 3.
//Input:
//Array: 3, 9, 7, 4, 6, 8
//X: 3
//Output:
//3, 9
//3, 6
//9, 6
//3, 9, 6
//No of groups: 4

public class FindGroups {
	
	public static boolean[] visited = new boolean[1000];
	public static int N;
	
	public static void printVisited(int nums[]) {
		for(int i = 0; i < visited.length; i++) {
			if(visited[i]) {
				System.out.print(nums[i]+" ");
			}
		}
		System.out.println();
	}
	
	public static void findGroup(int[] nums, int index, int count, int sum) {
		if(count < N) {
			visited[index] = true;
			sum += nums[index];
			if(count > 0 && sum % N == 0) {
				printVisited(nums);
			}
			if(count != N - 1)
				for(int i = index + 1; i < nums.length; i++)
					findGroup(nums, i, count + 1, sum);
			visited[index] = false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 1, 3, 4 };
		N = 3;
		for(int i =  0; i < nums.length; i++)
			findGroup(nums, i, 0, 0);
		
	}

}
