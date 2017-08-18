package zoho.set4;

//A man his driving car from home to office with X petrol. There are N number of petrol bunks in the city with only few capacities and each petrol is located in different places For one km one liter will consume. So he fill up petrol in his petrol tank in each petrol bunks. Output the remaining petrol if he has or tell him that he cannot travel if he is out of petrol.
//Input:
//Petrol in car: 2 Liters
//Petrol bunks: A B C
//Distance from petrol each petrol bunks: 1, 5, 3
//Capacities of each petrol bunk: 6, 4, 2

public class FindRemainingPetrol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int currentPetrol = 2;
		int[] petrolBanks = new int[] {1, 5, 3};
		int[] capacities = new int[] {6, 4, 2};
		for(int i = 0; i < petrolBanks.length; i++) {
			currentPetrol -= petrolBanks[i];
			if(currentPetrol < 0)
				break;
			currentPetrol += capacities[i];
		}
		System.out.println(currentPetrol > 0 ? currentPetrol : "Cannot Travel");
	}

}
