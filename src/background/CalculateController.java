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
       int inputA = input.getA();
       int inputB = input.getB();
       int inputC = input.getC();
       Quadratic quad = new Quadratic(inputA, inputB, inputC);
       String results = quad.solve();
       input.setResults(results);
    }

}
