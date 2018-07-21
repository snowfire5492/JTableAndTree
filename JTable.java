import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class JTable {

	JTable(){
	
		Object[][] data = {
			    {"Kathy", "Smith",
			     "Snowboarding", new Integer(5), new Boolean(false)},
			    {"John", "Doe",
			     "Rowing", new Integer(3), new Boolean(true)},
			    {"Sue", "Black",
			     "Knitting", new Integer(2), new Boolean(false)},
			    {"Jane", "White",
			     "Speed reading", new Integer(20), new Boolean(true)},
			    {"Joe", "Brown",
			     "Pool", new Integer(10), new Boolean(false)}
			};
		
		Object[] columnNames = {"First Name",
                "Last Name",
                "Sport",
                "# of Years",
                "Vegetarian"};
		
		
		//JTable table = new JTable(data, columnNames);
		
	}
	
	
	public static void main(String[] args){
		SwingUtilities.invokeLater(() -> {
			new JTable();
		});
	}
	
	
	
}
