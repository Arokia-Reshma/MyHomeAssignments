package home.assignment4;

public abstract class MySqlConnection implements DataBaseConnection{

	public void connect() {
		System.out.println("connect");
		
		
	}

	public void disconnect() {
		System.out.println("disconnect");
		
	}

	public void executeUpdate() {
		
		System.out.println("executeUpdate");
		
	}
public void executeQuery() {
	System.out.println("executeQuery");
}
	public static void main(String[] args) {
		
		
		
		

	}

}



