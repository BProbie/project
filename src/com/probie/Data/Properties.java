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
            properties.addValue(Data.loadFunction,Windows.getHere()+"\\"+"save\\");
            properties.addValue(Data.loadCommand,Windows.getHere()+"\\"+"save\\");
            properties.addValue(Data.saveFunction,Windows.getHere()+"\\"+"save\\");
            properties.addValue(Data.saveFunctionOpen,"true");
            properties.addValue(Data.saveCommand,Windows.getHere()+"\\"+"save\\");
            properties.addValue(Data.saveCommandOpen,"true");
            properties.addValue(Data.spawnFunction,Windows.getHere()+"\\"+"save\\music\\");
            properties.addValue(Data.spawnFunctionOpen,"true");
            properties.addValue(Data.spawnCommand,Windows.getHere()+"\\"+"save\\");
            properties.addValue(Data.spawnCommandOpen,"true");
            properties.addValue(Data.title,Data.getData("title"));
            properties.addValue(Data.width,Data.getData("width"));
            properties.addValue(Data.height,Data.getData("height"));
            properties.addValue(Data.style,Data.getData("style"));
            properties.addValue(Data.loadFunction,Data.getData("loadFunction"));
            properties.addValue(Data.loadCommand,Data.getData("loadCommand"));
            properties.addValue(Data.saveFunction,Data.getData("saveFunction"));
            properties.addValue(Data.saveFunctionOpen,Data.getData("saveFunctionOpen"));
            properties.addValue(Data.saveCommand,Data.getData("saveCommand"));
            properties.addValue(Data.saveCommandOpen,Data.getData("saveCommandOpen"));
            properties.addValue(Data.spawnFunction,Data.getData("spawnFunction"));
            properties.addValue(Data.spawnFunctionOpen,Data.getData("spawnFunctionOpen"));
            properties.addValue(Data.spawnCommand,Data.getData("spawnCommand"));
            properties.addValue(Data.spawnCommandOpen,Data.getData("spawnCommandOpen"));
            properties.addValue(Data.functionSpeed,Data.getData("functionSpeed"));
            properties.addValue(Data.commandSpeed,Data.getData("commandSpeed"));
        }
    }

    public static com.programe.probie.ProgrameTool.Datasql.Properties getProperties() {
        return properties;
    }
}