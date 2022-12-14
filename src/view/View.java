package view;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

public class View extends JFrame {
    private JScrollPane scrollPane;
    private MainPanel mainPanel;
    public View(ActionListener listener, MouseListener mouseListener) {
        setTitle("DragonJar");
        setBounds(50, 0, 1700, 2000);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);
        initComponent(listener, mouseListener);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    private void initComponent(ActionListener listener, MouseListener mouseListener) {
        mainPanel = new MainPanel(listener, mouseListener);
        scrollPane = new JScrollPane(mainPanel);
        getContentPane().add(scrollPane);
        scrollPane.getVerticalScrollBar().setUI(new ScrollModel());
        scrollPane.getVerticalScrollBar().setUnitIncrement(8);
    }
    public void expandButtonFooter() {
        mainPanel.expandButtonFooter();
    }
    public void expandCombo(int index) {
        mainPanel.expandCombo(index);
    }
    public void changeNextFlowPanel() {
        mainPanel.changeNextFlowPanel();
        scrollDown();
        scrollUp();
    }
    public void changeBackFlowPanel() {
        mainPanel.changeBackFlowPanel();
        scrollDown();
        scrollUp();
    }
    public JButton getButtonExpansive() {
        return mainPanel.getInfoPanel().getFooterPanel().getButton();
    }
    public JButton getList1() {
        return mainPanel.getList1();
    }
    public JButton getList2() {
        return mainPanel.getList2();
    }
    public JButton getList3() {
        return mainPanel.getList3();
    }
    public JPanel isFlowPanel() {
        return mainPanel.getFlowPanel();
    }
    public void setMidButtonsVisible() {
        mainPanel.setMidButtonsVisible();
    }
    public void collapseButtonFooter() {
        mainPanel.contractButtonFooter();
    }
    public void setMidButtonsInvisible() {
        mainPanel.setMidButtonsInvisible();
    }
    public JComponent isHeader() {
        return mainPanel.getHeader();
    }
    public JPanel getInfoPanel() {
        return mainPanel.getInfoPanel();
    }
    private void scrollDown() {
        scrollPane.getVerticalScrollBar().setValue(scrollPane.getVerticalScrollBar().getValue() + 1);
    }
    private void scrollUp() {
        scrollPane.getVerticalScrollBar().setValue(scrollPane.getVerticalScrollBar().getValue() - 1);
    }
    public void collapseAllCombo() {
        mainPanel.collapseAllCombo();
    }
    public JPanel getHeader() {
        return mainPanel.getHeader();
    }
}