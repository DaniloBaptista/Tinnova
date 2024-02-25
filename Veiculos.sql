-- tinnova.veiculos definition

CREATE TABLE `veiculos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `veiculo` varchar(255) DEFAULT NULL,
  `marca` varchar(255) DEFAULT NULL,
  `ano` int DEFAULT NULL,
  `descricao` text,
  `vendido` tinyint(1) DEFAULT NULL,
  `created` datetime DEFAULT NULL,
  `updated` datetime DEFAULT NULL,
  `cor` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO tinnova.veiculos (veiculo,marca,ano,descricao,vendido,created,updated,cor) VALUES
	 ('Onix','Chevrolet',2010,'Novo, azul.',1,'2024-02-24 16:07:37','2024-02-24 16:07:37','azul'),
	 ('Cruze','Chevrolet',2015,'Usado, vermelho',0,'2024-02-24 16:07:37','2024-02-24 16:07:37','vermelho'),
	 ('Tacker','Chevrolet',2018,'Novo, branco.',1,'2024-02-24 16:07:37','2024-02-24 16:07:37','branco'),
	 ('Fusion','Ford',2012,'Usado, prata',0,'2024-02-24 16:07:37','2024-02-24 16:07:37','prata'),
	 ('Cayenne','Porsche',2019,'NOvo, preto',1,'2024-02-24 16:07:37','2024-02-24 16:07:37','preto'),
	 ('Corolla','Toyota',2012,'Usado, Prata',NULL,'2024-02-23 00:00:00','2024-02-23 00:00:00','Prata'),
	 ('Palio','FIat',2003,'Usado',2,'2024-02-25 00:00:00','2024-02-25 00:00:00','Verde'),
	 ('Uno Millie','FIat',2005,'Usado,Rosa',1,'2024-02-25 00:00:00','2024-02-25 00:00:00','Rosa');