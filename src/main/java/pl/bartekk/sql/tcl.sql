-- TCL(transaction Control Language) : TCL commands deals with the transaction within the database.

--------------------- COMMIT ---------------------
COMMIT;

DELETE FROM Student WHERE AGE = 20;
COMMIT;

--------------------- ROLLBACK ---------------------
ROLLBACK;

DELETE FROM Student WHERE AGE = 20;
ROLLBACK;

--------------------- SAVEPOINT ---------------------
SAVEPOINT;

SAVEPOINT SAVEPOINT_NAME;
ROLLBACK TO SAVEPOINT_NAME;

--------------------- SET TRANSACTION ---------------------
SET TRANSACTION;

SET TRANSACTION [ READ WRITE | READ ONLY ];
