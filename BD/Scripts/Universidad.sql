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
