package home.assignment4;

public class JavaConnection1 extends MySqlConnection1{

	public void connect() {
		System.out.println("connect");
		
	}

	public void disconnect() {
		System.out.println("disconnect");
		
	}

	public void executeUpdate() {
	System.out.println("executeUpdate");
		
	}

	@Override
	public void executeQuery() {
		System.out.println("executeQuery");
		
	}

	public static void main(String[] args) {
		JavaConnection1 j = new JavaConnection1();
		
	j.connect();
	j.disconnect();
	j.executeUpdate();
	j.executeQuery();
		

	}

}
