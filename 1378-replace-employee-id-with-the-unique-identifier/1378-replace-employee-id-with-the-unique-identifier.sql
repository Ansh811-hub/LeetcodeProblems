# Write your MySQL query statement below
Select s.unique_id,c.name from Employees c
LEFT Join EmployeeUNI s
ON s.id = c.id
order by unique_id  asc;

