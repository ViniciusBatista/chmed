create table chmed.medico(
	id serial not null primary key,
	nome varchar(50),
	cpf varchar(16),
	crm varchar(10)
);

create table chmed.recibo(
	id serial not null primary key,
	procedimento varchar(30),
	data_recibo date not null,
	valor double precision not null, 
	num_recibo integer not null,
	id_medico integer,
	foreign key (id_medico) references chmed.medico (id)
);

select * from chmed.medico;