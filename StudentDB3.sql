USE [master]
GO

IF EXISTS (SELECT * FROM sys.databases WHERE name = 'StudentDB3')
	DROP DATABASE StudentDB3
GO

CREATE DATABASE StudentDB3
GO


use StudentDB3
GO
Create Table Student2 (RollNo varchar(10),Name varchar(30),mark float, FOO varchar(10) ,PRIMARY KEY (RollNo) )
GO
INSERT INTO Student2 (RollNo,Name,Mark,FOO) VALUES ('A1','Le Man', 5, 'lan')
INSERT INTO Student2 (RollNo,Name,Mark,FOO) VALUES ('A2','Tran Dao', 9, 'man')
INSERT INTO Student2 (RollNo,Name,Mark,FOO) VALUES ('B1','Dang Xuan', 8,'Bung')
INSERT INTO Student2 (RollNo,Name,Mark,FOO) VALUES ('B2','Phan Ha', 7,'Hung')
GO
select * from Student2
GO
