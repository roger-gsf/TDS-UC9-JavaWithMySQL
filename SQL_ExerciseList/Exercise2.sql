CREATE DATABASE exercise2;
USE exercise2;

CREATE TABLE alunos (
	id TINYINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(100) NOT NULL,
	curso VARCHAR(100) NOT NULL,
	nivel VARCHAR(100) NOT NULL,
	idade TINYINT NOT NULL
);

CREATE TABLE turmas (
	id TINYINT AUTO_INCREMENT PRIMARY KEY,
	nometurma VARCHAR(100) NOT NULL,
	sala SMALLINT NOT NULL,
	horario TIME NOT NULL
);

CREATE TABLE matriculas (
	id INT NOT NULL PRIMARY KEY,
	id_aluno TINYINT,
	id_turma TINYINT,
	nota_1 DECIMAL(4,2) NOT NULL,
	nota_2 DECIMAL(4,2) NOT NULL,
	nota_3 DECIMAL(4,2) NOT NULL,
	nota_final DECIMAL(4,2) NOT NULL,
	nr_faltas SMALLINT NOT NULL,
	FOREIGN KEY (id_aluno) REFERENCES alunos(id),
	FOREIGN KEY (id_turma) REFERENCES turmas(id)
);

INSERT INTO alunos (nome, curso, nivel, idade) VALUES
('Benjamin Bernardo', 'Programação', 'Ensino médio', 18),
('Dick Vigarista', 'Medicina', 'Ensino superior', 20),
('Penelope Charmosa', 'Direito', 'Graduação', 25),
('Rafael Aloprado', 'Psicologia', 'Mestrado', 30),
('Joana Pires', 'Administração', 'Doutorado', 37);

INSERT INTO turmas (nometurma, sala, horario) VALUES
('The Rogers', 101, '08:00:00'),
('Os sigmas', 30, '10:00:00'),
('Os shaolins', 85, '12:00:00'),
('As winx', 27, '14:00:00'),
('Os desempregados', 202, '16:00:00');

INSERT INTO matriculas VALUES
(45216, 1, 1, 7.5, 8.0, 7.0, 7.5, 3),
(73982, 2, 2, 8.0, 9.0, 8.5, 8.5, 1),
(16874, 3, 3, 6.5, 7.0, 6.0, 6.5, 5),
(50329, 4, 4, 9.0, 8.5, 9.5, 9.0, 0),
(90000, 5, NULL, 4.5, 3.0, 5.0, 4.0, 10); 

-- 1. Quais os nomes de todos os alunos?
SELECT alunos.nome 
FROM alunos;

-- 2. Quais os números das matrículas dos alunos?
SELECT matriculas.id
FROM matriculas
INNER JOIN alunos ON alunos.id = matriculas.id_aluno;

-- 3. Quais os números das matrículas dos alunos que não estão matriculados em uma turma?
SELECT matriculas.id
FROM matriculas
LEFT JOIN turmas ON matriculas.id_turma = turmas.id
WHERE turmas.id IS NULL;

-- 4. Quais os números dos alunos matriculados em uma turma de número '30'?
SELECT matriculas.id
FROM matriculas
INNER JOIN turmas ON matriculas.id_turma = turmas.id
WHERE turmas.sala = 30;

-- 5. Quais os horários das turmas do aluno 'Dick Vigarista'?
SELECT turmas.horario
FROM turmas
INNER JOIN matriculas ON matriculas.id_turma = turmas.id
INNER JOIN alunos ON matriculas.id_aluno = alunos.id
WHERE alunos.nome = 'Dick Vigarista';

-- 6. Quais os nomes dos alunos matriculados em uma turma de número '30'?
SELECT alunos.nome
FROM alunos
INNER JOIN matriculas ON matriculas.id_aluno = alunos.id
INNER JOIN turmas ON matriculas.id_turma = turmas.id
WHERE turmas.sala = 30;

-- 7. Quais os nomes dos alunos que não estão matriculados na turma de número '30'?
SELECT DISTINCT alunos.nome
FROM alunos
INNER JOIN matriculas ON matriculas.id_aluno = alunos.id
INNER JOIN turmas ON matriculas.id_turma = turmas.id
WHERE turmas.sala != 30;

-- 8. Quais os nomes das turmas com alunos com nota final maior que 8?
SELECT turmas.nometurma
FROM turmas
INNER JOIN matriculas ON matriculas.id_turma = turmas.id
WHERE matriculas.nota_final > 8.0;