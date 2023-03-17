package com.overlay;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.*;
import javax.swing.event.*;


public class Config {
    private JPanel m_configMenu;
    private JFrame m_frame;
    private ConfigMenu m_configmenu;
    
    InputStream inputStream = getClass().getResourceAsStream("/stuff/Background1.jpg");
    
    private static Image m_icon = Toolkit.getDefaultToolkit()
            .getImage("src\\main\\resources\\stuff\\icon.jpg");
    
    public Config() {
        try {
            m_configmenu = new ConfigMenu(
                "src\\main\\resources\\stuff\\Background1.jpg");

        } catch (IOException ex) {
            System.out.println(ex);
        }
        m_frame = new JFrame();

        m_frame.setVisible(true);

        m_frame.getContentPane().add(m_configmenu);
        m_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // m_frame.getContentPane().add(m_configMenu);
        // m_frame.add(new JLabel(new
        // ImageIcon("C:\\Users\\gadym\\Desktop\\new\\app\\src\\main\\resources\\stuff\\Background.jpg")));

        m_frame.pack();
        m_frame.setVisible(true);

        m_frame.setIconImage(m_icon);
        m_frame.setResizable(false);
    }

    public boolean isReadyForOverlay() {
        return m_configmenu.isReadyForOverlay();
    }

}
