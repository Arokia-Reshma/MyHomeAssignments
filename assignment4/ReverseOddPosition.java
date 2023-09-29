package home.assignment4;

public class ReverseOddPosition {
	
	    public static void main(String[] args) {
	    	
	        String test = "I am a software tester";
	        String[] words = test.split(" ");
	        
	        for (int i = 0; i < words.length; i++) {
	            if (i % 2 == 0) {
	                System.out.print(words[i] + " ");
	            } else {
	                // Odd position words, reverse and print them
	                char[] chars = words[i].toCharArray();
	                for (int j = chars.length - 1; j >= 0; j--) {
	                    System.out.print(chars[j]);
	                }
	                System.out.print(" ");
	            }
	        }
	    }
	
}

	    

		
	    
	        
	    

	

