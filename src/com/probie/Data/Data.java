package com.probie.Data;

import com.programe.probie.ProgrameTool.Computer.Windows;

public class Data {

    public static final String renewFile = "https://raw.githubusercontent.com/BProbie/project/refs/heads/Musicreater/Musicreater.exe";
    public static final String renewConfig = "https://raw.githubusercontent.com/BProbie/project/refs/heads/Musicreater/Musicreater.renew";
    public static final String github = "https://github.com/BProbie";
    public static final String website = "null";

    public static String title = "窗口标题";
    public static String width = "窗口宽度";
    public static String height = "窗口高度";
    public static String style = "样式代码";
    public static String load = "导入路径";
    public static String save = "保存路径";

    public static String getData(String key) {
        if (Properties.properties.connection()) {
            switch (key) {
                case "title": return Properties.properties.getValue(title)==null?"Musicreater":Properties.properties.getValue(title);
                case "width": return Properties.properties.getValue(width)==null?"900":Properties.properties.getValue(width);
                case "height": return Properties.properties.getValue(height)==null?"600":Properties.properties.getValue(height);
                case "style": return Properties.properties.getValue(style)==null?"3":Properties.properties.getValue(style);
                case "load": return Properties.properties.getValue(load)==null?Windows.getHere()+"\\"+"save\\":Properties.properties.getValue(load);
                case "save": return Properties.properties.getValue(save)==null?Windows.getHere()+"\\"+"save\\":Properties.properties.getValue(save);
            }
        }
        return null;
    }
}