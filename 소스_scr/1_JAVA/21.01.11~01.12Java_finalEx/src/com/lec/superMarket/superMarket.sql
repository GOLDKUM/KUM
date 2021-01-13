DROP SEQUENCE CUSTOMER_SEQ;
CREATE SEQUENCE CUSTOMER_SEQ
    START WITH 1 
    INCREMENT BY 1
    MAXVALUE 999999
    MINVALUE 1 
    NOCYCLE
    NOCACHE;
DROP TABLE CUS_LEVEL;
DROP TABLE CUSTOMER ;

CREATE TABLE CUS_LEVEL(
    levelNO NUMBER(1)PRIMARY KEY ,
    levelNAME VARCHAR2(20),
    LOW NUMBER(9),
    HIGH NUMBER(9)
     
);
CREATE TABLE CUSTOMER(
    cID NUMBER(6) PRIMARY KEY,
    cTEL VARCHAR2(20) NOT NULL,
    cNAME VARCHAR2(30) NOT NULL,
    cPOINT NUMBER(9)DEFAULT 1000,
    cAMOUNT NUMBER(9)DEFAULT 0,
    levelNO NUMBER(1)DEFAULT 1,
    FOREIGN KEY (levelNO) REFERENCES CUS_LEVEL(levelNO)
);
--TEST�� ����Ʈ �Է�
INSERT INTO CUS_LEVEL VALUES(1,'NORMAL',0,999999);
INSERT INTO CUS_LEVEL VALUES(2,'SILVER',1000000,1999999);
INSERT INTO CUS_LEVEL VALUES(3,'GOLD',2000000,2999999);
INSERT INTO CUS_LEVEL VALUES(4,'VIP',3000000,3999999);
INSERT INTO CUS_LEVEL VALUES(5,'VVIP',4000000,4999999);
SELECT * FROM CUS_LEVEL;
SELECT * FROM CUSTOMER;

INSERT INTO CUSTOMER(cID,cTEL,cNAME) VALUES(CUSTOMER_SEQ.NEXTVAL,'010-9999-9999','ȫ�浿');
INSERT INTO CUSTOMER VALUES (CUSTOMER_SEQ.NEXTVAL,'010-8888-8888','��浿',1000,5000000,5);

-- 0. �����̸��� �˻� : public Vector<String> getLevelNames()
SELECT LEVELNAME FROM CUS_LEVEL;

-- 1. cId(���̵�)�˻� : public CustomerDto cIdGetCustomers(String cId)
-- cIdGetCustomers�� �޼ҵ带 ��������! 
SELECT * FROM CUSTOMER;
SELECT * FROM CUS_LEVEL;

SELECT cId,cTEL,cNAME,cPOINT,cAMOUNT,LEVELNAME,
    HIGH-CAMOUNT+1 forLEVELUP
    FROM CUSTOMER C ,CUS_LEVEL L
    WHERE c.levelno=l.levelno
    AND CID=1;--�ְ� ������ ���� ���ͼ� ����! 
    
SELECT cId,cTEL,cNAME,cPOINT,cAMOUNT,LEVELNAME,
    (SELECT HIGH-CAMOUNT+1 FROM CUSTOMER WHERE CID=C.CID AND LEVELNO<>5 ) forLEVELUP
    FROM CUSTOMER C ,CUS_LEVEL L
    WHERE c.levelno=l.levelno
    AND CID=1;--�ڹ� �������
    
    
-- 2. ����4�ڸ�(FULL) �˻� 
-- ����4�ڸ��˻�= FULL�˻�
-- public ArrayList<CustomerDto> cTelGetCustomers(String cTel); �ڹٿ��� ������Ë�
-- cTelGetCustomers�� �޼ҵ带 ��������! 
SELECT cId,cTEL,cNAME,cPOINT,cAMOUNT,LEVELNAME,
    (SELECT HIGH-CAMOUNT+1 FROM CUSTOMER WHERE CID=C.CID AND LEVELNO<>5 ) forLEVELUP
    FROM CUSTOMER C ,CUS_LEVEL L
    WHERE c.levelno=l.levelno
    AND CTEL LIKE '%9999';
    
SELECT cId,cTEL,cNAME,cPOINT,cAMOUNT,LEVELNAME,
    (SELECT HIGH-CAMOUNT+1 FROM CUSTOMER WHERE CID=C.CID AND LEVELNO<>5 ) forLEVELUP
    FROM CUSTOMER C ,CUS_LEVEL L
    WHERE c.levelno=l.levelno
    AND CTEL LIKE '%'||'9999';--�ڹٿ��� �� SQL

-- 3. ���̸��˻� 
--public ArrayList<CustomerDto> cNameGetCustomers(String cName);
SELECT cId,cTEL,cNAME,cPOINT,cAMOUNT,LEVELNAME,
    (SELECT HIGH-CAMOUNT+1 FROM CUSTOMER WHERE CID=C.CID AND LEVELNO<>5 ) forLEVELUP
    FROM CUSTOMER C ,CUS_LEVEL L
    WHERE c.levelno=l.levelno
    AND CNAME='��浿';

-- 4. ����Ʈ�θ� ����(1000��¥���� ����Ʈ�θ� ����) 
-- public int buyWithPoint(int cAmount)
UPDATE CUSTOMER SET CPOINT=CPOINT -500 WHERE CID=1; --500?    1?

-- 5. ��ǰ���� (����Ʈ����, ���Ŵ����ݾ׺���,LEVELNO����
    --  public int buy(int cAmount, int cId)
    --5-1����Ʈ�� ���Ŵ����ݾ� ����
UPDATE CUSTOMER SET CPOINT=CPOINT+1000000*0.05,
                    CAMOUNT=CAMOUNT+1000000
                    WHERE CID=1;
SELECT * FROM CUS_LEVEL;
    --5-2levelNO����
SELECT CNAME,CAMOUNT,C.LEVELNO ���緹��,L.LEVELNO �ٲ���ҷ���,LOW,HIGH
    FROM CUSTOMER C,CUS_LEVEL L
    WHERE CAMOUNT BETWEEN LOW AND HIGH; 
    
SELECT L.LEVELNO 
    FROM CUSTOMER C,CUS_LEVEL L
    WHERE CAMOUNT BETWEEN LOW AND HIGH AND CID=1;-- ID�� 1�� ���� �ٲ����; --�ٲ���� ����

UPDATE CUSTOMER 
    SET LEVELNO =(SELECT L.LEVELNO 
    FROM CUSTOMER C,CUS_LEVEL L
    WHERE CAMOUNT BETWEEN LOW AND HIGH AND CID=1)
    WHERE CID=1;
    
SELECT * FROM CUSTOMER;
COMMIT;
ROLLBACK;
    --5-1+5-2���� �κ��� �ڹٿ� �� SQL��
        --public int buy(int cAmount, int cid)
UPDATE CUSTOMER SET CPOINT=CPOINT+1000000*0.05,
                    CAMOUNT=CAMOUNT+1000000,
                    LEVELNO =(SELECT L.LEVELNO 
                                FROM CUSTOMER C,CUS_LEVEL L
                                WHERE CAMOUNT+1000000 BETWEEN LOW AND HIGH AND CID=1)      
                    WHERE CID=1;
                    
UPDATE CUSTOMER SET CPOINT=CPOINT+100*0.05,
                    CAMOUNT=CAMOUNT+100,
                    LEVELNO =(SELECT L.LEVELNO 
                                FROM CUSTOMER C,CUS_LEVEL L
                                WHERE CAMOUNT+100 BETWEEN LOW AND HIGH AND CID=1)      
                    WHERE CID=1;

-- 6. ��޺����
--public ArrayList<CustomerDto> levelNameGetCustomers(String levelName)
--levelNameGetCustomers�޼ҵ带 �������� 
SELECT cId,cTEL,cNAME,cPOINT,cAMOUNT,LEVELNAME,
    (SELECT HIGH-CAMOUNT+1 FROM CUSTOMER WHERE CID=C.CID AND LEVELNO<>5 ) forLEVELUP
    FROM CUSTOMER C ,CUS_LEVEL L
    WHERE c.levelno=l.levelno AND levelname='VVIP'
    ORDER BY CAMOUNT DESC;
    
-- 7.��ü��� - CID, CTEL, CNAME, CPOINT, CAMOUNT, LEVELNAME, �����������Ѿ���
--            public ArrayList<CustomerDto> getCustomers()
--getCustomers()��� �޼ҵ带 ����! 
SELECT cId,cTEL,cNAME,cPOINT,cAMOUNT,LEVELNAME,
    (SELECT HIGH-CAMOUNT+1 FROM CUSTOMER WHERE CID=C.CID AND LEVELNO<>5 ) forLEVELUP
    FROM CUSTOMER C ,CUS_LEVEL L
    WHERE c.levelno=l.levelno 
    ORDER BY CAMOUNT DESC;
    
-- 8. ȸ������(����ȭ�� ���̸��� �Է¹޾� INSERT)
--          public int insertCustomer(String cTel, String cName)//DTO NO�ʿ�
INSERT INTO CUSTOMER (cID,cTEL,CNAME) VALUES(CUSTOMER_SEQ.NEXTVAL,'010-7777-7777','�տ���'); 
SELECT * FROM CUSTOMER;

-- 9. ��ȣ���� : public int updateCustomer(String cTel, int cId)
UPDATE CUSTOMER SET CTEL='010-1111-1111' WHERE  CID=3;

-- 10. ȸ��Ż�� : public int deleteCustomer(String cTel)
DELETE FROM CUSTOMER WHERE CID=3;
commit;
SELECT *FROM CUSTOMER;