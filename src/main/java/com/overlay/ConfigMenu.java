package com.overlay;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

// import com.google.common.primitives.Bytes;

import javax.imageio.ImageIO;

import java.awt.Image;
import java.awt.Desktop.Action;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

public class ConfigMenu extends JPanel {
  private JTextField m_delay;
  private JComboBox m_comboBox;
  private JLabel m_label;
  private JButton m_button;

  private JLabel m_label2;

  private Image m_backgroundImage;

  private Font m_font = new Font("serif", Font.BOLD, 12);

  public ConfigMenu(String fileName) throws IOException {
    m_button = new JButton("START");
    String[] jcomp4Items = { "refresh", "SNAP and translate" };

    m_delay = new JTextField(5);
    m_label = new JLabel("delay between refreses");
    m_label2 = new JLabel("refresh or snap translate?");
    m_label.setFont(m_font);
    m_label2.setFont(m_font);
    m_comboBox = new JComboBox(jcomp4Items);

    setPreferredSize(new Dimension(500, 350));
    setLayout(null);

    m_delay.addKeyListener(new KeyAdapter() {
      public void keyPressed(KeyEvent keypressed) {
        String value = m_delay.getText();
        int l = value.length();
        if (keypressed.getKeyChar() >= '0' && keypressed.getKeyChar() <= '9') {
          m_delay.setEditable(true);
        } else {
          m_delay.setEditable(false);
        }
      }
    });
    add(m_delay);
    add(m_label);
    add(m_comboBox);
    add(m_label2);
    add(m_button);

    m_delay.setBounds(135, 60, 100, 30);
    m_label.setBounds(135, 30, 150, 30);
    m_comboBox.setBounds(325, 65, 150, 30);
    m_label2.setBounds(325, 40, 150, 30);
    m_button.setBounds(325, 270, 150, 30);

    m_backgroundImage = ImageIO.read(new File(fileName));
  }

  public void paintComponent(Graphics graphics) {
    super.paintComponent(graphics);
    graphics.drawImage(m_backgroundImage, 0, 0, this);
  }

  public boolean isReadyForOverlay() {
    return m_button.isEnabled();
  }

}