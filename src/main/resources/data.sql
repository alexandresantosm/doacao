DROP TABLE IF EXISTS usuarios;

CREATE TABLE usuarios (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  nome VARCHAR(250) NOT NULL,
  email VARCHAR(250) NOT NULL,
  cpf_ou_cnpj VARCHAR(14) NOT NULL,
  telefones VARCHAR(250) NOT NULL
);
 
INSERT INTO usuarios (nome, email, cpf_ou_cnpj, telefones) VALUES
  ('Aliko', 'aliko.@email.com', '53899607007', '111111111'),
  ('Bill', 'bill.@email.com', '05398056000160', '222222222'),
  ('Folrunsho', 'folrunsho.@email.com', '12931003077', '333333333');