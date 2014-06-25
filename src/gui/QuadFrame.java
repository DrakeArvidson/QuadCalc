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
    	//Building the frame that the calculator sits in.
        this.setTitle("Quadratic Formula Calculator");//Sets the title of the frame
        this.setSize(350, 300);//sets the size of the frame window.
        this.setLayout(new BorderLayout());//Sets the layout manager of the frame.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Tells the program to exit/shutdown when the window is closed.
        
        JMenuBar bar = new JMenuBar();//Creates a menu bar that will hold menus.
        
        JMenu file = new JMenu("File");//Creates the 'File' menu
        
        JMenuItem quit = new JMenuItem("Quit");//Creates the 'Quit' item for a menu
        quit.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.KeyEvent.CTRL_MASK));//Gives the shortcut key of CTRL+Q
        quit.addActionListener(quitListener);//Adds the ActionListener to the quit item.
        
        JMenuItem reset = new JMenuItem("Reset");//Creates the 'Reset' item for a menu
        reset.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.KeyEvent.CTRL_MASK));//Shortcut key of CTRL+R
        reset.addActionListener(resetListener);//Adds the ActionListener to the reset item.
        
        JMenu help = new JMenu("Help");//Creates the 'Help' menu
        
        JMenuItem info = new JMenuItem("About");//Creates the 'About' item for a menu
        info.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.KeyEvent.CTRL_MASK));//Shortcut key of CTRL+I
        info.addActionListener(infoListener);//Adds the ActionListener to the info item.
        
        JMenuItem howTo = new JMenuItem("How-To");//Creates the 'How-To' item for a menu
        howTo.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.KeyEvent.CTRL_MASK));//Shortcut key of CTRL+G
        howTo.addActionListener(helpListener);//Adds the ActionListener to the howTo item.
        
        file.add(reset);//Adds the item reset to the file menu
        file.add(quit);//Adds the item quit to the file menu
        bar.add(file);//Adds the file menu to the bar
        
        help.add(info);//Adds the item info to the help menu
        help.add(howTo);//Adds the item howTo to the help menu
        bar.add(help);//Adds the help menu to the bar
        
        this.setJMenuBar(bar);//Makes the menu bar visible on the frame.
        
        title = new TitlePanel();//Creates the title panel
        this.add(title, BorderLayout.NORTH);//Sets the location of the title panel on the frame.

        input = new InputPanel();//Creates the input panel
        this.add(input, BorderLayout.CENTER);//Sets the location of the input panel on the frame.
        
        this.getRootPane().setDefaultButton(input.getCalcButton());//This gets the calculate button from the input panel and makes it the default button.
        //Making it the default button means that if you hit enter on your keyboard, it's like you clicked this button.
        this.setVisible(true);//Set the frame and everything on it visible.
    }
    
    

}
