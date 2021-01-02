--[VI] SUB QUERY : QUERY�ȿ� QUERY�� ����
--��1.�������� ����
--�������� (1) �����༭������ (������������� ������)= > >= < <= != <>
       -- (2) �����༭������(������������� 2���̻�)IN ANY SOME ALL ...EXISTS
-- SCOTT�� �ٹ��ϴ� �μ��̸� ���
SELECT DNAME FROM EMP E, DEPT D 
    WHERE E.DEPTNO=D.DEPTNO AND ENAME='SCOTT';

SELECT * FROM DEPT;
SELECT DEPTNO FROM EMP WHERE ENAME='SCOTT';
SELECT DNAME FROM DEPT
    WHERE DEPTNO=(SELECT DEPTNO FROM EMP WHERE ENAME='SCOTT');--�������� 
-- JOB�� 'MANAGER'�� ����� �μ��̸� 
SELECT DEPTNO FROM EMP WHERE JOB='MANAGER'; --�����༭������
SELECT DNAME FROM DEPT
    WHERE DEPTNO IN(SELECT DEPTNO FROM EMP WHERE JOB='MANAGER');--�������� 
--��2.������ �������� 
-- ȸ�翡�� �޿��� ���� ���� �޴� ����� �̸��� �޿� 
SELECT MAX(SAL) FROM EMP;--��������(������,���Ͽ�)  ������ �������Լ��� �׷��Լ��� ���� �������� �׷���� �ؾ��ϴ°��������ÿ�
SELECT ENAME, SAL FROM EMP 
    WHERE SAL=(SELECT MAX(SAL) FROM EMP);
--SCOTT�� ���� �μ���ȣ�� ����̸� 
SELECT *FROM DEPT;
SELECT DEPTNO FROM EMP WHERE ENAME='SCOTT';--��������
SELECT ENAME FROM EMP
    WHERE DEPTNO=(SELECT DEPTNO FROM EMP WHERE ENAME='SCOTT')
        AND ENAME<>'SCOTT';
--SCOTT�� ���� �ٹ��� (50�� DALLAS �μ� ȫ�浿  �Է���)
SELECT *FROM EMP;
SELECT *FROM DEPT;
DESC EMP;
DESC DEPT;
INSERT INTO DEPT VALUES(50,'����ȸ��','DALLAS');
INSERT INTO EMP (EMPNO,ENAME,DEPTNO) VALUES (9999,'�浿',50);
SELECT LOC FROM DEPT D, EMP E
    WHERE D.DEPTNO=E.DEPTNO AND ENAME='SCOTT';--�������� 
SELECT ENAME FROM EMP E, DEPT D
    WHERE E.DEPTNO=D.DEPTNO AND 
    LOC=(SELECT LOC FROM DEPT D, EMP E
        WHERE D.DEPTNO=E.DEPTNO AND ENAME='SCOTT')
    AND ENAME<>'SCOTT';
--SCOTT�� ���� �μ��� �ٹ��ϴ� ������� �޿� ���� ��� //SCOTT�� ���� �μ��������� �κ�
SELECT DEPTNO FROM EMP WHERE ENAME='SCOTT';--��������
SELECT SUM(SAL) FROM EMP
    WHERE DEPTNO=(SELECT DEPTNO FROM EMP WHERE ENAME='SCOTT');
--SCOTT�� ������ JOB�� ���� ����� ��� ������ ���
SELECT * FROM EMP
    WHERE JOB=(SELECT JOB FROM EMP WHERE ENAME='SCOTT');
--DALLAS���� �ٹ��ϴ� ����� �̸�, �μ���ȣ�� ��� 
ROLLBACK;--DML��ɾ� ��� 
SELECT ENAME, DEPTNO FROM EMP
    WHERE DEPTNO IN (SELECT DEPTNO FROM DEPT WHERE LOC='DALLAS' );
SELECT * FROM DEPT;
--SALES(DNAME) �μ����� �ٹ��ϴ� ������ �̸�, �޿� 
SELECT ENAME, SAL FROM EMP
    WHERE DEPTNO=(SELECT DEPTNO FROM DEPT WHERE DNAME='SALES');
SELECT * FROM DEPT;
SELECT * FROM EMP;
-- 'KING'�� ���ӻ���� ����� �̸��� �޿� ���
SELECT ENAME, SAL FROM EMP
    WHERE MGR=(SELECT EMPNO FROM EMP WHERE ENAME='KING');
-- ��ձ޿� ���Ϸ� �޴� ����� �̸�, �޿��� ��� 
SELECT ENAME, SAL FROM EMP
    WHERE SAL<=(SELECT ROUND(AVG(SAL))FROM EMP);
-- SCOTT�� JOB�� �μ���ȣ�� ���� ������ ��� �ʵ� ��� (��������߿���������)
SELECT * FROM EMP
    WHERE (JOB, DEPTNO)= (SELECT JOB, DEPTNO FROM EMP WHERE ENAME='SCOTT');
    

--�� �� ��������
--1. ������̺��� ���� ���� �Ի��� ����� �̸�, �޿�, �Ի���
SELECT ENAME,SAL,HIREDATE FROM EMP
    WHERE HIREDATE=(SELECT MIN(HIREDATE) FROM EMP);
    
-- 2. ȸ�翡�� ���� �޿��� ���� ����� �̸�, �޿�
SELECT ENAME,SAL FROM EMP
    WHERE SAL=(SELECT MIN(SAL) FROM EMP);
    
-- 3. ȸ�� ��պ��� �޿��� ���� �޴� ����� �̸�, �޿�, �μ��ڵ�
SELECT ENAME, SAL ,DEPTNO FROM EMP  
    WHERE SAL>=(SELECT ROUND(AVG(SAL))FROM EMP);
    
--4. ȸ�� ��� ������ �޿��� �޴� ����� �̸�, �޿�, �μ���
SELECT ENAME,SAL,DEPTNO FROM EMP
    WHERE SAL<=(SELECT ROUND(AVG(SAL))FROM EMP);
    
--5. SCOTT���� ���� �Ի��� ����� �̸�, �޿�, �Ի���, �޿� ���
SELECT ENAME, SAL ,HIREDATE ,GRADE FROM EMP,SALGRADE
    WHERE HIREDATE <(SELECT HIREDATE FROM EMP WHERE ENAME='SCOTT') 
    AND SAL BETWEEN LOSAL AND HISAL;
    
--6. 5��(SCOTT���� ���� �Ի��� ����� �̸�, �޿�, �Ի���, �޿� ���)�� �μ��� �߰��ϰ� 
    --�޿��� ū �� ����
SELECT DEPTNO,ENAME, SAL ,HIREDATE ,GRADE,DNAME FROM EMP E,SALGRADE ,DEPT D
    WHERE HIREDATE <(SELECT HIREDATE FROM EMP WHERE ENAME='SCOTT') AND SAL BETWEEN LOSAL AND HISAL
    AND D.DEPTNO=E.DEPTNO
    ORDER BY SAL DESC;
    
--7. ������̺��� BLAKE ���� �޿��� ���� ������� ���, �̸�, �޿��� �˻�
SELECT DEPTNO, ENAME,SAL FROM EMP
    WHERE SAL>(SELECT SAL FROM EMP WHERE ENAME='BLAKE');
    
--8. ������̺��� MILLER���� �ʰ� �Ի��� ����� ���, �̸�, �Ի����� �˻��Ͻÿ�
SELECT DEPTNO, ENAME, HIREDATE FROM EMP
    WHERE HIREDATE>(SELECT HIREDATE FROM EMP WHERE ENAME='MILLER');

--9. ������̺��� �����ü ��� �޿����� �޿��� ���� ������� ���, �̸�, �޿��� �˻�
SELECT ENAME, SAL ,DEPTNO FROM EMP  
    WHERE SAL>(SELECT ROUND(AVG(SAL))FROM EMP);
    
--10. ������̺��� CLARK�� ���� �μ���, ����� 7698�� ������ �޿����� 
        -- ���� �޿��� �޴� ������� ���, �̸�, �޿� �˻�
SELECT DEPTNO,ENAME,SAL FROM EMP 
    WHERE DEPTNO=(SELECT DEPTNO FROM EMP WHERE ENAME='CLARK') 
    AND SAL>(SELECT SAL FROM EMP WHERE EMPNO='7698');
--10���� 11���� ���̴� �μ��� �μ��� ! 

--11.  �����ȭ. ������̺��� CLARK�� ���� �μ����̸�, ����� 7698�� ������ �޿����� 
    --  ���� �޿��� �޴� ������� ���, �̸�, �޿� �˻� 
SELECT DEPTNO,ENAME,SAL FROM EMP E, DEPT D 
    WHERE E. DEPTNO=(SELECT DEPTNO FROM EMP WHERE ENAME='CLARK') 
    AND D.DEPTNO=E.DEPTNO
    AND SAL>(SELECT SAL FROM EMP WHERE EMPNO='7698');

--12.  ��� ���̺��� BLAKE�� ���� �μ��� �ִ� ��� ����� �̸��� �Ի����ڸ� ����ϴ� SELECT���� �ۼ��Ͻÿ�.
SELECT ENAME,HIREDATE FROM EMP
    WHERE DEPTNO=(SELECT DEPTNO FROM EMP WHERE ENAME='BLAKE');

--13.  ��� ���̺��� ��� �޿� �̻��� �޴� ��� �������� ���ؼ� �����ȣ�� �̸��� ���
        --(�� �޿��� ���� ������ ����Ͽ���.)
SELECT EMPNO, ENAME FROM EMP
    WHERE SAL>(SELECT AVG(SAL) FROM EMP)
    ORDER BY SAL DESC;


--�� 3.������ ��������; IN, ALL, ANY=SOME, EXISTS
--(1) IN; �������� ����� �ϳ��� ��ġ�ϸ� ��!
--�μ����� �Ի����� ���� ���� ����� �μ���ȣ, �̸�, �Ի��� ���
SELECT  DEPTNO, MAX(HIREDATE) FROM EMP GROUP BY DEPTNO;--����
SELECT EMPNO, ENAME, HIREDATE ,DEPTNO FROM EMP
    WHERE (DEPTNO,HIREDATE) IN (SELECT  DEPTNO, MAX(HIREDATE)      
                                FROM EMP GROUP BY DEPTNO);
--�޿��� 3000�̻� �޴� ��� �Ҽӵ� �μ����� �ٹ��ϴ� ������� �������
SELECT * FROM EMP 
    WHERE DEPTNO IN(SELECT DEPTNO FROM EMP WHERE SAL>=3000);--�������߿� �ϳ��� ����ϰ��� �Ҷ� ! 
--(2) ALL
--30�� �μ� �ִ� �޿����� �޿��� �޴� ����� ����
SELECT * FROM EMP 
    WHERE SAL>(SELECT MAX(SAL) FROM EMP WHERE DEPTNO='30');
SELECT * FROM EMP
    WHERE SAL >ALL (SELECT SAL FROM EMP WHERE DEPTNO ='30');
--(3) ANY=SOME 
SELECT * FROM EMP
    WHERE SAL >ANY (SELECT SAL FROM EMP WHERE DEPTNO ='30');
SELECT * FROM EMP
    WHERE SAL >(SELECT MIN(SAL) FROM EMP WHERE DEPTNO= '30');
--(4) EXISTS; �������� ����� �����ϸ� ��
--���Ӻ��ϰ� �ִ� �������� ���,�̸�,�޿�
SELECT EMPNO,ENAME,SAL 
    FROM EMP M
    WHERE EXISTS(SELECT * FROM EMP W WHERE M.EMPNO=W.MGR);
--���ܻ���� ��� �ʵ� ���� ���
SELECT * FROM EMP M
    WHERE NOT EXISTS(SELECT * FROM EMP  WHERE M.EMPNO=MGR);

--�μ����� ���� �޿��� ���� �޴� ����� ���, �̸� ,�޿� ,�μ���ȣ
SELECT DEPTNO, MAX(SAL) FROM EMP GROUP BY DEPTNO;
SELECT EMPNO, ENAME, SAL, DEPTNO 
    FROM EMP
    WHERE (DEPTNO,SAL) IN (SELECT DEPTNO, MAX(SAL) FROM EMP GROUP BY DEPTNO);

---------------------------------------------------------------------------
--������(JOB)�� MANAGER�� ����� ���� �μ��� �μ� ��ȣ�� �μ���� ������ ���(IN)
SELECT * FROM DEPT;
SELECT * FROM EMP;
SELECT E.DEPTNO, DNAME ,LOC FROM EMP E,DEPT D 
    WHERE E.DEPTNO=D.DEPTNO AND JOB='MANAGER' ;  --JOIN
    
SELECT DEPTNO, DNAME, LOC FROM DEPT
    WHERE DEPTNO IN (SELECT DEPTNO FROM EMP WHERE JOB='MANAGER');--SUB QUERY

--�ڿ����� 3000�̻��� ����� �� ���� ����� ����� �ش� ��޺� �ְ� ������ �޴� ������� ���, �̸�, ����, �Ի���, �޿�, �޿������ ���
SELECT EMPNO,ENAME,JOB,HIREDATE,SAL,GRADE
    FROM EMP, SALGRADE
    WHERE SAL  BETWEEN LOSAL AND HISAL AND
    (GRADE,SAL)IN
        (SELECT GRADE,MAX(SAL)FROM EMP, SALGRADE
            WHERE SAL BETWEEN LOSAL AND HISAL AND
            SAL>=3000 GROUP BY GRADE);

--�������ȭ : �Ի��� �б⺰�� ���� ���� ������ �޴� ������� �б�, ���, �̸�, JOB, �����, �Ի���, �޿�, �󿩸� ����ϼ���
SELECT HIREDATE, CEIL(EXTRACT(MONTH FROM HIREDATE)/3) QUARTER FROM EMP;

SELECT  CEIL(EXTRACT(MONTH FROM HIREDATE)/3) QUARTER,MAX(SAL)
    FROM EMP
    GROUP BY  CEIL(EXTRACT(MONTH FROM HIREDATE)/3);

SELECT CEIL(EXTRACT(MONTH FROM HIREDATE)/3) QUARTER,EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM
    FROM EMP
    WHERE(CEIL(EXTRACT(MONTH FROM HIREDATE)/3),SAL) IN
        (SELECT CEIL(EXTRACT(MONTH FROM HIREDATE)/3),MAX(SAL)
        FROM EMP
        GROUP BY CEIL(EXTRACT(MONTH FROM HIREDATE)/3))
    ORDER BY QUARTER;

--SALESMAN ��� ����� ���� �޿��� ���� �޴� ������� �̸��� �޿��� ����(��� ����)�� ����ϵ� ���� ����� ������� �ʴ´�.(ALL�̿�)
SELECT * FROM EMP 
    WHERE SAL >ALL(SELECT SAL FROM EMP WHERE JOB='SALESMAN')AND JOB <>'SALESMAN';
 
--SALESMAN �Ϻ� � �� ������� �޿��� ���� �޴� ������� �̸��� �޿��� ����(��� ����)�� ����ϵ� ���� ����� ���(ANY)
SELECT * FROM EMP 
    WHERE SAL >ANY(SELECT SAL FROM EMP WHERE JOB='SALESMAN');
    
--������ 3000�̸��� ��� �߿� ���� �ֱٿ� �Ի��� ����� �����ȣ�� �̸�, ����, �Ի����� ���
SELECT EMPNO,SAL,HIREDATE FROM EMP
    WHERE HIREDATE = (SELECT MAX(HIREDATE) FROM EMP WHERE SAL<3000);
    
SELECT EMPNO,SAL,HIREDATE FROM EMP
    WHERE HIREDATE >= ALL (SELECT HIREDATE FROM EMP WHERE SAL<3000);   
    
--������ ��SALESMAN���� ����� �޴� �޿��� �ּ� �޿����� ���� �޴� ������� �̸�, �޿�, ����, �μ���ȣ�� ����ϵ� �μ���ȣ�� 20���� ����� �����Ѵ�(ANY ������ �̿�)
SELECT * FROM EMP;
SELECT ENAME,SAL,JOB,DEPTNO
    FROM EMP
    WHERE SAL > (SELECT MIN(SAL) FROM EMP WHERE DEPTNO!=20);

SELECT ENAME,SAL,JOB,DEPTNO
    FROM EMP
    WHERE SAL > ANY(SELECT SAL FROM EMP WHERE DEPTNO!=20);
----------------------    
SELECT EMPNO,ENAME,JOB,HIREDATE,SAL,GRADE
    FROM EMP, SALGRADE
    WHERE SAL  BETWEEN LOSAL AND HISAL AND
    (GRADE,SAL)IN
        (SELECT GRADE,MAX(SAL)FROM EMP, SALGRADE
            WHERE SAL BETWEEN LOSAL AND HISAL AND
            SAL>=3000 GROUP BY GRADE);
-----------------------
SELECT DEPTNO, DNAME, LOC FROM DEPT
    WHERE DEPTNO IN (SELECT DEPTNO FROM EMP WHERE JOB='MANAGER');--SUB QUERY
--������ �������� �ѿ�������
-- 14. ��� ���̺��� �̸��� ��T���� �ִ� ����� �ٹ��ϴ� �μ����� �ٹ��ϴ� ��� �������� ����
    --��� ��ȣ,�̸�,�޿��� ����ϴ� SELECT���� �ۼ��Ͻÿ�. �� �����ȣ ������ ����Ͽ���.
SELECT * FROM EMP;
SELECT EMPNO,ENAME,JOB FROM EMP 
    WHERE (DEPTNO,ENAME) IN (SELECT DEPTNO,ENAME FROM EMP 
                                WHERE ENAME LIKE '%T%');
                                
-- 15. ��� ���̺��� �μ� ��ġ�� Dallas�� ��� �������� ���� �̸�,����,�޿��� ���
SELECT ENAME, JOB , SAL FROM EMP 
    WHERE DEPTNO =(SELECT DEPTNO FROM DEPT WHERE LOC ='DALLAS');

-- 16. EMP ���̺��� King���� �����ϴ� ��� ����� �̸��� �޿��� ����ϴ� SELECT��
SELECT * FROM EMP;
SELECT * FROM DEPT;
SELECT ENAME, JOB FROM EMP 
    WHERE MGR=(SELECT EMPNO FROM EMP WHERE ENAME='KING' );

-- 17. ��� ���̺��� SALES�μ� ����� �̸�,������ ����ϴ� SELECT���� �ۼ��Ͻÿ�.
SELECT ENAME, JOB FROM EMP
    WHERE DEPTNO IN(SELECT DEPTNO FROM EMP WHERE JOB='SALESMAN');

-- 18. ��� ���̺��� ������ �μ� 30�� ���� ���޺��� ���� ����� ���
SELECT ENAME FROM EMP
    WHERE SAL>(SELECT MIN(SAL) FROM EMP WHERE DEPTNO='30');

SELECT ENAME FROM EMP
    WHERE SAL>ANY (SELECT SAL FROM EMP WHERE DEPTNO='30');
    
-- 19. �μ� 10���� �μ� 30�� ����� ���� ������ �ð� �ִ� ����� �̸��� ������ ���
SELECT * FROM EMP;
SELECT ENAME, JOB FROM EMP
    WHERE JOB IN(SELECT JOB FROM EMP WHERE DEPTNO=30) AND DEPTNO=10;

-- 20. ��� ���̺��� FORD�� ������ ���޵� ���� ����� ��� ������ ���
SELECT * FROM EMP
    WHERE SAL=(SELECT SAL FROM EMP WHERE ENAME='FORD') 
    AND JOB=(SELECT JOB FROM EMP WHERE ENAME='FORD')AND ENAME!='FORD';

-- 21. �̸��� JONES�� ������ JOB�� ���ų� 
    --������ FORD ���� �̻��� ����� ������ �̸�,����,�μ���ȣ,�޿��� ����ϴ� SELECT���� �ۼ�.
    -- ��, ������ ���ĺ� ��, ������ ���� ������ ����Ͽ���.
SELECT ENAME, JOB, DEPTNO, SAL FROM EMP
    WHERE JOB=(SELECT JOB FROM EMP WHERE ENAME ='FORD') 
    OR SAL>(SELECT SAL FROM EMP WHERE ENAME = 'FORD')
    ORDER BY JOB, SAL DESC;


-- 22. ��� ���̺��� SCOTT �Ǵ� WARD�� ������ ���� ����� ������ �̸�,����,�޿��� ����ϴ� SELECT���� �ۼ��Ͻÿ�.
SELECT ENAME, JOB, SAL FROM EMP
    WHERE JOB =(SELECT JOB FROM EMP WHERE ENAME='SCOTT')
    OR SAL=(SELECT SAL FROM EMP WHERE ENAME='WARD');

-- 23. ��� ���̺��� CHICAGO���� �ٹ��ϴ� ����� ���� ������ �ϴ� ������� �̸�,������ ����ϴ� SELECT���� �ۼ��Ͻÿ�.
SELECT ENAME, JOB FROM EMP
    WHERE JOB IN (SELECT JOB FROM EMP E ,DEPT D
                WHERE E.DEPTNO=D.DEPTNO
                AND LOC='CHICAGO')  ;

-- 24. ��� ���̺��� �μ����� ������ ��� ���޺��� ���� ����� �����ȣ,�̸�,�޿��� ����ϴ� SELECT���� �ۼ��Ͻÿ�.
SELECT EMPNO, ENAME, SAL , DEPTNO
    FROM EMP E
    WHERE SAL>(SELECT AVG(SAL) FROM EMP WHERE DEPTNO=E.DEPTNO);
    
-- 25. ��� ���̺��� �������� ������ ��� ���޺��� ���� ����� �μ���ȣ,�̸�,�޿��� ����ϴ� SELECT���� �ۼ��Ͻÿ�.
SELECT DEPTNO, ENAME, SAL 
    FROM EMP E
    WHERE SAL<(SELECT AVG(SAL) FROM EMP WHERE JOB=E.JOB);

-- 26 ��� ���̺��� ��� �� �� �̻����κ��� ���� ���� �� �ִ� ����� ����,�̸�,�����ȣ,�μ���ȣ�� ���(��, �μ���ȣ ������ �������� ����)
SELECT EMPNO,ENAME,SAL,DEPTNO
    FROM EMP M
    WHERE EXISTS(SELECT * FROM EMP W WHERE M.EMPNO=W.MGR);

-- 27. ��� ���̺��� ���� ����� �����ȣ, �̸�, ����, �μ���ȣ�� ����ϴ� SELECT���� �ۼ��Ͻÿ�
SELECT * FROM EMP M
    WHERE NOT EXISTS(SELECT * FROM EMP  WHERE M.EMPNO=MGR);


























