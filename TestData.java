package week3.day1;

public class TestData extends LoginTestData {
	
	public void enterCredentials() {
	System.out.println("enterCredentials");
	}
	
	public void navigateToHomePage() {
		System.out.println("navigateToHomePage");
	}
	

	public static void main(String[] args) {
		LoginTestData obj = new LoginTestData();
		obj.enterPassword();
		obj.enterUsername();
		

	}

}
