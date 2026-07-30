# Write your MySQL query statement below
select s.product_name,p.year,p.price from sales p join product s on p.product_id=s.product_id 