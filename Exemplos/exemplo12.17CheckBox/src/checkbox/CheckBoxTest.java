package checkbox;

import javax.swing.JFrame;

/**
 *
 * @author Ueno Souza Silva
 */
public class CheckBoxTest {
    
    public static void main(String[] args){
        CheckBox checkBox = new CheckBox();
        checkBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        checkBox.setSize(275, 100);
        checkBox.setVisible(true);
    } 
    
}
