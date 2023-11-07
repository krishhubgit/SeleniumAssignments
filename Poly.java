package week3.day1;

public class Poly {
	public void  reportStep(String msg, String status) {
		System.out.println("msg, Status ");
		}
	public void  reportStep(String msg, String status, boolean snap ) {
		System.out.println("msg, Status, snap");

}
	public static void main(String[] args) {
		Poly obj = new Poly();
		obj.reportStep("report", "Pass");
		obj.reportStep("Hi","Pass", true);

	}}