package view.Middle;

import javax.swing.*;
import java.awt.*;

public class FlowPanel extends JPanel {
    private JButton back, next;
    private Image image;
    private JPanel midPanel;

    public FlowPanel(String source) {
        this.setSize(1700, 800);
        back = new JButton("<");
        next = new JButton(">");
        image = new ImageIcon(source).getImage();

        createButton(back);
        createButton(next);


        midPanel = new JPanel();
        midPanel.setPreferredSize(new Dimension(1388, 355));
        midPanel.setOpaque(false);


        add(back);
        add(midPanel);
        add(next);
    }

    private void createButton(JButton button) {
        button.setPreferredSize(new Dimension(50, 50));
        button.setFont(new Font("NSimSun", Font.BOLD, 50));
        button.setBorder(BorderFactory.createEmptyBorder());
        button.setBackground(new Color(0, 0, 0, 0));
        button.setBorderPainted(false);
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }
}
