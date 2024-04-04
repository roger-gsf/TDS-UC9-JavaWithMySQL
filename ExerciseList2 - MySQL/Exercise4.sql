CREATE DATABASE exercise4;
USE exercise4;

CREATE TABLE professor (
  cod_professor TINYINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  nome_professor VARCHAR(30) NOT NULL
);

CREATE TABLE alunos (
  cod_aluno TINYINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  nome_aluno VARCHAR(50) NOT NULL
);

CREATE TABLE disciplinas (
  cod_disciplina VARCHAR(6) NOT NULL PRIMARY KEY,
  nome_disciplina VARCHAR(50) NOT NULL
);

CREATE TABLE turmas (
  cod_turma SMALLINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  cod_disciplina VARCHAR(6) NOT NULL,
  cod_aluno TINYINT NOT NULL,
  sigla_turma VARCHAR(5) NOT NULL,
  ano_semestre VARCHAR(20) NOT NULL,
  FOREIGN KEY (cod_disciplina) REFERENCES disciplinas(cod_disciplina),
  FOREIGN KEY (cod_aluno) REFERENCES alunos(cod_aluno)
);

CREATE TABLE prova1 (
  cod_aluno TINYINT NOT NULL,
  cod_turma SMALLINT NOT NULL,
  nota DECIMAL(4,2) NOT NULL,
  FOREIGN KEY (cod_aluno) REFERENCES alunos(cod_aluno),
  FOREIGN KEY (cod_turma) REFERENCES turmas(cod_turma)
);

CREATE TABLE prova2 (
  cod_aluno TINYINT NOT NULL,
  cod_turma SMALLINT NOT NULL,
  nota DECIMAL(4,2) NOT NULL,
  FOREIGN KEY (cod_aluno) REFERENCES alunos(cod_aluno),
  FOREIGN KEY (cod_turma) REFERENCES turmas(cod_turma)
);

-- Alguns INSERTs para teste:
INSERT INTO professor (nome_professor) VALUES 
('Jaques de Almeida');

INSERT INTO alunos (nome_aluno) VALUES 
('Alice Oliveira'),
('Bernardo Schneider'),
('Carlos Eduardo');

INSERT INTO disciplinas (cod_disciplina, nome_disciplina) VALUES 
('MAT101', 'Matemática'),
('POR202', 'Língua Portuguesa');

INSERT INTO turmas (cod_disciplina, cod_aluno, sigla_turma, ano_semestre) VALUES
('MAT101', 1, 'A', '2023-Primeiro'),
('MAT101', 2, 'B', '2023-Segundo'),
('POR202', 3, 'C', '2024-Primeiro');

INSERT INTO prova1 (cod_aluno, cod_turma, nota) VALUES 
(1, 1, 8.7),
(2, 1, 7.5),
(3, 2, 9.2);

INSERT INTO prova2 (cod_aluno, cod_turma, nota) VALUES 
(1, 1, 8.9),
(2, 1, 6.8),
(3, 2, 5.5);