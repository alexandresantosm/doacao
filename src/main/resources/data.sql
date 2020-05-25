INSERT INTO usuarios (nome, email, cpf_ou_cnpj, tipo) VALUES
('Aliko', 'aliko.@email.com', '53899607007', 1),
('Bill', 'bill.@email.com', '05398056000160', 2),
('Folrunsho', 'folrunsho.@email.com', '12931003077', 2),
('Hemoce', 'hemoce.@email.com', '7954571011491', 3);
  
INSERT INTO telefones (usuario_id, telefones) VALUES
(1, '111111111'),
(2, '222222222'),
(3, '333333333'),
(4, '8531012296');
  
INSERT INTO estados (nome) VALUES
('CE'),
('SP'),
('TO');
  
INSERT INTO cidades (nome, estado_id) VALUES
('Fortaleza', 1),
('São Paulo', 2),
('Palmas', 3);

INSERT INTO enderecos (logradouro, numero, complemento, bairro, cep, usuario_id, cidade_id) VALUES
('Rua Um', '1', 'Casa', 'Bairro Um', '11111111', 1, 3),
('Rua Dois', '2', 'Sítio', 'Bairro Dois', '22222222', 2, 1),
('Rua Três', '3', 'Sala 3', 'Bairro Três', '33333333', 3, 2),
('Av. José Bastos', '3390', 'Prédio', 'Rodolfo Teófilo', '60440261', 4, 1);