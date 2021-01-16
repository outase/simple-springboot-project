USE otmProject;

-- product
DELETE FROM products;

INSERT INTO products (name, price) VALUES (N'部品１', 160000);
INSERT INTO products (name, price) VALUES (N'部品２', 380000);

-- warehouse
DELETE FROM warehouses;

INSERT INTO warehouses (name, address) VALUES (N'倉庫１', N'愛知県');
INSERT INTO warehouses (name, address) VALUES (N'倉庫２', N'大阪府');
INSERT INTO warehouses (name, address) VALUES (N'倉庫３', N'埼玉県');
INSERT INTO warehouses (name, address) VALUES (N'倉庫４', N'千葉県');

-- productstock
DELETE FROM productstock;

INSERT INTO productstock (warehouses_id, products_id, stock) VALUES (1, 1, 300);
INSERT INTO productstock (warehouses_id, products_id, stock) VALUES (1, 2, 200);
INSERT INTO productstock (warehouses_id, products_id, stock) VALUES (2, 1, 100);
INSERT INTO productstock (warehouses_id, products_id, stock) VALUES (3, 2, 50);
INSERT INTO productstock (warehouses_id, products_id, stock) VALUES (4, 1, 150);
