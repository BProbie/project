scoreboard players tag @s add Test
execute @s ~ ~ ~ scoreboard objectives add Test dummy
execute @s ~ ~ ~ gamerule gameLoopFunction music:Test
title @a actionbar "\u00a76\u00a7l播放音乐 \u00a7b\u00a7l>>\u00a7a\u00a7lTest\u00a7b\u00a7l<<\u00a7r"
scoreboard players add @a[tag=Test] Test 1
execute @a[score_Test_min=15,score_Test=15] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 1.414
execute @a[score_Test_min=20,score_Test=20] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 1.587
execute @a[score_Test_min=25,score_Test=25] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 1.782
execute @a[score_Test_min=30,score_Test=30] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 1.888
execute @a[score_Test_min=35,score_Test=35] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 2.119
execute @a[score_Test_min=40,score_Test=40] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 2.378
execute @a[score_Test_min=45,score_Test=45] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 2.670
execute @a[score_Test_min=55,score_Test=55] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 0.707
execute @a[score_Test_min=60,score_Test=60] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 0.794
execute @a[score_Test_min=65,score_Test=65] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 0.891
execute @a[score_Test_min=70,score_Test=70] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 0.944
execute @a[score_Test_min=75,score_Test=75] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 1.059
execute @a[score_Test_min=80,score_Test=80] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 1.189
execute @a[score_Test_min=85,score_Test=85] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 1.335
execute @a[score_Test_min=95,score_Test=95] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 0.354
execute @a[score_Test_min=100,score_Test=100] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 0.397
execute @a[score_Test_min=105,score_Test=105] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 0.400
execute @a[score_Test_min=110,score_Test=110] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 0.472
execute @a[score_Test_min=115,score_Test=115] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 0.530
execute @a[score_Test_min=120,score_Test=120] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 0.595
execute @a[score_Test_min=125,score_Test=125] ~ ~ ~ playsound minecraft:block.note.harp music @a ~ ~ ~ 9 0.667
execute @a[score_Test_min=130,score_Test=130] ~ ~ ~ gamerule gameLoopFunction -
execute @a[score_Test_min=130,score_Test=130] ~ ~ ~ scoreboard objectives remove Test
execute @a[score_Test_min=130,score_Test=130] ~ ~ ~ scoreboard players tag @s remove Test