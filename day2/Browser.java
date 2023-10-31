package week1.day2;

public class Browser {
	public String launchBrowser(String browserName) {
		System.out.println("Browser Launched Successfully:"+browserName);
		return browserName;
		
	}
public void loadUrl()
{
	System.out.println("url launched successfully");
}
	public static void main(String[] args) {
		Browser details=new Browser();
		details.launchBrowser("Edge");
		details.loadUrl();
		
		}

}
