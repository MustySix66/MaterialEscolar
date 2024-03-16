CREATE DATABASE consecionarioALKA;

USE consecionarioALKA;

 CREATE TABLE clientes(
	CodigoCliente INT NOT NULL AUTO_INCREMENT,
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