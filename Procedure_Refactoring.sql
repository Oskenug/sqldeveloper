SET SERVEROUTPUT ON;
DECLARE 
PIS_NAME_UN�VERS�TY VARCHAR2(50);
BEGIN
SELECT UNIVERSITY INTO PIS_NAME_UN�VERS�TY FROM INTERN WHERE FIRST_NAME='�zge Nur';
DBMS_OUTPUT.put_line(PIS_NAME_UN�VERS�TY);
END;
/

CREATE OR REPLACE PROCEDURE FIND_UNIVERSITY(
PIS_FIRST_NAME IN VARCHAR2,
PIS_UNIVERSITY OUT VARCHAR2)
IS
BEGIN
SELECT UNIVERSITY 
INTO PIS_UNIVERSITY 
FROM INTERN 
WHERE PIS_FIRST_NAME=FIRST_NAME;
END;
/