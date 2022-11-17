package view;

import javax.swing.*;
import java.awt.*;

public class BackgroundPanel extends JPanel {

    public BackgroundPanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        MainPanel mainPanel = new MainPanel();
        JScrollPane scrollPane = new JScrollPane(mainPanel);
        add(scrollPane);
    }

    @Override
    public void paint(Graphics g){
        Dimension dimension = this.getSize();
        ImageIcon icon = new ImageIcon("data/images/background.jpg");
        g.drawImage(icon.getImage(), 0, 0, dimension.width, dimension.height, null);
        setOpaque(false);
        super.paintChildren(g);
    }
}
