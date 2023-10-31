package week3.day2;

public class CountOfCharacters {

	public static void main(String[] args) {
		int count =0;
		String s = "TestLeaf";
		char[] charArray = s.toCharArray();
		for (int i=0; i<charArray.length; i++)
		{
			if (charArray[i]=='e') {
				count++;
			}
		}
		
			System.out.println(count);	
		
		

	}

}
