CREATE TABLE "Test".orders (
	order_id int4 NOT NULL,
	customer_id int4 NOT NULL,
	employee_id int4 NOT NULL,
	order_date date NOT NULL,
	shipper_id int4 NOT NULL,
	CONSTRAINT orders_pkey PRIMARY KEY (order_id)
);


-- "Test".orders foreign keys

ALTER TABLE "Test".orders ADD CONSTRAINT orders_customer_id_fkey FOREIGN KEY (customer_id) REFERENCES "Test".customers(customer_id);