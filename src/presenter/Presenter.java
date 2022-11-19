package presenter;

import view.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Presenter implements ActionListener, MouseListener {
    private View view;

    public Presenter() {
        view = new View(this, this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("next".equals(e.getActionCommand())) view.changeNextFlowPanel();
        if ("back".equals(e.getActionCommand())) view.changeBackFlowPanel();
    }

    public static void main(String[] args) {
        new Presenter();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //print the mouse coordinates
        System.out.println(e.getX() + " " + e.getY());
        if (e.getSource() instanceof JButton) {
            JButton button = (JButton) e.getSource();
            button.setCursor(new Cursor(Cursor.HAND_CURSOR));
            if (button.equals(view.getList1())) {
                view.expandCombo(1);
            } else if (button.equals(view.getList2())) {
                view.expandCombo(2);
            } else if (button.equals(view.getList3())) {
                view.expandCombo(3);
            } else if (button.equals(view.getButtonExpansive())) {
                view.expandButtonFooter();
            }
        }
        if (e.getSource() instanceof JLabel) ((JLabel) e.getSource()).setCursor(new Cursor(Cursor.HAND_CURSOR));
        if (e.getSource().equals(view.isFlowPanel())) view.setMidButtonsVisible();
        if (e.getSource().equals(view.getInfoPanel())) view.setMidButtonsInvisible();
    }
    @Override
    public void mouseExited(MouseEvent e) {
        {
            if (e.getSource() instanceof JButton) {
                JButton button = (JButton) e.getSource();
                button.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                if (button.equals(view.getButtonExpansive())) {
                    view.collapseButtonFooter();
                }
            }
            if (e.getSource() instanceof JLabel) ((JLabel) e.getSource()).setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            if (e.getSource().equals(view.isHeader())) view.setMidButtonsInvisible();
        }
    }
}
