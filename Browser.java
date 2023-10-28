package week3.day1;

public class Browser extends Chrome{

	public void openURL() {
			System.out.println("openURL");
	}
	public void closeBrowser() {
				System.out.println("closeBrowser");	
	}
	public void navigateBack() {
		System.out.println("navigateBack");
	}
	
	
		
	public static void main(String[] args) {
		Chrome obj = new Chrome();
		Edge obj1 = new Edge();
		Safari obj2 = new Safari();		
		obj.openIncognito();
		obj.clearCache();
		obj1.clearCookies();
		obj1.takeSnap();
		obj2.readerMode();
		obj2.fullScreenMode();
		
		
		
		
		
		
		
		

	}

}
