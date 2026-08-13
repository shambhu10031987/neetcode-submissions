-- Write your query below
with abc as(
select e.* ,v1.value as val_left,v2.value as val_right from expressions e
join variables v1 on e.left_operand=v1.name 
join variables v2 on  e.right_operand=v2.name
)
select abc.left_operand,abc.operator,abc.right_operand,
 
 CASE 
        WHEN operator = '>' AND val_left > val_right THEN 'true'
        WHEN operator = '<' AND val_left < val_right THEN 'true'
        WHEN operator = '=' AND val_left = val_right THEN 'true'
        ELSE 'false'
    END AS value
from abc


