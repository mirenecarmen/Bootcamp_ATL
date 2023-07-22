CREATE TABLE color (
    id INT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    codigo_hex VARCHAR(7) NOT NULL
);
CREATE TABLE objeto (
    id INT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    id_color INT,
    FOREIGN KEY (id_color) REFERENCES color(id)
);
INSERT INTO color (id, nombre, codigo_hex) VALUES
(1, 'Rojo', '#FF0000'),
(2, 'Verde', '#00FF00'),
(3, 'Azul', '#0000FF');
