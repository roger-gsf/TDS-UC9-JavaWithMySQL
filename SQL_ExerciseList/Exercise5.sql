CREATE DATABASE exercise5;
USE exercise5;

CREATE TABLE professores (
    id_prof TINYINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    cpf_prof VARCHAR(15) NOT NULL UNIQUE,
    nome_prof VARCHAR(50) NOT NULL,
    data_nasc_prof DATE NOT NULL,
    titulacao_prof VARCHAR(20) NOT NULL,
    tele_pessoal_prof VARCHAR(14) NOT NULL,
    tele_residencial_prof VARCHAR(14) NOT NULL
);

CREATE TABLE alunos (
  cod_matricula_aluno SMALLINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  data_matricula_aluno DATE NOT NULL,
  nome_aluno VARCHAR(50) NOT NULL,
  endereco_aluno VARCHAR(50) NOT NULL,
  telefone_aluno VARCHAR(14) NOT NULL,
  data_nasc_aluno DATE NOT NULL,
  altura_aluno DECIMAL(3,2) NOT NULL,
  peso_aluno DECIMAL(5,2) NOT NULL
);

CREATE TABLE turmas (
  id_turma TINYINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  qtd_alunos TINYINT NOT NULL,
  horario_aula TIME NOT NULL,
  data_inicial DATE NOT NULL,
  data_final DATE NOT NULL,
  tipo_curso VARCHAR(50) NOT NULL,
  id_prof TINYINT NOT NULL,
  cod_matricula_aluno SMALLINT,
  FOREIGN KEY (id_prof) REFERENCES professores(id_prof),
  FOREIGN KEY (cod_matricula_aluno) REFERENCES alunos(cod_matricula_aluno)
);

CREATE TABLE cursos (
  id_curso TINYINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  nome_curso VARCHAR(50) NOT NULL,
  descricao_curso TEXT NOT NULL,
  carga_horaria SMALLINT NOT NULL
);

CREATE TABLE aluno_monitor (
  cod_matricula_aluno SMALLINT NOT NULL,
  id_turma TINYINT NOT NULL,
  FOREIGN KEY (cod_matricula_aluno) REFERENCES alunos (cod_matricula_aluno),
  FOREIGN KEY (id_turma) REFERENCES turmas (id_turma),
  PRIMARY KEY (cod_matricula_aluno, id_turma)
);

CREATE TABLE matriculas (
  id_matricula SMALLINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  cod_matricula_aluno SMALLINT NOT NULL,
  id_turma SMALLINT NOT NULL,
  qtd_faltas SMALLINT NOT NULL,
  FOREIGN KEY (cod_matricula_aluno) REFERENCES alunos (cod_matricula_aluno),
  FOREIGN KEY (id_turma) REFERENCES turmas (id_turma)
);