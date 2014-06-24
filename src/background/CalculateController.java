package background;

import gui.InputPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculateController implements ActionListener {

	InputPanel input;

	public CalculateController(InputPanel input) {
		this.input = input;

	}

	public void actionPerformed(ActionEvent event) {
		String results = "";
		if (input.anyEmpty()) {
			results = "Please enter a number for a, b, and c!";
		}
		else {
			int inputA = input.getA();
			int inputB = input.getB();
			int inputC = input.getC();
			Quadratic quad = new Quadratic(inputA, inputB, inputC);
			results = quad.solve();
		}
		input.setResults(results);
	}

}
