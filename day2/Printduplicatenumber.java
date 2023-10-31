package week1.day2;

public class Printduplicatenumber {

	public static void main(String[] args) {
		int[] number={2,5,7,7,5,9,2,3};
		for (int i = 0; i < number.length; i++) {
			for (int j = i+1; j < number.length; j++) {
				if(number[i]==number[j])
					System.out.println("Duplicate Values:"+number[j]);
				
			}
			
		}
		

	}

}
