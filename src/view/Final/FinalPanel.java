package view.Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;

public class FinalPanel extends JPanel {
    private BackPanel backPanel;

    public FinalPanel() {
        setLayout(new GridBagLayout());
        backPanel = new BackPanel();
        initComponent();
    }

    private void initComponent() {
        GridBagConstraints gbc = new GridBagConstraints();
        backPanel.setBackground(new Color(0, 0, 0, 215));
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(backPanel, gbc);
    }

    public void setListeners(MouseListener mouseListener) {
        backPanel.setListeners(mouseListener);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Dimension dimension = this.getSize();
        Image icon = new ImageIcon("sources/images/background.jpg").getImage();
        g.drawImage(icon, 0, 0, dimension.width, dimension.height, null);
        setOpaque(false);
        super.paintComponent(g);
    }
}
