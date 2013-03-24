DROP TABLE IF EXISTS USERS ;

CREATE TABLE  USERS 
(
  id int(11) NOT NULL auto_increment,
  userName varchar(255) NOT NULL,
  password varchar(255) NOT NULL,
  firstName varchar(255) NOT NULL,
  lastName varchar(255) default NULL,
  email varchar(255) default NULL,
  phone varchar(255) default NULL,
  dob datetime default NULL,
  PRIMARY KEY  (id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
