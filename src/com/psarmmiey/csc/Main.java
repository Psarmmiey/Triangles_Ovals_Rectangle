package com.psarmmiey.csc;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        JFrame frame =
                new JFrame("Drawing Rectangles, Ovals");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        RectOvalTriangle rectOvalTriangle =
                new RectOvalTriangle();

        rectOvalTriangle.setBackground(Color.white);
        frame.add(rectOvalTriangle);
        frame.setSize(180, 200);
        frame.setVisible(true);
    }
}
