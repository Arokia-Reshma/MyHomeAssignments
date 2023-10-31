package home.assignment5;

import java.util.ArrayList;
import java.util.List;

public class Day1 {

	public static void main(String[] args) {
		List<String>lastword = new ArrayList<String>();
		lastword.add("Welcome");
		lastword.add("To");
		lastword.add("TestLeaf");
		System.out.println(lastword);
		String word = lastword.get(2);
		System.out.println("The Last word is :" +word);
		int size = word.length();
		System.out.println("Length of the last word :" +size);

	}

}
