package week1.day2;

public class Browserwithtwomethods {
	public String launchBrowser(String browserName) {
		System.out.println("Browser launched successfully");
		return browserName;
			

	}
	public void loadUrl () {
		System.out.println("Application url loaded successfully");
			}
public static void main(String[] args) {
	Browserwithtwomethods obj = new Browserwithtwomethods();
	obj.launchBrowser("Edge");
	obj.loadUrl();
	
	
	
}
	
}

