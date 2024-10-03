package com.probie.Data;

import com.programe.probie.ProgrameTool.Computer.Windows;

public class Properties {
    public static com.programe.probie.ProgrameTool.Datasql.Properties properties = new com.programe.probie.ProgrameTool.Datasql.Properties().setPath(Windows.getTempPath()).setFileName("Musicreater.properties").setComment(null);

    public static void init() {
        if (properties.connection()) {
            properties.addValue(Data.title,"Musicreater");
            properties.addValue(Data.width,"900");
            properties.addValue(Data.height,"600");
            properties.addValue(Data.style,"3");
            properties.addValue(Data.load,Windows.getHere()+"\\"+"save\\");
            properties.addValue(Data.save,Windows.getHere()+"\\"+"save\\");
            properties.addValue(Data.title,Data.getData("title"));
            properties.addValue(Data.width,Data.getData("width"));
            properties.addValue(Data.height,Data.getData("height"));
            properties.addValue(Data.style,Data.getData("style"));
            properties.addValue(Data.load,Data.getData("load"));
            properties.addValue(Data.save,Data.getData("save"));
        }
    }

    public static com.programe.probie.ProgrameTool.Datasql.Properties getProperties() {
        return properties;
    }
}