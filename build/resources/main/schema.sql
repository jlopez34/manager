DROP TABLE IF EXISTS USER;

CREATE TABLE USER(
  ID_USER UUID PRIMARY KEY,
  NAME VARCHAR(50) NOT NULL,
  EMAIL VARCHAR(100) NOT NULL,
  PASSWORD VARCHAR(50) NOT NULL,
  CREATED DATE NOT NULL,
  MODIFIED DATE NOT NULL,
  LAST_LOGIN DATE NOT NULL,
  TOKEN VARCHAR(200) NOT NULL,
  ACTIVE CHAR(1) NOT NULL
);

DROP TABLE IF EXISTS PHONE;

CREATE TABLE PHONE(
  ID_PHONE INT AUTO_INCREMENT  PRIMARY KEY,
    NUMBER VARCHAR(50) NOT NULL,
    CITY_CODE VARCHAR(2) NOT NULL,
    COUNTRY_CODE VARCHAR(2) NOT NULL
 );

DROP TABLE IF EXISTS USER_PHONE;

CREATE TABLE USER_PHONE(
  ID_USER_PHONE INT AUTO_INCREMENT,
  ID_USER UUID NOT NULL,
  ID_PHONE INT NOT NULL,
  PRIMARY KEY (ID_USER_PHONE,ID_USER, ID_PHONE),
  CONSTRAINT FK_USER FOREIGN KEY (ID_USER) REFERENCES USER(ID_USER),
  CONSTRAINT FK_PHONE FOREIGN KEY (ID_PHONE) REFERENCES PHONE(ID_PHONE)
 );

