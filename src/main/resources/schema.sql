CREATE TABLE IF NOT EXISTS vendor (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  name varchar(255),
  founder varchar(255),
  PRIMARY KEY (id),
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS item (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  name varchar(255),
  price real,
  vendor varchar(255),
  color varchar(255),
  PRIMARY KEY (id),
  FOREIGN KEY (vendor) REFERENCES vendor(name)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;