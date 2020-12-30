select * from customers c2 
select * from orders o 

select o.order_id, c.customer_name, o.order_date 
from orders o 
inner join customers c 
on o.customer_id  = c.customer_id 
where o.order_id = 10308



select c.customer_name, o.order_id 
from customers c 
left join orders o 
on c.customer_id = o.customer_id 
order by c.customer_name 

select * from customers c 
where customer_name = 'Trail''s Head Gourmet Provisioners'

select * from orders o 
where customer_id = 82


select c.customer_name, o.order_id 
from orders o
right join customers c
on c.customer_id = o.customer_id 
order by c.customer_name


select c.customer_name, o.order_id 
from orders o
full outer join customers c
on c.customer_id = o.customer_id 
order by c.customer_name

select * 
from customers c 
cross join orders o 

select MIN(order_id) as miniOrderId
from orders o2 

select MAX(postal_code) as highestPostalCode
from customers c2  

select count(customer_id)
from customers c 

select avg(order_id) as avgPS
from orders o 

select sum(shipper_id)
from orders o2 

select 
upper(customer_name) as uppName
from customers c2 

select
ceil(sum(order_id)) ordid
from orders o2 

select * 
from orders o2 
where order_date = '1996-08-27'


select employee_id - shipper_id as employeeSubtractShipper
from orders o2 

select extract (day from order_date)
from orders o 
