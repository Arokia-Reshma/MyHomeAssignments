package home.assignment3;

public class Elements extends Button {
public void createElements(){
}

 public static void main(String[] args) {
		Elements e= new Elements();
		RadioButton rb = new RadioButton();
		CheckBoxButton cb =new CheckBoxButton();
		TextField tf= new TextField();
		e.click();
		e.setText("String text");
		e.submit();
		rb.selectRadioButton();
		tf.getText();
		cb.clickCheckButton();
		
		
		

	}

}
