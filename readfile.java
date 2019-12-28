import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class readfile extends JFrame{
	private JTextField addressBar;
	private JEditorPane display;
	
	//constructor
	public readfile() {
		super("Bucky Browser");
		
		addressBar = new JTextField("enter a URL hoss!");
		addressBar.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						loadCrap(event.getActionCommand());
					}
				}
			);	
	}
}