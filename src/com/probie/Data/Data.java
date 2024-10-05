package com.probie.Data;

import com.programe.probie.ProgrameTool.Computer.Windows;

public class Data {

    public static final String renewFile = "https://raw.githubusercontent.com/BProbie/project/refs/heads/Musicreater/Musicreater.exe";
    public static final String renewConfig = "https://raw.githubusercontent.com/BProbie/project/refs/heads/Musicreater/Musicreater.renew";
    public static final String github = "https://github.com/BProbie";
    public static final String website = "https://www.everyonepiano.cn/home.html#:~:text=Everyone%20P";

    public static final String _DO = "0.354";
    public static final String _RE = "0.397";
    public static final String _MI = "0.400";
    public static final String _FA = "0.472";
    public static final String _SO = "0.530";
    public static final String _LA = "0.595";
    public static final String _SI = "0.667";

    public static final String DO = "0.707";
    public static final String RE = "0.794";
    public static final String MI = "0.891";
    public static final String FA = "0.944";
    public static final String SO = "1.059";
    public static final String LA = "1.189";
    public static final String SI = "1.335";

    public static final String DO_ = "1.414";
    public static final String RE_ = "1.587";
    public static final String MI_ = "1.782";
    public static final String FA_ = "1.888";
    public static final String SO_ = "2.119";
    public static final String LA_ = "2.378";
    public static final String SI_ = "2.670";

    public static String title = "Frame-Title";
    public static String width = "Frame-Width";
    public static String height = "Frame-Height";
    public static String style = "Frame-Style";
    public static String loadFunction = "Path-LoadFunction";
    public static String loadCommand = "Path-LoadCommand";
    public static String saveFunction = "Path-SaveFunction";
    public static String saveFunctionOpen = "IsOpen-SaveFunction";
    public static String saveCommand = "Path-SaveCommand";
    public static String saveCommandOpen = "IsOpen-SaveCommand";
    public static String spawnFunction = "Path-SpawnFunction";
    public static String spawnFunctionOpen = "IsOpen-SpawnFunction";
    public static String spawnCommand = "Path-SpawnCommand";
    public static String spawnCommandOpen = "IsOpen-SpawnCommand";
    public static String functionSpeed = "Speed-Function";
    public static String commandSpeed = "Speed-Command";

    public static String getData(String key) {
        if (Properties.properties.connection()) {
            switch (key) {
                case "title": return Properties.properties.getValue(title)==null?"Musicreater":Properties.properties.getValue(title);
                case "width": return Properties.properties.getValue(width)==null?"900":Properties.properties.getValue(width);
                case "height": return Properties.properties.getValue(height)==null?"600":Properties.properties.getValue(height);
                case "style": return Properties.properties.getValue(style)==null?"3":Properties.properties.getValue(style);
                case "loadFunction": return Properties.properties.getValue(loadFunction)==null?Windows.getHere()+"\\"+"save\\":Properties.properties.getValue(loadFunction);
                case "loadCommand": return Properties.properties.getValue(loadCommand)==null?Windows.getHere()+"\\"+"save\\":Properties.properties.getValue(loadCommand);
                case "saveFunction": return Properties.properties.getValue(saveFunction)==null?Windows.getHere()+"\\"+"save\\":Properties.properties.getValue(saveFunction);
                case "saveFunctionOpen": return Properties.properties.getValue(saveFunctionOpen)==null?"true":Properties.properties.getValue(saveFunctionOpen);
                case "saveCommand": return Properties.properties.getValue(saveCommand)==null?Windows.getHere()+"\\"+"save\\":Properties.properties.getValue(saveCommand);
                case "saveCommandOpen": return Properties.properties.getValue(saveCommandOpen)==null?"true":Properties.properties.getValue(saveCommandOpen);
                case "spawnFunction": return Properties.properties.getValue(spawnFunction)==null?Windows.getHere()+"\\"+"save\\music\\":Properties.properties.getValue(spawnFunction);
                case "spawnFunctionOpen": return Properties.properties.getValue(spawnFunctionOpen)==null?"true":Properties.properties.getValue(spawnFunctionOpen);
                case "spawnCommand": return Properties.properties.getValue(spawnCommand)==null?Windows.getHere()+"\\"+"save\\":Properties.properties.getValue(spawnCommand);
                case "spawnCommandOpen": return Properties.properties.getValue(spawnCommandOpen)==null?"true":Properties.properties.getValue(spawnCommandOpen);
                case "functionSpeed": return Properties.properties.getValue(functionSpeed)==null?"5":Properties.properties.getValue(functionSpeed);
                case "commandSpeed": return Properties.properties.getValue(commandSpeed)==null?"5":Properties.properties.getValue(commandSpeed);
            }
        }
        return null;
    }
}