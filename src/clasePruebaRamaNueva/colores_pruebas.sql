CREATE TABLE colores (
    id INT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    codigo_hex VARCHAR(7) NOT NULL
);
INSERT INTO colores (id, nombre, codigo_hex) VALUES
(1, 'Rojo', '#FF0000'),
(2, 'Verde', '#00FF00'),
(3, 'Azul', '#0000FF');