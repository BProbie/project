package com.probie.UI;

import javax.swing.*;
import java.util.Objects;
import com.probie.Data.Data;
import com.probie.Data.Properties;
import com.programe.probie.ProgrameTool.Computer.misc.Screen;

public class UI {
    public static JFrame frame = new JFrame();

    public static void createUI() {
        Use.createUse(frame);
    }

    public static void drawUI() {
        if (Properties.properties.connection()) {
            frame.setTitle(Data.getData("title"));
            frame.setSize(Integer.parseInt(Objects.requireNonNull(Data.getData("width"))), Integer.parseInt(Objects.requireNonNull(Data.getData("height"))));
            frame.setLocation((int)(Screen.getSize().getWidth()/2-frame.getSize().getWidth()/2),(int)(Screen.getSize().getHeight()/2-frame.getSize().getHeight()/2));
            frame.getRootPane().setWindowDecorationStyle(Integer.parseInt(Objects.requireNonNull(Data.getData("style"))));
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.setLayout(null);
            Use.drawMenu(frame);
        }
    }
}