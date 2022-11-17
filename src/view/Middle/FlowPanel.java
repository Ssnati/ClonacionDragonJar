package view;

import javax.swing.*;

public class FlowPanel extends JPanel {
    private JButton back, next;
    private MidPanel midPanel;

    public FlowPanel() {
        back = new JButton("<");
        next = new JButton(">");
        midPanel = new MidPanel();

        add(back);
        add(midPanel);
        add(next);
    }

    class MidPanel extends JPanel{

    }
}
