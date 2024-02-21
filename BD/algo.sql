CREATE DATABASE GrupoInvestigacionAG_AG_AGUILAS;
USE GrupoInvestigacionAG_AG_AGUILAS;

CREATE TABLE Articulo (
    ID_Articulo INT PRIMARY KEY AUTO_INCREMENT,
    Nombre VARCHAR(50),
    Palabras_Clave VARCHAR(50),
    Email_Contacto VARCHAR(50),
    Tiene_Copia BOOLEAN,
    Ubicacion_Copia VARCHAR(50)
);

CREATE TABLE Autor (
    ID_Autor INT PRIMARY KEY AUTO_INCREMENT,
    Nombre VARCHAR(50),
    Email VARCHAR(50),
    Centro_Trabajo VARCHAR(50),
    Temas_Trabajo VARCHAR(50)
);

CREATE TABLE Informes_Tecnicos (
    ID_Informe INT PRIMARY KEY AUTO_INCREMENT,
    Numero INT,
    Centro_Publicacion VARCHAR(50),
    Mes_Publicacion INT,
    Anio_Publicacion INT
);

CREATE TABLE Congreso (
    ID_Congreso INT PRIMARY KEY AUTO_INCREMENT,
    Nombre VARCHAR(50),
    Edicion INT,
    Ciudad VARCHAR(50),
    Fecha_Inicio DATE,
    Fecha_Final DATE,
    Tipo VARCHAR(50),
    Frecuencia VARCHAR(50),
    Pais VARCHAR(50),
    Anio_Primer_Celebracion INT
);

CREATE TABLE Revista_Cientifica (
    ID_Revista INT PRIMARY KEY AUTO_INCREMENT,
    Nombre VARCHAR(50),
    Editor VARCHAR(50),
    Anio_Inicio_Publicacion INT,
    Frecuencia VARCHAR(50),
    Temas VARCHAR(50),
    Numero_Revista INT,
    Paginas VARCHAR(50),
    Anio INT
);

CREATE TABLE Publica (
    ID_Articulo INT,
    ID_Publicacion INT,
    Tipo_Publicacion VARCHAR(50),
    PRIMARY KEY (ID_Articulo, ID_Publicacion),
    FOREIGN KEY (ID_Articulo) REFERENCES Articulo(ID_Articulo)
);

CREATE TABLE Escribe (
    ID_Autor INT,
    ID_Articulo INT,
    PRIMARY KEY (ID_Autor, ID_Articulo),
    FOREIGN KEY (ID_Autor) REFERENCES Autor(ID_Autor),
    FOREIGN KEY (ID_Articulo) REFERENCES Articulo(ID_Articulo)
);

ALTER TABLE Publica
ADD COLUMN ID_Informe INT,
ADD COLUMN ID_Congreso INT,
ADD COLUMN ID_Revista INT;

ALTER TABLE Publica
ADD FOREIGN KEY (ID_Informe) REFERENCES Informes_Tecnicos(ID_Informe),
ADD FOREIGN KEY (ID_Congreso) REFERENCES Congreso(ID_Congreso),
ADD FOREIGN KEY (ID_Revista) REFERENCES Revista_Cientifica(ID_Revista);
