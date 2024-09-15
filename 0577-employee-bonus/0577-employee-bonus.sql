select name,bonus
from Employee e
left join Bonus
on e.empId=Bonus.empId
where Bonus.bonus<1000 and Bonus.bonus is null