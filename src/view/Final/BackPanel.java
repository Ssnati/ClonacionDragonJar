package view.Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;

public class BackPanel extends JPanel {
    private InternalPanel internalPanelLeft, internalPanelRight;

    public InternalPanel getInternalPanelLeft() {
        return internalPanelLeft;
    }

    public void setInternalPanelLeft(InternalPanel internalPanelLeft) {
        this.internalPanelLeft = internalPanelLeft;
    }

    public InternalPanel getInternalPanelRight() {
        return internalPanelRight;
    }

    public void setInternalPanelRight(InternalPanel internalPanelRight) {
        this.internalPanelRight = internalPanelRight;
    }

    public BackPanel() {
        setLayout(new GridBagLayout());
        internalPanelLeft = new InternalPanel("data/images/calendar.png");
        internalPanelRight = new InternalPanel("data/images/phone.png");

        internalPanelLeft.setTitle("AGENDA UNA LLAMADA");
        internalPanelLeft.setDescription("Uno de nuestros asesores se comunicará contigo.");
        addInternalPanelLeft();

        internalPanelRight.setTitle("CONTÁCTANOS");
        internalPanelRight.setDescription("Comunícate directamente con nosotros.");
        addInternalPanelRight();
    }

    private void addInternalPanelLeft() {
        GridBagConstraints gbc = new GridBagConstraints();
        internalPanelLeft.setBackground(new Color(14, 53, 40, 180));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(20, 20, 20, 20);
        gbc.ipadx = 170;//Tamaño del panel horizontal
        gbc.ipady = 24;//Tamaño del panel vertical
        add(internalPanelLeft, gbc);
    }

    private void addInternalPanelRight() {
        GridBagConstraints gbc = new GridBagConstraints();
        internalPanelRight.setBackground(new Color(127, 89, 9, 180));
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.insets = new Insets(20, 20, 20, 20);
        gbc.ipadx = 180;//Tamaño del panel horizontal
        gbc.ipady = 24;//Tamaño del panel vertical
        add(internalPanelRight, gbc);

    }

    public void setListeners(MouseListener mouseListener) {
        internalPanelLeft.setListeners(mouseListener);
        internalPanelRight.setListeners(mouseListener);
    }
}
