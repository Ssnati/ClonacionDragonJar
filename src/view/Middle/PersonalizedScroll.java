package view.Middle;

import view.MainPanel;

import javax.swing.*;
import java.awt.*;

public class PersonalizedScroll extends JScrollBar {
    public PersonalizedScroll(MainPanel mainPanel) {
            setUI(new ScrollModel());
            setPreferredSize(new Dimension(10, 0));
            setForeground(Color.GREEN);
            setBackground(Color.PINK);
    }
}
