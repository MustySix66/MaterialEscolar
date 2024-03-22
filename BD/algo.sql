INSERT INTO CochesVendidos (Matricula, Marca, Modelo, Color, Precio, Codigocliente1) VALUES 
+('V2360OX', 'Opel', 'Corsa Sport 1.2', 'Azul', 21000.00,1),
+('V1010PB', 'Ford', 'Probe 2.0 16V', 'Blanco', 28600.00,2),
+('V4578OB', 'Ford', 'Orion Ghia 1.8', 'Negro', 26000.00,3),
+('V7648OU', 'Citroen', 'Xantia 16V', 'Negro', 24800.00,4),
+('V3543NC', 'Ford', 'Escort Ghia 1.6', 'Rojo', 25000.00,5),
+('V7632NX', 'Citroen', 'Zx Turbo-D', 'Rojo', 28000.00,6),
+('V8018LJ', 'Ford', 'Fiesta 1.4 CLX', 'Azul', 19500.00,7),
+('V2565NB', 'Renault', 'Clio 1.7 S', 'Blanco', 21000.00,8),
('V7642OU','Ford','Mondeo 1.8 GLX','Blanco', 31000.00,9),
+('V1234LC','Audi','100 2.3','Verde', 35100.00,10),
+('V9834LH','Peugeot','205 GTI','Rojo', 24500.00,11);

INSERT INTO Revisiones (CambioAceite, CambioFiltro, RevisionFrenos, Otro, Matricula1) VALUES 
('Sí', 'No', 'No', 'Revisar luces','V7632NX'),+
('Sí', 'Sí', 'No', 'Cambiar limpias','V7632NX'),+
('No', 'Sí', 'Sí', 'Arreglar alarma','V4578OB'),+
('No', 'Sí', 'Sí', 'Ajustar tablero','V2360OX'),+
('Sí', 'Sí', 'Sí', 'Cambiar limpia parabrisas','V2565NB'),+
('No', 'No', 'Sí', 'Cambiar luz interior','V7648OU'),+
('Sí', 'Sí', 'No', NULL,'V2565NB'), +
('No', 'No', 'No', NULL,'V8018LJ'),+
('Sí', 'No', 'Sí', 'Regular encendido','V3543NC'), +
('No', 'Sí', 'No', 'Reparar puerta delantera','V8018LJ'),+
('No', 'No', 'No', NULL,'V3543NC'), +
('Sí', 'Sí', 'Sí', NULL,'V1234LC'),+
('No', 'Sí', 'No', 'Cambiar limpias','V9834LH'), +
('No', 'Sí', 'No', NULL,'V1010PB');+