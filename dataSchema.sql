CREATE TABLE `infoStudent` (
  `idnp_student` varchar(64) NOT NULL,
  `nume_student` varchar(64) DEFAULT NULL,
  `prenume_student` varchar(64) DEFAULT NULL,
  `grupa` varchar(64) DEFAULT NULL,
  `specialitate` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`idnp_student`)
);

CREATE TABLE `infoProfesori` (
  `idnp_profesor` varchar(64) NOT NULL,
  `nume_profesor` varchar(64) DEFAULT NULL,
  `prenume_profesor` varchar(64) DEFAULT NULL,
  `id_curs` int DEFAULT NULL,
  PRIMARY KEY (`idnp_profesor`),
  KEY `id_curs` (`id_curs`),
  CONSTRAINT `infoprofesori_ibfk_1` FOREIGN KEY (`id_curs`) REFERENCES `cursuri` (`id_curs`)
);

CREATE TABLE `cursuri` (
  `id_curs` int NOT NULL AUTO_INCREMENT,
  `nume_curs` varchar(64) DEFAULT NULL,
  `semestru` int DEFAULT NULL,
  PRIMARY KEY (`id_curs`)
);

CREATE TABLE `note` (
  `id_nota` int NOT NULL AUTO_INCREMENT,
  `id_curs` int DEFAULT NULL,
  `idnp_student` varchar(64) DEFAULT NULL,
  `nota` int DEFAULT NULL,
  `data` date DEFAULT NULL,
  PRIMARY KEY (`id_nota`),
  KEY `id_curs` (`id_curs`),
  KEY `idnp_student` (`idnp_student`),
  CONSTRAINT `note_ibfk_1` FOREIGN KEY (`id_curs`) REFERENCES `cursuri` (`id_curs`),
  CONSTRAINT `note_ibfk_2` FOREIGN KEY (`idnp_student`) REFERENCES `infoStudent` (`idnp_student`),
  CONSTRAINT `note_chk_1` CHECK (((`nota` > 0) and (`nota` < 11)))
);

CREATE TABLE `specialitati` (
  `id_specialitate` int NOT NULL AUTO_INCREMENT,
  `nume_specialitate` varchar(64) DEFAULT NULL,
  `descriere` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id_specialitate`)
);

CREATE TABLE `top_10` (
  `id` int NOT NULL,
  `idnp_student` varchar(64) DEFAULT NULL,
  `nota_medie` double DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idnp_student` (`idnp_student`),
  CONSTRAINT `top_10_ibfk_1` FOREIGN KEY (`idnp_student`) REFERENCES `infoStudent` (`idnp_student`)
)