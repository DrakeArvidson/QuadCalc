package background;

import gui.QuadFrame;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ActionListener created for my reset option within the menu bar.
 * @author darvidson
 *
 */
public class ResetListener implements ActionListener {
	
	QuadFrame frame;
	
	public ResetListener(QuadFrame frame) {
		this.frame = frame;
	}
	
	public void actionPerformed(ActionEvent event) {
		reset();
	}
	
	private void reset() {
		
		final Frame[] frames = Frame.getFrames();
        for (int i = 0 ; i < frames.length; i++) {
            frames[i].dispose();
        }
        
        new QuadFrame();
	}

}
