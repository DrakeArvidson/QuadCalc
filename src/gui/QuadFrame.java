package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import background.HelpListener;
import background.InfoListener;
import background.QuitListener;
import background.ResetListener;
/**
 * The frame for the whole calculator, includes all other panels.
 * @author darvidson
 *
 */

@SuppressWarnings("serial")
public class QuadFrame extends JFrame {
    public JMenuBar menu;
    public TitlePanel title;
    public InputPanel input;
    public QuitListener quitListener = new QuitListener(this);
    public ResetListener resetListener = new ResetListener(this);
    public InfoListener infoListener = new InfoListener(this);
    public HelpListener helpListener = new HelpListener(this);

    public QuadFrame() {
        this.setTitle("Quadratic Formula Calculator");
        this.setSize(350, 300);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JMenuBar bar = new JMenuBar();
        
        JMenu file = new JMenu("File");
        
        JMenuItem quit = new JMenuItem("Quit");
        quit.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.KeyEvent.CTRL_MASK));
        quit.addActionListener(quitListener);
        
        JMenuItem reset = new JMenuItem("Reset");
        reset.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.KeyEvent.CTRL_MASK));
        reset.addActionListener(resetListener);
        
        JMenu help = new JMenu("Help");
        
        JMenuItem info = new JMenuItem("About");
        info.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.KeyEvent.CTRL_MASK));
        info.addActionListener(infoListener);
        
        JMenuItem howTo = new JMenuItem("How-To");
        howTo.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.KeyEvent.CTRL_MASK));
        howTo.addActionListener(helpListener);
        
        file.add(reset);
        file.add(quit);
        bar.add(file);
        
        help.add(info);
        help.add(howTo);
        bar.add(help);
        
        this.setJMenuBar(bar);
        
        title = new TitlePanel();
        this.add(title, BorderLayout.NORTH);

        input = new InputPanel();
        this.add(input, BorderLayout.CENTER);
        
        this.getRootPane().setDefaultButton(input.getCalcButton());
        
        this.setVisible(true);
    }
    
    

}
