DROP TABLE IF EXISTS Pet;
DROP TABLE IF EXISTS Person;

CREATE TABLE person (
  id BIGINT NOT NULL AUTO_INCREMENT,
  first_name varchar(50) NOT NULL,
  PRIMARY KEY(id)
);


CREATE TABLE pet (
  id BIGINT NOT NULL AUTO_INCREMENT,
  name varchar(50) NOT NULL,
  owner_id BIGINT NOT NULL,
  PRIMARY KEY(id)
);

ALTER TABLE pet ADD FOREIGN KEY (owner_id) REFERENCES person(id);

INSERT INTO person(id, first_name)values(1,'User A');
INSERT INTO person(id, first_name)values(2,'User 2');

INSERT INTO pet(id, name,owner_id)values(1,'cat',1);
INSERT INTO pet(id, name,owner_id)values(2,'parrot',2);
INSERT INTO pet(id, name,owner_id)values(3,'dog',2);
