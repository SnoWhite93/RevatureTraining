select * from customers;


INSERT INTO Customers (customer_name , contact_name, address , city , postal_code , country)
VALUES ('Cardinal', 'Tom B. Erichsen', 'Skagen 21', 'Stavanger', '4006', 'Norway');


delete from customers where customer_id = 93;

alter table customers 
alter column customer_name drop not null;

alter table customers 
alter column contact_name drop not null;

alter table customers 
alter column address drop not null;

alter table customers 
alter column city drop not null;

alter table customers 
alter column postal_code drop not null;

alter table customers 
alter column country drop not null;

insert into customers (customer_name, city, country)
values ('Jimmy Johns', 'Santa Ana', 'USA');

select * from customers c 
where address is null;

update customers 
set customer_name = 'Purple B', city = 'Ontario'
where customer_id = 10;

select * from customers c 
order by customer_id asc;

update customers 
set contact_name ='Consuela'
where country = 'Mexico';

delete from customers 
where customer_name = 'Wilman Kala';

select * from customers c 
where country = 'Germany'
limit 3;

select min(postal_code) as smallestPC
from customers c 
where country ='USA';

select max(city) as letterOfcity
from customers c;

select count(customer_name)
from customers c ;

select avg(customer_id)
from customers c ;

select * from customers c 
where contact_name like 'A%';

select * from customers 
where city in('Ontario');

select * from customers c 
where country in(select country from customers c2);

select * from customers c2 
where customer_id between 28 and 44
order by contact_name;





