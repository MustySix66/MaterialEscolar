create database Andrade_Lopez_Kevin_Antonio_Proyecto;
use Andrade_Lopez_Kevin_Antonio_Proyecto;

create table Clientes (
    IDCliente int not null auto_increment,
    Nombres varchar(70),
    Calle varchar (25),
    NumDireccion int(5),
    Colonia varchar(25),
    Postal int(6),
    Telefono int(10),
    Edad int(2),
    constraint pk_CodigoCliente primary key (IDCliente)
);

create table Pedidos (
    IDPedido int not null auto_increment,
    ClienteID int(10),
    FechaPedido datetime,
    constraint pk_CodigoPedido primary key (IDPedido),
    constraint fk_CodigoCliente foreign key (ClienteID) references Clientes(IDCliente)
);

create table Platillos (
    ID_Platillo int not null auto_increment,
    Nombre varchar(25),
    Descripcion text,
    Precio float,
    Tamaño varchar(1),
    constraint pk_CodigoPlatillo primary key (ID_Platillo)
);

create table DetallePedidos (
  DetalleID int primary key not null auto_increment,
  PedidoID int(10),
  PlatilloID int(10),
  Cantidad int(10),
  PrecioVenta float(10),
  Comentarios text(10),
  constraint fk_CodigoPedido foreign key (PedidoID) references Pedidos(IDPedido),
  constraint fk_CodigoPlatillo foreign key (PlatilloID) references Platillos(ID_Platillo)
);

CREATE TABLE Clientes_Platillos (
  ClienteID INT,
  PlatilloID INT,
  FechaPreferencia DATE,
  CONSTRAINT fk_ClienteID FOREIGN KEY (ClienteID) REFERENCES Clientes(IDCliente),
  CONSTRAINT fk_PlatilloID FOREIGN KEY (PlatilloID) REFERENCES Platillos(ID_Platillo)
);

# alter
alter table clientes change column Nombres Nombre varchar(25);
alter table clientes add column ApePaterno varchar(20) after Nombre;
alter table clientes add column ApeMaterno varchar(20) after ApePaterno;
alter table pedidos change column FechaPedido HoraPedido datetime;

# Drop
alter table platillos drop column Tamaño;
alter table clientes drop column Edad;
alter table clientes_platillos drop column FechaPreferencia;

# Insertar datos
INSERT INTO clientes (Nombre, ApePaterno, ApeMaterno, Calle, NumDireccion, Colonia, Postal, Telefono) VALUES 
('Antonio','García',' Pérez','Astilleros',3, 'Valencia', 46011 ,963689521),
('Juan','Chavez',' Pérez','Centro',9, 'Murcia', 46021 ,963661221),
('Pablo','Rivera',' Martin','Cuarto centenario',12, 'Madrid', 51011 ,999689521),
('Baruc','Lopez',' Lira','España',7, 'España', 11 ,961234521),
('Alejandro','Hernandez',' Rivas','Artillero',20, 'Julian', 516233 ,961239521),
('Braulio','Medina',' Luna','Solera',115, 'Soledad', 20211 ,827489521),
('Luis','Torres','Gomez','Libertadores',45, 'Libertad', 28013 ,915678921),
('Carmen','Ruiz','Diaz','Reyes Católicos',67, 'Imperial', 28044 ,915623421),
('Marta','Jimenez','Moreno','Gran Vía',23, 'Centro', 28001 ,915698721),
('Carlos','Fernandez','Luna','Princesa',2, 'Argüelles', 28008 ,915612321),
('Sofia','Gonzalez','Cano','Mayor',56, 'Sol', 28013 ,915678541),
('David','Morales','Prieto','Alcalá',134, 'Retiro', 28009 ,915612876),
('Ana','Sanchez','Blanco','Castellana',89, 'Salamanca', 28006 ,915623490),
('Carlos','Pérez',' Ruiz','Magallanes',21, 'Utiel', 46300,962485147);

insert into pedidos (ClienteID, HoraPedido) values 
(1, '2024-03-01 13:04:22'),
(2, '2024-03-01 14:26:59'),
(3, '2024-03-02 10:15:30'),
(4, '2024-03-02 11:20:45'),
(5, '2024-03-02 12:25:00'),
(6, '2024-03-02 13:30:15'),
(7, '2024-03-02 14:35:30'),
(8, '2024-03-02 15:40:45'),
(9, '2024-03-02 16:45:00'),
(10, '2024-03-02 17:50:15'),
(11, '2024-03-02 18:55:30'),
(12, '2024-03-02 20:00:45'),
(13, '2024-03-02 21:05:00'),
(14, '2024-03-02 22:10:15');


insert into platillos (Nombre, Descripcion, Precio) values
('Pasta blanca', 'rica pasta color blanco', '70'),
('Arroz blanco','asi nomás, arroz','25'),
('Adobada','Carne adobada','55'),
('Enchiladas Verdes', 'Tortillas rellenas bañadas en salsa verde', '85'),
('Tacos al Pastor', 'Tacos de carne adobada con piña', '45'),
('Ceviche de Pescado', 'Pescado marinado en jugo de limón con verduras', '90'),
('Chiles Rellenos', 'Chiles poblanos rellenos de queso y carne', '80'),
('Pollo al Horno', 'Pollo marinado y horneado con especias', '120'),
('Carnitas', 'Trozos de carne de cerdo cocidos a fuego lento', '60'),
('Barbacoa de Borrego', 'Carne de borrego cocida en su jugo', '110'),
('costillas con ejotes', 'Costillas al carbon con una salsa de ejote', '7000');

insert into detallepedidos (PedidoID,PlatilloID,Cantidad,PrecioVenta,Comentarios) values
('1','2','3','75','3 ordenes de arroz'),
('2','3','1','55','1 orden de adobada'),
('3', '4', '2', '170', '2 ordenes de Enchiladas Verdes'),
('4', '5', '1', '45', '1 orden de Tacos al Pastor'),
('5', '6', '1', '90', '1 orden de Ceviche de Pescado'),
('6', '7', '2', '160', '2 ordenes de Chiles Rellenos'),
('7', '8', '1', '120', '1 orden de Pollo al Horno'),
('8', '9', '3', '180', '3 ordenes de Carnitas'),
('9', '10', '1', '110', '1 orden de Barbacoa de Borrego'),
('10', '4', '2', '170', '2 ordenes de Enchiladas Verdes');

INSERT INTO clientes_platillos (ClienteID, PlatilloID) VALUES 
(3, 4),
(4, 5),
(5, 6),
(6, 7),
(7, 8),
(8, 9),
(9, 10),
(10, 4),
(11, 5),
(12, 6);

# Delete
delete from platillos where ID_Platillo=1;
delete from platillos where ID_Platillo=11;
delete from pedidos where ClienteID=11;

# Update
update platillos set Descripcion='Rica carne con un delicioso adobo casero UwU' where ID_Platillo=3;
update detallepedidos set Comentarios = 'Sin cebolla' where DetalleID =3;
update clientes set Telefono = '449654321' where IDCliente=5;

# Select
select IDCliente, Nombre, Colonia, Telefono from clientes;
select Nombre, Precio from platillos;
select IDPedido, HoraPedido from pedidos;

select * from clientes where IDCliente=7;
select * from detallepedidos where PlatilloID=4;
select * from clientes_platillos where ClienteID =2;

select * from pedidos where time(HoraPedido)>'13:0:0';
select Nombre, Precio from platillos where Precio>70;
select * from clientes where Nombre like '%s';