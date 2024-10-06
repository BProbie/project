package com.probie.Event;

import java.util.Objects;
import com.probie.Data.Data;
import com.programe.probie.ProgrameTool.Computer.Windows;

public class Spawn {
    public static void function(String title,String value) {
        String function =
                "scoreboard players tag @s add "+title+
                "\nexecute @s ~ ~ ~ scoreboard objectives add "+title+" dummy"+
                "\nexecute @s ~ ~ ~ gamerule gameLoopFunction music:"+title+
                "\ntitle @a actionbar \"\\u00a76\\u00a7l播放音乐 \\u00a7b\\u00a7l>>\\u00a7a\\u00a7l"+title+"\\u00a7b\\u00a7l<<\\u00a7r\""+
                "\nscoreboard players add @a[tag="+title+"] "+title+" 1";
        String[] values = value.replaceAll("\n","").split(" ");
        for (int i = 10; i < 10 + values.length * Integer.parseInt(Objects.requireNonNull(Data.getData("functionSpeed"))); i += Integer.parseInt(Objects.requireNonNull(Data.getData("functionSpeed")))) {
            switch (values[((i-10)/Integer.parseInt(Objects.requireNonNull(Data.getData("functionSpeed"))))]) {
                case "0↓":
                    break;
                case "1↓":
                    function=function+"\nexecute @a[score_"+title+"_min="+i+",score_"+title+"="+i+"] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 "+
                            Data._DO; break;
                case "2↓":
                    function=function+"\nexecute @a[score_"+title+"_min="+i+",score_"+title+"="+i+"] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 "+
                            Data._RE; break;
                case "3↓":
                    function=function+"\nexecute @a[score_"+title+"_min="+i+",score_"+title+"="+i+"] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 "+
                            Data._MI; break;
                case "4↓":
                    function=function+"\nexecute @a[score_"+title+"_min="+i+",score_"+title+"="+i+"] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 "+
                            Data._FA; break;
                case "5↓":
                    function=function+"\nexecute @a[score_"+title+"_min="+i+",score_"+title+"="+i+"] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 "+
                            Data._SO; break;
                case "6↓":
                    function=function+"\nexecute @a[score_"+title+"_min="+i+",score_"+title+"="+i+"] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 "+
                            Data._LA; break;
                case "7↓":
                    function=function+"\nexecute @a[score_"+title+"_min="+i+",score_"+title+"="+i+"] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 "+
                            Data._SI; break;

                case "0":
                    break;
                case "1":
                    function=function+"\nexecute @a[score_"+title+"_min="+i+",score_"+title+"="+i+"] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 "+
                            Data.DO; break;
                case "2":
                    function=function+"\nexecute @a[score_"+title+"_min="+i+",score_"+title+"="+i+"] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 "+
                            Data.RE; break;
                case "3":
                    function=function+"\nexecute @a[score_"+title+"_min="+i+",score_"+title+"="+i+"] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 "+
                            Data.MI; break;
                case "4":
                    function=function+"\nexecute @a[score_"+title+"_min="+i+",score_"+title+"="+i+"] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 "+
                            Data.FA; break;
                case "5":
                    function=function+"\nexecute @a[score_"+title+"_min="+i+",score_"+title+"="+i+"] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 "+
                            Data.SO; break;
                case "6":
                    function=function+"\nexecute @a[score_"+title+"_min="+i+",score_"+title+"="+i+"] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 "+
                            Data.LA; break;
                case "7":
                    function=function+"\nexecute @a[score_"+title+"_min="+i+",score_"+title+"="+i+"] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 "+
                            Data.SI; break;

                case "0↑":
                    break;
                case "1↑":
                    function=function+"\nexecute @a[score_"+title+"_min="+i+",score_"+title+"="+i+"] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 "+
                            Data.DO_; break;
                case "2↑":
                    function=function+"\nexecute @a[score_"+title+"_min="+i+",score_"+title+"="+i+"] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 "+
                            Data.RE_; break;
                case "3↑":
                    function=function+"\nexecute @a[score_"+title+"_min="+i+",score_"+title+"="+i+"] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 "+
                            Data.MI_; break;
                case "4↑":
                    function=function+"\nexecute @a[score_"+title+"_min="+i+",score_"+title+"="+i+"] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 "+
                            Data.FA_; break;
                case "5↑":
                    function=function+"\nexecute @a[score_"+title+"_min="+i+",score_"+title+"="+i+"] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 "+
                            Data.SO_; break;
                case "6↑":
                    function=function+"\nexecute @a[score_"+title+"_min="+i+",score_"+title+"="+i+"] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 "+
                            Data.LA_; break;
                case "7↑":
                    function=function+"\nexecute @a[score_"+title+"_min="+i+",score_"+title+"="+i+"] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 "+
                            Data.SI_; break;
            }
        }
        function = function +
                "\nexecute @a[score_"+title+"_min="+
                (10+values.length*Integer.parseInt(Objects.requireNonNull(Data.getData("functionSpeed"))))+
                ",score_"+title+"="+
                (10+values.length*Integer.parseInt(Objects.requireNonNull(Data.getData("functionSpeed"))))+
                "] ~ ~ ~ gamerule gameLoopFunction -"+
                "\nexecute @a[score_"+title+"_min="+
                (10+values.length*Integer.parseInt(Objects.requireNonNull(Data.getData("functionSpeed"))))+
                ",score_"+title+"="+
                (10+values.length*Integer.parseInt(Objects.requireNonNull(Data.getData("functionSpeed"))))+
                "] ~ ~ ~ scoreboard objectives remove "+title+
                "\nexecute @a[score_"+title+"_min="+
                (10+values.length*Integer.parseInt(Objects.requireNonNull(Data.getData("functionSpeed"))))+
                ",score_"+title+"="+
                (10+values.length*Integer.parseInt(Objects.requireNonNull(Data.getData("functionSpeed"))))+
                "] ~ ~ ~ scoreboard players tag @s remove "+title;

        Windows.writeFile(Data.getData("spawnFunction")+"\\"+title+".mcfunction",function);
        if (Objects.requireNonNull(Data.getData("spawnFunctionOpen")).equals("true")) {
            Windows.open(Data.getData("spawnFunction"));
        }
    }

    public static void command(String title,String value) {
        Windows.showInformation("Please Wait For The New!");
    }
}