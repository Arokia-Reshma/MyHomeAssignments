package week3.day1;

public class Chrome extends Browser{
	public void openIncognito() {
		System.out.println("open incognito");
		
	}
	public void clearCache() {
		System.out.println("clear cache");
	}

	public static void main(String[] args) {
		Chrome ch =new Chrome();
		System.out.println("BrowserVersion:" +ch.browserVersion);
		System.out.println("BrowserName:" +ch.browserName);
		ch.clearCache();
		ch.openIncognito();
		ch.openURL();
		ch.navigateBack();
		ch.closeBrowser();
		
		

	}

}
