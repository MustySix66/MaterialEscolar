CREATE DATABASE TallerMecanico;
USE TallerMecanico;

CREATE TABLE Cliente (
    ID_Cliente VARCHAR(9) PRIMARY KEY,
    Nombre VARCHAR(50),
    Apellidos VARCHAR(50),
    Direccion VARCHAR(100),
    Telefono VARCHAR(15)
);

CREATE TABLE Vehiculo (
    Matricula VARCHAR(10) PRIMARY KEY,
    Modelo VARCHAR(50),
    Color VARCHAR(20),
    FechaEntrada DATE,
    HoraEntrada TIME,
    ID_Cliente VARCHAR(9),
    FOREIGN KEY (ID_Cliente) REFERENCES Cliente(ID_Cliente)
);

CREATE TABLE Mecanico (
    ID_Mecanico INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(50),
    Apellidos VARCHAR(50)
);

CREATE TABLE Repuesto (
    ID_Repuesto INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(50),
    Precio DECIMAL(10,2)
);

CREATE TABLE Reparacion (
    ID_Reparacion INT AUTO_INCREMENT PRIMARY KEY,
    Fecha DATE,
    ManoDeObra DECIMAL(10,2),
    IVA DECIMAL(5,2),
    Total DECIMAL(10,2),
    TotalUSD DECIMAL(10,2),
    Matricula_Vehiculo VARCHAR(10),
    ID_Mecanico INT,
    FOREIGN KEY (Matricula_Vehiculo) REFERENCES Vehiculo(Matricula),
    FOREIGN KEY (ID_Mecanico) REFERENCES Mecanico(ID_Mecanico)
);

CREATE TABLE Reparacion_Repuesto (
    ID_Reparacion INT,
    ID_Repuesto INT,
    Cantidad INT,
    FOREIGN KEY (ID_Reparacion) REFERENCES Reparacion(ID_Reparacion),
    FOREIGN KEY (ID_Repuesto) REFERENCES Repuesto(ID_Repuesto),
    PRIMARY KEY (ID_Reparacion, ID_Repuesto)
);
