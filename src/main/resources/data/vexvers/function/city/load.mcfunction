scoreboard objectives add vx_init dummy
execute unless score #border vx_init matches 1 run worldborder center 0 0
execute unless score #border vx_init matches 1 run worldborder set 4000
execute unless score #border vx_init matches 1 run scoreboard players set #border vx_init 1
schedule function vexvers:city/check 20t
