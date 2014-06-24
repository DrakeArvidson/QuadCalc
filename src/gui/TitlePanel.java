package gui;

import javax.swing.JLabel;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class TitlePanel extends JPanel{

    
    public TitlePanel() {
        this.add(new JLabel("<html>ax<sup>2</sup> + bx + c = 0 </html>"));
        this.setVisible(true);
    }

}
