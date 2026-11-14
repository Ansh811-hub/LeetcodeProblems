# Write your MySQL query statement below
select s.name, c.bonus from employee s
left join bonus c
on s.empid = c.empid
where c.bonus < 1000 OR c.bonus IS NULL;