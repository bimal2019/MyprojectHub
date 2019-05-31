create table product(id integer not null,
						name varchar(100) not null,
						category varchar(50) not null,
						retail_price Decimal (20,2) not null,
						discounted_price Decimal (20,2) not null,
						availability Boolean not null,
						discount_percentage int not null
						)
						
					