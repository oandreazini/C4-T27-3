use heroku_0d3d9a2e88b6da5;

DROP TABLE IF EXISTS `cajeros`;
DROP table IF EXISTS `productos`;
DROP table IF EXISTS `maquinas_registradoras`;
DROP table IF EXISTS `ventas`;

create table cajeros(
id int NOT NULL AUTO_INCREMENT,
nombre_apellidos nvarchar(225),
PRIMARY KEY (id)
);

insert into cajeros (`nombre_apellidos`) values('Laura Perez');
insert into cajeros (`nombre_apellidos`) values('Aina Lopez');
insert into cajeros (`nombre_apellidos`) values('Pepe Pepito');

create table productos(
id int NOT NULL AUTO_INCREMENT,
nombre nvarchar(100),
precio int,
PRIMARY KEY (id)
);

insert into productos (`nombre`, `precio`) values ('Kit kat', 2 );
insert into productos (`nombre`, `precio`) values ('kinder Bueno', 3);
insert into productos (`nombre`, `precio`) values ('kinder Sorpresa', 4);

create table maquinas_registradoras(
id int NOT NULL AUTO_INCREMENT,
piso int,
PRIMARY KEY (id)
);

insert into maquinas_registradoras (`piso`) values ( 2 );
insert into maquinas_registradoras (`piso`) values ( 4 );
insert into maquinas_registradoras (`piso`) values ( 8 );


create table ventas(
id int NOT NULL AUTO_INCREMENT,
cajero int,
maquina int,
producto int,
CONSTRAINT FK_id_cajero FOREIGN KEY (cajero) REFERENCES cajeros(id)
ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT FK_Iid_maquina FOREIGN KEY (maquina) REFERENCES maquinas_registradoras(id)
ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT FK_id_producto FOREIGN KEY (producto) REFERENCES productos(id)
ON DELETE CASCADE ON UPDATE CASCADE,
PRIMARY KEY (id)
);


insert into ventas (`cajero`, `maquina`, `producto`) values ( 1, 1, 1 );
insert into ventas (`cajero`, `maquina`, `producto`) values ( 11, 11, 11);
insert into ventas (`cajero`, `maquina`, `producto` ) values ( 21, 21, 21);