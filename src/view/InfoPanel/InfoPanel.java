package view.InfoPanel;

import javax.swing.*;
import java.awt.*;

public class InfoPanel extends JPanel {
    private FooterPanel footerPanel;

    public InfoPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        footerPanel = new FooterPanel();
        addFooterPanel(gbc);
    }

    private void addFooterPanel(GridBagConstraints gbc) {
        footerPanel.setBackground(Color.BLACK);
        footerPanel.setPreferredSize(new Dimension(1310, 150));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.ipadx = 40;
        gbc.ipady = 20;
        add(footerPanel, gbc);
    }


}
