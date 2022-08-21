package comboboxframe;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Ueno Souza Silva
 */
public class ComboBoxFrame extends JFrame {

    private final JComboBox<String> ImagesJComboBox;
    private final JLabel label;

    private static final String[] names = {"/imagens/bug1.png", "/imagens/bug2.png", "/imagens/bug3.png", "/imagens/bug4.png"};
    private final Icon[] icons = {
        new ImageIcon(getClass().getResource(names[0])),
        new ImageIcon(getClass().getResource(names[1])),
        new ImageIcon(getClass().getResource(names[2])),
        new ImageIcon(getClass().getResource(names[3]))};

    public ComboBoxFrame() {
        super("Testing JComboBox");
        setLayout(new FlowLayout());

        ImagesJComboBox = new JComboBox<>(names);
        ImagesJComboBox.setMaximumRowCount(3);

        ImagesJComboBox.addItemListener(
                new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    label.setIcon(icons[ImagesJComboBox.getSelectedIndex()]);
                }
            }
        }
        );
        add(ImagesJComboBox);
        label = new JLabel(icons[0]);
        add(label);
    }

}
