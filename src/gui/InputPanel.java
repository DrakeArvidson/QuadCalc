package gui;

import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import background.CalculateController;

@SuppressWarnings("serial")
public class InputPanel extends JPanel {
    JTextField inA = new JTextField();
    JTextField inB = new JTextField();
    JTextField inC = new JTextField();
    JButton calc = new JButton("Calculate");
    JTextArea results = new JTextArea();
    CalculateController controller = new CalculateController(this);

    public InputPanel() {
        super();
        JPanel panelA = new JPanel();
        JPanel panelB = new JPanel();
        JPanel panelC = new JPanel();
        JPanel button = new JPanel();
        JPanel resultPane = new JPanel();

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        panelA.setLayout(new BoxLayout(panelA, BoxLayout.X_AXIS));
        panelA.add(new JLabel("A = "));
        inA.setMaximumSize(new Dimension(100, 50));
        panelA.add(inA);

        panelB.setLayout(new BoxLayout(panelB, BoxLayout.X_AXIS));
        panelB.add(new JLabel("B = "));
        inB.setMaximumSize(new Dimension(100, 50));
        panelB.add(inB);

        panelC.setLayout(new BoxLayout(panelC, BoxLayout.X_AXIS));
        panelC.add(new JLabel("C = "));
        inC.setMaximumSize(new Dimension(100, 50));
        panelC.add(inC);

        calc.addActionListener(controller);
        button.add(calc);

        results.setPreferredSize(new Dimension(300, 100));
        resultPane.add(results);

        this.add(panelA);
        this.add(panelB);
        this.add(panelC);
        this.add(button);
        this.add(resultPane);

    }
    
    public int getA() {
           return Integer.parseInt(inA.getText());
    }
    
    public int getB() {
        return Integer.parseInt(inB.getText());
 }
    
    public int getC() {
        return Integer.parseInt(inC.getText());
 }
    
    public void setResults(String answer) {
        results.setText(answer);
    }

}
