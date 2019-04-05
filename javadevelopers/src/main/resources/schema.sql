DROP TABLE IF EXISTS JUNGLE.ANIMAL; DROP TABLE IF EXISTS JUNGLE.FOOD; 
DROP SCHEMA IF EXISTS JUNGLE;

CREATE SCHEMA jungle;

CREATE table jungle.animal
(
  id   INT,
  name VARCHAR(50),
  legs INT,

  PRIMARY KEY (id)
);
CREATE table jungle.food
(
  id   INT,
  name VARCHAR(50),
  PRIMARY KEY (id)
);
