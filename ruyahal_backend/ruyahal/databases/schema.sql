BEGIN TRANSACTION;

CREATE SEQUENCE seq_user_id
INCREMENT BY 1
NO MAXVALUE
NO MINVALUE
CACHE 1;

CREATE TABLE users(user_id int DEFAULT nextval('seq_user_id'::regclass) PRIMARY KEY NOT NULL, 
				   user_name varchar(50) NOT NULL, 
				   user_lastname varchar(50) NOT NULL, 
				   user_age int NOT NULL,
				   sex varchar(50) NOT NULL,
				   sexual_orientation varchar(50),
				   user_occupation varchar(100) NOT NULL,
				   marital_status varchar(50) NOT NULL,
				   zodiac_sign varchar(100) NOT NULL,
				   religion varchar(50),
				   phone_number int NOT NULL,
				   email varchar(100) NOT NULL,
				   credit int NOT NULL
				   
				  );