execute if predicate vexvers:in_windgaze unless entity @s[tag=vx_windgaze] run function vexvers:city/enter_windgaze
execute unless predicate vexvers:in_windgaze if entity @s[tag=vx_windgaze] run tag @s remove vx_windgaze
execute if predicate vexvers:in_harbor unless entity @s[tag=vx_harbor] run function vexvers:city/enter_harbor
execute unless predicate vexvers:in_harbor if entity @s[tag=vx_harbor] run tag @s remove vx_harbor
execute if predicate vexvers:in_sakura unless entity @s[tag=vx_sakura] run function vexvers:city/enter_sakura
execute unless predicate vexvers:in_sakura if entity @s[tag=vx_sakura] run tag @s remove vx_sakura
execute if predicate vexvers:in_oasis unless entity @s[tag=vx_oasis] run function vexvers:city/enter_oasis
execute unless predicate vexvers:in_oasis if entity @s[tag=vx_oasis] run tag @s remove vx_oasis
