package zoho.set5;

import java.util.Arrays;

//Input:
//With the starting and ending time of work given find the minimum no of workers needed
//
//Start time 		end time
//1230			0130
//1200			0100
//1600			1700

public class WorkersNeeded {
	
	public static int findNoOfWorkers(int[] arrival, int[] departure) {
		int count = 0, max = 0;;
		for(int i = 0, j = 0; i < arrival.length && j < departure.length;) {
			if(arrival[i] < departure[j]) {
				count++;
				i++;
			}
			else {
				count--;
				j++;
			}
			if(count > max)
				max = count;
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrival[] = new int[] {1100,1102};
		int departure[] = new int[] {1101,1103};
		for(int i = 0; i < arrival.length; i++) {
			if(arrival[i] >= 1200 && departure[i] < 1200)
				departure[i] += 2400;
		}
		Arrays.sort(arrival);
		Arrays.sort(departure);
		System.out.println(findNoOfWorkers(arrival, departure));
	}

}
