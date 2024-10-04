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
        String[] values = value.split(" ");
        for (int i = 10; i < 10 + values.length * Integer.parseInt(Objects.requireNonNull(Data.getData("functionSpeed"))); i += Integer.parseInt(Objects.requireNonNull(Data.getData("functionSpeed")))) {
            switch (values[((i-10)/Integer.parseInt(Objects.requireNonNull(Data.getData("functionSpeed"))))]) {
                case "0":
                    break;
                case "1↓":
                    function = function + "\nexecute @a[score_" + title + "_min=" + i + ",score_" + title + "=" + i + "] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 " + "0.354";
                    break;
                case "2↓":
                    function = function + "\nexecute @a[score_" + title + "_min=" + i + ",score_" + title + "=" + i + "] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 " + "0.397";
                    break;
                case "3↓":
                    function = function + "\nexecute @a[score_" + title + "_min=" + i + ",score_" + title + "=" + i + "] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 " + "0.400";
                    break;
                case "4↓":
                    function = function + "\nexecute @a[score_" + title + "_min=" + i + ",score_" + title + "=" + i + "] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 " + "0.472";
                    break;
                case "5↓":
                    function = function + "\nexecute @a[score_" + title + "_min=" + i + ",score_" + title + "=" + i + "] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 " + "0.530";
                    break;
                case "6↓":
                    function = function + "\nexecute @a[score_" + title + "_min=" + i + ",score_" + title + "=" + i + "] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 " + "0.595";
                    break;
                case "7↓":
                    function = function + "\nexecute @a[score_" + title + "_min=" + i + ",score_" + title + "=" + i + "] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 " + "0.667";
                    break;

                case "1":
                    function = function + "\nexecute @a[score_" + title + "_min=" + i + ",score_" + title + "=" + i + "] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 " + "0.707";
                    break;
                case "2":
                    function = function + "\nexecute @a[score_" + title + "_min=" + i + ",score_" + title + "=" + i + "] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 " + "0.794";
                    break;
                case "3":
                    function = function + "\nexecute @a[score_" + title + "_min=" + i + ",score_" + title + "=" + i + "] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 " + "0.891";
                    break;
                case "4":
                    function = function + "\nexecute @a[score_" + title + "_min=" + i + ",score_" + title + "=" + i + "] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 " + "0.944";
                    break;
                case "5":
                    function = function + "\nexecute @a[score_" + title + "_min=" + i + ",score_" + title + "=" + i + "] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 " + "1.059";
                    break;
                case "6":
                    function = function + "\nexecute @a[score_" + title + "_min=" + i + ",score_" + title + "=" + i + "] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 " + "1.189";
                    break;
                case "7":
                    function = function + "\nexecute @a[score_" + title + "_min=" + i + ",score_" + title + "=" + i + "] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 " + "1.335";
                    break;

                case "1↑":
                    function = function + "\nexecute @a[score_" + title + "_min=" + i + ",score_" + title + "=" + i + "] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 " + "1.414";
                    break;
                case "2↑":
                    function = function + "\nexecute @a[score_" + title + "_min=" + i + ",score_" + title + "=" + i + "] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 " + "1.587";
                    break;
                case "3↑":
                    function = function + "\nexecute @a[score_" + title + "_min=" + i + ",score_" + title + "=" + i + "] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 " + "1.782";
                    break;
                case "4↑":
                    function = function + "\nexecute @a[score_" + title + "_min=" + i + ",score_" + title + "=" + i + "] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 " + "1.888";
                    break;
                case "5↑":
                    function = function + "\nexecute @a[score_" + title + "_min=" + i + ",score_" + title + "=" + i + "] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 " + "2.119";
                    break;
                case "6↑":
                    function = function + "\nexecute @a[score_" + title + "_min=" + i + ",score_" + title + "=" + i + "] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 " + "2.378";
                    break;
                case "7↑":
                    function = function + "\nexecute @a[score_" + title + "_min=" + i + ",score_" + title + "=" + i + "] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 " + "2.670";
                    break;
            }
        }
        function = function +
                "\nexecute @a[score_"+title+"_min="+
                (10+values.length * Integer.parseInt(Objects.requireNonNull(Data.getData("functionSpeed"))))+
                ",score_"+title+"="+
                (10+values.length * Integer.parseInt(Objects.requireNonNull(Data.getData("functionSpeed"))))+
                "] ~ ~ ~ gamerule gameLoopFunction -"+
                "\nexecute @a[score_"+title+"_min="+
                (10+values.length * Integer.parseInt(Objects.requireNonNull(Data.getData("functionSpeed"))))+
                ",score_"+title+"="+
                (10+values.length * Integer.parseInt(Objects.requireNonNull(Data.getData("functionSpeed"))))+
                "] ~ ~ ~ scoreboard objectives remove "+title+
                "\nexecute @a[score_"+title+"_min="+
                (10 + values.length * Integer.parseInt(Objects.requireNonNull(Data.getData("functionSpeed"))))+
                ",score_"+title+"="+
                (10 + values.length * Integer.parseInt(Objects.requireNonNull(Data.getData("functionSpeed"))))+
                "] ~ ~ ~ scoreboard players tag @s remove "+title;

        Windows.writeFile(Data.getData("spawnFunction") + title + ".mcfunction", function);
        if (Objects.requireNonNull(Data.getData("spawnFunctionOpen")).equals("true")) {
            Windows.open(Data.getData("spawnFunction"));
        }
    }

    public static void command(String title,String value) {
        Windows.showInformation("Please Wait For The New!");
    }
}