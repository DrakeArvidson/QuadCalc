package background;

import gui.QuadFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

/**
 * ActionListener created for the Help option in the menu bar.
 * @author darvidson
 *
 */
public class HelpListener implements ActionListener {
	
	QuadFrame frame;
	
	public HelpListener(QuadFrame frame) {
		this.frame = frame;
	}
	
	public void actionPerformed(ActionEvent event) {
		String message = "<html><h1>Instructions</h1>" +
						"<p>Use this calculator to solve the quadratic equation <html>ax<sup>2</sup> + bx + c = 0</p>" +
						"<p>Input your values for 'a', 'b', and 'c' and then hit the Calculate button to see the answer.</p></html>";
		JOptionPane.showMessageDialog(null, message);
	}

}
