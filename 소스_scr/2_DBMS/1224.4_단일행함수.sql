--[IV]
--�Լ� = �������Լ� + �׷��Լ�
SELECT ENAME,HIREDATE, TO_CHAR(HIREDATE, 'YY"��"MM"��"DD"��"DY"����"')
    FROM EMP;--������ �Լ�
SELECT ENAME, INITCAP(ENAME) FROM EMP; --�������Լ� 
SELECT SUM(SAL) FROM EMP;--������ �Լ�!�׷��Լ�! 
SELECT DEPTNO, SUM(SAL) FROM EMP GROUP BY DEPTNO;--�׷��Լ�

--EX.�����Լ�, �����Լ�, ��¥�Լ�, ����ȯ�Լ�, NVL(), ETC....
--(1)�����Լ� 
DESC DUAL; --����Ŭ���� �����ϴ� 1��1��¥�� DUMMY TABLE
SELECT ABS(-9) FROM DUAL;--���밪
SELECT FLOOR(34.5678) FROM DUAL;--�Ҽ������� ����
SELECT FLOOR(34.5678*10)/10 FROM DUAL;--�Ҽ��� ���ڸ����� ����
SELECT TRUNC (34.5678) FROM DUAL; --�Ҽ������� ���� 
SELECT TRUNC (34.5678,1) FROM DUAL; --�Ҽ��� ���ڸ����� ���� 
SELECT TRUNC (34.5678,-1) FROM DUAL; --���� �ڸ����� ����

--EMP ���̺��� �̸�, �޿�(���� �ڸ����� ����)���
SELECT ENAME, TRUNC(SAL,-2)FROM EMP;

--EMP ���̺��� �̸�, �޿�(���� �ڸ����� ����)���
SELECT ENAME, TRUNC(SAL,-1)FROM EMP;
SELECT CEIL(34.5678) FROM DUAL; --�Ҽ������� �ø�
SELECT ROUND(34.5678) FROM DUAL; --�Ҽ��������ݿø�
SELECT ROUND(34.5678,1) FROM DUAL; --�Ҽ��� ���ڸ����� �ݿø�
SELECT ROUND(34.5678,-1) FROM DUAL;--���� �ڸ����� �ݿø�

SELECT FLOOR(10/4) FROM DUAL;
SELECT MOD(9,2)FROM DUAL; --���������� 9������2�� 1
SELECT MOD('9',2)FROM DUAL;--9/2�� ������ 

--Ȧ���޿� �Ի��� �������� ��� �ʵ带 ���! 
SELECT * FROM EMP
    WHERE MOD(TO_CHAR(HIREDATE,'MM'),2)=1;
SELECT HIREDATE FROM EMP ;
    
--(2) ���ڰ����Լ� 
SELECT UPPER ('abcABC')FROM DUAL;
SELECT LOWER ('abcABC')FROM DUAL;
SELECT INITCAP('abcABC')FROM DUAL; --ù���ڸ� �빮�� �׵ڷδ� �ҹ��ڷ� ���! 
--JOB�� MANAGER�� ������ ��� �ʵ� 
SELECT * FROM EMP WHERE UPPER(JOB) ='MANAGER';
SELECT EMPNO, INITCAP(ENAME) FROM EMP;
SELECT 'AB'||'CD'||'EF'||'GH' FROM DUAL;
SELECT CONCAT(CONCAT('AB','CD'),CONCAT('EF','GH'))FROM DUAL;-- CONCAT�� ������ 2���ۿ� �ȵ�! 

--XXX�� XX��(�̸��� JOB�̴�)
SELECT ENAME||'��'||JOB||'�̴�' FROM EMP;
--SELECT CONCAT(CONCAT(ENAME,'��'),CONCAT(JOB,'�̴�'))FROM DUAL;

--SUBSTR(STR, ������ġ, ���ڰ���) ù��° ��ġ�� 1 
--SUSSTRB(STR, ������ġ, ���ڹ���Ʈ��) 
SELECT SUBSTR('WELCOM TO ORACLE', 3,2)FROM DUAL; --3��° ���ں��� 2����� L�� 3��°�̰� �װ��� �����ؼ� ��� LC! 
SELECT SUBSTRB('WELCOM TO ORACLE', 3,2)FROM DUAL;--3���� ���ں��� 2BYTE��� 

SELECT SUBSTR('�����ͺ��̽�',4,3)FROM DUAL;--4�������� ���� 3�� ���! 
SELECT SUBSTRB('�����ͺ��̽�',4,3)FROM DUAL;--4����BYTE����  3BYTE ���! 
--��� �ѹ��ڰ� 1BYTE, �ѱ� �ѹ��ڰ� 3BYTE 

--9���� �Ի��� ����� ��� �ʵ� 81/01/01
SELECT * FROM EMP WHERE SUBSTR(HIREDATE,4,2)='09';--TO_CHAR, LIKE, SUBSTR ������ 3����
SELECT SUBSTR('010-99-9999',-4,4)FROM DUAL;-- ��ȭ��ȣ �ڿ� ���ڸ�! 
--���ڰ������� 
--    1  2  3  4  5  6 
--   -6 -5 -4 -3 -2 -1
-- 9�Ͽ� �Ի��� ����� ��� �ʵ� 
SELECT * FROM EMP 
    WHERE SUBSTR(HIREDATE,-2,2)='09'; 
SELECT LENGTH('ABCD') FROM DUAL; --���� ����  -4
SELECT LENGTHB('ABCD') FROM DUAL;--���� BYTE��-4

SELECT LENGTH('�ȳ��ϼ���') FROM DUAL; --���� ����   -5
SELECT LENGTHB('�ȳ��ϼ���') FROM DUAL;--���� BYTE��-15
DESC DEPT;

--INSTR(str,ã������) ; STR���� ã�� ������ ��ġ (ù��°1��) ������ 0
--INSTR(str,ã������,������ġ) ; STR���� ������ġ���� ã�������� ��ġ (ù��°1��) ������ 0
SELECT INSTR('ABCABC','B') FROM DUAL;     --2
SELECT INSTR('ABCABC','B',3) FROM DUAL;   --5

--9���� �Ի��� ���( INSTR �̿�)
SELECT * FROM EMP WHERE INSTR(HIREDATE, '09')=4;

--9�Ͽ� �Ի��� ��� (INSTR �̿�) 81/12/09
SELECT * FROM EMP WHERE INSTR(HIREDATE, '09')=7;

--LPAD(����, �ڸ���, '#')-���ڸ� �ڸ�����ŭ Ȯ���ϰ� ���� ���ڸ��� #
SELECT LPAD('ORACLE',20,'#') FROM DUAL;--�̰� LEFT���ʿ� ���̴°�
SELECT RPAD('ORACLE',20,'*') FROM DUAL;--�̰� RIGHT�����ʿ� ���̴°� 
SELECT ENAME, LPAD(SAL,6,'*') FROM EMP;

--���,S****(�̸��� ���ѹ��ڸ� ����ϰ� �������� *)
SELECT EMPNO, RPAD(SUBSTR(ENAME,1,1),LENGTH(ENAME),'*') NAME FROM EMP;

--7369(���),S****(�̸�) 80/12/**(�Ի���)���
SELECT EMPNO, RPAD(SUBSTR(ENAME,1,1),LENGTH(ENAME),'*') NAME,
       RPAD(SUBSTR(HIREDATE,1,6),LENGTH(HIREDATE),'*') HIRE 
       FROM EMP;

--7369(���),****H(�̸�) 80/12/**(�Ի���)���
SELECT EMPNO, LPAD(SUBSTR(ENAME,-1,1),LENGTH(ENAME),'*') NAME,
       RPAD(SUBSTR(HIREDATE,1,6),LENGTH(HIREDATE),'*') HIRE 
       FROM EMP;

--�̸��� ������ �ڸ��� R�� ��� ���(INSTR, SUBSTR,LIKE)
SELECT * FROM EMP WHERE ENAME LIKE '__R%';
SELECT * FROM EMP WHERE INSTR(ENAME,'R')=3;
SELECT * FROM EMP WHERE SUBSTR(ENAME, 3, 1) = 'R';

SELECT TRIM  ('         ORCALE DB       ')FROM DUAL;
SELECT LTRIM ('         ORCALE DB       ')FROM DUAL;
SELECT RTRIM ('         ORCALE DB       ')FROM DUAL;

SELECT REPLACE (ENAME, 'A', 'XX') FROM EMP;-- A�� XX�� ��ȯ�ϱ�! 
SELECT ENAME FROM EMP;

-- 3)��¥ ���� �����, �Լ� 
SELECT SYSDATE FROM DUAL;--SYSDATE���� ���� ��¥�� ���ִ°Ծƴ϶� �����δ� ������ ��� ǥ������!
SELECT TO_CHAR(SYSDATE,'YY-MM-DD HH24:MI:SS') FROM DUAL;
SELECT SYSDATE-1,SYSDATE ����, SYSDATE+1 FROM DUAL;--��¥�� ������ ����  +1 -1�ϸ� ��¥�� ���ϰ� ���ش� 

--14�� �� 
SELECT SYSDATE+14 FROM DUAL;

--�̸�,�Ի���, �ٹ����� ���
SELECT ENAME, HIREDATE, FLOOR(SYSDATE-HIREDATE) "�ٹ�����" FROM EMP;
SELECT ENAME, HIREDATE, TRUNC(SYSDATE-HIREDATE) "�ٹ�����" FROM EMP;

--�̸�,�Ի���, �ٹ��ּ�,�ٹ����
SELECT ENAME, HIREDATE, TRUNC((SYSDATE-HIREDATE)/7) "�ٹ��ּ�" ,TRUNC((SYSDATE-HIREDATE)/365) "�ٹ����"FROM EMP;

--�̸�, �Ի���, �ٹ����� ��MONTHS_BETWEEN �� ��¥ ���̰� �� ���������� ��ȯ�Ѵ�
SELECT ENAME, HIREDATE, TRUNC(MONTHS_BETWEEN(SYSDATE,HIREDATE)) FROM EMP; --ABS�� �ؼ� ���밪�� �����ش�.

--ADD_MONTHS(Ư����¥, ���� �� )Ư���� ��¥�κ��� ��� ���� ���� 
--�̸�, �Ի���, �����Ⱓ������(�����Ⱓ�� 6����)
SELECT ENAME, HIREDATE, ADD_MONTHS(HIREDATE,6) "�����Ⱓ������" FROM EMP;

--NEXT_DAY(Ư����¥, '��') Ư����¥�κ��� ó�� �����ϴ� ������
SELECT NEXT_DAY(SYSDATE, '��Ѣ߲') FROM DUAL;

--LAST_DAY(Ư����¥); Ư����¥�� ���Ǹ���
--�̸�, �Ի���, ���޳�(������ ����)
SELECT ENAME,HIREDATE, LAST_DAY(HIREDATE) ���޳� FROM EMP;  

--ROUND; ��¥�ݿø�, TRUNC;��¥����
SELECT ROUND(SYSDATE-30,'YEAR')FROM DUAL; -- �����**�⵵ 1��1��
SELECT ROUND(SYSDATE-30,'MONTH')FROM DUAL; --�����**�⵵ ##��1��
SELECT ROUND(SYSDATE,'DAY')FROM DUAL;-- ����� ����� �Ͽ��� ��ȭ���� �Ͽ��Ϸ� ������ �Ͽ��Ϸ� 
SELECT ROUND(SYSDATE)FROM DUAL;--����� ����� 0�÷�

--ROUND; ��¥�ݿø�, TRUNC;��¥����
SELECT TRUNC(SYSDATE-30,'YEAR')FROM DUAL; -- �����**�⵵ 1��1��
SELECT TRUNC(SYSDATE-30,'MONTH')FROM DUAL; --�����**�⵵ ##��1��
SELECT TRUNC(SYSDATE,'DAY')FROM DUAL;-- ����� ����� �Ͽ��� ��ȭ���� �Ͽ��Ϸ� ������ �Ͽ��Ϸ�
SELECT TRUNC(SYSDATE)FROM DUAL;      -- ����� ���� 0��

--EX1.�̸�, �Ի���, �Ի��ϴ��� 1��
SELECT ENAME, HIREDATE, TRUNC(HIREDATE,'MONTH') FROM EMP;

--EX2.�̸�, �Ի���, ���޳�(25��)
SELECT ENAME, HIREDATE, SAL, ROUND(HIREDATE-9,'MONTH')+24   FROM EMP;

--EX3 �̸�, �Ի���, SAL(����), �̋����� ���� ������
SELECT ENAME �̸�, HIREDATE �Ի��� ,SAL ����, TRUNC(MONTHS_BETWEEN(SYSDATE,HIREDATE))*SAL ������ FROM EMP;

--EX4 �̸�, �Ի���, SAL, COMM, �̋����� ���� ����(SAL*12+COMM)
SELECT ENAME �̸�, HIREDATE �Ի���, SAL ����, COMM �󿩱�, TRUNC((SYSDATE-HIREDATE)/365)*(SAL*12+NVL(COMM,0)) FROM EMP;







