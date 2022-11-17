package view;

import javax.swing.*;
import java.awt.*;

public class InfoPanel extends JPanel {
    public InfoPanel() {
        //añadir una etiqueta con el texto "Informacion" y el color de la letra rojo
        JLabel label = new JLabel("Informacion");
        label.setForeground(Color.RED);
        add(label);
        setBackground(Color.BLACK);
    }
}
