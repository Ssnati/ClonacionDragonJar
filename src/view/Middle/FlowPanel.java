package view.Middle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

public class FlowPanel extends JPanel {
    private JButton back, next;
    private Image image;
    private MidPanel midPanel;

    private int index;


    public JButton getBack() {
        return back;
    }

    public void setBack(JButton back) {
        this.back = back;
    }

    public JButton getNext() {
        return next;
    }

    public void setNext(JButton next) {
        this.next = next;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public MidPanel getMidPanel() {
        return midPanel;
    }

    public void setMidPanel(JPanel midPanel) {
        this.midPanel = (MidPanel) midPanel;
    }

    public FlowPanel(String source) {
        this.setSize(1700, 800);
        index = 1;
        back = new JButton("<");
        next = new JButton(">");
        image = new ImageIcon(source).getImage();

        createButton(back);
        createButton(next);


        midPanel = new MidPanel();
        midPanel.setPreferredSize(new Dimension(1388, 355));
        midPanel.setOpaque(false);


        add(back);
        add(midPanel);
        add(next);
    }

    private void createButton(JButton button) {
        button.setPreferredSize(new Dimension(50, 50));
        button.setFont(new Font("NSimSun", Font.BOLD, 50));
        button.setBorder(BorderFactory.createEmptyBorder());
        button.setBackground(new Color(0, 0, 0, 0));
        button.setBorderPainted(false);
        button.setFocusable(false);
        button.setContentAreaFilled(false);
        button.setVisible(false);
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }

    public void setListeners(ActionListener listener, MouseListener mouseListener) {
        back.addActionListener(listener);
        next.addActionListener(listener);
        back.setActionCommand("back");
        next.setActionCommand("next");
        back.addMouseListener(mouseListener);
        next.addMouseListener(mouseListener);
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void changeFlowPanel(int indexCase) {
        int operation = index + indexCase;
        if (operation == 0) operation = 3;
        else if (operation == 4) operation = 1;
        image = new ImageIcon("data/images/Flow" + operation + ".jpg").getImage();
        back.setVisible(true);
        next.setVisible(true);
        index = operation;

    }

    public void setMidButtonsVisible() {
        next.setVisible(true);
        back.setVisible(true);
    }

    public void setMidButtonsInvisible() {
        next.setVisible(false);
        back.setVisible(false);
    }
}