# Write your MySQL query statement below
select w1.id
from Weather w1
inner join Weather w2
-- where datediff(w1.recordDate, w2.recordDate) = 1
-- on datediff(w1.recordDate, w2.recordDate) = 1
where SUBDATE(w1.recordDate, 1) = w2.recordDate
and w1.temperature > w2.temperature;