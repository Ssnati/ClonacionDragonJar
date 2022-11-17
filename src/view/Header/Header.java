package view;

import javax.swing.*;
import javax.swing.plaf.basic.BasicComboBoxUI;
import java.awt.*;

public class Header extends JPanel {
    private JLabel icon, label1, label2, label3, search;
    private JComboBox<String> combo1, combo2, combo3;

    public Header() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        initComponent();
        addItems();
    }

    private void initComponent() {
        ImageIcon img = new ImageIcon("data/images/Logo.png");
        icon = new JLabel(new ImageIcon(img.getImage().getScaledInstance(250, 50, Image.SCALE_AREA_AVERAGING)));


        combo1 = new JComboBox<>();
        comboFeatures(combo1);
        combo2 = new JComboBox<>();
        comboFeatures(combo2);
        combo3 = new JComboBox<>();
        comboFeatures(combo3);


        label1 = new JLabel("Nosotros");
        label2 = new JLabel("Servicios");
        label3 = new JLabel("Contactarnos");
        search = new JLabel("Aqui deberia ir una lupa");
    }

    private void comboFeatures(JComboBox<String> combo) {
        combo.setBackground(Color.WHITE);
        combo.setBorder(BorderFactory.createLineBorder(Color.white));
        combo.setModel(new DefaultComboBoxModel<>(new String[]{"Seleccione una opcion", "Opcion 1", "Opcion 2", "Opcion 3"}));
        //quitamos la decoracion del combo
//        combo.setUI(new BasicComboBoxUI());
        combo.setRenderer(new DefaultListCellRenderer() {
            @Override
            public void paint(Graphics g) {
                setBackground(Color.WHITE);
                setForeground(Color.BLACK);
                //quitamos la decoracion de la barra que se desplaza hacia abajo en el combo
                removeHighlight();

                super.paint(g);
            }
        });
        combo.setBorder(BorderFactory.createEmptyBorder());
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
    }

    private void addItems() {
        add(icon);
        add(label1);
        add(label2);
        add(label3);
        add(combo1);
        add(combo2);
        add(combo3);
        add(label3);
        add(search);
    }

}
