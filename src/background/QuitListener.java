package background;

import gui.QuadFrame;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuitListener implements ActionListener {
    
    QuadFrame frame;
    
    public QuitListener(QuadFrame frame) {
        this.frame = frame;
    }

    public void actionPerformed(ActionEvent event) {
        quit();
    }
    
    private void quit() {

        final Frame[] frames = Frame.getFrames();
        for (int i = 0 ; i < frames.length; i++) {
            frames[i].dispose();
        }

    }

}
