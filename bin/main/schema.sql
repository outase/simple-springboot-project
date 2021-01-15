--sqlserverにはCREATE DATABASE IF NOT EXEISTSが書けないので、下記のように書きたいが書いてもできない。
--そのためDataBaseは手動で作成してから実行すること
--IF NOT EXISTS (SELECT * FROM master..sysdatabases WHERE name='otmProject')
--	CREATE DATABASE otmProject;
--GO

USE otmProject;

DROP TABLE IF EXISTS employee;

CREATE TABLE employee (
    id INT PRIMARY KEY IDENTITY(1,1),
    name NVARCHAR(255),
    sex int, --1:男、2:女
    age int,
    address NVARCHAR(255)
);