package background;

import gui.QuadFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

/**
 * ActionListener for the About option in the menu bar.
 * @author darvidson
 *
 */
public class InfoListener implements ActionListener {	
	
	QuadFrame frame;
	
	public InfoListener(QuadFrame frame) {
		this.frame = frame;
	}
	
	public void actionPerformed(ActionEvent event) {
		
		String message = "<html><h1>About</h1>" +
						"<p>This is a simple Java application, created to solve for x when you have a Quadratic Equation</p>" +
						"<h3>Created by: Drake Arvidson</h3>";
		JOptionPane.showMessageDialog(null, message);
	}

}
