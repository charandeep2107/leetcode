/* Write your PL/SQL query statement below */
select e.name as employee from employee e,employee mgr where e.managerId=mgr.id and e.salary>mgr.salary 