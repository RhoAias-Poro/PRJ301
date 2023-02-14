USE [master]
GO

IF EXISTS (SELECT * FROM sys.databases WHERE name = 'StudentDB2')
	DROP DATABASE StudentDB2
GO

CREATE DATABASE StudentDB2
GO


use StudentDB2
GO
Create Table Student1 (RollNo varchar(10),Name varchar(30),mark float, AB float ,PRIMARY KEY (RollNo) )
GO
INSERT INTO Student1 (RollNo,Name,Mark,AB) VALUES ('A1','Le Man', 5, 5)
INSERT INTO Student1 (RollNo,Name,Mark,AB) VALUES ('A2','Tran Dao', 9, 6)
INSERT INTO Student1 (RollNo,Name,Mark,AB) VALUES ('B1','Dang Xuan', 8,8)
INSERT INTO Student1 (RollNo,Name,Mark,AB) VALUES ('B2','Phan Ha', 7,10)
INSERT INTO Student1 (RollNo,Name,Mark,AB) VALUES ('B3','Hoang Thu', 8,4)
INSERT INTO Student1 (RollNo,Name,Mark,AB) VALUES ('B4','Nguyen Dong', 7,2)
INSERT INTO Student1 (RollNo,Name,Mark,AB) VALUES ('C2','Pham Thu', 7,3)
GO
select * from Student1
GO
