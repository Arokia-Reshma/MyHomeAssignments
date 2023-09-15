package home.assignment;

public class Palindrome {

	public static void main(String[] args) {
		int n = 545;
		int rev = 0;
		int num =n;
		while (n>0)
		{
			rev = rev*10;
			rev = rev+n%10;
			n=n/10;
			
			
		}
if (rev ==num)
{
	System.out.println("Palindrome");
}

else
{
	System.out.println("not palindrome");
}
	}}


