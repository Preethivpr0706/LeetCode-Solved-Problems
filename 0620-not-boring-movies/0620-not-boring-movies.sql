# Write your MySQL query statement below
Select * from Cinema c
where (c.id%2<>0) and c.description<>'boring'
order by rating desc;