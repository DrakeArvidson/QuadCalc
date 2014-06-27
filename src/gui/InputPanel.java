package gui;

import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import background.CalculateController;
import background.ClearController;

/**
 * This is the panel that contains the input fields, buttons, and results text area.
 * @author darvidson
 *
 */
@SuppressWarnings("serial")
public class InputPanel extends JPanel {
	private JTextField inA = new JTextField();
	private JTextField inB = new JTextField();
	private JTextField inC = new JTextField();
	private JButton calc = new JButton("Calculate");
	private JButton clear = new JButton("Clear");
	private JEditorPane results = new JEditorPane();
	private CalculateController controller = new CalculateController(this);
	private ClearController clearController = new ClearController(this);

	public InputPanel() {
		super();
		JPanel panelA = new JPanel();//Creating multiple panels to put on the input panel, this one is for the a input box
		JPanel panelB = new JPanel();//Panel for the b input box
		JPanel panelC = new JPanel();//Panel for the c input box
		JPanel button = new JPanel();//Panel for the buttons
		JPanel resultPane = new JPanel();//Panel for the results text area

		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));//Sets the layout manager of the input panel, in this case BoxLayout on the y axis.

		panelA.setLayout(new BoxLayout(panelA, BoxLayout.X_AXIS));//Sets the layout manager of panelA, BoxLayout on the x axis.
		panelA.add(new JLabel("a = "));//Adds the label before the text box.
		inA.setMaximumSize(new Dimension(100, 50));//Sets the size of the text box for input a
		inA.addFocusListener(new java.awt.event.FocusAdapter() {//This is used to highlight the text in the field when it gains focus.
			public void focusGained(java.awt.event.FocusEvent evt) {
				SwingUtilities.invokeLater(new Runnable() {
					public void run() {
						inA.selectAll();
					}
				});
			}
		});;
		panelA.add(inA);//Adds the inA text box to panelA

		panelB.setLayout(new BoxLayout(panelB, BoxLayout.X_AXIS));//Sets the layout manager for panelB, BoxLayout on the x axis
		panelB.add(new JLabel("b = "));//Adds the label before the text box.
		inB.setMaximumSize(new Dimension(100, 50));//sets the size of the box.
		inB.addFocusListener(new java.awt.event.FocusAdapter() {//Highlight text when it gains focus.
			public void focusGained(java.awt.event.FocusEvent evt) {
				SwingUtilities.invokeLater(new Runnable() {
					public void run() {
						inB.selectAll();
					}
				});
			}
		});;
		panelB.add(inB);//Adds the inB text box to panelB

		panelC.setLayout(new BoxLayout(panelC, BoxLayout.X_AXIS));//Sets the layout manager for panelC, BoxLayout on the x axis
		panelC.add(new JLabel("c = "));//Adds the label before the text box
		inC.setMaximumSize(new Dimension(100, 50));//Sets the size of the box
		inC.addFocusListener(new java.awt.event.FocusAdapter() {//Highlight text when it gains focus.
			public void focusGained(java.awt.event.FocusEvent evt) {
				SwingUtilities.invokeLater(new Runnable() {
					public void run() {
						inC.selectAll();
					}
				});
			}
		});;
		panelC.add(inC);//Adds the inC text box to panelC

		calc.addActionListener(controller);//Adds an ActionListener to the calculate button
		button.add(calc);//Adds the Calculate button to the button panel

		clear.addActionListener(clearController);//Adds an ActionListener to the clear button
		button.add(clear);//Adds the Clear button to the button panel

		results.setPreferredSize(new Dimension(300, 100));//Sets the size of the results text area
		results.setEditable(false);//Makes it so the text area cannot be edited manually
		//results.setLineWrap(true);//Should wrap text in the text area
		resultPane.add(results);//Add the text area to the results panel
		
		this.add(panelA);//adds panelA
		this.add(panelB);//adds panelB
		this.add(panelC);//adds panelC
		this.add(button);//adds button panel
		this.add(resultPane);//adds the resultPane panel

	}
	//Returns the int value of inA
	public int getA() {
		return Integer.parseInt(inA.getText());
	}
	//Return the int value of inB
	public int getB() {
		return Integer.parseInt(inB.getText());
	}
	//Return the int value of inC
	public int getC() {
		return Integer.parseInt(inC.getText());
	}
	//Sets the text of the results text area
	public void setResults(String answer) {
		results.setText(answer);
	}
	//Checks to see if any of the input boxes are left empty, this is run when the calculate button is clicked.
	public boolean anyEmpty() {
		if(inA.getText().equals("") || inB.getText().equals("") || inC.getText().equals("")) {
			return true;
		}
		else {
			return false;
		}
	}
	//Returns the Calculate button, used for setting the default button of the frame
	public JButton getCalcButton() {
		return calc;
	}
	//Used when the clear button is clicked, clears any text in all text fields/areas
	public void clearText() {
		inA.setText("");
		inB.setText("");
		inC.setText("");
		results.setText("");
	}
	

}
