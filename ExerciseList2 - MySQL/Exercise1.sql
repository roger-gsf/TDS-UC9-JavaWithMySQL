CREATE DATABASE exercise1;
USE exercise1;

CREATE TABLE vendedores (
	id TINYINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(30) NOT NULL,
	idade INT NOT NULL,
	salario DECIMAL(6,2) NOT NULL
);

CREATE TABLE clientes (
	id TINYINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(30) NOT NULL,
	cidade VARCHAR(30) NOT NULL,
	tipo VARCHAR(30) NOT NULL
);

CREATE TABLE pedidos (
	id TINYINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	id_vendedor TINYINT NOT NULL,
	id_cliente TINYINT NOT NULL,
	qtd_itens SMALLINT NOT NULL,
	valor_total DECIMAL(6,2) NOT NULL,
	FOREIGN KEY (id_vendedor) REFERENCES vendedores(id),
	FOREIGN KEY (id_cliente) REFERENCES clientes(id)
);


INSERT INTO vendedores (nome, idade, salario) VALUES 
('João', 35, 2500.00), 
('Maria', 28, 2800.50), 
('Pedro', 40, 3000.75), 
('Ana', 32, 2700.25), 
('Carlos', 45, 3200.00);

INSERT INTO clientes (nome, cidade, tipo) VALUES
('Gedore', 'São Paulo', 'Indústria'),
('Lojas Lebes', 'Rio de Janeiro', 'Comércio'),
('Macromix', 'Porto Alegre', 'Varejo'),
('Jadlog', 'Salvador', 'Logística'),
('Petrobras', 'Brasília', 'Corporativa');

INSERT INTO pedidos (id_vendedor, id_cliente, qtd_itens, valor_total) VALUES
(1, 3, 10, 6000.00),
(2, 4, 15, 7500.00),
(2, 2, 8, 4800.00),
(4, 5, 12, 2300.00),
(4, 1, 20, 1000.00);

-- 1. Quais os nomes de todos os vendedores?
SELECT nome 
FROM vendedores;

-- 2. Quais os números dos vendedores que realizaram algum pedido?
SELECT DISTINCT vendedores.nome 
FROM vendedores
INNER JOIN pedidos ON vendedores.id = pedidos.id_vendedor
WHERE pedidos.id IS NOT NULL;

-- 3. Quais os números dos vendedores que não realizaram pedidos?
SELECT vendedores.nome 
FROM vendedores
LEFT JOIN pedidos ON vendedores.id = pedidos.id_vendedor
WHERE pedidos.id IS NULL;

-- 4. Quais os nomes dos vendedores que realizaram pedido para clientes do tipo “Indústria”?
SELECT DISTINCT vendedores.nome 
FROM vendedores
INNER JOIN pedidos ON vendedores.id = pedidos.id_vendedor
INNER JOIN clientes ON clientes.id = pedidos.id_cliente
WHERE clientes.tipo = 'Indústria';

-- 5. Qual o tipo do cliente que foram atendidos (realizaram pedido) com o vendedor “João”?
SELECT clientes.tipo 
FROM clientes
INNER JOIN pedidos ON clientes.id = pedidos.id_cliente
INNER JOIN vendedores ON vendedores.id = pedidos.id_vendedor
WHERE vendedores.nome = 'João';

-- 6. Quais os nomes e tipos dos clientes com pedidos acima de R$5000.00?
SELECT clientes.nome, clientes.tipo
FROM clientes
INNER JOIN pedidos ON clientes.id = pedidos.id_cliente
WHERE pedidos.valor_total > 5000.00;