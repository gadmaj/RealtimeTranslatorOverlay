/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.overlay;

public class App {
    public static boolean m_isTranslating = true;
    public static boolean m_translationType = true; // TRUE IS CONSTANT TRANSLATION FALSE IS
    public static double m_howOften = 2; // how many seconds till next translation

    public static void main(String[] args) {
        // ScreenShoter screenshoter = new ScreenShoter();
        ScanScreen scanScreen = new ScanScreen();
        // Config configure = new Config();

        // m_1.setDelay();
        // Overlay.addEnglishOverlay("BROTHER IN CHRIST", 500, 500, 500, 500);
        
        // Overlay overlay = new Overlay();
        // while(true){
        // screenshoter.takeScreenShot();
        scanScreen.scanScreen();
        // }
    }

}
