package view.Middle;

import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.plaf.basic.BasicComboBoxUI;
import java.awt.*;

public class PersonalizedCombo extends BasicComboBoxUI {
    @Override
    public void configureArrowButton() {
        super.configureArrowButton();
        arrowButton.setBackground(Color.WHITE);
        arrowButton.setBorder(BorderFactory.createEmptyBorder());
    }

    @Override
    protected JButton createArrowButton() {
        return new BasicArrowButton(BasicArrowButton.SOUTH, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE);
    }

    @Override
    public void paintCurrentValueBackground(Graphics g, Rectangle bounds, boolean hasFocus) {
        g.setColor(Color.WHITE);
        g.fillRect(bounds.x, bounds.y, bounds.width, bounds.height);
    }
}
