package view;

import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.*;

public class ScrollModel extends BasicScrollBarUI {
    protected void configureScrollBarColors() {
        this.thumbColor = new Color(145, 143, 143, 76);
    }
}
