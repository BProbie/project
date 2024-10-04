package com.probie.Data;

import com.programe.probie.ProgrameTool.Computer.Windows;

public class Data {

    public static final String renewFile = "https://raw.githubusercontent.com/BProbie/project/refs/heads/Musicreater/Musicreater.exe";
    public static final String renewConfig = "https://raw.githubusercontent.com/BProbie/project/refs/heads/Musicreater/Musicreater.renew";
    public static final String github = "https://github.com/BProbie";
    public static final String website = "https://www.everyonepiano.cn/home.html#:~:text=Everyone%20P";

    public static String title = "窗口标题";
    public static String width = "窗口宽度";
    public static String height = "窗口高度";
    public static String style = "样式代码";
    public static String loadFunction = "导入函数文件的默认打开路径";
    public static String loadCommand = "导入指令文件的默认打开路径";
    public static String saveFunction = "保存函数文件的默认打开路径";
    public static String saveFunctionOpen = "保存函数文件后是否自动打开文件夹";
    public static String saveCommand = "保存指令文件的默认打开路径";
    public static String saveCommandOpen = "保存指令文件后是否自动打开文件夹";
    public static String spawnFunction = "生成函数文件的默认存放路径";
    public static String spawnFunctionOpen = "生成函数文件后是否自动打开文件夹";
    public static String spawnCommand = "生成指令文件的默认存放路径";
    public static String spawnCommandOpen = "生成指令文件后是否自动打开文件夹";

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
                case "spawnFunction": return Properties.properties.getValue(spawnFunction)==null?Windows.getHere()+"\\"+"save\\":Properties.properties.getValue(spawnFunction);
                case "spawnFunctionOpen": return Properties.properties.getValue(spawnFunctionOpen)==null?"true":Properties.properties.getValue(spawnFunctionOpen);
                case "spawnCommand": return Properties.properties.getValue(spawnCommand)==null?Windows.getHere()+"\\"+"save\\":Properties.properties.getValue(spawnCommand);
                case "spawnCommandOpen": return Properties.properties.getValue(spawnCommandOpen)==null?"true":Properties.properties.getValue(spawnCommandOpen);
            }
        }
        return null;
    }
}