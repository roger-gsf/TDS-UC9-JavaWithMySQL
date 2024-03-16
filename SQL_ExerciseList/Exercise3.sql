CREATE DATABASE exercise3; 
USE exercise3;

CREATE TABLE departamentos (
id TINYINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
id_gerente TINYINT NOT NULL,
nome VARCHAR(100) NOT NULL,
horario TIME NOT NULL
);

CREATE TABLE empregados (
id TINYINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
id_departamento TINYINT NOT NULL,
nome VARCHAR(100) NOT NULL,
aniversario DATE NOT NULL,
endereco VARCHAR(100) NOT NULL,
sexo VARCHAR(10) NOT NULL,
salario DECIMAL(7,2) NOT NULL,
FOREIGN KEY (id_departamento) REFERENCES departamentos(id)
);

CREATE TABLE localizacoes (
id TINYINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
id_departamento TINYINT NOT NULL,
FOREIGN KEY (id_departamento) REFERENCES departamentos(id)
);

CREATE TABLE projetos (
id TINYINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
id_departamento TINYINT NOT NULL,
nome VARCHAR(100) NOT NULL,
FOREIGN KEY (id_departamento) REFERENCES departamentos(id)
);

CREATE TABLE trabalha_em (
id_empregado TINYINT NOT NULL,
id_projeto TINYINT NOT NULL,
horas SMALLINT NOT NULL,
FOREIGN KEY (id_empregado) REFERENCES empregados(id),
FOREIGN KEY (id_projeto) REFERENCES projetos(id)
);

CREATE TABLE dependente (
id TINYINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
id_empregado TINYINT NOT NULL,
nome VARCHAR(100) NOT NULL,
sexo VARCHAR(10) NOT NULL,
aniversario DATE NOT NULL,
parentesco VARCHAR(30) NOT NULL,
FOREIGN KEY (id_empregado) REFERENCES empregados(id)
);
