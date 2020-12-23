CREATE TABLE "Test".customers (
	customer_id serial NOT NULL,
	customer_name text NOT NULL,
	contact_name text NOT NULL,
	address text NOT NULL,
	city text NOT NULL,
	postal_code text NOT NULL,
	country text NOT NULL,
	CONSTRAINT customers_pk PRIMARY KEY (customer_id)
);
