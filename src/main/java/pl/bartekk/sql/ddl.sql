-- DDL(Data Definition Language) : DDL or Data Definition Language actually consists of the SQL commands that can be
-- used to define the database schema. It simply deals with descriptions of the database schema and is used to create
-- and modify the structure of database objects in database.

--------------------- CREATE ---------------------
CREATE;

CREATE DATABASE database_name;
CREATE DATABASE my_database;

--------------------- DROP ---------------------

DROP;

DROP TABLE table_name;
DROP DATABASE database_name;

--------------------- ALTER ---------------------

ALTER;

ALTER TABLE table_name ADD (Columnname_1  datatype, Columnname_2  datatype);
ALTER TABLE table_name DROP COLUMN column_name;

--------------------- TRUNCATE ---------------------
TRUNCATE;

TRUNCATE TABLE table_name;

--------------------- RENAME ---------------------
RENAME;

ALTER TABLE table_name RENAME TO new_table_name;
ALTER TABLE table_name RENAME COLUMN old_name TO new_name;