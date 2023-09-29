package home.assignment4;

public class RemoveDuplicateWord {

	public static void main(String[] args) {
		String inputText = "We learn Java basics as part of java sessions in java week1";
		int count=0;
		String[]words = inputText.split(" ");
		
		for(int i = 0;i < words.length; i++) {
			for(int j=i+1;j<words.length;j++) {
			if(words[i].equalsIgnoreCase(words[j])){
		
				words[j] = "";
				count++;
				
				
			}
	}
}
	if (count>0) {
		System.out.println("Original text :" +inputText);
		System.out.println("Duplicates removed text: " );
		for(String word : words) {
			if(!word.isEmpty()) {
				System.out.println(word + " ");
			}
		
			
		}
	}else {
		System.out.println("no duplicate words found");
	}

	}

}
	
