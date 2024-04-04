CREATE DATABASE exercise6;
USE exercise6;

CREATE TABLE professores (
  id_prof TINYINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  cpf_prof VARCHAR(15) NOT NULL UNIQUE,
  nome_prof VARCHAR(50) NOT NULL,
  dt_nasc_prof DATE NOT NULL,
  titulacao_prof VARCHAR(20) NOT NULL,
  tele_pessoal_prof VARCHAR(15) NOT NULL,
  tele_resid_prof VARCHAR(15) NOT NULL
);

CREATE TABLE alunos (
  cod_matric_aluno SMALLINT NOT NULL PRIMARY KEY,
  dt_matric_aluno DATE NOT NULL,
  nome_aluno VARCHAR(50) NOT NULL,
  endereco_aluno VARCHAR(50) NOT NULL,
  telefone_aluno VARCHAR(15) NOT NULL,
  dt_nasc_aluno DATE NOT NULL,
  altura_aluno DECIMAL(3,2) NOT NULL,
  peso_aluno DECIMAL(5,2) NOT NULL
);

CREATE TABLE cursos (
  id_curso TINYINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  nome_curso VARCHAR(50) NOT NULL,
  desc_curso TEXT NOT NULL,
  carga_horaria SMALLINT NOT NULL
);

CREATE TABLE turmas (
  id_turma TINYINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  id_prof TINYINT NOT NULL,
  id_curso TINYINT NOT NULL,
  qtd_alunos TINYINT NOT NULL,
  horario_aula TIME NOT NULL,
  dt_inicial DATE NOT NULL,
  dt_final DATE NOT NULL,
  tipo_curso VARCHAR(50) NOT NULL,
  FOREIGN KEY (id_prof) REFERENCES professores(id_prof),
  FOREIGN KEY (id_curso) REFERENCES cursos(id_curso)
);

CREATE TABLE aluno_monitor (
  cod_matric_aluno SMALLINT NOT NULL,
  id_turma TINYINT NOT NULL,
  PRIMARY KEY (cod_matric_aluno, id_turma),
  FOREIGN KEY (cod_matric_aluno) REFERENCES alunos(cod_matric_aluno),
  FOREIGN KEY (id_turma) REFERENCES turmas(id_turma)
);

CREATE TABLE matriculas (
  id_matricula SMALLINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  id_turma TINYINT NOT NULL,
  cod_matric_aluno SMALLINT NOT NULL,
  qtd_faltas SMALLINT NOT NULL,
  FOREIGN KEY (cod_matric_aluno) REFERENCES alunos(cod_matric_aluno),
  FOREIGN KEY (id_turma) REFERENCES turmas(id_turma)
);

INSERT INTO professores (cpf_prof, nome_prof, dt_nasc_prof, titulacao_prof, tele_pessoal_prof, tele_resid_prof) VALUES
('111.222.333-44', 'Carlos Pereira', '1978-06-15', 'Matemática', '(51) 91234-5678', '(51) 3214-5678'),
('222.333.444-55', 'Mariana Santos', '1983-09-25', 'Letras', '(51) 92345-6789', '(51) 4321-8765'),
('333.444.555-66', 'Paula Oliveira', '1975-03-30', 'Física', '(51) 93456-7890', '(51) 5432-1098');

INSERT INTO alunos (cod_matric_aluno, dt_matric_aluno, nome_aluno, endereco_aluno, telefone_aluno, dt_nasc_aluno, altura_aluno, peso_aluno) VALUES
(1111, '2024-05-23', 'Lucas Lima', 'Rua X, 123', '(51) 97654-5823', '2000-04-04', 1.72, 61.5),
(2222, '2024-06-12', 'Ana Oliveira', 'Rua Y, 234', '(51) 96543-9147', '2001-05-05', 1.85, 72.3),
(3333, '2024-07-04', 'Pedro Costa', 'Rua Z, 345', '(51) 95432-0368', '2002-06-06', 1.67, 58.9),
(4444, '2024-08-13', 'Lara Pereira', 'Rua W, 456', '(51) 94321-7295', '2003-07-07', 1.78, 65.2),
(5555, '2024-09-25', 'Luiza Santos', 'Rua V, 567', '(51) 93219-6403', '2004-08-08', 1.60, 54.8),
(6666, '2024-02-01', 'Marcos Silva', 'Rua U, 678', '(51) 92800-8951', '2005-09-09', 1.82, 76.7),
(7777, '2024-10-15', 'Carolina Souza', 'Rua T, 789', '(51) 96578-3214', '2006-10-10', 1.75, 70.0),
(8888, '2024-11-20', 'Joana Ferreira', 'Rua S, 890', '(51) 95468-7532', '2007-11-11', 1.68, 55.5),
(9999, '2024-12-25', 'Rafaela Oliveira', 'Rua R, 901', '(51) 94321-6789', '2008-12-12', 1.70, 58.0),
(0000, '2024-01-05', 'Eduardo Silva', 'Rua Q, 1234', '(51) 93265-8741', '2009-01-01', 1.80, 75.0),
(1010, '2024-03-20', 'Mateus Pereira', 'Rua P, 5678', '(51) 91324-5768', '2010-02-02', 1.76, 69.0),
(2020, '2024-04-15', 'Sophia Lima', 'Rua O, 9876', '(51) 92468-5372', '2011-03-03', 1.65, 52.3);

INSERT INTO cursos (nome_curso, desc_curso, carga_horaria) VALUES
('Desenvolvimento Web', 'Curso de desenvolvimento web para aprender programação e construção de websites.', 1600),
('Administração', 'Curso de administração para entender princípios de gestão empresarial e organizacional.', 2200),
('Engenharia Civil', 'Curso de engenharia civil para estudar estruturas, construção e planejamento urbano.', 2800),
('Marketing Digital', 'Curso de marketing digital para aprender estratégias de promoção online e análise de mercado.', 1200);

INSERT INTO turmas (id_prof, id_curso, qtd_alunos, horario_aula, dt_inicial, dt_final, tipo_curso) VALUES
(1, 1, 4, '08:30', '2024-03-06', '2024-11-20', 'Técnico'),
(2, 2, 3, '15:00', '2024-04-10', '2024-12-18', 'Graduação'),
(3, 3, 5, '10:30', '2024-05-15', '2024-11-30', 'Pós-graduação'),
(1, 1, 6, '14:00', '2024-06-20', '2024-08-30', 'Técnologo');

INSERT INTO aluno_monitor (cod_matric_aluno, id_turma) VALUES
(1010, 1),
(3333, 2),
(8888, 3);

INSERT INTO matriculas (id_turma, cod_matric_aluno, qtd_faltas) VALUES
(1, 1111, 8),
(1, 2222, 4),
(2, 3333, 6),
(2, 4444, 2),
(1, 5555, 3),
(1, 6666, 1),
(3, 7777, 5),
(3, 8888, 3),
(4, 9999, 2),
(4, 0000, 4),
(1, 1010, 0),
(2, 1010, 1),
(3, 1010, 2),
(1, 2020, 3),
(2, 2020, 0),
(3, 2020, 1);

-- 2) Fazer as seguintes consultas SQL:
-- 2.1) Listar os dados dos alunos:
SELECT * FROM alunos;

-- 2.2) Listar os dados dos alunos e as turmas que eles estão matriculados:
SELECT alunos.*, turmas.id_turma FROM alunos
INNER JOIN matriculas matrics ON alunos.cod_matric_aluno = matrics.cod_matric_aluno
INNER JOIN turmas ON matrics.id_turma = turmas.id_turma;

-- 2.3) Listar os alunos que não possuem faltas:
SELECT alunos.* FROM alunos
LEFT JOIN matriculas ON alunos.cod_matric_aluno = matriculas.cod_matric_aluno
WHERE matriculas.qtd_faltas = 0;

-- 2.4) Listar os professores e a quantidade de turmas que cada um leciona:
SELECT profs.*, COUNT(turmas.id_turma) AS qtd_turmas FROM professores profs
INNER JOIN turmas ON profs.id_prof = turmas.id_prof
GROUP BY profs.id_prof, profs.cpf_prof, profs.nome_prof, profs.dt_nasc_prof, 
profs.titulacao_prof, profs.tele_pessoal_prof, profs.tele_resid_prof;

-- 2.5) Listar nome dos professores, apenas um dos números de telefone do professor, dados
-- (id da turma, data início, data fim e horário) das turmas que o professor leciona, curso da
-- turma e alunos matriculados ordenado por nome do professor, id turma e nome do aluno:
SELECT 
profs.nome_prof AS Nome_professor,
profs.tele_pessoal_prof AS TelePessoalProf,
turmas.id_turma AS ID_Turma,
turmas.dt_inicial AS Data_inicial,
turmas.dt_final AS Data_final ,
turmas.horario_aula AS Horario_aula,
cursos.nome_curso AS Nome_curso,
alunos.nome_aluno AS Nome_aluno
FROM professores profs
INNER JOIN turmas ON profs.id_prof = turmas.id_prof
INNER JOIN matriculas matrics ON turmas.id_turma = matrics.id_turma
INNER JOIN alunos ON matrics.cod_matric_aluno = alunos.cod_matric_aluno
INNER JOIN cursos ON turmas.id_curso = cursos.id_curso
ORDER BY profs.nome_prof, turmas.id_turma, alunos.nome_aluno;

-- 2.6) Listar os nomes dos professores e a turma que cada um leciona com maior número de alunos:
SELECT 
profs.nome_prof AS Nome_Professor, 
turmas.id_turma AS ID_Turma
FROM professores profs
INNER JOIN turmas ON profs.id_prof = turmas.id_prof
WHERE turmas.qtd_alunos = (SELECT MAX(qtd_alunos) FROM turmas WHERE id_prof = profs.id_prof);

-- 2.7) Listar os nomes dos alunos ordenados pela turma que estes possuem maior número de
-- faltas. Deve aparecer apenas a turma que cada um dos alunos tem maior quantidade de faltas:
SELECT alunos.nome_aluno, turmas.id_turma
FROM matriculas matrics
INNER JOIN alunos ON matrics.cod_matric_aluno = alunos.cod_matric_aluno
INNER JOIN turmas ON matrics.id_turma = turmas.id_turma
INNER JOIN (SELECT cod_matric_aluno, MAX(qtd_faltas) AS max_faltas
FROM matriculas
GROUP BY cod_matric_aluno) AS MaiorNrFaltas 
ON MaiorNrFaltas.cod_matric_aluno = matrics.cod_matric_aluno AND MaiorNrFaltas.max_faltas = matrics.qtd_faltas
GROUP BY alunos.nome_aluno, turmas.id_turma
ORDER BY alunos.nome_aluno;

-- 2.8) Listar a quantidade média de alunos por curso.
SELECT ROUND((COUNT(cod_matric_aluno) / COUNT(DISTINCT id_turma)), 1) AS MediaAproxAlunosPorCurso
FROM matriculas;

-- 3) Fazer alterações nas tabelas:
-- 3.1) Alterar o nome de todos os professores para maiúsculo:
UPDATE professores
SET nome_prof = UPPER(nome_prof);

-- 3.2) Colocar o nome de todos os alunos que estão na turma com o maior número de alunos em maiúsculo:
UPDATE alunos
SET nome_aluno = UPPER(alunos.nome_aluno)
WHERE alunos.cod_matric_aluno IN (
SELECT matriculas.cod_matric_aluno
FROM matriculas
WHERE matriculas.id_turma = (
SELECT id_turma
FROM matriculas
GROUP BY id_turma
ORDER BY COUNT(cod_matric_aluno) DESC
LIMIT 1)
);

-- 4) Excluir as ausências dos alunos nas turmas que estes são monitores:
UPDATE matriculas
INNER JOIN aluno_monitor ON matriculas.cod_matric_aluno = aluno_monitor.cod_matric_aluno
SET matriculas.qtd_faltas = 0;