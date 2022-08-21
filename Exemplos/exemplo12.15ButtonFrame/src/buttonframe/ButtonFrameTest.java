package buttonframe;

import javax.swing.JFrame;

/**
 *
 * @author Ueno Souza Silva
 */
public class ButtonFrameTest {
    
    public static void main(String[] args){
        ButtonFrame buttonFrame = new ButtonFrame();
        buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttonFrame.setSize(295, 110);
        buttonFrame.setVisible(true);
    }
}
