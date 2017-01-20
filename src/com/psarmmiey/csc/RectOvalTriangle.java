package com.psarmmiey.csc;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Psarmmiey on 1/18/17.
 */

class RectOvalTriangle extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        this.setBackground(Color.white);

        // Draw blue Rectangle
        g.setColor(Color.blue);
        g.fillRect(40, 40, 100, 100);

        // Draw red oval inside the blue rectangle
        g.setColor( Color.red);
        g.fillOval(40, 40, 100, 100);


        // Draw the white triangles
        g.setColor(Color.white);
        int[] xV1 = {40, 90, 140 };
        int[] yV1 = {120, 40, 120};
        g.drawPolygon(xV1, yV1, 3);


        int[] xV2 = {40, 90, 140};
        int[] yV2 = {60, 140, 60};
        g.drawPolygon(xV2, yV2, 3);

    }
}
