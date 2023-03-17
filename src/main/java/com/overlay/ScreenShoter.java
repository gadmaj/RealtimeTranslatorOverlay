package com.overlay;
import java.awt.AWTException;
import java.awt.Toolkit;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.File;
import javax.imageio.ImageIO;
public class ScreenShoter {
    private long m_howoften;
    public ScreenShoter(){
        m_howoften = 1500;
        
    }
    public void setDelay(long newdelay){
        m_howoften = newdelay;
        System.out.println("Delay switched to: " + m_howoften);
    }
    public void takeScreenShot(){
        try{
            Thread.sleep(m_howoften);
            Robot m_robot = new Robot();

            Rectangle capture = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage Image = m_robot.createScreenCapture(capture);
            ImageIO.write(Image, "jpg", new File("C:\\Users\\gadym\\Desktop\\New folder (3)\\translationoverlay\\src\\main\\resources\\temp\\temp.jpg"));
            System.out.println("SCREENSHOT SAVED!");
        }
        catch(AWTException | IOException | InterruptedException ex){
            System.out.println(ex);
        }
    }
}
