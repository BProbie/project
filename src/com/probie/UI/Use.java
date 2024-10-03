package com.probie.UI;

import java.awt.*;
import javax.swing.*;
import java.util.Objects;
import com.probie.Data.Data;
import com.probie.Data.Properties;
import com.programe.probie.ProgrameTool.Computer.Windows;

public class Use {

    //TODO Panel
    public static JPanel menuPanel = new JPanel();
    public static JPanel mainPanel = new JPanel();
    public static JPanel functionPanel = new JPanel();
    public static JPanel commandPanel = new JPanel();
    public static JPanel configPanel = new JPanel();

    //TODO MenuButton
    public static JButton toMain = new JButton("首页");
    public static JButton toFunction = new JButton("函数");
    public static JButton toCommand = new JButton("指令");
    public static JButton toConfig = new JButton("设置");

    //TODO Main

    //TODO Function
    public static JTextField functionField = new JTextField();
    public static JButton loadFunction = new JButton("导入");
    public static JButton saveFunction = new JButton("保存");
    public static JTextArea functionText = new JTextArea();
    public static JScrollPane functionScroll = new JScrollPane();

    //TODO Command
    public static JTextField commandField = new JTextField();
    public static JButton loadCommand = new JButton("导入");
    public static JButton saveCommand = new JButton("保存");
    public static JTextArea commandText = new JTextArea();
    public static JScrollPane commandScroll = new JScrollPane();

    //TODO Config
    public static JTextArea configTextArea = new JTextArea();
    public static JScrollPane configScroll = new JScrollPane();
    public static JButton loadConfig = new JButton("导入");
    public static JButton saveConfig = new JButton("保存");
    public static JButton resetConfig = new JButton("重置");
    public static JButton helpConfig = new JButton("帮助");

    public static void createUse(JFrame frame) {
        //TODO Frame||Panel
        frame.add(menuPanel);
        frame.add(mainPanel);
        frame.add(functionPanel);
        frame.add(commandPanel);
        frame.add(configPanel);
        functionPanel.add(functionField);
        functionPanel.add(loadFunction);
        functionPanel.add(saveFunction);
        functionPanel.add(functionText);
        functionPanel.add(functionScroll);
        commandPanel.add(commandField);
        commandPanel.add(loadCommand);
        commandPanel.add(saveCommand);
        commandPanel.add(commandText);
        commandPanel.add(commandScroll);
        menuPanel.add(toMain);
        menuPanel.add(toFunction);
        menuPanel.add(toCommand);
        menuPanel.add(toConfig);
        configPanel.add(configTextArea);
        configPanel.add(configScroll);
        configPanel.add(loadConfig);
        configPanel.add(saveConfig);
        configPanel.add(resetConfig);
        configPanel.add(helpConfig);

        //TODO Scroll
        configScroll.setViewportView(configTextArea);
        functionScroll.setViewportView(functionText);
        commandScroll.setViewportView(commandText);

        //TODO ActionEvent
        toMain.addActionListener(actionEvent -> {
            initMenu();
            toMain.setBackground(Color.lightGray);
            mainPanel.setVisible(true);
        });
        toFunction.addActionListener(actionEvent -> {
            initMenu();
            toFunction.setBackground(Color.lightGray);
            functionPanel.setVisible(true);
        });
        toCommand.addActionListener(actionEvent -> {
            initMenu();
            toCommand.setBackground(Color.lightGray);
            commandPanel.setVisible(true);
        });
        toConfig.addActionListener(actionEvent -> {
            initMenu();
            toConfig.setBackground(Color.lightGray);
            configPanel.setVisible(true);
        });

        //TODO Main

        //TODO Function
        loadFunction.addActionListener(actionEvent -> functionText.setText(Windows.readFile(String.valueOf(Windows.getChosenFile(Objects.requireNonNull(Data.getData("load")))))));
        saveFunction.addActionListener(actionEvent -> Windows.writeFile(Data.getData("save")+functionField.getText()+".musicreaterSave",functionText.getText()));

        //TODO Command
        loadCommand.addActionListener(actionEvent -> commandText.setText(Windows.readFile(String.valueOf(Windows.getChosenFile(Objects.requireNonNull(Data.getData("load")))))));
        saveCommand.addActionListener(actionEvent -> Windows.writeFile(Data.getData("save")+commandField.getText()+".musicreaterSave",commandText.getText()));

        //TODO Config
        loadConfig.addActionListener(actionEvent -> {
            if (Properties.properties.connection()) {
                configTextArea.setText(Windows.readFile(Properties.properties.getFilePath()));
            }
        });
        saveConfig.addActionListener(actionEvent -> {
            if (Properties.properties.connection()) {
                Windows.writeFile(Properties.properties.getFilePath(),configTextArea.getText());
                UI.drawUI();
            }
            initMenu();
            toConfig.setBackground(Color.lightGray);
            configPanel.setVisible(true);
        });
        resetConfig.addActionListener(actionEvent -> {
            Windows.writeFile(Properties.properties.getFilePath(),"");
            if (Properties.properties.connection()) {
                Properties.init();
                configTextArea.setText(Windows.readFile(Properties.properties.getFilePath()));
                UI.drawUI();
            }
            initMenu();
            toConfig.setBackground(Color.lightGray);
            configPanel.setVisible(true);
        });
        helpConfig.addActionListener(actionEvent -> Windows.showInformation("Vegetable Just More Practice!"));
    }

    public static void drawMenu(JFrame frame) {

        //TODO Panel
        menuPanel.setBounds(0, 0,frame.getWidth(),frame.getHeight()/10);
        menuPanel.setBackground(Color.GRAY);
        menuPanel.setLayout(null);
        menuPanel.setVisible(true);
        mainPanel.setBounds(0,frame.getHeight()/10,frame.getWidth(),frame.getHeight()/10*9);
        mainPanel.setBackground(Color.DARK_GRAY);
        mainPanel.setLayout(null);
        mainPanel.setVisible(true);
        functionPanel.setBounds(0,frame.getHeight()/10,frame.getWidth(),frame.getHeight()/10*9);
        functionPanel.setBackground(Color.DARK_GRAY);
        functionPanel.setLayout(null);
        functionPanel.setVisible(false);
        commandPanel.setBounds(0,frame.getHeight()/10,frame.getWidth(),frame.getHeight()/10*9);
        commandPanel.setBackground(Color.DARK_GRAY);
        commandPanel.setLayout(null);
        commandPanel.setVisible(false);
        configPanel.setBounds(0,frame.getHeight()/10,frame.getWidth(),frame.getHeight()/10*9);
        configPanel.setBackground(Color.DARK_GRAY);
        configPanel.setLayout(null);
        configPanel.setVisible(false);

        //TODO MenuButton
        toMain.setBounds(0,0,menuPanel.getWidth()/4,menuPanel.getHeight());
        toMain.setBackground(Color.GRAY);
        toFunction.setBounds(menuPanel.getWidth()/4,0,menuPanel.getWidth()/4,menuPanel.getHeight());
        toFunction.setBackground(Color.GRAY);
        toCommand.setBounds(menuPanel.getWidth()/4*2,0,menuPanel.getWidth()/4,menuPanel.getHeight());
        toCommand.setBackground(Color.GRAY);
        toConfig.setBounds(menuPanel.getWidth()/4*3,0,menuPanel.getWidth()/4,menuPanel.getHeight());
        toConfig.setBackground(Color.GRAY);

        //TODO Main

        //TODO Function
        functionField.setBounds(0,0,functionPanel.getWidth()/2,functionPanel.getHeight()/8);
        functionField.setFont(new Font("",Font.BOLD,30));
        loadFunction.setBounds(functionPanel.getWidth()/2,0,functionPanel.getWidth()/4,functionPanel.getHeight()/8);
        saveFunction.setBounds(functionPanel.getWidth()/4*3,0,functionPanel.getWidth()/4,functionPanel.getHeight()/8);
        functionText.setBounds(0,functionPanel.getHeight()/8,functionPanel.getWidth(),functionPanel.getHeight()/2);
        functionText.setFont(new Font("",Font.BOLD,20));
        functionScroll.setBounds(0,functionPanel.getHeight()/8,functionPanel.getWidth(),functionPanel.getHeight()/2);

        //TODO Command
        commandField.setBounds(0,0,commandPanel.getWidth()/2,commandPanel.getHeight()/8);
        commandField.setFont(new Font("",Font.BOLD,20));
        loadCommand.setBounds(commandPanel.getWidth()/2,0,commandPanel.getWidth()/4,commandPanel.getHeight()/8);
        saveCommand.setBounds(commandPanel.getWidth()/4*3,0,commandPanel.getWidth()/4,commandPanel.getHeight()/8);
        commandText.setBounds(0,commandPanel.getHeight()/8,commandPanel.getWidth(),commandPanel.getHeight()/2);
        commandText.setFont(new Font("",Font.BOLD,20));
        commandScroll.setBounds(0,commandPanel.getHeight()/8,commandPanel.getWidth(),commandPanel.getHeight()/2);

        //TODO Config
        configTextArea.setBounds(0,0,configPanel.getWidth()/4*3,configPanel.getHeight());
        if (Properties.properties.connection()) {
            configTextArea.setText(Windows.readFile(Properties.properties.getFilePath()));
        }
        configScroll.setBounds(0,0,configPanel.getWidth()/4*3,configPanel.getHeight());
        loadConfig.setBounds(configPanel.getWidth()/4*3,0,configPanel.getWidth()/4,configPanel.getHeight()/4);
        saveConfig.setBounds(configPanel.getWidth()/4*3,configPanel.getHeight()/4,configPanel.getWidth()/4,configPanel.getHeight()/4);
        resetConfig.setBounds(configPanel.getWidth()/4*3,configPanel.getHeight()/4*2,configPanel.getWidth()/4,configPanel.getHeight()/4);
        helpConfig.setBounds(configPanel.getWidth()/4*3,configPanel.getHeight()/4*3,configPanel.getWidth()/4,configPanel.getHeight()/4);
    }

    public static void initMenu() {
        toMain.setBackground(Color.GRAY);
        toFunction.setBackground(Color.GRAY);
        toCommand.setBackground(Color.GRAY);
        toConfig.setBackground(Color.GRAY);
        mainPanel.setVisible(false);
        functionPanel.setVisible(false);
        commandPanel.setVisible(false);
        configPanel.setVisible(false);
    }
}