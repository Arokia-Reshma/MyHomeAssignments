package week3.day1;

public class Subclass extends Overriding {
	public void number(int x) {
		System.out.println("13");
		System.out.println(x);
		
		
	}
	
	public static void main(String[] args) {
		Subclass sc=new Subclass();
		sc.number(2);
		

	}

}
