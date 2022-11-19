package view.InfoPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;

public class FooterPanel extends JPanel {
    private JLabel description, descriptionRed, description2Red, description2;

    public JLabel getDescription() {
        return description;
    }

    public void setDescription(JLabel description) {
        this.description = description;
    }

    public JLabel getDescriptionRed() {
        return descriptionRed;
    }

    public void setDescriptionRed(JLabel descriptionRed) {
        this.descriptionRed = descriptionRed;
    }

    public JLabel getDescription2Red() {
        return description2Red;
    }

    public void setDescription2Red(JLabel description2Red) {
        this.description2Red = description2Red;
    }

    public JLabel getDescription2() {
        return description2;
    }

    public void setDescription2(JLabel description2) {
        this.description2 = description2;
    }

    public void setButton(JButton button) {
        this.button = button;
    }

    private JButton button;

    public FooterPanel() {
        setLayout(new GridBagLayout());

        description = new JLabel("       SEGÚN LA ONU, EL CIBERCRIMEN EN LATINOAMÉRICA CUESTA MAS DE           ");
        descriptionRed = new JLabel("90.000");
        description2Red = new JLabel("             MILLONES DE DÓLARES ");
        description2 = new JLabel("EN PERDIDAS");
        button = new JButton("PARA EVITAR QUE TU ORGANIZACIÓN SEA PARTE DE ESTA ESTADISTICA, CONOCE NUESTROS SERVICIOS");

        initComponent();
    }

    private void initComponent() {
        Font tittleFont = new Font("SansSerif", Font.PLAIN, 30);
        addDescription(tittleFont);
        addDescriptionRed(tittleFont);
        addDescription2Red(tittleFont);
        addDescription2(tittleFont);
        addButton();
        performedButton();
    }

    private void addDescription(Font titleFont) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.EAST;
        description.setPreferredSize(new Dimension(1900, 50));
        description.setFont(titleFont);
        description.setForeground(Color.WHITE);
        add(description, gbc);
    }

    private void addDescriptionRed(Font tittleFont) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(0, 0, 0, -0);
        descriptionRed.setFont(tittleFont);
        descriptionRed.setForeground(Color.RED);
        add(descriptionRed, gbc);
    }

    private void addDescription2Red(Font tittleFont) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.insets = new Insets(-10, 300, 0, 0);
        description2Red.setFont(tittleFont);
        description2Red.setForeground(Color.RED);
        add(description2Red, gbc);
    }

    private void addDescription2(Font tittleFont) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(-10, 0, 0, 0);
        description2.setForeground(Color.WHITE);
        description2.setFont(tittleFont);
        add(description2, gbc);
    }

    private void addButton() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 4;
        gbc.ipadx = 30;
        gbc.ipady = 20;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(15, 50, 0, 100);
        button.setFont(new Font("SansSerif", Font.PLAIN, 20));
        add(button, gbc);
    }

    private void performedButton() {
        button.setBorder(BorderFactory.createLineBorder((Color.WHITE), 2, true));
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        button.setFocusable(false);
    }

    public void setListeners(MouseListener listener) {
        button.addMouseListener(listener);
    }

    public JButton getButton() {
        return button;
    }

    public void setColorButton() {
        Color color = new Color(51, 51, 51);
        button.setBackground(color);
        button.setBorder(BorderFactory.createLineBorder(color, 2, true));
        button.setBorderPainted(false);
        button.setText(button.getText()+"  >");
    }

    public void setDefaultColorButton() {
        performedButton();
        button.setBorderPainted(true);
        button.setText(button.getText().substring(0, button.getText().length()-3));
    }
}
