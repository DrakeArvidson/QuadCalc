package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import background.QuitListener;
import background.ResetListener;


public class QuadFrame extends JFrame {
    public JMenuBar menu;
    public TitlePanel title;
    public InputPanel input;
    public QuitListener quitListener = new QuitListener(this);
    public ResetListener resetListener = new ResetListener(this);

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
        
        file.add(reset);
        file.add(quit);
        bar.add(file);
        
        this.setJMenuBar(bar);
        
        title = new TitlePanel();
        this.add(title, BorderLayout.NORTH);

        input = new InputPanel();
        this.add(input, BorderLayout.CENTER);
        
        this.setVisible(true);
    }
    
    

}
