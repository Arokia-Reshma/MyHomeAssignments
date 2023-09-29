package home.assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingElements {

	public static void main(String[] args) {
		List<String>values =new ArrayList<String>();
		values.add("HCL");
		values.add("Wipro");
		values.add("AspireSystems");
		values.add("CTS");
		System.out.println("Given Input :" +values);
		Collections.sort(values);
		System.out.println("Ascending order :" +values);
		Collections.reverse(values);
		System.out.println("Reverse order :" +values);
		
		

	}

}
