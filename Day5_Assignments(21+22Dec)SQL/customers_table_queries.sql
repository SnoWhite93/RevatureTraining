select * from customers;
select customer_name, city
from customers c ;

select * from customers c ;

select distinct Country from customers c ;

select count(*) as DistinctCountries
from (select distinct Country from customers c) as jimy;

select * from customers c ;

select * from customers c 
where country = 'USA';

--select count(*) as USCountries
--from (select * from customers c2 where country = 'USA')

select country 
from customers c 
where customer_id between 20 and 27;



select city
from customers c 
where city like 'T%';

select customer_id, country 
from customers c 
where country in ('USA', 'France') 
order by country ;

select * from customers c 
where country = 'Germany' and city ='Berlin';

select * from customers c 
where country = 'Sweden' or country ='Brazil'
order by country;

select customer_id , customer_name , country 
from customers c 
where not country = 'Mexico'
order by customer_name;

select customer_id, country
from customers c 
where country = 'Canada' and (city = 'Tsawassen' or city = 'Vancouver');

select * from customers c 
where not country = 'Canada' and not country ='Germany';


select customer_id, contact_name, postal_code 
from customers c2 
order by postal_code;

select contact_name, postal_code, customer_id
from customers c 
order by postal_code desc;

select * from customers c 
order by country, customer_id;

select * from customers c 
order by country asc, customer_name desc;


