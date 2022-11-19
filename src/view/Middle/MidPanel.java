package view.Middle;

import javax.swing.*;
import java.awt.*;

public class MidPanel extends JPanel {
    private final Font font = new Font("SansSerif", Font.PLAIN, 14);
    private JComboBox<String> combo1, combo2, combo3;

    public MidPanel() {
        setLayout(null);
        initializeCombo();
    }

    private void initializeCombo() {
        combo1 = new JComboBox<>();
        combo2 = new JComboBox<>(new String[]{"Burp Bounty", "Epic Bounties", "Plataforma de \nEducación"});
        combo3 = new JComboBox<>(new String[]{"Blog de Seguridad \nInformática", "Conferencia de \nSeguridad Informática", "Foros de la Comunidad", "Contenido en Video", "Herramientas \nDragonJAR", "Legal"});
        addCombo1();
        addCombo2();
        addCombo3();
    }

    private void addCombo3() {
        comboFeatures(combo3);
        combo3.setBounds(970, -29, 252, 25);
        add(combo3);
    }

    private void addCombo2() {
        comboFeatures(combo2);
        combo2.setBounds(855, -29, 252, 25);
        add(combo2);
    }

    private void addCombo1() {
        combo1.addItem("Seguridad Informática \nOfensiva");
        comboFeatures(combo1);
        combo1.setBounds(736, -29, 252, 25);
        add(combo1);
    }

    private void comboFeatures(JComboBox<String> combo) {
        combo.setBackground(Color.WHITE);
        combo.setBorder(BorderFactory.createLineBorder(Color.white));
        combo.setForeground(new Color(0, 0, 0, 128));
        combo.setFont(font);
        combo.setUI(new PersonalizedCombo());
        combo.setFocusable(false);
        ((JLabel) combo.getRenderer()).setHorizontalAlignment(SwingConstants.LEFT);
        combo.setEditable(false);
        combo.setSelectedIndex(-1);
        setRender(combo);
    }

    private void setRender(JComboBox<String> combo) {
        combo.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                setBorder(BorderFactory.createEmptyBorder(0, 20, 20, 0));
                if (index == 0) {
                    setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 0));
                }
                return this;
            }
        });
    }

    public void expandCombo(int index) {
        switch (index) {
            case 1:
                combo1.setVisible(true);
                combo1.showPopup();
                break;
            case 2:
                combo2.setVisible(true);
                combo2.showPopup();
                break;
            case 3:
                combo3.setVisible(true);
                combo3.showPopup();
                break;
        }
    }

    public void collapseAllCombo() {
        combo1.hidePopup();
        combo2.hidePopup();
        combo3.hidePopup();
    }
}
