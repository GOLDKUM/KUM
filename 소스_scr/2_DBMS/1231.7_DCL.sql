  SHOW user;
SELECT * FROM TAB;
SELECT * FROM DBA_TABLES; -- DBA권한이 아니므로 접근불가
SELECT * FROM USER_TABLES; -- 내 계정이 갖고 있는 테이블 정보
SELECT * FROM ALL_TABLES; -- 접근가능한 테이블 정보
SELECT * FROM ALL_TABLES WHERE TABLE_NAME='EMP';
SELECT * FROM SCOTT.EMP;
EXIT; -- 접속해제
SHOW USER;
SELECT * FROM SCOTT.EMP; -- 권한박탈 후 접근 불가
EXIT;

