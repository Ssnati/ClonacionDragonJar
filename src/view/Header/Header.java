package view.Header;

import view.Middle.PersonalizedCombo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

public class Header extends JPanel {
    private final Color foregroundColor = new Color(0, 0, 0, 128);
    private final Color backgroundColor = new Color(255, 255, 255);
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

        list1 = new JButton("Formación \u25BC");
        buttonFeatures(list1);

        list2 = new JButton("Productos \u25BC");
        buttonFeatures(list2);


        list3 = new JButton("Comunidad \u25BC");
        buttonFeatures(list3);


        label1 = new JLabel("Nosotros");
        label1.setForeground(foregroundColor);
        label1.setFont(font);
        label2 = new JLabel("Servicios");
        label2.setForeground(foregroundColor);
        label2.setFont(font);
        label3 = new JLabel("Contactarnos");
        label3.setForeground(foregroundColor);
        label3.setFont(font);

        ImageIcon loupe = new ImageIcon("sources/images/loupe.png");
        search = new JLabel(new ImageIcon(loupe.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING)));
    }

    private void buttonFeatures(JButton list) {
        list.setForeground(foregroundColor);
        list.setBackground(new Color(0, 0, 0, 0));
        list.setBorderPainted(false);
        list.setFocusPainted(false);
        list.setFont(font);
        list.setMargin(new Insets(0, 0, 0, 0));
    }

    private void comboFeatures(JComboBox<String> combo) {
        combo.setPreferredSize(new Dimension(100, 25));
        combo.setBackground(Color.WHITE);
        combo.setBorder(BorderFactory.createLineBorder(Color.white));
        combo.setForeground(foregroundColor);
        combo.setFont(font);
        combo.setUI(new PersonalizedCombo());
        combo.setFocusable(false);
        ((JLabel) combo.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        combo.setEditable(false);
        //metodo para colocar un titulo a la combo
    }

    private void addItems() {
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(0, 100, 0, 170);
        add(icon, c);

        c = new GridBagConstraints();
        Insets insets = new Insets(0, 14, 0, 14);
        c.gridx = 1;
        c.gridy = 0;
        c.insets = insets;
        add(label1);

        c = new GridBagConstraints();
        c.gridx = 2;
        c.gridy = 0;
        c.insets = insets;
        add(label2, c);

        c = new GridBagConstraints();
        c.gridx = 3;
        c.gridy = 0;
        c.insets = insets;
        add(label3, c);

        c = new GridBagConstraints();
        c.gridx = 4;
        c.gridy = 0;
        c.insets = insets;
        add(list1, c);

        c = new GridBagConstraints();
        c.gridx = 5;
        c.gridy = 0;
        c.insets = insets;
        add(list2, c);

        c = new GridBagConstraints();
        c.gridx = 6;
        c.gridy = 0;
        c.insets = insets;
        add(list3, c);

        c = new GridBagConstraints();
        c.gridx = 7;
        c.gridy = 0;
        c.insets = insets;
        add(label3, c);

        c = new GridBagConstraints();
        c.gridx = 8;
        c.gridy = 0;
        c.insets = new Insets(0, 14, 0, 100);
        add(search, c);
    }

    public void setListeners(ActionListener listener, MouseListener mouseListener) {
        label1.addMouseListener(mouseListener);
        label2.addMouseListener(mouseListener);
        label3.addMouseListener(mouseListener);
        list1.addMouseListener(mouseListener);
        list2.addMouseListener(mouseListener);
        list3.addMouseListener(mouseListener);
        search.addMouseListener(mouseListener);
    }
//        combo1.addMouseListener(mouseListener);
//        combo2.addMouseListener(mouseListener);
//        combo3.addMouseListener(mouseListener);
//        combo1.addActionListener(listener);
//        combo2.addActionListener(listener);
//        combo3.addActionListener(listener);}

    public Color getForegroundColor() {
        return foregroundColor;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    @Override
    public Font getFont() {
        return font;
    }

    public JLabel getIcon() {
        return icon;
    }

    public JLabel getLabel1() {
        return label1;
    }

    public JLabel getLabel2() {
        return label2;
    }

    public JLabel getLabel3() {
        return label3;
    }

    public JLabel getSearch() {
        return search;
    }

//    public JComboBox<String> getCombo1() {
//        return combo1;
//    }

//    public JComboBox<String> getCombo2() {
//        return combo2;
//    }

//    public JComboBox<String> getCombo3() {
//        return combo3;
//    }

    public JButton getList1() {
        return list1;
    }

    public JButton getList2() {
        return list2;
    }

    public JButton getList3() {
        return list3;
    }

}
