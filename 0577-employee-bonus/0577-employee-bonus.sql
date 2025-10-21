# Write your MySQL query statement below
Select Employee.name , Bonus.bonus
From Bonus
Right Join Employee on Employee.empId = Bonus.empId
where  bonus<1000 || bonus is null