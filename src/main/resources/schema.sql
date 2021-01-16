--sqlserverにはCREATE DATABASE IF NOT EXEISTSが書けないので、下記のように書きたいが書いてもできない。
--そのためDataBaseは手動で作成してから実行すること
--IF NOT EXISTS (SELECT * FROM master..sysdatabases WHERE name='otmProject')
--	CREATE DATABASE otmProject;
--GO

USE otmProject;

-- products
DROP TABLE IF EXISTS products;

CREATE TABLE products (
    id INT PRIMARY KEY IDENTITY(1,1),
    name NVARCHAR(255),
    price int,
);

-- warehouses
DROP TABLE IF EXISTS warehouses;

CREATE TABLE warehouses (
    id INT PRIMARY KEY IDENTITY(1,1),
    name NVARCHAR(255),
    address NVARCHAR(255),
);

-- productstock
DROP TABLE IF EXISTS productstock;

CREATE TABLE productstock (
    warehouses_id int,
    products_id int,
    stock int,
    PRIMARY KEY (warehouses_id, products_id)
);