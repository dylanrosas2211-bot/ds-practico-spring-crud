CREATE DATABASE IF NOT EXISTS `Yeseria-Rosas`;
USE `Yeseria-Rosas`;


CREATE TABLE Especialidad (
    id_especialidad INT AUTO_INCREMENT PRIMARY KEY,
    modalidad_pago VARCHAR(100)
);

CREATE TABLE Responsable (
    id_responsable INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    telefono VARCHAR(50)
);

CREATE TABLE Obra (
    id_obra INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    direccion VARCHAR(255),
    precio_metro_cliente FLOAT,
    estado VARCHAR(50),
    id_responsable INT,
    FOREIGN KEY (id_responsable) REFERENCES Responsable(id_responsable)
);

CREATE TABLE Trabajadores (
    id_trabajador INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    tarifa_personal FLOAT,
    id_especialidad INT,
    FOREIGN KEY (id_especialidad) REFERENCES Especialidad(id_especialidad)
);

CREATE TABLE Asistencia (
    id_asistencia INT AUTO_INCREMENT PRIMARY KEY,
    id_trabajador INT,
    id_obra INT,
    fecha VARCHAR(50),
    dias_trabajados FLOAT,
    precio_dia_aplicado FLOAT,
    FOREIGN KEY (id_trabajador) REFERENCES Trabajadores(id_trabajador),
    FOREIGN KEY (id_obra) REFERENCES Obra(id_obra)
);

CREATE TABLE Pagos_Trabajadores (
    id_pago INT AUTO_INCREMENT PRIMARY KEY,
    id_obra INT,
    id_trabajador INT,
    fecha VARCHAR(50),
    descripcion TEXT,
    monto FLOAT,
    FOREIGN KEY (id_obra) REFERENCES Obra(id_obra),
    FOREIGN KEY (id_trabajador) REFERENCES Trabajadores(id_trabajador)
);

CREATE TABLE Adelantos_Pagos (
    id_adelanto INT AUTO_INCREMENT PRIMARY KEY,
    id_obra INT,
    id_trabajador INT,
    monto FLOAT,
    fecha VARCHAR(50),
    FOREIGN KEY (id_obra) REFERENCES Obra(id_obra),
    FOREIGN KEY (id_trabajador) REFERENCES Trabajadores(id_trabajador)
);

CREATE TABLE Produccion_Metros (
    id_produccion INT AUTO_INCREMENT PRIMARY KEY,
    id_obra INT,
    id_trabajador INT,
    metros_propios FLOAT,
    metros_cuadrados FLOAT,
    fecha VARCHAR(50),
    FOREIGN KEY (id_obra) REFERENCES Obra(id_obra),
    FOREIGN KEY (id_trabajador) REFERENCES Trabajadores(id_trabajador)
);

CREATE TABLE Maquinas (
    id_maquina INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    marca_modelo VARCHAR(100),
    estado VARCHAR(50),
    id_obra INT,
    FOREIGN KEY (id_obra) REFERENCES Obra(id_obra)
);

CREATE TABLE Ingresos (
    id_ingreso INT AUTO_INCREMENT PRIMARY KEY,
    id_obra INT,
    monto FLOAT,
    fecha VARCHAR(50),
    FOREIGN KEY (id_obra) REFERENCES Obra(id_obra)
);
