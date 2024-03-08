CREATE DATABASE ServicioMilitar;
USE ServicioMilitar;

CREATE TABLE Soldado (
    CodigoSoldado INT PRIMARY KEY,
    Nombre VARCHAR(100),
    ApellidoMaterno VARCHAR(100),
    ApellidoPaterno VARCHAR(100),
    Grado VARCHAR(50)
);

CREATE TABLE Cuartel (
    NumeroCuartel INT PRIMARY KEY,
    Nombre VARCHAR(100),
    Ubicacion VARCHAR(100)
);

CREATE TABLE Cuerpo (
    CodigoCuerpo INT PRIMARY KEY,
    Denominacion VARCHAR(100)
);

CREATE TABLE Compania (
    NumeroCompania INT PRIMARY KEY,
    ActividadPrincipal VARCHAR(100)
);

CREATE TABLE Servicio (
    CodigoServicio INT PRIMARY KEY,
    Actividad VARCHAR(100)
);

CREATE TABLE SoldadoCompania (
    CodigoSoldado INT,
    NumeroCompania INT,
    PRIMARY KEY (CodigoSoldado, NumeroCompania),
    FOREIGN KEY (CodigoSoldado) REFERENCES Soldado(CodigoSoldado),
    FOREIGN KEY (NumeroCompania) REFERENCES Compania(NumeroCompania)
);

CREATE TABLE SoldadoCuartel (
    CodigoSoldado INT,
    NumeroCuartel INT,
    PRIMARY KEY (CodigoSoldado, NumeroCuartel),
    FOREIGN KEY (CodigoSoldado) REFERENCES Soldado(CodigoSoldado),
    FOREIGN KEY (NumeroCuartel) REFERENCES Cuartel(NumeroCuartel)
);

CREATE TABLE SoldadoServicio (
    CodigoSoldado INT,
    CodigoServicio INT,
    FechaRealizacion DATE,
    PRIMARY KEY (CodigoSoldado, CodigoServicio, FechaRealizacion),
    FOREIGN KEY (CodigoSoldado) REFERENCES Soldado(CodigoSoldado),
    FOREIGN KEY (CodigoServicio) REFERENCES Servicio(CodigoServicio)
);

ALTER TABLE Soldado
ADD CodigoCuerpo INT,
ADD FOREIGN KEY (CodigoCuerpo) REFERENCES Cuerpo(CodigoCuerpo);