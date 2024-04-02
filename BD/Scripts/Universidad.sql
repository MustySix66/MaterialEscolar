#CREACIÓN DE BASE DE DATOS
create database universidad;
use universidad;

create table carrera (
	clave_c int not null auto_increment, 
    nombre_c varchar(45),
    duracion_c varchar(45),
    constraint pk_carrera primary key (clave_c)
);
#drop table carrera;

create table materia (
clave_m int not null primary key auto_increment,
nombre_m varchar(45),
coordinacion varchar(45)
);

create table profesor (
	clave_p int not null auto_increment, 
    nombre_p varchar(45),
    direccion_p varchar(45),
    constraint pk_profesor primary key (clave_p)
);
    
create table alumno (
	clave_al int not null auto_increment, 
    nombre_al varchar(45),
    edad int (2),
    constraint pk_alumno primary key (clave_al)
);

#CREAR TABLA ALUMNO PROFESOR 
create table alumno_profesor(
	alumno_clave_al int,
	profesor_clave_p int,
	constraint fk_falu1 foreign key(alumno_clave_al) references alumno (clave_al),
	constraint fk_fprof foreign key(profesor_clave_p) references profesor (clave_p)
);

create  table materia_profesor(
	materia_clave_m int,
	profesor_clave_p int,
	constraint fk_fmat foreign key (materia_clave_m) references  materia(clave_m),
	constraint fk_fprof2 foreign key(profesor_clave_p) references profesor (clave_p)
);

create table materia_alumno(
	alumno_clave_al int,
	materia_clave_m int,
	constraint fk_fal2 foreign key(alumno_clave_al) references alumno (clave_al),
	constraint fk_fmat2 foreign key(materia_clave_m) references materia (clave_m)
);

-- metodologia de alter
alter table alumno add column carrera_clave_c int;
alter table alumno add constraint fk_fcarr foreign key(carrera_clave_c) references carrera(clave_c);
alter table materia add column horas_totales int;
alter table materia add column horas int after nombre_m;
alter table materia change column horas horas_semana int;
alter table materia drop column horas_semana;

INSERT INTO carrera(nombre_c,duracion_c) VALUES ("TICS","3 ANIOS 8 MESES");
INSERT INTO carrera(nombre_c,duracion_c) VALUES ("MECATRONICA","3 ANIOS 8 MESES");
INSERT INTO carrera(nombre_c,duracion_c) VALUES ("CONTABILIDAD","3 ANIOS 8 MESES");
##Alumnos------------------------------------------------------
insert into alumno (nombre_al,edad,carrera_clave_c) values 
("Adolfo", 30, 1),
("Maria", 18, 1 ),
("Sofia", 20, 3),
("Carlos", 25, 2),
("Mario", 19, 2);

##Materias-----------------------------------------------------------
insert into materia (nombre_m,coordinacion,horas_totales) values ("Base de datos","Software",60);
insert into materia (nombre_m,coordinacion,horas_totales) values ("Poo","Software",90);
insert into materia (nombre_m,coordinacion,horas_totales) values ("Ingles","Ingles",60);
insert into materia (nombre_m,coordinacion,horas_totales) values ("Disenio Web","Software",60);
insert into materia (nombre_m,coordinacion,horas_totales) values ("Redes","Redes",60);

###Profesor---------------------------------------------------
insert into profesor(nombre_p,direccion_p) values ("Gonzalo","Madero 323");
insert into profesor(nombre_p,direccion_p) values ("Cuco","Lopez Mateos 1005");
insert into profesor(nombre_p,direccion_p) values ("Chess","Pulgas Pandas 520");

### Alumno-Profesor-------------------------------------------
insert into alumno_profesor (alumno_clave_al,profesor_clave_p) values (1,1);
insert into alumno_profesor (alumno_clave_al,profesor_clave_p) values (1,2);
insert into alumno_profesor (alumno_clave_al,profesor_clave_p) values (1,3);
insert into alumno_profesor (alumno_clave_al,profesor_clave_p) values (2,1);
insert into alumno_profesor (alumno_clave_al,profesor_clave_p) values (3,3);

### Materia-Alumnos------------------------------------------
insert into materia_alumno(alumno_clave_al,materia_clave_m) values(1,1);
insert into materia_alumno(alumno_clave_al,materia_clave_m) values(1,2);
insert into materia_alumno(alumno_clave_al,materia_clave_m) values(2,1);
insert into materia_alumno(alumno_clave_al,materia_clave_m) values(2,2);
insert into materia_alumno(alumno_clave_al,materia_clave_m) values(3,1);

##materia-profesor-----------------------------------------

insert into materia_profesor(materia_clave_m,profesor_clave_p) values (1,1);
insert into materia_profesor(materia_clave_m,profesor_clave_p) values (1,2);
insert into materia_profesor(materia_clave_m,profesor_clave_p) values (2,2);
insert into materia_profesor(materia_clave_m,profesor_clave_p) values (2,3);
insert into materia_profesor(materia_clave_m,profesor_clave_p) values (3,3);