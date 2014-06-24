package background;

import gui.InputPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClearController implements ActionListener {

	InputPanel input;
	
	public ClearController(InputPanel input) {
		this.input = input;
	}
	
	public void actionPerformed(ActionEvent event) {
		input.clearText();
	}
}
