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
				   gender varchar(50) NOT NULL,
				   sexual_orientation varchar(50),
				   user_occupation varchar(100) NOT NULL,
				   marital_status varchar(50) NOT NULL,
				   zodiac_sign varchar(100) NOT NULL,
				   religion varchar(50) NOT NULL,
				   email varchar(100) NOT NULL,
				   enabled boolean DEFAULT false
				  );
				  
INSERT INTO users( user_name,
				   user_lastname, 
				   user_age,
				   gender,
				   sexual_orientation,
				   user_occupation,
				   marital_status,
				   zodiac_sign,
				   religion,
				   email
				  )
VALUES('ahmet', 'yildirim', 29, 'male', 'straight', 'programmer', 'married', 'aquarious', 'muslim', 'email.email.com')

ROLLBACK;
COMMIT;
SELECT user_id, user_name, user_lastname, user_age, gender, sexual_orientation, user_occupation, marital_status, zodiac_sign, religion, email, enabled
FROM users;

DROP TABLE zodiac_sign;

