--[V]�׷��Լ� SUM,AVG,MIN,MAX,COUNT,STDDEVǥ������,VARIANCE�л�
SELECT ENAME,ROUND(SAL,-3)FROM EMP;--�������Լ�
SELECT SUM(SAL)FROM EMP;--�׷��Լ�
SELECT ENAME, SUM (SAL) FROM EMP;--�׷��Լ��� ������� ���� �� �� ����! 
SELECT DEPTNO, SUM(SAL) FROM EMP GROUP BY DEPTNO;--������� �׷��Լ��� ���� ������ ������ GROUP BY�� �ʼ��̴�! 
--EMP���̺��� ��� SAL
SELECT ROUND(AVG(SAL),2) FROM EMP;
SELECT COUNT(*) FROM EMP;--COUNT ���! --�ο�(��)��!
SELECT TRUNC(AVG(SAL)), TRUNC(SUM(SAL)/COUNT(SAL)) FROM EMP;
SELECT AVG(COMM) FROM EMP; -- �׷��Լ��� NULL���� ����! 
SELECT COUNT(COMM),SUM(COMM),AVG(COMM) FROM EMP; -- NULL���� ��� �����ϰ� ���� ���� 4��! 
--EMP���̺��� SAL�� ���,��,�ּҰ�,�ִ밪 �л� ,ǥ������
SELECT ROUND(AVG(SAL)),SUM(SAL),MIN(SAL),MAX(SAL),
    ROUND(VARIANCE(SAL)),ROUND(STDDEV(SAL))FROM EMP;
--�μ���ȣ�� �޿� �ִ�ġ 
SELECT DEPTNO �μ���ȣ,MAX(SAL)   
    FROM EMP 
    GROUP BY DEPTNO
    ORDER BY �μ���ȣ;--GROUP BY������ �ʵ��� ��Ī�� �� �� ����! 
-- �׷��Լ��� ������, ������, ��¥�� ��� ��밡�� 
-- �μ����� �����Ի�⵵�� ����غ��ÿ� 
SELECT * FROM EMP;
SELECT * FROM DEPT;
SELECT DEPTNO, MIN(HIREDATE),MAX(HIREDATE) FROM EMP
    GROUP BY DEPTNO;
SELECT MIN(ENAME),MAX(ENAME) FROM EMP;--A�� ���� ����� �ܾ MIN Z�� ���� ����� �ܾ MAX 
SELECT COUNT(JOB) FROM EMP;--JOB�ʵ��� ����! 
SELECT COUNT(DISTINCT JOB) FROM EMP;

--	���� �ֱٿ� �Ի��� ����� �Ի��ϰ� �Ի����� ���� ������ ����� �Ի����� ���. 
--(���) 80/12/17:14620��° 83/01/12:13864��°
SELECT MIN(HIREDATE)||'�����Ի�:'||TRUNC (SYSDATE-MIN(HIREDATE))||'�Ϥ�'||
        MAX(HIREDATE)||'�ֱ��Ի�:'||TRUNC(SYSDATE-MAX(HIREDATE))||'��°' FROM EMP;	
        
--(���) 80��12��17�� �����Ի�  :14,620��° 83��01��12�� �ֱ��Ի� :13,864��°?	
SELECT MIN(HIREDATE)||'�����Ի�:'||TO_CHAR(TRUNC (SYSDATE-MIN(HIREDATE)),'99,999')||'�Ϥ�'||
        MAX(HIREDATE)||'�ֱ��Ի�:'||TO_CHAR(TRUNC(SYSDATE-MAX(HIREDATE)),'99,999')||'��°' FROM EMP;	

--10�� �μ� �Ҽ��� ����� ��ձ޿�
SELECT AVG(SAL) FROM EMP WHERE DEPTNO=10;
SELECT DEPTNO, ROUND(AVG(SAL)) FROM EMP GROUP BY DEPTNO;

--��2. GROUP BY ��
--EX.�μ��� �ִ� �޿�
SELECT DEPTNO,MAX(SAL) FROM EMP GROUP BY DEPTNO;

--�μ��� �����, �ִ�޿�, �ּ� �޿�, ��ձ޿� 
SELECT DEPTNO, COUNT(*),MAX(SAL),MIN(SAL), AVG(SAL) FROM EMP 
    GROUP BY DEPTNO;
    
--�μ��� �����, �ִ�޿�, �ּұ޿�, ��ձ޿�
SELECT DNAME,COUNT(*),MAX(SAL),MIN(SAL),ROUND(AVG(SAL))
    FROM EMP E ,DEPT D
    WHERE E.DEPTNO=D.DEPTNO
    GROUP BY DNAME;--�׷��Լ��̸��� �տ� �̸��� �� ���ƾ���
    
SELECT DEPTNO, JOB, SUM(SAL) FROM EMP
    GROUP BY DEPTNO,JOB
    ORDER BY DEPTNO;

--��3.HAVING ����(�׷��Լ� ����� ����)
--DEPTNO���� ��ձ޿�(��ձ޿��� 2000�̻��� �μ��� ���)
SELECT DEPTNO, ROUND(AVG(SAL)) FROM EMP   
        GROUP BY DEPTNO
        HAVING AVG(SAL)>2000;--WHERE������ �׷��Լ��� ���� ������ �ȵǿ� 

SELECT * FROM EMP;

SELECT ENAME, HIREDATE FROM EMP
    WHERE HIREDATE = (SELECT MAX(HIREDATE) FROM EMP);--��������(VI) 
    
SELECT MAX(HIREDATE) FROM EMP;
SELECT ENAME, MAX(HIREDATE) FROM EMP GROUP BY ENAME;

--��4.�ǹ����̺�
SELECT DEPTNO, JOB, SUM(SAL) FROM EMP 
    GROUP BY DEPTNO,JOB
    ORDER BY DEPTNO;
SELECT * FROM EMP;
--1�ܰ�
SELECT DEPTNO, DECODE(JOB,'CLERK',SAL,0)"CLEAKR",
               DECODE(JOB,'MANAGER',SAL,0)"MANAGER",
               DECODE(JOB,'PRESIDENT',SAL,0)"PRESIDENT",
               DECODE(JOB,'ANALYST',SAL,0)"ANALYST",
               DECODE(JOB,'SALESMAN',SAL,0)"SALESMAN" FROM EMP;
       
--2�ܰ�
SELECT DEPTNO, SUM(DECODE(JOB,'CLERK',SAL,0))"CLEAKR",
               SUM(DECODE(JOB,'MANAGER',SAL,0))"MANAGER",
               SUM(DECODE(JOB,'PRESIDENT',SAL,0))"PRESIDENT",
               SUM(DECODE(JOB,'ANALYST',SAL,0))"ANALYST",
               SUM(DECODE(JOB,'SALESMAN',SAL,0))"SALESMAN" FROM EMP
               GROUP BY DEPTNO;--�ǹ����̺�!
--3�ܰ�: �հ��߰�
SELECT DEPTNO, SUM(DECODE(JOB,'CLERK',SAL,0))"CLEAKR",
               SUM(DECODE(JOB,'MANAGER',SAL,0))"MANAGER",
               SUM(DECODE(JOB,'PRESIDENT',SAL,0))"PRESIDENT",
               SUM(DECODE(JOB,'ANALYST',SAL,0))"ANALYST",
               SUM(DECODE(JOB,'SALESMAN',SAL,0))"SALESMAN", 
               SUM(SAL) "�μ��� �Ұ�"
            FROM EMP
            GROUP BY ROLLUP (DEPTNO);--�ǹ����̺�!
--ROLLUP
SELECT JOB, AVG(SAL) FROM EMP GROUP BY ROLLUP(JOB);
SELECT DEPTNO,JOB,AVG(SAL) FROM EMP GROUP BY ROLLUP (DEPTNO,JOB);

SELECT DEPTNO, SUM(SAL) FROM EMP GROUP BY DEPTNO;
SELECT DEPTNO, SUM(SAL) FROM EMP GROUP BY ROLLUP (DEPTNO) ;            --�հ��߰� 
               

-- ��<�� ��������>

-- 1. ��� ���̺��� �ο���,�ִ� �޿�,�ּ� �޿�,�޿��� ���� ����Ͽ� ���
SELECT COUNT(*),MAX(SAL),MIN(SAL),SUM(SAL) FROM EMP;

-- 2. ������̺��� ������ �ο����� ���Ͽ� ����ϴ� SELECT ������ �ۼ��Ͽ���.
SELECT JOB ,COUNT(*)FROM EMP
    GROUP BY JOB;

-- 3. ������̺��� �ְ� �޿��� �ּ� �޿��� ���̴� ���ΰ� ����ϴ� SELECT������ �ۼ��Ͽ���.
SELECT MAX(SAL)-MIN(SAL) FROM EMP;

-- 4. �� �μ����� �ο���, �޿� ���, ���� �޿�, �ְ� �޿�, �޿��� ���� ����ϵ� �޿��� ���� ���� ������ ����϶�.
SELECT DEPTNO,COUNT(8),ROUND(AVG(SAL)),MIN(SAL),MAX(SAL),SUM(SAL)
    FROM EMP
    GROUP BY DEPTNO
    ORDER BY SUM(SAL) DESC;

-- 5. �μ���, ������ �׷��Ͽ� ����� �μ���ȣ, ����, �ο���, �޿��� ���, �޿��� ���� 
    --���Ͽ� ����϶�(��°���� �μ���ȣ, ���������� �������� ����)
SELECT DEPTNO,JOB,COUNT(*),ROUND(AVG(SAL)),SUM(SAL)
    FROM EMP
    GROUP BY DEPTNO,JOB
    ORDER BY DEPTNO DESC, JOB DESC;

-- 6. ������, �μ��� �׷��Ͽ� �����  ����, �μ���ȣ, �ο���, �޿��� ���, �޿��� ���� ���Ͽ� 
-- ����϶�.(��°���� ������, �μ���ȣ �� �������� ����)
SELECT JOB, DEPTNO,COUNT(*),ROUND(AVG(SAL)),SUM(SAL)
    FROM EMP
    GROUP BY JOB, DEPTNO
    ORDER BY JOB DESC, DEPTNO DESC;

--7. ������� 5���̻� �Ѵ� �μ���ȣ�� ������� ����Ͻÿ�.
SELECT * FROM EMP;
SELECT DEPTNO, COUNT(*)
    FROM EMP
    GROUP BY DEPTNO
    HAVING COUNT(*)>4;

--8. ������� 5���̻� �Ѵ� �μ���� ������� ����Ͻÿ�
SELECT * FROM EMP;
SELECT DEPTNO, COUNT(*)
    FROM EMP
    GROUP BY DEPTNO
    HAVING COUNT(*)>4;

--9. ��� ���̺��� ������ �޿��� ����� 3000�̻��� ������ ���ؼ� ������, ��� �޿�, 
--�޿��� ���� ���Ͽ� ����϶�
SELECT * FROM EMP;
SELECT JOB, ROUND(AVG(SAL)),SUM(SAL)
    FROM EMP
    GROUP BY JOB
    HAVING ROUND(AVG(SAL))>=3000;
    
--10. ������̺��� �޿����� 5000�� �ʰ��ϴ� �� ������ ���ؼ� ������ �޿��հ踦 ����϶� 
        --��, �޿� �հ�� �������� �����϶�.
SELECT JOB, SUM(SAL)
    FROM EMP
    GROUP BY JOB
    HAVING SUM(SAL)>5000;

--11. �μ��� �޿����, �μ��� �޿��հ�, �μ��� �ּұ޿��� ����϶�.
SELECT DEPTNO �μ���, ROUND(AVG(SAL))�޿����, SUM(SAL)�޿��հ�, MIN(SAL) �ּұ޿�
    FROM EMP
    GROUP BY DEPTNO;

--12. ���� 11���� �����Ͽ�, �μ��� �޿���� �ִ�ġ, �μ��� �޿����� �ִ�ġ, 
            --�μ��� �ּұ޿��� �ִ�ġ�� ����϶�.
SELECT MAX(ROUND(AVG(SAL)))�޿����, MAX(SUM(SAL))�޿��հ�, MAX(MIN(SAL)) �ּұ޿�
    FROM EMP
    GROUP BY DEPTNO;

--13. ��� ���̺��� �Ʒ��� ����� ����ϴ� SELECT ������ �ۼ��Ͽ���.(�⵵�� ������)
--   H_YEAR	COUNT(*)	MIN(SAL)	MAX(SAL)	AVG(SAL)	SUM(SAL)
--     80	  1		    800		    800		    800		    800
--	81	 10		    950		    5000	    2282.5	  22825
--	82	  2		    1300	    3000	   2150		   4300
--	83	  1		    1100	    1100	    1100	   1100
SELECT SUBSTR(HIREDATE,1,2), COUNT(*),MIN(SAL),MAX(SAL),AVG(SAL),SUM(SAL)
    FROM EMP
    GROUP BY SUBSTR(HIREDATE,1,2)
    ORDER BY SUBSTR(HIREDATE,1,2);

-- 14.  ������̺��� �Ʒ��� ����� ����ϴ� SELECT �� �ۼ�
-- TOTAL	1980	1981	1982	1983
--  14		  1	     10	      2	      1
SELECT SUBSTR(TO_CHAR(HIREDATE,'YYYY-MM-DD'),1,4)���, COUNT(*) TOTAL  FROM EMP
    GROUP BY ROLLUP(SUBSTR(TO_CHAR(HIREDATE,'YYYY-MM-DD'),1,4))
    ORDER BY SUBSTR(TO_CHAR(HIREDATE,'YYYY-MM-DD'),1,4);


--15. ������̺��� �Ʒ��� ����� ����ϴ� SELECT �� �ۼ�(JOB ������ �������� ����)
-- JOB��, DEPTNO�� SUM(SAL)
--JOB		DEPTNO10	DEPTNO20	DEPTNO30     TOTAL
--ANALYST	     0		   6000		    0		6000
--CLERK		  1300		   1900		  950		4150
--��.
--SALESMAN	      0	 		0	 5600		 5600
SELECT * FROM EMP;
SELECT JOB, SUM(DECODE(DEPTNO,10,SAL,0))"DEPTNO10",
            SUM(DECODE(DEPTNO,20,SAL,0))"DEPTNO20",
            SUM(DECODE(DEPTNO,30,SAL,0))"DEPTNO30",
            SUM(SAL) TOTAL
            FROM EMP
            GROUP BY ROLLUP(JOB);
            

        
--16. ������̺��� �ִ�޿�, �ּұ޿�, ��ü�޿���, ����� ���Ͻÿ�
SELECT MAX(SAL),MIN(SAL),SUM(SAL),ROUND(AVG(SAL))
    FROM EMP;

--17. ������̺��� �μ��� �ο����� ���Ͻÿ�
SELECT DEPTNO, COUNT(*)
    FROM EMP
    GROUP BY DEPTNO;

--18. ��� ���̺��� �μ��� �ο����� 6���̻��� �μ��ڵ带 ���Ͻÿ�
SELECT DEPTNO, COUNT(*)
    FROM EMP
    GROUP BY DEPTNO
    HAVING COUNT(*)>=6;

--19. ������̺��� ������ ���� ����� ������ �Ͻÿ�
--DNAME               CLERK    MANAGER     PRESIDENT    ANALYST   SALESMAN
--ACCOUNTING            1300       2450       5000          0          0
--RESEARCH              1900       2975          0       6000          0
--SALES                 950        2850          0          0       5600
SELECT * FROM EMP;
SELECT DNAME, SUM(DECODE(JOB,'CLERK',SAL,0))"CLEAKR",
              SUM(DECODE(JOB,'MANAGER',SAL,0))"MANAGER",
              SUM(DECODE(JOB,'PRESIDENT',SAL,0))"PRESIDENT",
              SUM(DECODE(JOB,'ANALYST',SAL,0))"ANALYST",
              SUM(DECODE(JOB,'SALESMAN',SAL,0))"SALESMAN" FROM EMP E,DEPT D
              WHERE E.DEPTNO=D.DEPTNO
              GROUP BY ROLLUP (DNAME);

--20.  ������̺��� �޿��� ���� ������� ����� �ο��Ͽ� ������ ���� ����� ������ �Ͻÿ�. 
-- (��Ʈ self join, group by, count���)
--ENAME	    ���
--________________________
--KING		1
--SCOTT		2
--����
SELECT E1.ENAME, E1.SAL,E2.ENAME,E2.SAL
    FROM EMP E1< EMP E2;

               
               
