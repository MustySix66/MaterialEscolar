CREATE DATABASE consecionarioALKA;

USE consecionarioALKA;

 CREATE TABLE clientes(
	CodigoCliente INT NOT NULL auto_increment,
    NombreCliente VARCHAR(50),
    ApellidosCliente VARCHAR(50),
    DireccionCliente VARCHAR(100),
    Poblacion VARCHAR(50),
    CodigoPostal INT,
    Provincia VARCHAR(50),
    Telefono VARCHAR(15),
    FechaNacimiento DATE,
    CONSTRAINT pk_CodigoCliente PRIMARY KEY(CodigoCliente)
 );
 
 CREATE TABLE CochesVendidos(
	Matricula VARCHAR(15) PRIMARY KEY,
    Marca VARCHAR(50),
    Modelo VARCHAR(50),
    Color VARCHAR(50),
    Precio FLOAT,
    ExtrasInstalados VARCHAR(50)
 );
 
CREATE TABLE Revisiones (
	Nrevision INT NOT NULL AUTO_INCREMENT,
    CambioAceite VARCHAR(2),
    CambioFiltro VARCHAR(2),
    Otro TEXT,
	CONSTRAINT pk_NumRevision PRIMARY KEY(Nrevision)
);

ALTER TABLE clientes CHANGE COLUMN Poblacion Estado VARCHAR(50);
ALTER TABLE clientes DROP COLUMN Provincia;
ALTER TABLE CochesVendidos DROP COLUMN ExtrasInstalados;
ALTER TABLE Revisiones ADD COLUMN RevisionFrenos VARCHAR(2) AFTER CambioFiltro;
ALTER TABLE CochesVendidos ADD COLUMN Codigocliente1 INT(11);
ALTER TABLE CochesVendidos MODIFY COLUMN Matricula VARCHAR(7);
ALTER TABLE Revisiones ADD COLUMN Matricula1 VARCHAR(7);
ALTER TABLE CochesVendidos ADD CONSTRAINT fk_CodigoCliente FOREIGN KEY (Codigocliente1) REFERENCES clientes(CodigoCliente);
ALTER TABLE Revisiones ADD CONSTRAINT fk_Matricula FOREIGN KEY (Matricula1) REFERENCES CochesVendidos(Matricula);

INSERT INTO clientes (NombreCliente, ApellidosCliente, DireccionCliente, Estado, CodigoPostal, Telefono, FechaNacimiento) VALUES 
('Antonio','García Pérez','Astilleros 3', 'Valencia', 46011 ,'963689521','1950-08-15'),
('Carlos','Pérez Ruiz','Magallanes 21', 'Utiel', 46300,'962485147','1958-04-26'),
('Luis','Rodríguez Más','Juan de Mena 11', 'Gandia', 46700,'962954578','1961-03-30'),
('Jaime','Juangrán Sornes','Balmes 21', 'Valencia',46014 ,'963684526','1986-01-31'),
('Alfonso ','Prats Montolla ','Séneca 23 ', 'Sagunto ',46500 ,'963547852','1995-04-28'), 
('José' ,'Navarro Lard' ,'Río Segura 4', 'Valencia ',46002 ,'963874569' ,'1964-05-15'), 
('Elisa' ,'Ubeda Sansón' , 'valencia 4', 'Sagunto ',46550 , '963547812','1972-07-10'), 
('Eva' , 'San Martín','Villanfranca 34' , 'Alzira' ,46600 , '962401589','1985-06-12'), 
('Gerardo',' Hernández Luis','Salinas 8 ', 'Valencia' ,46002 , '963589621','1995-01-02'), 
('Sergio',' Larred Navas',' Blasco Ibáñez 65 ','Valencia ',46005,',963589621','1977-12-25'), 
('Joaquín',' Arboles Onsins',' Gandia 8', 'Xàtiva',45800,',963758953','1969-05-04');

INSERT INTO CochesVendidos (Matricula, Marca, Modelo, Color, Precio, Codigocliente1) VALUES 
('V2360OX', 'Opel', 'Corsa Sport 1.2', 'Azul', 21000.00,1),
('V1010PB', 'Ford', 'Probe 2.0 16V', 'Blanco', 28600.00,2),
('V4578OB', 'Ford', 'Orion Ghia 1.8', 'Negro', 26000.00,3),
('V7648OU', 'Citroen', 'Xantia 16V', 'Negro', 24800.00,4),
('V3543NC', 'Ford', 'Escort Ghia 1.6', 'Rojo', 25000.00,5),
('V7632NX', 'Citroen', 'Zx Turbo-D', 'Rojo', 28000.00,6),
('V8018LJ', 'Ford', 'Fiesta 1.4 CLX', 'Azul', 19500.00,7),
('V2565NB', 'Renault', 'Clio 1.7 S', 'Blanco', 21000.00,8),
('V7642OU','Ford','Mondeo 1.8 GLX','Blanco', 31000.00,9),
('V1234LC','Audi','100 2.3','Verde', 35100.00,10),
('V9834LH','Peugeot','205 GTI','Rojo', 24500.00,11);

INSERT INTO Revisiones (CambioAceite, CambioFiltro, RevisionFrenos, Otro, Matricula1) VALUES 
('Sí', 'No', 'No', 'Revisar luces','V7632NX'),
('Sí', 'Sí', 'No', 'Cambiar limpias','V7632NX'),
('No', 'Sí', 'Sí', 'Arreglar alarma','V4578OB'),
('No', 'Sí', 'Sí', 'Ajustar tablero','V2360OX'),
('Sí', 'Sí', 'Sí', 'Cambiar limpia parabrisas','V2565NB'),
('No', 'No', 'Sí', 'Cambiar luz interior','V7648OU'),
('Sí', 'Sí', 'No', NULL,'V2565NB'), 
('No', 'No', 'No', NULL,'V8018LJ'),
('Sí', 'No', 'Sí', 'Regular encendido','V3543NC'), 
('No', 'Sí', 'No', 'Reparar puerta delantera','V8018LJ'),
('No', 'No', 'No', NULL,'V3543NC'), 
('Sí', 'Sí', 'Sí', NULL,'V1234LC'),
('No', 'Sí', 'No', 'Cambiar limpias','V9834LH'), 
('No', 'Sí', 'No', NULL,'V1010PB');