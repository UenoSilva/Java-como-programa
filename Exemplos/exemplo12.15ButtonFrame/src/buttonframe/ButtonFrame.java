package buttonframe;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Ueno Souza Silva
 */
public class ButtonFrame extends JFrame{
    
    private final JButton plaingJButton;
    private final JButton francyJButton;
    
    public ButtonFrame(){
        super("Testing Buttons");
        setLayout(new FlowLayout());
        
        plaingJButton = new JButton("Plain Button"); //botão com texto
        add(plaingJButton); //adiciona plainButton a JFrame
        
        Icon bug1 = new ImageIcon(getClass().getResource("/imagens/bug1.png"));
        Icon bug2 = new ImageIcon(getClass().getResource("/imagens/bug2.png"));
        
        francyJButton = new JButton("Francy Button", bug1); //configura a imagem
        francyJButton.setRolloverIcon(bug2);
        add(francyJButton); //adiciona francyButton a JFrame
        
        //cria um novo ButtonHandler de tratamento para tratamento de eventos de botão
        ButtonHandler handler = new ButtonHandler();
        francyJButton.addActionListener(handler);
        plaingJButton.addActionListener(handler);
    }
    
    //classe interna para o tratamento do button
    private class ButtonHandler implements ActionListener{
        
        //trata evento de botão
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(ButtonFrame.this, String.format("Você pressionou: %s", e.getActionCommand()));
        }
    }
}
