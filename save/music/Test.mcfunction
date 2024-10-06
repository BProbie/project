scoreboard players tag @s add Test
execute @s ~ ~ ~ scoreboard objectives add Test dummy
execute @s ~ ~ ~ gamerule gameLoopFunction music:Test
title @a actionbar "\u00a76\u00a7l播放音乐 \u00a7b\u00a7l>>\u00a7a\u00a7lTest\u00a7b\u00a7l<<\u00a7r"
scoreboard players add @a[tag=Test] Test 1
execute @a[score_Test_min=10,score_Test=10] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 0.707
execute @a[score_Test_min=15,score_Test=15] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 0.794
execute @a[score_Test_min=20,score_Test=20] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 0.891
execute @a[score_Test_min=25,score_Test=25] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 0.944
execute @a[score_Test_min=30,score_Test=30] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 1.059
execute @a[score_Test_min=35,score_Test=35] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 1.189
execute @a[score_Test_min=40,score_Test=40] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 1.335
execute @a[score_Test_min=45,score_Test=45] ~ ~ ~ gamerule gameLoopFunction -
execute @a[score_Test_min=45,score_Test=45] ~ ~ ~ scoreboard objectives remove Test
execute @a[score_Test_min=45,score_Test=45] ~ ~ ~ scoreboard players tag @s remove Test