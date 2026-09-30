INSERT INTO pacientes (nome, cpf, data_nascimento, telefone, email)
VALUES ('João da Silva', '11111111111', '1998-05-10', '(74) 99999-1111', 'joao@email.com');

INSERT INTO pacientes (nome, cpf, data_nascimento, telefone, email)
VALUES ('Maria Oliveira', '22222222222', '2001-08-22', '(74) 99999-2222', 'maria@email.com');

INSERT INTO medicos (nome, especialidade, crm)
VALUES ('Dr. Carlos Souza', 'Clínico Geral', 'CRM-BA 12345');

INSERT INTO medicos (nome, especialidade, crm)
VALUES ('Dra. Ana Lima', 'Cardiologia', 'CRM-BA 67890');

INSERT INTO consultas (data_hora, status, observacoes, paciente_id, medico_id)
VALUES ('2026-09-24 09:00:00', 'AGENDADA', 'Consulta de rotina', 1, 1);

INSERT INTO consultas (data_hora, status, observacoes, paciente_id, medico_id)
VALUES ('2026-09-24 10:30:00', 'AGENDADA', 'Avaliação cardiológica', 2, 2);

INSERT INTO usuarios (usuario, senha, perfil)
VALUES ('admin', '1234', 'ADMIN');
