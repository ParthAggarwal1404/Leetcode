# Write your MySQL query statement below
select   d.name as Department,e.name as Employee , e.salary as Salary
from Employee e
Join  Department d on  e.departmentId = d.id 

where e.salary= (SELECT MAX(salary) from Employee
where departmentId = e.departmentId)