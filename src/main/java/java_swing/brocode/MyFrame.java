package java_swing.brocode;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame () {
        this.setVisible(true); // makes frame visible
        this.setTitle("Acus"); // sets the title of frame
        this.setSize(420, 420); // sets the x-dimension and y-dimension of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        this.setResizable(true); // resizes the window

        ImageIcon image = new ImageIcon("stars.png"); // creates an image icon
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(94, 160, 238)); // changes color of the background
    }
}
