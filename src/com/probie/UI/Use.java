package com.probie.UI;

import java.awt.*;
import javax.swing.*;
import com.probie.Main;
import java.util.Objects;
import java.io.IOException;
import com.probie.Data.Data;
import com.probie.Event.Spawn;
import com.probie.Data.Properties;
import com.programe.probie.ProgrameTool.Website.Website;
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
    public static JTextPane renewInformation = new JTextPane();
    public static JScrollPane renewScroll = new JScrollPane();
    public static JButton sureRenew = new JButton("立即更新");
    public static JButton quitRenew = new JButton("取消更新");
    public static JButton renew = new JButton("检查更新");
    public static JButton github = new JButton("GitHub");
    public static JButton website = new JButton("音乐网站");
    public static JButton me = new JButton("关于作者");

    //TODO Function
    public static JTextField functionField = new JTextField();
    public static JButton loadFunction = new JButton("导入");
    public static JButton saveFunction = new JButton("保存");
    public static JTextArea functionText = new JTextArea();
    public static JScrollPane functionScroll = new JScrollPane();
    public static JButton[][] functionKey = new JButton[8][3];
    public static JButton spawnFunction = new JButton("生\n成");

    //TODO Command
    public static JTextField commandField = new JTextField();
    public static JButton loadCommand = new JButton("导入");
    public static JButton saveCommand = new JButton("保存");
    public static JTextArea commandText = new JTextArea();
    public static JScrollPane commandScroll = new JScrollPane();
    public static JButton[][] commandKey = new JButton[8][3];
    public static JButton spawnCommand = new JButton("生\n成");

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
        frame.add(renewInformation);
        frame.add(renewScroll);
        frame.add(sureRenew);
        frame.add(quitRenew);
        mainPanel.add(renew);
        mainPanel.add(github);
        mainPanel.add(website);
        mainPanel.add(me);
        functionPanel.add(functionField);
        functionPanel.add(loadFunction);
        functionPanel.add(saveFunction);
        functionPanel.add(functionText);
        functionPanel.add(functionScroll);
        functionPanel.add(spawnFunction);
        commandPanel.add(commandField);
        commandPanel.add(loadCommand);
        commandPanel.add(saveCommand);
        commandPanel.add(commandText);
        commandPanel.add(commandScroll);
        commandPanel.add(spawnCommand);
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
        renewScroll.setViewportView(renewInformation);

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
        quitRenew.addActionListener(actionEvent -> exitRenew());
        sureRenew.addActionListener(actionEvent -> {
            if (Website.downFile(Data.renewFile,Windows.getHere(),Windows.getFileName(Data.renewFile))) {
                Windows.showInformation("Renew Success!");
            } else {
                Windows.showInformation("Connection Timed Out!");
            }
            exitRenew();
        });
        renew.addActionListener(actionEvent -> {
            Object[] values = null;
            try {
                values = Objects.requireNonNull(Website.getValueList(Data.renewConfig)).toArray();
            } catch (Exception exception) {
                Windows.showInformation("Connection Timed Out!");
            }
            if (!Objects.requireNonNull(values)[0].equals(Main.version)) {
                initMenu();
                menuPanel.setVisible(false);
                sureRenew.setVisible(true);
                quitRenew.setVisible(true);
                renewInformation.setVisible(true);
                renewScroll.setVisible(true);
                String value = "检测到有可更新的内容如下:";
                for (Object object : values) {
                    value = value+"\n"+object;
                }
                renewInformation.setText(value);
            } else {
                Windows.showInformation("This Is The Latest!");
            }
        });
        github.addActionListener(actionEvent -> {
            if (java.awt.Desktop.getDesktop().isSupported(java.awt.Desktop.Action.BROWSE)) {
                try {
                    Desktop.getDesktop().browse(java.net.URI.create(Data.github));
                } catch (IOException ioException) {
                    throw new RuntimeException(ioException);
                }
            }
        });
        website.addActionListener(actionEvent -> {
            if (java.awt.Desktop.getDesktop().isSupported(java.awt.Desktop.Action.BROWSE)) {
                try {
                    Desktop.getDesktop().browse(java.net.URI.create(Data.website));
                } catch (IOException ioException) {
                    throw new RuntimeException(ioException);
                }
            }
        });
        me.addActionListener(actionEvent -> {
            Windows.showInformation("Author: "+"BProbie");
        });

        //TODO Function
        loadFunction.addActionListener(actionEvent -> {
            String path = String.valueOf(Windows.getChosenFile(Objects.requireNonNull(Data.getData("loadFunction"))));
            functionText.setText(Windows.readFile(path));
            functionField.setText(Windows.getFileName(path).split("\\.")[0]);
        });
        saveFunction.addActionListener(actionEvent -> {
            Windows.writeFile(Data.getData("saveFunction")+functionField.getText()+".musicreater",functionText.getText());
            if (Objects.requireNonNull(Data.getData("saveFunctionOpen")).equals("true")) {
                Windows.open(Data.getData("saveFunction"));
            }
        });
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 8; j++) {
                JButton button = new JButton();
                switch (i) {
                    case 0: button.setText(j+"↑"); break;
                    case 1: button.setText(String.valueOf(j)); break;
                    case 2: button.setText(j+"↓"); break;
                    default: break;
                }
                button.addActionListener(actionEvent -> functionText.setText(functionText.getText()+button.getText()+" "));
                functionPanel.add(button);
                functionKey[j][i] = button;
            }
        }
        spawnFunction.addActionListener(actionEvent -> Spawn.function(functionText.getText()));

        //TODO Command
        loadCommand.addActionListener(actionEvent -> {
            String path = String.valueOf(Windows.getChosenFile(Objects.requireNonNull(Data.getData("loadCommand"))));
            commandText.setText(Windows.readFile(path));
            commandField.setText(Windows.getFileName(path).split("\\.")[0]);
        });
        saveCommand.addActionListener(actionEvent -> {
            Windows.writeFile(Data.getData("saveCommand")+commandField.getText()+".musicreater",commandText.getText());
            if (Objects.requireNonNull(Data.getData("saveCommandOpen")).equals("true")) {
                Windows.open(Data.getData("saveCommand"));
            }
        });
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 8; j++) {
                JButton button = new JButton();
                switch (i) {
                    case 0: button.setText(j+"↑"); break;
                    case 1: button.setText(String.valueOf(j)); break;
                    case 2: button.setText(j+"↓"); break;
                }
                button.addActionListener(actionEvent -> commandText.setText(commandText.getText()+button.getText()+" "));
                commandPanel.add(button);
                commandKey[j][i] = button;
            }
        }
        spawnCommand.addActionListener(actionEvent -> Spawn.command(commandText.getText()));

        //TODO Config
        loadConfig.addActionListener(actionEvent -> {
            if (Properties.properties.connection()) {
                configTextArea.setText(Windows.readFile(Properties.properties.getFilePath()));
            }
        });
        saveConfig.addActionListener(actionEvent -> {
            if (Properties.properties.connection()) {
                Windows.writeFile(Properties.properties.getFilePath(),configTextArea.getText());
                if (Integer.parseInt(Objects.requireNonNull(Data.getData("width")))<250) {
                    Properties.properties.addValue(Data.width,"250");
                    Windows.showInformation("The Min Width Is 250");
                }
                if (Integer.parseInt(Objects.requireNonNull(Data.getData("height")))<150) {
                    Properties.properties.addValue(Data.height,"150");
                    Windows.showInformation("The Min Height Is 150");
                }
                if (Integer.parseInt(Objects.requireNonNull(Data.getData("style")))==0) {
                    Properties.properties.addValue(Data.style,"3");
                    Windows.showInformation("The Style Cannot Be 0");
                }
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
        mainPanel.setBounds(0,frame.getHeight()/10,frame.getWidth(),frame.getHeight()/10*9-30);
        mainPanel.setBackground(Color.DARK_GRAY);
        mainPanel.setLayout(null);
        mainPanel.setVisible(true);
        functionPanel.setBounds(0,frame.getHeight()/10,frame.getWidth(),frame.getHeight()/10*9-30);
        functionPanel.setBackground(Color.DARK_GRAY);
        functionPanel.setLayout(null);
        functionPanel.setVisible(false);
        commandPanel.setBounds(0,frame.getHeight()/10,frame.getWidth(),frame.getHeight()/10*9-30);
        commandPanel.setBackground(Color.DARK_GRAY);
        commandPanel.setLayout(null);
        commandPanel.setVisible(false);
        configPanel.setBounds(0,frame.getHeight()/10,frame.getWidth(),frame.getHeight()/10*9-30);
        configPanel.setBackground(Color.DARK_GRAY);
        configPanel.setLayout(null);
        configPanel.setVisible(false);

        //TODO MenuButton
        toMain.setBounds(0,0,menuPanel.getWidth()/4,menuPanel.getHeight());
        toMain.setBackground(Color.LIGHT_GRAY);
        toFunction.setBounds(menuPanel.getWidth()/4,0,menuPanel.getWidth()/4,menuPanel.getHeight());
        toFunction.setBackground(Color.GRAY);
        toCommand.setBounds(menuPanel.getWidth()/4*2,0,menuPanel.getWidth()/4,menuPanel.getHeight());
        toCommand.setBackground(Color.GRAY);
        toConfig.setBounds(menuPanel.getWidth()/4*3,0,menuPanel.getWidth()/4,menuPanel.getHeight());
        toConfig.setBackground(Color.GRAY);

        //TODO Main
        renewInformation.setBounds(0,0,frame.getWidth(),frame.getHeight()/2);
        renewInformation.setFont(new Font("",Font.BOLD,20));
        renewScroll.setBounds(0,0,frame.getWidth(),frame.getHeight()/2);
        quitRenew.setBounds(frame.getWidth()/5,frame.getHeight()/5*3,frame.getWidth()/5,frame.getHeight()/5);
        sureRenew.setBounds(frame.getWidth()/5*3,frame.getHeight()/5*3,frame.getWidth()/5,frame.getHeight()/5);
        quitRenew.setBackground(Color.PINK);
        sureRenew.setBackground(Color.PINK);
        renewInformation.setVisible(false);
        renewScroll.setVisible(false);
        quitRenew.setVisible(false);
        sureRenew.setVisible(false);
        renew.setBounds(mainPanel.getWidth()/5,mainPanel.getHeight()/5,mainPanel.getWidth()/5,mainPanel.getHeight()/8);
        github.setBounds(mainPanel.getWidth()/5*3,mainPanel.getHeight()/5,mainPanel.getWidth()/5,mainPanel.getHeight()/8);
        website.setBounds(mainPanel.getWidth()/5,mainPanel.getHeight()/5*3,mainPanel.getWidth()/5,mainPanel.getHeight()/8);
        me.setBounds(mainPanel.getWidth()/5*3,mainPanel.getHeight()/5*3,mainPanel.getWidth()/5,mainPanel.getHeight()/8);

        //TODO Functionr
        functionField.setBounds(0,0,functionPanel.getWidth()/2,functionPanel.getHeight()/8);
        functionField.setFont(new Font("",Font.BOLD,30));
        loadFunction.setBounds(functionPanel.getWidth()/2,0,functionPanel.getWidth()/4,functionPanel.getHeight()/8);
        saveFunction.setBounds(functionPanel.getWidth()/4*3,0,functionPanel.getWidth()/4,functionPanel.getHeight()/8);
        functionText.setBounds(0,functionPanel.getHeight()/8,functionPanel.getWidth(),functionPanel.getHeight()/2);
        functionText.setFont(new Font("",Font.BOLD,20));
        functionScroll.setBounds(0,functionPanel.getHeight()/8,functionPanel.getWidth(),functionPanel.getHeight()/2);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 8; j++) {
                functionKey[j][i].setBounds(functionPanel.getWidth()/9*j,functionPanel.getHeight()/8*(5+i),functionPanel.getWidth()/9,functionPanel.getHeight()/8);
            }
        }
        spawnFunction.setBounds(functionPanel.getWidth()/9*8,functionPanel.getHeight()/8*5,functionPanel.getWidth()/9,functionPanel.getHeight()/8*3);

        //TODO Command
        commandField.setBounds(0,0,commandPanel.getWidth()/2,commandPanel.getHeight()/8);
        commandField.setFont(new Font("",Font.BOLD,20));
        loadCommand.setBounds(commandPanel.getWidth()/2,0,commandPanel.getWidth()/4,commandPanel.getHeight()/8);
        saveCommand.setBounds(commandPanel.getWidth()/4*3,0,commandPanel.getWidth()/4,commandPanel.getHeight()/8);
        commandText.setBounds(0,commandPanel.getHeight()/8,commandPanel.getWidth(),commandPanel.getHeight()/2);
        commandText.setFont(new Font("",Font.BOLD,20));
        commandScroll.setBounds(0,commandPanel.getHeight()/8,commandPanel.getWidth(),commandPanel.getHeight()/2);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 8; j++) {
                commandKey[j][i].setBounds(commandPanel.getWidth()/9*j,commandPanel.getHeight()/8*(5+i),commandPanel.getWidth()/9,commandPanel.getHeight()/8);
            }
        }
        spawnCommand.setBounds(commandPanel.getWidth()/9*8,commandPanel.getHeight()/8*5,commandPanel.getWidth()/9,commandPanel.getHeight()/8*3);

        //TODO Config
        configTextArea.setBounds(0,0,configPanel.getWidth()/4*3,configPanel.getHeight());
        configTextArea.setFont(new Font("",Font.BOLD,15));
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

    public static void exitRenew() {
        initMenu();
        renewInformation.setVisible(false);
        renewScroll.setVisible(false);
        sureRenew.setVisible(false);
        quitRenew.setVisible(false);
        toMain.setBackground(Color.LIGHT_GRAY);
        menuPanel.setVisible(true);
        mainPanel.setVisible(true);
    }
}