package week3.day1;

public class Overloading {
	public void reportstep() {
		System.out.println("reportstep" );
		
	}
	public void reportstep(String msg , String status) {
		System.out.println("Message and Status" +msg+ " " +status+ "" );
		
	}
	public void reportstep(String msg , String status, boolean snap) {
		System.out.println("message,status and boolean:" +msg+ "" +status+ "" +snap+ "");
		
		}

	

	public static void main(String[] args) {
		Overloading ol =new Overloading();
		ol.reportstep();
		ol.reportstep("Static","Overloading");
		ol.reportstep("Static","Overloading" , true);
	
		

	}
	
	}
	


