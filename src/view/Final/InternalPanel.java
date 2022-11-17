package view.Final;

import javax.swing.*;
import java.awt.*;

public class InternalPanel extends JPanel {
    private JButton icon;
    private JLabel title, description;

    public InternalPanel(String source) {
        setLayout(new GridBagLayout());

        ImageIcon imageIcon = new ImageIcon(source);
        icon = new JButton(new ImageIcon(imageIcon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));

        title = new JLabel("Titulo");
        description = new JLabel("Descripcion");

        addIcon();
        addTitle();
        addDescription();
    }

    private void addTitle() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.insets = new Insets(0, 20, 0, 70);
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.PLAIN, 20));
        title.setForeground(Color.WHITE);
        add(title, gbc);
    }

    private void addDescription() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.insets = new Insets(0, 0, 0, 155);
        description.setFont(new Font("Arial", Font.PLAIN, 15));
        description.setForeground(Color.WHITE);
        description.setHorizontalAlignment(SwingConstants.LEFT);
        add(description, gbc);
    }

    private void addIcon() {
        GridBagConstraints gbc = new GridBagConstraints();
        icon.setBorderPainted(false);
        icon.setBackground(new Color(0, 0, 0, 0));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 2;
        gbc.insets = new Insets(5, 0, 5, 5);
        add(icon, gbc);
    }

    public void setTitle(String title) {
        this.title.setText(title);
    }

    public void setDescription(String description) {
        this.description.setText(description);
    }
}
