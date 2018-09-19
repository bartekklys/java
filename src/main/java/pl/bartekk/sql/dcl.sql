-- DCL(Data Control Language) : DCL includes commands such as GRANT and REVOKE which mainly deals with the rights,
-- permissions and other controls of the database system.

GRANT;
REVOKE;

--------------------- Examples ---------------------

-- For example: To grant CREATE TABLE privilege to a user by creating a testing role:
--
-- First, create a testing Role
CREATE ROLE testing;

-- Second, grant a CREATE TABLE privilege to the ROLE testing. You can add more privileges to the ROLE.
GRANT CREATE TABLE TO testing;

-- Third, grant the role to a user.
GRANT testing TO user1;

-- To revoke a CREATE TABLE privilege from testing ROLE, you can write:
REVOKE CREATE TABLE FROM testing;

-- The Syntax to drop a role from the database is as below:
DROP ROLE role_name;

-- For example: To drop a role called developer, you can write:
DROP ROLE testing;

