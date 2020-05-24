INSERT INTO usuarios (nome, email, cpf_ou_cnpj) VALUES
('Aliko', 'aliko.@email.com', '53899607007'),
('Bill', 'bill.@email.com', '05398056000160'),
('Folrunsho', 'folrunsho.@email.com', '12931003077');
  
INSERT INTO telefones (usuario_id, telefones) VALUES
(1, '111111111'),
(2, '222222222'),
(3, '333333333');
  
INSERT INTO estados (nome) VALUES
('CE'),
('SP'),
('TO');
  
INSERT INTO cidades (nome, estado_id) VALUES
('Fortaleza', 1),
('São Paulo', 2),
('Palmas', 3);