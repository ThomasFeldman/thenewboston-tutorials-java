import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class TheWindow extends JFrame{

	private JSlider slider;
	private DrawOval myPanel;
	
	public TheWindow() {
		super("The title");
		myPanel = new DrawOval();
		myPanel.setBackground(Color.ORANGE);
		
		slider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
	}
	
}
