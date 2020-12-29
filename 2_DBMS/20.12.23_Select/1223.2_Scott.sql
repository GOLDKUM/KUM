--[II] SELECT 문
--1.SQL문장 작성법
SELECT*FROM TAB; -- 현 계정 SCOTT이 가지고 있는 테이블들
SELECT*FROM DEPT; --DEPT테이블의 모든 열,모든행
SELECT*FROM EMP; --EMP테이블의 모든열, 모든행
--DEPT 테이블의 구조(ORACLE)에서만 가능! 
DESC DEPT;

--2.SQL문장 실행(특정 열만 출력)
SELECT*FROM EMP;--SELECT하면 모두다 출력
SELECT EMPNO, ENAME, SAL, JOB FROM EMP;--특정 열만 출현 
SELECT EMPNO AS "사번", ENAME AS "이름", SAL AS "급여", JOB AS "작업" FROM EMP;--타이틀교체! 
SELECT EMPNO AS 사번, ENAME AS 이름, SAL AS 급여, JOB AS 작업 FROM EMP;--출력되는 열에 별명사용(타이틀조정)! 위에줄과 같음!
SELECT EMPNO 사번, ENAME 이름, SAL 급여, JOB 작업 FROM EMP; --똑같음! 
SELECT EMPNO NO, ENAME NAME, SAL SALARY, JOB FROM EMP;--JOB만 그대로 나머지는 변경 영어와 한글 모두 다됨! 

--특정한 행을 출력해보자! 
--3. WHERE 절(조건) 비교연산자를 이용 
SELECT EMPNO "사번",ENAME "이름", SAL "급여" FROM EMP
    WHERE SAL=3000; --SAL이 3000인 행만 출력! --새미콜론은 맨마지막문장의 끝!
SELECT EMPNO, ENAME, SAL FROM EMP WHERE SAL!=3000;
SELECT EMPNO, ENAME, SAL FROM EMP WHERE SAL^=3000;
SELECT EMPNO, ENAME, SAL FROM EMP WHERE SAL<>3000;--! ^ <> 다르다라는 의미 

--10번 부서인 사원의 모든 필드를 출력
SELECT * FROM EMP WHERE DEPTNO=10;
SELECT * FROM DEPT;

--ENAME이 'FORD'인 직원의 모든 필드를 출력
SELECT * FROM EMP WHERE ENAME = 'FORD';  --데이터는 대소문자를 가린다 ! 
--SELECT * FROM EMP WHERE ENAME = 'ford';--소문자는 데이터는 없지요~! 

--급여가 2000이상인 3000미만인 직원의 모든 필드를 출력
SELECT * FROM EMP 
    WHERE SAL>=2000 AND SAL<3000;

--비교연산은 숫자, 문자, DATE형 모두 가능 
SELECT * FROM EMP;
SELECT * FROM EMP WHERE ENAME <'F';--'A''B''C''D''E'로 시작하는사람 뿌려요
SELECT * FROM EMP WHERE HIREDATE < '81/01/01';    

--82년에 입사한 직원의 모든 필드 출력
SELECT * FROM EMP WHERE HIREDATE>= '81/01/01' AND HIREDATE<='82/12/31';--''데이터로 ! 

--날짜 표기법 셋팅 (RR/MM/DD)년월일
ALTER SESSION SET NLS_DATE_FORMAT='RR/MM/DD';--내이야기군

--연봉이 2400이상인 직원의 ENAME, SAL ,연봉 출력(연봉 = SAL*12)
SELECT ENAME "이름", SAL 급여, SAL*12 연봉 FROM EMP
    WHERE SAL*12>2400
    ORDER BY 연봉;--WHERE절에 연봉이라고 쓰고 싶지만 연봉이라는건 진짜 존재하지 않는것이 떄문에 진짜 필드에 존재하는 SAL*12를 작성
    --ORDER BY절은 별명 가능!  WHY? 이유는 밑에 설명했음 
    --FROM -> WHERE -> SELECT ->ORDER BY 뿌리는 순서! 

--5.산술표현식
SELECT ENAME, SAL, SAL+300 UPGRADESAL FROM EMP;
--모든 사원의 사원명, 월급(SAL), 연봉(SAL*12+COMM)
SELECT ENAME, SAL,COMM, SAL*12+NVL(COMM,0) FROM EMP;--null값이 들어가면 무조건 null로 나옴! 
--산술연산의 결과는 NULL을 포함하면 결과는 NULL
--       -> NUL(NULL일수도 있는 필드명, 대치값) 둘은 타입이 같아야함! 
DESC EMP; --테이블 확인 
DESC DEPT;
SELECT * FROM DEPT;

--모든 사원의 사원명, 월급 ,COMM, 연봉(SAL*12+COMM)COMM이 NULL이면 0으로 나오게
SELECT ENAME, SAL, NVL(COMM,'0'),SAL*12+NVL(COMM,0)FROM EMP;

--모든 사원의 사뭔명(ENAME),상사의 사번(MGR) 상사가 없으면 CEO(출력)
SELECT ENAME, NVL(MGR,0) FROM EMP;

--6.연결 연산자(||) ; 열이나 문자를 연결
SELECT ENAME||'은 ' ||JOB||'이다' FROM EMP;
--"SMITH IS CLEAR"로 출력되고 TITLE EMPLOYEES라고 모든 직원 출력
SELECT ENAME||'IS'||JOB EMPLOYEE FROM EMP; 

--7.중복제거 (DISTINCT) //필드 로우 테이블 
SELECT DISTINCT JOB FROM EMP;
SELECT DISTINCT MGR FROM EMP;

--	연습문제 꼭 풀기
--1. emp 테이블의 구조 출력
DESC EMP;
--2. emp 테이블의 모든 내용을 출력 
SELECT * FROM EMP;
--3. 현 scott 계정에서 사용가능한 테이블 출력
SELECT * FROM TAB;
--4. emp 테이블에서 사번, 이름, 급여, 업무, 입사일 출력
SELECT EMPNO, ENAME, SAL, JOB, HIREDATE FROM EMP;
--5. emp 테이블에서 급여가 2000미만인 사람의 사번, 이름, 급여 출력
SELECT EMPNO, ENAME, SAL FROM EMP WHERE SAL<2000;
--6. 입사일이 81/02이후에 입사한 사람의 사번, 이름, 업무, 입사일 출력
SELECT EMPNO,ENAME,JOB,HIREDATE FROM EMP WHERE  HIREDATE>= '81/02/01';
--7. 업무가 SALESMAN인 사람들 모든 자료 출력
SELECT * FROM EMP WHERE JOB='SALESMAN';
--8. 업무가 CLERK이 아닌 사람들 모든 자료 출력
SELECT * FROM EMP WHERE JOB!='CLERK';
--9. 급여가 1500이상이고 3000이하인 사람의 사번, 이름, 급여 출력
SELECT EMPNO, ENAME, SAL FROM EMP WHERE SAL>=1500 AND SAL<3000;
--10. 부서코드가 10번이거나 30인 사람의 사번, 이름, 업무, 부서코드 출력
SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP WHERE DEPTNO='10' OR DEPTNO='30';  
--11. 업무가 SALESMAN이거나 급여가 3000이상인 사람의 사번, 이름, 업무, 부서코드 출력
SELECT EMPNO, ENAME, JOB, DEPTNO FROM EMP WHERE JOB='SALESMAN' OR SAL>=3000;
--12. 급여가 2500이상이고 업무가 MANAGER인 사람의 사번, 이름, 업무, 급여 출력
SELECT EMPNO, ENAME, JOB, SAL FROM EMP WHERE SAL>=2500 AND JOB='MANAGER';
--13.“ename은 XXX 업무이고 연봉은 XX다” 스타일로 모두 출력
SELECT ENAME||'은 ' ||JOB||'업무이고 연봉은'||(SAL*12+NVL(COMM,0))||'다'FROM EMP;
--NVL익숙해지자

--8번 SQL연산자! (BETWEEN,IN,LIKE, ISNULL)
--SAL이 1500이상이고 3000이하인 사번,이름 급여
SELECT EMPNO, ENAME,SAL FROM EMP
    WHERE SAL>=1500 AND SAL<=3000;
--필드명 BETWEEN A AND B(A~B까지, A와B 포함)
SELECT EMPNO, ENAME,SAL FROM EMP
    WHERE SAL BETWEEN 1500 AND 3000;

--82년도 입사한 직원의 모든 필드를 출력
SELECT * FROM EMP
    WHERE HIREDATE>='82/01/01' AND HIREDATE<='82/12/31';
SELECT * FROM EMP
    WHERE HIREDATE BETWEEN '82/01/01' AND '82/12/31';

--이름이 A~C로 시작하는 사람의 이름을 출려하시오
SELECT * FROM EMP
    WHERE ENAME BETWEEN 'A' AND 'D';--D를 포함하기 싫으면 AND ENAME!='D';
    
--부서번호(DEPTNO)가 10,20인 사원의 모든 필드 
SELECT * FROM EMP WHERE DEPTNO =10 OR DEPNO=20;
SELECT * FROM EMP WHERE DEPTNO IN(10,20);--10이거나 20번이거나 사원
SELECT * FROM EMP WHERE DEPTNO NOT IN(10,20);--10번이나 20번이 아닌 사원을 뽑아라 할때! 

--EMPNO가 7902,7788,7566인 사원의 모든 필드 
SELECT * FROM EMP WHERE DEPTNO IN(7902,7788,7566);

--이름이 M으로 시작하는 사원의 모든 필드 
SELECT * FROM EMP WHERE ENAME LIKE 'M%';--%0글자이상/ _한글자

--이름에 N이 들어가는 사원의 모든 필드 
SELECT * FROM EMP WHERE ENAME LIKE '%N%';

--이름이 S로 끝나는 사원의 모든 필드
SELECT * FROM EMP WHERE ENAME LIKE '%S';

--이름에 %가 들어가는 사원의 모든 필드
INSERT INTO EMP VALUES (9999,'A%',NULL,NULL,NULL,9000,9000,40);
SELECT * FROM EMP;
SELECT * FROM EMP WHERE ENAME LIKE '%\%%' ESCAPE'\';
ROLLBACK; --DML(데이터 조작어를 취소)
SELECT * FROM EMP;

--SAL이 5도로 끝나는 사원의 모든 필드 
SELECT * FROM EMP WHERE SAL LIKE'%5'; --오라클은 자바와 다르게 SAL은 숫자형 입력한것은 문자형이지만 변환하지 않아도 알아서 찾아줌
DESC EMP;

--입사년도가 82년인 사원의 모든 필드 ''=>문자형
SELECT * FROM EMP
    WHERE HIREDATE>='82/01/01'AND HIREDATE<='82/12/31';
SELECT * FROM EMP
    WHERE HIREDATE BETWEEN '82/01/01' AND '82/12/31';
SELECT * FROM EMP WHERE HIREDATE LIKE '82/__/__';
SELECT * FROM EMP WHERE HIREDATE LIKE '82/%';
SELECT * FROM EMP WHERE HIREDATE BETWEEN TO_DATE('1982/01/01','YYYY/MM/DD')
                                        AND TO_DATE('1982/12/31','YYYY/MM/DD');

--1월에 입사한 사원의 모든 필드! 
SELECT * FROM EMP WHERE HIREDATE LIKE '%/01/%';
SELECT * FROM EMP WHERE HIREDATE LIKE '__/01/__';

--상여금이 없는 사원의 모든 필드
SELECT * FROM EMP;
SELECT * FROM EMP WHERE COMM=0 OR COMM IS NULL;--NULL은 무조건 ISNULL해줘야 나온당~!

--상여금이 있는 사원의 모든 필드
SELECT * FROM EMP WHERE COMM IS NOT NULL AND COMM!=0;

--9.정렬 (오름차순,내림차순)
SELECT ENAME, SAL FROM EMP;
SELECT ENAME, SAL FROM EMP ORDER BY SAL ASC;--오름차순 정렬    ASC은 생략해도 되요!!!.0
SELECT ENAME, SAL FROM EMP ORDER BY SAL DESC; --내림차순 정렬
SELECT * FROM EMP ORDER BY SAL, HIREDATE; --중복된 사람중에 입사일 최신순 우선순위
SELECT * FROM EMP ORDER BY SAL, HIREDATE DESC; --중복된 사람중에 입사일 늦은순 우선순위
SELECT * FROM EMP ORDER BY SAL, HIREDATE DESC, ENAME;--심지어 연봉 입사까지 같아서 이름순으로! 

--이름, 연봉 (SAL*12+COMM)을 출력(연봉이 높은 순으로)
SELECT ENAME, SAL*12+NVL(COMM,0) 연봉 FROM EMP 
    ORDER BY 연봉 DESC;
SELECT ENAME, SAL*12+NVL(COMM,0) 연봉 FROM EMP 
    ORDER BY SAL*12+NVL(COMM,0) DESC;

--연봉이 2000이상인 직원의 이름, 연봉을 출력(연봉이 높은 순)
    --ORDER BY 절에는 필드별명 사용 가능 . WHERE 절에는 필드별명 사용불가 
SELECT ENAME ,SAL*12+NVL(COMM,0) 연봉 FROM EMP 
    WHERE SAL*12+NVL(COMM,0)>2000 ORDER BY 연봉 DESC;

--<셤 연습문제>
--1.	EMP 테이블에서 sal이 3000이상인 사원의 empno, ename, job, sal을 출력
SELECT EMPNO, ENAME, JOB, SAL FROM EMP WHERE SAL>='3000'; 

--2.	EMP 테이블에서 empno가 7788인 사원의 ename과 deptno를 출력
SELECT ENAME, DEPTNO FROM EMP WHERE EMPNO='7788';

--3.	연봉이 24000이상인 사번, 이름, 급여 출력 (급여순정렬)
SELECT * FROM EMP;
SELECT EMPNO, ENAME, SAL FROM EMP ORDER BY SAL;

--4.	EMP 테이블에서 hiredate가 1981년 2월 20과 1981년 5월 1일 사이에 입사한 사원의 
--ename,job,hiredate을 출력하는 SELECT 문장을 작성 (단 hiredate 순으로 출력)
SELECT ENAME, JOB, HIREDATE FROM EMP WHERE HIREDATE BETWEEN  '81/02/22' AND '81/05/01'
    ORDER BY HIREDATE;
    
--5.	EMP 테이블에서 deptno가 10,20인 사원의 모든 정보를 출력 (단 ename순으로 정렬)
SELECT * FROM EMP WHERE DEPTNO IN(10,20);

--6.	EMP 테이블에서 sal이 1500이상이고 deptno가 10,30인 사원의 ename과 sal를 출력
-- (단 HEADING을 employee과 Monthly Salary로 출력)
SELECT * FROM EMP;
SELECT ENAME, SAL FROM EMP WHERE SAL>=1500 AND DEPTNO IN (10,30);

--7.	EMP 테이블에서 hiredate가 1982년인 사원의 모든 정보를 출력
SELECT * FROM EMP WHERE HIREDATE LIKE '82/%';

--8.	이름의 첫자가 C부터  P로 시작하는 사람의 이름, 급여 이름순 정렬
SELECT * FROM EMP WHERE ENAME BETWEEN 'C' AND 'P' ORDER BY SAL, ENAME; 

--9.	EMP 테이블에서 comm이 sal보다 10%가 많은 모든 사원에 대하여 이름, 급여, 상여금을 
--출력하는 SELECT 문을 작성
SELECT * FROM EMP;
SELECT ENAME, SAL ,COMM FROM EMP WHERE COMM>=SAL+SAL*0.1;

--10.	EMP 테이블에서 job이 CLERK이거나 ANALYST이고 sal이 1000,3000,5000이 아닌 모든 사원의 정보를 출력
SELECT * FROM EMP WHERE JOB='CLERK' OR JOB= 'ANALYST' AND SAL NOT IN (1000,3000,5000); 

--11.	EMP 테이블에서 ename에 L이 두 자가 있고 deptno가 30이거나 또는 mgr이 7782인 사원의 
--모든 정보를 출력하는 SELECT 문을 작성하여라.
SELECT * FROM EMP WHERE ENAME LIKE '%L%L%' AND DEPTNO ='30' OR MGR='7782';

--12.	사원 테이블에서 입사일이 81년도인 직원의 사번,사원명, 입사일, 업무, 급여를 출력
--SELECT EMPNO, ENAME, HIREDATE, JOB, SAL FROM EMP WHERE HIREDATE LIKE '81/__/__';
SELECT * FROM EMP;
SELECT EMPNO, ENAME, HIREDATE, JOB, SAL FROM EMP WHERE HIREDATE LIKE '82/__/__';

--13.	사원 테이블에서 입사일이81년이고 업무가 'SALESMAN'이 아닌 직원의 사번, 사원명, 입사일, 
-- 업무, 급여를 검색하시오.
SELECT * FROM EMP;
SELECT EMPNO, ENAME, HIREDATE, JOB, SAL FROM EMP WHERE HIREDATE LIKE '81/%' AND JOB!='SALESMAN';

--14.	사원 테이블의 사번, 사원명, 입사일, 업무, 급여를 급여가 높은 순으로 정렬하고, 
-- 급여가 같으면 입사일이 빠른 사원으로 정렬하시오.
SELECT * FROM EMP ORDER BY SAL,HIREDATE ;

--15.	사원 테이블에서 사원명의 세 번째 알파벳이 'N'인 사원의 사번, 사원명을 검색하시오
SELECT EMPNO, ENAME FROM EMP WHERE ENAME LIKE '__N%'; 

--16.	사원 테이블에서연봉(SAL*12)이 35000 이상인 사번, 사원명, 연봉을 검색 하시오.
SELECT EMPNO, ENAME, SAL*12+NVL(COMM,0) 연봉 FROM EMP WHERE SAL*12+NVL(COMM,0)>=35000;





