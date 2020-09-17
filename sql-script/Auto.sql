CREATE DATABASE  IF NOT EXISTS Auto;

USE Auto;

DROP TABLE IF EXISTS auto;


CREATE TABLE auto (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Make` varchar(45) DEFAULT NULL,
  `Model` varchar(45) DEFAULT NULL,
  `Colour` varchar(45) DEFAULT NULL,
  `Power` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

LOCK TABLES auto WRITE;


INSERT INTO auto (Make, Model, Colour, Power) VALUES 
	('Skoda','Octavia','Zelena','68'),
	('VW','Golf','Cervena','80'),
	('Opel','Astra','Cerna','55'),
	('BMW','X5','Modra','95'),
	('Seat','Leon','Zluta','49'),
	('Ford','Focus','Fialova','62'),
	('VW','Passat','Cerna','128'),
	('Skoda','Fabia','Modra','45'),
	('Renault','Megane','Zelena','67'),
	('Opel','Corsa','Zluta','44'),
	('Audi','A6','Cerna','135'),
	('Fiat','Panda','Bila','52');


