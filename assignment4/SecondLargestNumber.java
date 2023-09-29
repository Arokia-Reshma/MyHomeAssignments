package home.assignment4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {
	int [] array= {3,2,11,4,6,7};
	List<Integer> input = new LinkedList<Integer>();
	for(int num : array) {
		input.add(num);
	}
Collections.sort(input);
System.out.println("second largest number : " +input.get(input.size()-2));
	}

}
