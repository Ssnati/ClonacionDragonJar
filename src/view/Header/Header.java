package view.Header;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;

public class Header extends JPanel {
    private final Color foregroundColor = new Color(0, 0, 0, 128);
    private final Font font = new Font("SansSerif", Font.PLAIN, 14);
    private JLabel icon, label1, label2, label3, search;
    private JButton list1, list2, list3;

    public Header() {
        setLayout(new GridBagLayout());
        initComponent();
        addItems();
        setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(195, 195, 195, 128)));
    }

    private void initComponent() {
        ImageIcon img = new ImageIcon("sources/images/Logo.png");
        icon = new JLabel(new ImageIcon(img.getImage().getScaledInstance(250, 50, Image.SCALE_AREA_AVERAGING)));

        addButtons();
        addLabels();

        ImageIcon magnifyingGlass = new ImageIcon("sources/images/magnifyingGlass.png");
        search = new JLabel(new ImageIcon(magnifyingGlass.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING)));
    }

    private void addButtons() {
        list1 = new JButton("Formación \u25BC");
        buttonFeatures(list1);

        list2 = new JButton("Productos \u25BC");
        buttonFeatures(list2);

        list3 = new JButton("Comunidad \u25BC");
        buttonFeatures(list3);
    }

    private void addLabels() {
        label1 = new JLabel("Nosotros");
        label2 = new JLabel("Servicios");
        label3 = new JLabel("Contactarnos");
        setLabelFeatures(label1);
        setLabelFeatures(label2);
        setLabelFeatures(label3);
    }

    private void buttonFeatures(JButton list) {
        list.setForeground(foregroundColor);
        list.setBackground(new Color(0, 0, 0, 0));
        list.setBorderPainted(false);
        list.setFocusPainted(false);
        list.setFont(font);
        list.setMargin(new Insets(0, 0, 0, 0));
    }

    private void setLabelFeatures(JLabel label) {
        label.setForeground(foregroundColor);
        label.setFont(font);
    }

    private void addItems() {
        GridBagConstraints gbc = new GridBagConstraints();
        Insets insets = new Insets(0, 14, 0, 14);
        addIcon(gbc);
        gbc.insets = insets;
        addLabel1(gbc);
        addLabel2(gbc);
        addLabel3(gbc);
        addList1(gbc);
        addList2(gbc);
        addList3(gbc);
        addSearch(gbc);
    }

    private void addIcon(GridBagConstraints gbc) {
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(0, 100, 0, 170);
        add(icon, gbc);
    }

    private void addLabel1(GridBagConstraints gbc) {
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(label1, gbc);

    }

    private void addLabel2(GridBagConstraints gbc) {
        gbc.gridx = 2;
        gbc.gridy = 0;
        add(label2, gbc);
    }

    private void addList1(GridBagConstraints gbc) {
        gbc.gridx = 4;
        gbc.gridy = 0;
        add(list1, gbc);
    }

    private void addList2(GridBagConstraints gbc) {
        gbc.gridx = 5;
        gbc.gridy = 0;
        add(list2, gbc);

    }

    private void addList3(GridBagConstraints gbc) {
        gbc.gridx = 6;
        gbc.gridy = 0;
        add(list3, gbc);

    }

    private void addLabel3(GridBagConstraints gbc) {
        gbc.gridx = 7;
        gbc.gridy = 0;
        add(label3, gbc);
    }

    private void addSearch(GridBagConstraints gbc) {
        gbc.gridx = 8;
        gbc.gridy = 0;
        gbc.insets = new Insets(0, 14, 0, 100);
        add(search, gbc);
    }

    public void setListeners(MouseListener mouseListener) {
        label1.addMouseListener(mouseListener);
        label2.addMouseListener(mouseListener);
        label3.addMouseListener(mouseListener);
        list1.addMouseListener(mouseListener);
        list2.addMouseListener(mouseListener);
        list3.addMouseListener(mouseListener);
        search.addMouseListener(mouseListener);
    }

    public JButton getList1() {
        return list1;
    }

    public JButton getList2() {
        return list2;
    }

    public JButton getList3() {
        return list3;
    }

    @Override
    public Font getFont() {
        return font;
    }
}
