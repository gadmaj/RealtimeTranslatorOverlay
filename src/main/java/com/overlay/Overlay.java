package com.overlay;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
// import javax.swing.JTextField;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Dimension;

public class Overlay {
    private static JFrame m_frame = new JFrame("Translation Window");
    private static Dimension m_screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private static Image m_icon = Toolkit.getDefaultToolkit()
            .getImage("C:\\Users\\gadym\\Desktop\\new\\app\\src\\main\\resources\\stuff\\icon.jpg");
   
    public Overlay() {
        m_frame.setUndecorated(true);

        m_frame.setBackground(new Color(255, 255, 255, 255));

        m_frame.setAlwaysOnTop(true);

        m_frame.setPreferredSize(new Dimension((int) (m_screenSize.getWidth()), (int) (m_screenSize.getHeight())));

        m_frame.getRootPane().putClientProperty("apple.awt.draggableWindowBackground", true);

        m_frame.getContentPane().setLayout(new java.awt.BorderLayout());

        m_frame.setVisible(true);
        m_frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        m_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m_frame.pack();
        m_frame.setIconImage(m_icon);
        
        addEnglishOverlay("HEY", 500, 500 ,500, 500);
    }

    public static void addEnglishOverlay(String translatedenglish, int x, int y, int width, int length) {

        // if (x < (int) (m_screenSize.getWidth()) &&
        //         y < (int) (m_screenSize.getHeight())) {
            JLabel label = new JLabel(translatedenglish);
            System.out.println("WITHIN SCREEN SIZE");
            label.setSize(m_screenSize);
            label.setBounds(x, y, width, length);
            label.setBackground(new Color(0, 0, 0, 255));
            label.setVisible(true);
            m_frame.add(label);
        // } else {
        //     System.out.println("DID NOT DISPLAY PANEL WITHIN SCREEN SIZE");
        // }
    }
}
