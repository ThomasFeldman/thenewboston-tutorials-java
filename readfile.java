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
		add(addressBar, BorderLayout.NORTH);
		
		display = new JEditorPane();
		display.setEditable(false);
		display.addHyperlinkListener(
			new HyperlinkListener() {
				public void hyperlinkUpdate(HyperlinkEvent event) {
					if(event.getEventType()==HyperlinkEvent.EventType.ACTIVATED) {
						loadCrap(event.getURL().toString());
					}
				}
			}
		);
	}
}