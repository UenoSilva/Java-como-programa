package radiobuttonframe;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Ueno Souza Silva
 */
public class RadioButtonFrame extends JFrame{
    
    private final JTextField textField;
    private final Font plainFont;
    private final Font boldFont;
    private final Font italicFont;
    private final Font boldItalicFont;
    private final JRadioButton plainJRadioButton;
    private final JRadioButton boldJRadioButton;
    private final JRadioButton italicJRadioButton;
    private final JRadioButton boldItalicJRadioButton;
    private final ButtonGroup radioGroup;
    
    public RadioButtonFrame(){
        super("RadioButton test");
        setLayout(new FlowLayout());
        
        textField = new JTextField("Veja o estilo da font mudar", 20);
        add(textField);
        
        //cria os botões de ação
        plainJRadioButton = new JRadioButton("Plain", true);
        boldJRadioButton = new JRadioButton("Bold", false);
        italicJRadioButton = new JRadioButton("Italic", false);
        boldItalicJRadioButton = new JRadioButton("Bold/Italic", false);
        add(plainJRadioButton);
        add(boldJRadioButton);
        add(italicJRadioButton);
        add(boldItalicJRadioButton);
        
        //cria o relacionamento lógico entre os JRadioButton
        radioGroup = new ButtonGroup();
        radioGroup.add(plainJRadioButton);
        radioGroup.add(boldJRadioButton);
        radioGroup.add(italicJRadioButton);
        radioGroup.add(boldItalicJRadioButton);
        
        //cria Font objetos
        plainFont = new Font("Plain", Font.PLAIN, 14);
        boldFont = new Font("Bold", Font.BOLD, 14);
        italicFont = new Font("Italic", Font.ITALIC, 14);
        boldItalicFont = new Font("Bold/Italic", Font.BOLD + Font.ITALIC, 14);
        textField.setFont(plainFont);
        
        plainJRadioButton.addItemListener(new RadioButtonHandler(plainFont));
        boldJRadioButton.addItemListener(new RadioButtonHandler(boldFont));
        italicJRadioButton.addItemListener(new RadioButtonHandler(italicFont));
        boldItalicJRadioButton.addItemListener(new RadioButtonHandler(boldItalicFont));
    }

    private class RadioButtonHandler implements ItemListener{
        
        private Font font;
        
        public RadioButtonHandler(Font f){
            font = f;
        }
        
        @Override
        public void itemStateChanged(ItemEvent e) {
            textField.setFont(font);
        }
    }
}
