package com.probie;

import java.io.File;
import com.probie.UI.UI;
import com.probie.Data.Properties;
import com.programe.probie.ProgrameTool.Computer.Windows;

public class Main {

    public static String workName = "Musicreater";
    public static String author = "Probie";
    public static String version = "1.0";
    public static String mcVersion = "1.12.2";
    public static String javaVersion = "1.8.0";

    private static boolean isFirst = false;

    public static void init () {
        if (!new File(Properties.properties.getFilePath()).exists()) {
            Properties.init();
            if (Properties.properties.connection()) {
                isFirst = true;
            }
        }
        UI.frame.setUndecorated(true);
        UI.createUI();
        UI.drawUI();
    }
    public static void main(String[] args) {
        init();
        UI.frame.setVisible(true);
        if (Properties.properties.connection()) {
            if (isFirst) {
                Windows.showInformation("Welcome To Musicreater!");
            }
        } else {
            Windows.showInformation("Connection Properties Failed?");
        }
    }
}