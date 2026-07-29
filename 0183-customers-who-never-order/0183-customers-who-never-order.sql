/* Write your PL/SQL query statement below */
select c.name Customers from customers c where id not in(select customerid from orders)
