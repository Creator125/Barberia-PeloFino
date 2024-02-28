-- Tabla de administradores
CREATE TABLE Admin(
	id_admin SERIAL PRIMARY KEY,
	username VARCHAR(50),
	password VARCHAR(10),
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	email VARCHAR(100),
	state VARCHAR(50),
	phone VARCHAR(50)
);

-- Tabla de barberos
CREATE TABLE Barbers(
	id_barber SERIAL PRIMARY KEY,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	email VARCHAR(100),
	phone VARCHAR(50),
	state VARCHAR(50),
	password VARCHAR(15)
);

-- Tabla de fechas
CREATE TABLE Schedules(
	id_schedule SERIAL PRIMARY KEY,
	start_date TIMESTAMP,
	end_date TIMESTAMP
);

-- Tablas de citas
CREATE TABLE Quote(
	id_quote SERIAL PRIMARY KEY,
	state VARCHAR(15),
	id_barber INTEGER REFERENCES Barbers(id_barber),
	id_schedule INTEGER REFERENCES Schedules(id_schedule)
);

-- Tabla de clientes
CREATE TABLE Customer(
	id_customer SERIAL PRIMARY KEY,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	email VARCHAR(100),
	phone VARCHAR(50),
	state VARCHAR(50),
	id_quote INTEGER REFERENCES Quote(id_quote),
	password VARCHAR(15)
);

