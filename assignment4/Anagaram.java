package home.assignment4;

import java.util.Arrays;

public class Anagaram {

	public static void main(String[] args) {
		String text1="stops";
		String text2 = "potss";
		
		if (text1.length()==text2.length()){
		
		}
	else {
		System.out.println("length mismatch, strings are not Anagaram");
			
		}
			char[] charArray1 = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
Arrays.sort(charArray1);
Arrays.sort(charArray2);
if(Arrays.equals(charArray1, charArray2))
{

System.out.println("The given strings are Anagaram");


	}
else {
	System.out.println("the given strings are not Anagaram");
}
	
}
	}




