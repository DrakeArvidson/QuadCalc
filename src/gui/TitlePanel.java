package gui;

import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * A simple JPanel, used at the top of the frame.
 * @author darvidson
 *
 */

@SuppressWarnings("serial")
public class TitlePanel extends JPanel{

    //Constructor for the TitlePanel, adds a JLabel for the title of the calculator frame
    public TitlePanel() {
        this.add(new JLabel("<html>ax<sup>2</sup> + bx + c = 0 </html>"));//Used HTML to format the text, allowed me to use a superscript.
        this.setVisible(true);
    }

}
