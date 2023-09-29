package home.assignment4;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		String text = "changename";
		char[] charArray = text.toCharArray();
		for(int i= charArray.length-1 ; i>=0; i--) {
			if (i%2!=0) {
				char character= charArray[i];
				System.out.println("Character in odd index: " + i +":" +character);
				character = Character.toUpperCase(character);
				System.out.println(character);
				
			}
			
		}
		
		
		
		
			
		}
		

	}


