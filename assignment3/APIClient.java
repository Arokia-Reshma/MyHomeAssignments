package home.assignment3;

public class APIClient {
	public void sendRequest(){
	}
	
	public void sendRequest(String name) {
		System.out.println("String ");
	}
	public void sendRequest(String name, String msg, boolean status) {
		System.out.println("name , msg and boolean :" +name+ " " +msg+ " " +status+ " ");
	}
	

	public static void main(String[] args) {
		//Overloading ol =new Overloading();
		APIClient ap = new APIClient();
			ap.sendRequest("endpoint");
			ap.sendRequest("endpoint" ,"requestBody" , true);
		
		

	}

}
