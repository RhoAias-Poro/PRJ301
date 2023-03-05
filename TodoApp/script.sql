CREATE DATABASE TodoApp
GO

USE TodoApp
GO

CREATE TABLE users (
  id int NOT NULL IDENTITY(1,1) PRIMARY KEY,
  first_name varchar(20) DEFAULT NULL,
  last_name varchar(20) DEFAULT NULL,
  username varchar(250) DEFAULT NULL,
  password varchar(20) DEFAULT NULL,
) 

CREATE TABLE todos (
  id bigint NOT NULL IDENTITY(1,1) PRIMARY KEY,
  description varchar(255) DEFAULT NULL,
  is_done bit NOT NULL,
  target_date datetime DEFAULT NULL,
  username varchar(255) DEFAULT NULL,
  title varchar(255) DEFAULT NULL,
) 
