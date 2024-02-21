create database tienda;
use tienda;
create table articulos (
id_articulo int auto_increment primary key,
N_articulo varchar(25),
Descripcion varchar(25),
Precio int);


select * from articulos;

create table pedido (id_ped int auto_increment primary key,
direccion varchar(25),
fecha date
);

select * from pedido;


CREATE TABLE IF NOT EXISTS `tienda`.`cliente` (
  `id_cliente` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL DEFAULT NULL,
  `apellido_p` VARCHAR(45) NULL DEFAULT NULL,
  `apellido_m` VARCHAR(45) NULL DEFAULT NULL,
  `direccion` VARCHAR(45) NULL DEFAULT NULL,
  `telefono` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id_cliente`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci

select * from cliente;

ALTER TABLE articulos ADD COLUMN id_ped INT,
ADD FOREIGN KEY (id_ped) REFERENCES pedido(id_ped);

ALTER TABLE articulos ADD COLUMN id_cliente INT,
ADD FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente);
