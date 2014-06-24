package background;

import gui.QuadFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class InfoListener implements ActionListener {	
	
	QuadFrame frame;
	
	public InfoListener(QuadFrame frame) {
		this.frame = frame;
	}
	
	public void actionPerformed(ActionEvent event) {
		JOptionPane.showMessageDialog(null, "This is a simple Java application created by Drake Arvidson.");
	}

}
