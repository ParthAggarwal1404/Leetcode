# Write your MySQL query statement below
select name as customers 
from Orders
Right Join Customers  on  Orders.customerId =Customers.id
where customerId is null