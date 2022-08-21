package radiobuttonframe;

import javax.swing.JFrame;

/**
 *
 * @author Ueno Souza Silva
 */
public class RadioButtonFrameTest {
    
    public static void main(String[] args){
        
        RadioButtonFrame radioButton = new RadioButtonFrame();
        radioButton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        radioButton.setSize(300, 100);
        radioButton.setVisible(true);
    }
    
}
