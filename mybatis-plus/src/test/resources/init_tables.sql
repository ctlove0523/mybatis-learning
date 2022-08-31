CREATE TABLE IF NOT EXISTS `ACTOR` (
  actor_id smallint NOT NULL AUTO_INCREMENT,
  first_name varchar(45) NOT NULL,
  last_name varchar(45) NOT NULL,
  last_update timestamp NOT NULL,
  PRIMARY KEY (actor_id)
);