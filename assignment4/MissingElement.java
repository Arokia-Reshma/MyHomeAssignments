package home.assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
	 int [] array = {1,2,3,4,10,6,8};
	 Arrays.sort(array);
	// System.out.println(Arrays.toString(array));
	 List<Integer>data = new ArrayList<Integer>();
	 for (Integer num : array) {
		 data.add(num);
		
	}
	 for(int i= 0 ; i < data.size()-1; i++) {
		 int currentElement = data.get(i);
		 int nextElement = data.get(i+1);
	 

if(currentElement+1 != nextElement) {
int missingElement=currentElement+1;
System.out.println("missingElement in the list : " +missingElement);
}
	}
	}
}


