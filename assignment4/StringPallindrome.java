package home.assignment4;

public class StringPallindrome {

	public static void main(String[] args) {
		
		String word = "madam";
		 String reverse = "";
		 char ch;
		
		for(int i= 0; i<word.length();i++) {
		ch=word.charAt(i);
		reverse = ch+reverse;
		}
		System.out.println(reverse);
		if(word.equals(reverse)) {
			System.out.println("String is Pallindrome");
		}
		else {
			System.out.println("String is not Pallindrome");
			
			
		}
		
			
		}
		
		
			
		}
		

	


