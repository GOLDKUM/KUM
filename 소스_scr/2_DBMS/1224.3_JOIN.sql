-- [III] JOIN:���̺��� 2���̻�, �����Ͽ� �˻�
SELECT * FROM EMP WHERE ENAME='SCOTT';--�μ���ȣ (DEPNO):20
SELECT * FROM DEPT;

--CROSS JOIN (FROEM���� ���̺� 2�� �̻�)
SELECT * FROM EMP,DEPT WHERE ENAME='SCOTT';

--EQUI JOIN(���� �ʵ��� DEPTNO���� ��ġ�Ǵ� ���Ǹ� JOIN)
SELECT * FROM EMP,DEPT 
    WHERE ENAME='SCOTT' AND EMP.DEPTNO=DEPT.DEPTNO;
SELECT * FROM EMP , DEPT WHERE EMP.DEPTNO=DEPT.DEPTNO;

--��� ����� �̸�, �μ���, �μ���ȣ�� ����Ѵ�.
SELECT * FROM DEPT;
--SELECT ENAME "NAME", DNAME, EMP.DEPTNO FROM EMP E, DEPT D 
    --WHERE EMP.DEPTNO=DEPT.DEPTNO;       �ʵ� ���Ϸ����� �װ��ص��ǰ� �ʵ��̸��ص��ǰ�    ���̺� ���Ϸ����� ������ ���Ϸ���!
    
SELECT ENAME , DNAME, E.DEPTNO FROM EMP E, DEPT D 
    WHERE E.DEPTNO=D.DEPTNO;
SELECT E.*,DNAME,LOC 
    FROM EMP E, DEPT D WHERE E.DEPTNO=D.DEPTNO;

--���, �̸�, �μ���ȣ, �μ��̸�, �ٹ���
SELECT EMPNO, ENAME, E.DEPTNO, DNAME, LOC
    FROM EMP E, DEPT D 
    WHERE E.DEPTNO=D.DEPTNO;
    
--�޿� 2000�̻��� ������ �̸�, ����, �޿� ,�μ��� ,�ٹ��� �ʵ� ���
SELECT ENAME, JOB, SAL, DNAME, LOC 
    FROM EMP E, DEPT D
    WHERE E.DEPTNO=D.DEPTNO AND SAL>=2000;

--LOC�� CHICAHO�� ����� �̸�, ����, �μ���, �ٹ��� ��� 
SELECT ENAME, JOB, DNAME, LOC FROM EMP E, DEPT D 
    WHERE E.DEPTNO=D.DEPTNO AND D.LOC='CHICAGO';


--�μ���ȣ�� 10 �Ǵ� 20�� ����� �̸�, ����, �ٹ��� ���(�޿��� ����)
SELECT ENAME,JOB,LOC FROM EMP E, DEPT D
    WHERE E.DEPTNO=D.DEPTNO AND E.DEPTNO IN(10,20)
    ORDER BY SAL;

--�̸�, �޿�, �󿩱�(COMM), ����(SAL +COMM)*12, �μ���,�ٹ���
SELECT ENAME, COMM, (SAL+NVL(COMM,0))*12 "����" , DNAME, LOC 
    FROM EMP E, DEPT D 
    WHERE E.DEPTNO=D.DEPTNO;

--�̸�, �޿�, �󿩱�(COMM), ����(SAL +COMM)*12, �μ���,�ٹ���
-- JOB�� SALESMAN �Ǵ� MANAGER�� ����� (������ ū�� ����)
SELECT ENAME, COMM, (SAL+NVL(COMM,0))*12 "����" , DNAME, LOC 
    FROM EMP E, DEPT D 
    WHERE E.DEPTNO=D.DEPTNO 
    --JOB IN (UPPER('SALESMAN'), UPPER('MANAGER')) --UPPER�� ��ҹ��� ��������! 
    AND UPPER(JOB) IN ('SALESMAN', 'MANAGER')
    ORDER BY ���� DESC;
SELECT * FROM DEPT;

--COMM�� NULL�̰� �޿��� 1200�̻��� ����� �̸�,�޿�,�Ի���, �μ���ȣ, 
--�μ���(�μ����, �޿�ū�� ����)
SELECT ENAME �̸�, SAL �޿�, HIREDATE �Ի���, E.DEPTNO �μ���ȣ,DNAME �μ��� 
    FROM EMP E, DEPT D 
    WHERE E.DEPTNO=D.DEPTNO
    AND COMM IS NULL AND SAL>=1200
    ORDER BY DNAME, SAL DESC;

--EQUI JOIN���� 






















