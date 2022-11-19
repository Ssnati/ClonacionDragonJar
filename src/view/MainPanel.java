package view;

import view.Final.FinalPanel;
import view.Header.Header;
import view.InfoPanel.InfoPanel;
import view.Middle.FlowPanel;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

public class MainPanel extends JPanel {
    private Header header;
    private FlowPanel flowPanel;

    private InfoPanel infoPanel;
    private FinalPanel finalPanel;

    public MainPanel(ActionListener listener, MouseListener mouseListener) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        header = new Header();
        flowPanel = new FlowPanel("data/images/Flow1.jpg");
        infoPanel = new InfoPanel();
        finalPanel = new FinalPanel();

        header.setPreferredSize(new Dimension(1388, 80));
        infoPanel.setPreferredSize(new Dimension(1388, 340));
        finalPanel.setPreferredSize(new Dimension(1388, 340));

        finalPanel.setOpaque(false);
        infoPanel.setBackground(new Color(25, 25, 25));
        header.setBackground(new Color(254, 254, 254));

        setListeners(listener, mouseListener);

        add(header);
        add(flowPanel);
        add(infoPanel);
        add(finalPanel);
    }

    private void setListeners(ActionListener listener, MouseListener mouseListener) {
        header.setListeners(listener, mouseListener);
        flowPanel.setListeners(listener, mouseListener);
        flowPanel.addMouseListener(mouseListener);
        infoPanel.setListeners(mouseListener);
        header.addMouseListener(mouseListener);
        infoPanel.addMouseListener(mouseListener);
        finalPanel.setListeners(mouseListener);
    }

    public InfoPanel getInfoPanel() {
        return infoPanel;
    }

    public void expandButtonFooter() {
        infoPanel.expandButtonFooter();
    }

    public void setDefaultFooterPanel() {
        infoPanel.contractButtonFooter();
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public FlowPanel getFlowPanel() {
        return flowPanel;
    }

    public void setFlowPanel(FlowPanel flowPanel) {
        this.flowPanel = flowPanel;
    }

    public void setInfoPanel(InfoPanel infoPanel) {
        this.infoPanel = infoPanel;
    }

    public FinalPanel getFinalPanel() {
        return finalPanel;
    }

    public void setFinalPanel(FinalPanel finalPanel) {
        this.finalPanel = finalPanel;
    }

    public void expandCombo(int index) {
        header.expandCombo(index);
    }

    public void contractCombo(int index) {
        header.contractCombo(index);
    }

    public void changeNextFlowPanel() {
        flowPanel.changeFlowPanel(+1);
    }

    public void changeBackFlowPanel() {
        flowPanel.changeFlowPanel(-1);
    }

    public JButton getList1() {
        return header.getList1();
    }

    public JButton getList2() {
        return header.getList2();
    }

    public JButton getList3() {
        return header.getList3();
    }

    public void setMidButtonsVisible() {
        flowPanel.setMidButtonsVisible();
    }

    public void contractButtonFooter() {
        infoPanel.contractButtonFooter();
    }

    public void setMidButtonsInvisible() {
        flowPanel.setMidButtonsInvisible();
    }
}
