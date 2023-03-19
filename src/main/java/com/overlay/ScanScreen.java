package com.overlay;

import java.awt.Rectangle;
import java.awt.Toolkit;
import java.io.File;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class ScanScreen {
    public Tesseract m_scanner;
    public ScanScreen() {
        m_scanner = new Tesseract();
        m_scanner.setLanguage("chi_sim");
        m_scanner.setOcrEngineMode(0);
        m_scanner.setDatapath("src\\main\\resources\\tessdata"); //("src\\main\\resources\\tessdata\\chi_sim.traineddata");
    }
    public void scanScreen(){
        String mscreen;
        File temp = new File("src\\main\\resources\\temp\\temp.jpg");//("C:\\Users\\gadym\\Desktop\\New folder (3)\\translationoverlay\\src\\main\\resources\\temp\\temp.jpg");
        Rectangle screenRec = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        try{
            mscreen = m_scanner.doOCR(temp);
            System.out.println(mscreen);
        }
        catch(TesseractException ex){
            System.out.println(ex);
        }
        
    }
}