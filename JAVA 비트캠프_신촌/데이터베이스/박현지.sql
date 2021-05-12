--�� ID(�⺻Ű)
--����
--�������
--�������
--�Ա����� 
--�Աݿ���
--�Ա�ȸ��  
--�� ����� 
-- ������� �����  
-- ������¹�ȣ 
-- �����  

create table premium(
    id varchar2(10) primary key,
    name varchar2(30),
    birth varchar2(10),
    contractdate varchar2(10),
    depositDate varchar2(10), 
    depositMonth varchar2(10),
    depositNumber varchar2(5),
    premium number,
    v_premium number,
    VirtualAccount varchar2(10), 
    bank varchar2(10) 
);

insert into premium(id,contractdate,depositDate,birth,name,depositMonth,depositNumber,bank,VirtualAccount,premium,v_premium)
values ('AAAA','20180101','20201029', '960118', '������', '202010', '32 ', '����', '11111111', 15200 , 15200 ); 

insert into premium(id,contractdate,depositDate,birth,name,depositMonth,depositNumber,bank,VirtualAccount,premium,v_premium)
values ('BBBB','20180525','20201029', '730505', '���缮', '202009', '28', '�츮', '22222222', 17000  , 17000);

insert into premium(id,contractdate,depositDate,birth,name,depositMonth,depositNumber,bank,VirtualAccount,premium,v_premium)
values ('CCCC','20161231','20201029', '700428', '��ȣ��', '202010', '44', '����', '33333333', 25000 , 25000 );

insert into premium(id,contractdate,depositDate,birth,name,depositMonth,depositNumber,bank,VirtualAccount,premium,v_premium)
values ('DDDD','20190504','20201029', '880331', '�ŵ���', '202008', '22', '�츮', '22223333', 100000 , 100000 );

insert into premium(id,contractdate,depositDate,birth,name,depositMonth,depositNumber,bank,VirtualAccount,premium,v_premium)
values ('EEEE','20170701','20201029', '880808', 'ȫ�浿', '202007', '23', '����', '33337777', 50000 , 50000 );

insert into premium(id,contractdate,depositDate,birth,name,depositMonth,depositNumber,bank,VirtualAccount,premium,v_premium)
values ('FFFF','20170805','20201030', '930330', '������', '202007', '28', '����', '44444444', 40000 , 40000 );

insert into premium(id,contractdate,depositDate,birth,name,depositMonth,depositNumber,bank,VirtualAccount,premium,v_premium)
values ('GGGG','20100908','20201030', '930927', '�Ż��Ӵ�', '202010', '88', '����', '11114444', 10000 , 10000 );

insert into premium(id,contractdate,depositDate,birth,name,depositMonth,depositNumber,bank,VirtualAccount,premium,v_premium)
values ('HHHH','20161231','20201029', '700505', '����', '202010', '44', '����', '33336666', 25000 , 25000 );

insert into premium(id,contractdate,depositDate,birth,name,depositMonth,depositNumber,bank,VirtualAccount,premium,v_premium)
values ('IIII ','20190101','20201101', '600601', '�ȳ�ȳ��', '202011', '20', '�ϳ�', '55555555', 42000 , 42000 );

commit;

-- [UPDATE ����]
-- 1. ��ü �Ա����ڸ� ���� ��¥�� �ٲپ��.
update premium set depositDate = sysdate;

-- 2.������� ���������� �� , ������� ����� �ݾ��� 7777������ �����Ͽ���.
update premium set v_premium = 7777 where bank ='����';

-- 3. ȸ���� 25ȸ�� �̸��� ������ ��������� 2020-11���� �ٲپ��.
update premium set birth = 202011 where depositnumber < 25;

-- 4. ����� �ݾ��� 5���� �̻��̰� �츮������ ��� �̸��� VIP�� �ٲپ��.
update premium set name = 'VIP' where premium >=50000 and bank = '�츮';

-- 5. ������� ��ȣ�� 99999999�� ���� �ϰų� ������ 99�� �����Ͽ���.
--    ���� �� �ѹ��ϱ�
update premium set virtualaccount = '99999999' , depositmonth = '99' ;
ROLLBACK;

-- 6. �̸��� �ȳ�ȳ���� ��� �ȳ��ϼ����� �����Ͽ���.
update premium set name = '�ȳ��ϼ���' where name = '�ȳ�ȳ��';

-- 7. ����ᰡ 20000�� �̸� �� ��� 3000���� ���ϼ���.
update premium set premium = premium +  3000 where premium < 20000;

-- 8. ������ �̰ų� ȫ�浿�̸� ���¹�ȣ�� 77777777�� �����Ͽ���.(in Ű���� ���)
update premium set virtualaccount = '77777777' where name in('������','ȫ�浿');

-- 9. ������� �츮 �Ǵ� �����̸� �����̸��� �ѱ����� �����Ͽ��� .
update premium set bank = '�ѱ�' where bank in('�츮','����'); 

-- 10. �� ����Ḧ 12%�λ���Ѷ� .
update premium set premium = premium*1.12 ;



-- �ѹ� �ϱ� 
rollback;

select * from premium;

--[DELETE ����]
--1. id�� GGGG�� ��� ���� 
delete from premium where id = 'GGGG';

--2. ȸ���� 50ȸ �̻��̰ų� , ����ᰡ 30000�� ���� �� ��� ���� 
delete from premium where depositnumber >= 50 or premium <= 30000;

--3. �̸��� �������̰ų� ������ ��� ����
delete from premium where name in('������','����');

--4. ������� ��ȣ�� 1�� �����ϴ� ��� ����
delete from premium where virtualaccount like '1%';

--5. �̸��� �ŵ����� ��� ���� 
delete from premium where id = 'DDDD';

--6. ������� ���� �߿��� ȸ���� 10ȸ �̻��� ��� ���� 
delete from premium where bank = '����' and depositnumber >=10;

--7. ��������� 93���� �����ϰ� ����ᰡ 10000�� ��� ���� 
delete from premium where birth like '93%' and premium = 10000;

--8. �̸��� �������� ������ ��� ���� ����
delete from premium where name <> '������';

--9. ������� �����̳� �츮�� �ƴ� ��� ��� ����(in Ű���� ���)
delete from premium where bank not in('����','�츮');

--10.������� ����ᰡ 50000�� �̻��̰� 100000���� ������ ��� ���� 
delete from premium where v_premium >= 50000 and v_premium<=100000;

select * from premium;

rollback;

-- [select ����]
-- 1. ��ü ��ȸ�ϱ�
select * from premium;

-- 2. �̸��� ������ �����ϴ� ����� �˻��Ͻÿ�.
select name from premium where name like '��%';

-- 3. name �� ������ premium �� �Դϴ�.
select name || '�� ������ ' || premium || '�� �Դϴ�' as ��� from premium;

-- 4. �Ա����ڰ� �ֽ��� ������� �����Ͻÿ�.
select * from premium order by depositdate desc;

-- 5. �Ա� ȸ���� ���� ���� �� ���� , ������ ���� ���� ������ �����Ͻÿ�.
select * from premium order by depositnumber desc , premium asc;

-- 6. ����Ḧ 10%�λ��ϸ� �˸��ƽ��� ����Ͽ� �������� �����Ͽ���.
select name , premium , 1.1 * premium as �λ��  from premium order by premium desc;

-- 7. ������� ��ȣ �߿� ����° ���ڰ� 2�� ����� ����Ͽ���.
select * from premium where virtualaccount like '__2%';

-- 8. ������� �츮�����̰ų� ���������� id, name , v_premium , bank �� ����Ͽ���.
select id , name , v_premium , bank from premium where bank in('�츮','����');

-- 9. ������� �츮�����̰ų� ���������� �ƴ� ������ id, name , v_premium , bank �� ����Ͽ���.
select id , name , v_premium , bank from premium where bank not in('�츮','����');

-- 10. ����� �ݾ��� 8���� �̻��̰ų� , �̸��� 5������ ����� ����Ͽ���.
select * from premium where premium >= 80000 or length(name) = 5;



-- [���ڿ� ���� �Լ�]
-- 1. name�� ������ premium �Դϴ�.
select concat(concat(concat(name , '�� ������ '),premium),'�Դϴ�. ') as result from premium;

-- 2. id�� �ҹ��ڷ� ����Ͽ���.
select lower(id) from premium;

-- 3. id�� �빮�ڷ� ����ϰ� , ù���ڸ� �빮�ڷ� �����Ͽ���.
select upper(id) , initcap(id) from premium;

-- 4. substr �� �̿��Ͽ� ������� ��ȣ 5��°���� �����Ͽ���.
select substr(VirtualAccount , 5) from premium;

-- 5. substr �� �̿��Ͽ� ������� �ڿ��� 3��°���� 1���� �����Ͽ���.
select substr(VirtualAccount , -3 , 1) from premium;

-- 6. �̸��� ���̰� 3�� ����� ������ �����Ͽ���.
select * from premium where mod(length(name),3) = 0;

-- 7. �̸��� '��'�� �� �ֳ���? 
select name , instr(name , '��') as ���� from premium;

-- 8. �̸��� 10�� �߿� lpad �� ����Ͽ� ���鿡 �ڸ� ä�켼��.
select name , lpad(name , 10 , '��') from premium;

-- 9. �̸��� 10�� �߿� rpad �� ����Ͽ� ���鿡 �ڸ� ä�켼��.
select name , rpad(name , 10 , '��') from premium;

-- 10.�� id���� c�� a�� ġȯ�Ͽ���.
select id , replace(id , 'C' , 'A') as result from premium;

--[������ ���� �Լ�]

update premium set premium = -100 where id in('AAAA','BBBB');

-- 1. ������ ����Ḧ ����� ���Ͽ���.
select premium , abs(premium) as newpremium from premium ;

-- 2. ������� 2������ ����Ͽ���.
select name , premium , power(premium , 2) as newpremium from premium;

-- 3. sign�� ����Ͽ� ��ȣ �� Ȯ�� �ϱ� 
select sign(10) as ��� , sign(0) as "0�϶�" , sign(-10) as ���� from dual; 

-- 4. round �ݿø� �Լ��� ����Ͽ� Ȯ�� �ϱ� 
select round(17) , round(14.57,-1) , round(14.57 , 1) from dual;

-- 5. trunc �Լ��� ����Ͽ� Ȯ�� �ϱ�
select trunc(15.79 , 1) from dual;

-- [��¥ ���� �Լ�]
alter session set nls_date_format = 'YYYY-MM-DD hh:mi:ss';

select sysdate from dual;

-- 1. ���� ��¥���� 5���� ���Ͽ���.
select sysdate , sysdate + 5 from dual;

-- 2. ���� �ð��� 5�ð� ������ �ð�, 30������ �ð��� ���� ������.
select sysdate , sysdate + 5/24 , sysdate + 30/24/60/60 from dual;

-- 3. ���ݺ��� 3���� �� , 5���� ���� �ð��� ���غ�����.
select sysdate , add_months(sysdate , 3) , add_months(sysdate , -5) from dual;

-- 4. �̹��� ������ �� 
select last_day(sysdate) from dual;

-- 5. �̹��� ������� ���� �����ΰ�? 
select next_day(sysdate,'��') from dual;

-- [null�� ���õ� ����]
update premium set v_premium = null where id in('AAAA', 'EEEE' , 'DDDD') ;

-- 1. ������� �Ա� ����ᰡ null �̸� 5000���� ä��ÿ�.
select v_premium , nvl(v_premium , 5000) from premium;

-- 2. ������� �Ա� ����ᰡ �����ϸ� ���� , null �̸� null����� ä��ÿ�.
select v_premium , nvl2(v_premium , '����' , 'null����') as ��� from premium;

-- 3. ������� ������ ��� null������ ��ü�Ͻÿ�.
select bank , nullif(bank , '����') as ��� from premium;

-- [case ǥ���� ���õ� ����]
-- 1. �����̸��� OO �̸� OO �����Դϴ�.�� ǥ���غ���.
select name , bank , 
case bank 
when '����' then '���������Դϴ�.'
when '����' then '���������Դϴ�.'
when '�츮' then '�츮�����Դϴ�.'
else '�ϳ������Դϴ�.' end as result 
from premium;

-- 2. �Ա� ȸ���� 50 �̻��̸� high , 40�̻��̸� middle , �� �̸��̸� low�� ����غ�����.
select name , depositNumber , 
case 
when depositNumber >= 50 then 'high'
when depositNumber >= 40 then 'middle'
else 'low' end as result
from premium;

drop table set_a;
drop table set_b;

-- [���� ���� ���õ� ����]
create table a(val number);
create table b(val number);

insert into a(val) values(1);
insert into a(val) values(2);
insert into a(val) values(3);

insert into b(val) values(3);
insert into b(val) values(4);
insert into b(val) values(5);

select * from a;
select * from b;

-- 1. ������ ����ϱ� 
select * from a
union 
select * from b;

-- 2. a���̺�� b���̺� ��ü �� ����ϱ�
select * from a
union all
select * from b;

-- 3. ������ ����ϱ� 
select * from a
intersect
select * from b;

-- 4. a-b ��?
select * from a
minus
select * from b;

-- 5. b-a ��?
select * from b
minus
select * from a;


-- [�׷�(����)�Լ� ���õ� ����]
-- 1. premium ���̺��� �� ����? 
select count(*) as ���� from premium;

-- 2. ������� ������? 
select sum(premium) as ���� from premium;

-- 3. ���ະ�� �׷����Ͽ� �� �ݾ��� ���Ͽ���.
select bank, sum(premium) as ���� from premium group by bank;

-- 4. �Ա����ڰ� 2020-10-30�̰� ���������� �ѱݾ��� ���Ͽ���.
select depositdate, bank , sum(premium) as ���� from premium group by bank , depositdate
having depositdate = '20201030' and bank = '����';

-- 5. �̸��� ���� ���� ������ ����� ���߿� ������ �����?
select min(name) as ���� , max(name) as ���߿� from premium ;

-- 6. �Ա����ں��� �׷����ϰ� �������� �����Ͽ���.
select depositdate from premium group by depositdate
order by depositdate asc;

-- 7. ���ະ ���� �� ������ ��ȸ�ϵ� , 2�� �̻� ��ȸ�ǵ��� �ϼ���.
select bank , count(*) from premium group by bank
having count(*) >= 2;

-- 8. ������� ���հ� ��հ��� ���Ͽ���.
--    ��, ��հ��� �Ҽ��� ��°�ڸ������� ��Ÿ�����.
select sum(premium) as ���� , round(avg(premium),2) as ��հ� from premium;

-- 9. ������� ��ȣ�� ù���ڴ�� �׷����ϼ���.
select bank , VirtualAccount from premium group by  bank , VirtualAccount 
order by VirtualAccount asc;

-- 10. ������� �Ա� ������� ������ ���ະ�� ���Ͽ���.
-- �� , null���� ��� 70000������ ġȯ�Ͽ���.
select bank, sum(nvl(v_premium,70000)) as ���� from premium group by bank;


-- [���ΰ� ���õ� ����]


select * from premium;





