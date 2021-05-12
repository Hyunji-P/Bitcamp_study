-- 11�� 5����
-- sysdate : ���� �ð��� �ǹ��ϴ� ����Ŭ ���� �Լ�

-- ����� ���� 
create table employees(
    id varchar2(20) primary key,
    name varchar2(30) not null,
    password varchar2(30)not null,
    gender varchar2(10),
    birth date default sysdate,
    marriage varchar2(30),
    salary number default 100,
    address varchar2(50),
    manager varchar2(50)
    
);

-- ������ �ִ� ���̺� ��� ����
select * from tab;

desc employees;

select * from employees;

-- '1990/12/25' ���� -> ��¥�� �ٲ㼭(�Ͻ��� ����ȯ) -> birth �÷��� ��
insert into employees(id , name , password , gender , birth , marriage , salary , address , manager)
values('yusin','������','abc1234','����','1990/12/25','��ȥ',220,'���',null);

insert into employees(id , name , password , gender , birth , marriage , salary , address , manager)
values('choi','�ֿ�','abc1234','����','1990/12/25','��ȥ',220,'���','yusin');

insert into employees(id , name , password , gender , birth , marriage , salary , address , manager)
values('kang','������','abc1234','����','1990/12/25','��ȥ',220,'����','yusin');

-- Ŀ�� : ������ �߰��� ������ ���� �����Ѵ�.(= ������ ����)
commit;

-- CTAS ����� ���� ���̺� ����
-- ������ �����ϰ� , �ӽ� ������ ���̺��� ������� �� �� ��� 
create table emp01
as
select * from employees;

create table emp02
as
select id , name , marriage from employees;

create table emp03
as
select birth from employees;

--���빰�� ������ ���� , �ܼ� ������ �����Ѵ�.
create table emp04
as
select * from employees
--where ���� �������� �ۼ��� �� �÷��̸��� �����
where 1 = 2;

desc employees ;

--�޴��� �÷� �߰��ϱ� 
alter table employees add (hphone varchar2(15));

desc employees;

select * from employees;

-- ����) ���� �÷� �߰��ϱ� (�� , age�÷��� �⺻ ���� 0���� �����Ѵ�.
alter table employees add(age number default 0);
desc employees;
select * from employees;

--��Ī �÷� �߰��ϱ� 
alter table employees add(nickname varchar2(30) default 'ö��');
desc employees;
select * from employees;

--���̵� �ִ� 20�ڸ��ε� 25�ڸ��� �������� �Ͽ� ���� 
insert into employees(id , name , password , gender , birth , marriage , salary , address , manager)
values('yusinyusinyusinyusinyusin','������','abc1234','����','1990/12/25','��ȥ',220,'���',null);

--�ش� �÷��� ���̸� 30����Ʈ�� �ø���
alter table employees modify (id varchar2(30));

--�޴����� ���������� �ٲ� ����.
--�޴��� �÷��� ��� null�� ��� �����Ƿ� , ������ Ÿ���� �����ϴµ� ������ ���� ����.
alter table employees modify (hphone number);
--�г����� ���������� �ٲ� ����.
--�̹� ���ڿ��� ��� �����Ƿ� , ������ �Ұ����ϴ�.
--����ִ� ���ڿ� 'ö��'�� ��� null�� ���� �� ������ Ÿ���� �ٲ� �� �ִ�.
--ö���� �����ε� ���ڷ� �ٲٷ��� �ϴϱ� ������ ��(�ڹٿ��� numberformatexception)
alter table employees modify (nickname number);

--�÷��� �̸� ���� 
--hphone �÷��� �̸��� handphone �̴�.
alter table employees rename column hphone to handphone;

--����) 'manager' �÷��� �̸��� 'mgr'���� ���� �Ǿ�� �Ѵ�.
alter table employees rename column manager to mgr;

--handphone �÷��� �� �̻� �ʿ����� �ʽ��ϴ�.
--�̸� �����ϵ��� �մϴ�.
--drop�� ������ 1������ �����ϴ�.
alter table employees drop column handphone;

--���̺� �̸� �����ϱ�
rename employees to emp;

commit;

drop table employees;

create table employees(
    id varchar2(20) primary key,
    name varchar2(30) not null,
    password varchar2(30)not null,
    gender varchar2(10),
    birth date default sysdate,
    marriage varchar2(30),
    salary number default 100,
    address varchar2(50),
    manager varchar2(50)
    
);

-- 11�� 6����

-- �߰� ��� 01
-- �÷� �̸� ������� �ʰ� �߰��ϴ� ��쿡�� �ݵ��
-- ���̺� ���� �� ����� �÷� ������� ��� �Է� ����� �Ѵ�.

insert into employees 
values ('yosin','������','abc1234','����','1990/12/25','��ȥ',220,'���',null); 

insert into employees 
values ('lee','�̼���','abc1234','����','1990/12/25','��ȥ',220,'����','yosin');

insert into employees 
values ('choi','�ֿ�','abc1234','����','1990/12/25','��ȥ',155,'����','yosin');

insert into employees 
values ('kang','������','abc1234','����','1990/12/25','��ȥ',null,'���빮','yosin');



-- �߰� ��� 02
-- �÷� �̸��� ����ϴ� ��� , ������ Ÿ���� ���� ��� �Ѵ�.

insert into employees (id , name , password , gender , birth , marriage , salary , address , manager)
values ('yoon','������','abc1234','����','1990/12/25','��ȥ',230,'���','yosin');

insert into employees (id , name , password , gender , birth , marriage , salary , address , manager)
values ('kim9','�豸','abc1234','����','1990/12/25','��ȥ',280,'����',null);

insert into employees (id , name , password , gender , birth , marriage , salary , address , manager)
values ('general','������','abc1234','����','1990/12/25','��ȥ',385,'����','kim9');

insert into employees (id , name , password , gender , birth , marriage , salary , address , manager)
values ('an','���߱�','abc1234','����','1990/12/25','��ȥ',360,'���빮','kim9');


-- �߰� ��� 03
-- �ʿ� ���� �÷��� ������� �ʴ� ���
-- �޿��� å������ �ʴ� ������ 
-- �޿��� �⺻ ���� 100���� �Ǿ� �����Ƿ� 100�� �߰��ȴ�.
-- ���� ������Ʈ �� ������ �����̴�.
insert into employees (id , name , password , gender , birth , marriage , address , manager)
values ('nongae','��','abc1234','����','1990/12/25','��ȥ','����','soon');

insert into employees (id , name , password , gender , birth , marriage , address , manager)
values ('queen','��������','abc1234','����','1990/12/25','��ȥ','���','soon');

-- �Ŵ����� ���� ���� �ʴ� ���
insert into employees (id , name , password , gender , birth , marriage , salary , address )
values ('soon','������','abc1234','����','1990/12/25','��ȥ',240,'����');

-- �߰� ��� 04
-- �÷� �̸��� ���Ƿ� ����ϴ� ���
insert into employees(id , salary , manager , address , name , password , gender , birth , marriage)
values ('shin',215,'kim9','���빮','�Ż��Ӵ�','abc1234','����','1990/12/25','��ȥ');

insert into employees(id , salary , manager , address , name , password , gender , birth , marriage)
values ('hwang',155,'kim9','���','Ȳ����','abc1234','����','1990/12/25','��ȥ');

insert into employees(id , salary , manager , address , name , password , gender , birth , marriage)
values ('myoung',340,'soon','����','������','abc1234','����','1990/12/25','��ȥ');

insert into employees(id , salary , manager , address , name , password , gender , birth , marriage)
values ('maria',390,'soon','���빮','��������','abc1234','����','1990/12/25','��ȥ');

insert into employees(id , salary , manager , address , name , password , gender , birth , marriage)
values ('princess',185,'soon','����','��������','abc1234','����','1990/12/25','��ȥ');

commit;
-- �� �����ϱ� 
-- where ��(clause): ��ü �����Ϳ��� �Ϻ� ��(row)�� �����ϰ��� �� �� ����ϴ� �����̴�.
-- ����(��) ������ : =(����) , <> (�ٸ�) , > , >= , < , <= 

-- �÷� 1�� ���� �ϱ� 
-- ���� ) ��� ������� �޿��� 100���� ���� �ϼ���.
update employees set salary = 100 ;

-- ����) ��� ������� ����� qwert�� �����ϼ���.
update employees set password = 'qwert';

-- ����) ��� ������� ������ ���� ��¥�� �����ϼ���.
update employees set birth = sysdate;

-- �÷� ������ �����ϱ� 
-- ��� ������� �޿��� 500���� , ����� 'abc1234'�� �����ϼ���.
update employees set salary = 500 , password = 'abc1234';

-- where �� ��� �ϱ� (�����̸Ӹ� Ű�� �ַ� ���)
update employees set salary = 400 where id = 'an';

-- �������� ��ȥ ���θ� '��ȥ' ���� �����ϼ���.
update employees set marriage = '��ȥ' where id = 'yoon';


-- �۾��� ������� �ѹ��ϼ���.

rollback;

-- ������� �޿��� 10%�λ� ��Ű����.
-- ���� �޿��� 100%�̰� 10%�λ� �� 1.1
-- �� , null ���� ������ �ص� ����� �׻� null�̴� 
update employees set salary=salary*1.1;

-- �������� �޿��� 100 �������ּ���.
update employees set salary = salary - 100 where id = 'general';

-- Ȳ������ �޿��� 50 ���ϰ� , �ּҸ� ������ �����ϼ���.
update employees set salary = salary + 50 , address = '����' where id = 'hwang';

-- �ֿ��� �̹��� �ֺν����� ������ �߰� , ���빮���� �̻� �����ϴ�.
update employees set name = '�ֺν�' , address = '���빮' where id = 'choi';

rollback;
-- �����ڰ� �豸�� ������� �޿��� 600���� ���� �ϼ���.
-- 4�� �� ��(��) ������Ʈ�Ǿ����ϴ�. (= cnt) 
--> ���� welfare �ڹ� �ڵ� �� ������Ʈ �޼ҵ� �ڵ� �� cnt �����Ͽ���
update employees set salary = 600  where manager = 'kim9';

-- �޿��� 200������ ������� �޿��� 300���� �����ϼ���.
update employees set salary = 300 where salary <= 200;

-- and(&&) / or(||) / not(!) 
-- �����ڰ� �������̰� , �޿��� 250 �̻��� ����鿡 ���Ͽ� �޿��� 700���� �����ϼ���.
update employees set salary = 700 where manager = 'yusin' and salary >= 250 ;

-- �豸 �̰ų� Ȳ�����̸� �޿��� 450 ���� �����ϼ���.
update employees set salary = 450 where id = 'kim9' or id = 'hwang';

rollback;

-- �豸 �̰ų� Ȳ�����̸� �޿��� 1000 ���� �����ϵ� , in Ű���� ��� �Ͽ���
update employees set salary = 1000 where id in ('kim9' , 'hwang');

-- �����ڰ� �������̰ų� , �������� ������� �޿��� 555���� �����ϼ���.
update employees set salary = 555 where manager in('yusin','soon');

-- ��ȥ ���ΰ� ��ȥ �Ǵ� ��ȥ�� �ƴ� ������� �޿��� 777�� �����ϼ���.
update employees set salary = 777 where marriage not in('��ȥ' , '��ȥ');

select * from employees;

rollback;

-- �����ϱ� 
-- ��� ����� �����ϼ���.
delete from employees;

-- ��� ���߱��� �����ϼ���.
delete from employees where id = 'an';

-- �����ڰ� �������� ����� �����ϼ���.
delete from employees where manager = 'yosin';

-- �����ڰ� ������ �̰ų� �������� ����� �����ϼ���.
delete from employees where manager in('yusin','soon');

-- �����ڰ� �������� ��� �߿��� �޿��� 220 �̻��� ����� �����ϼ���.
delete from employees where manager = 'yusin' and salary >=220;

-- �޿��� 200�̸��̰ų� 300�̻��� ����� �����ϼ���.
delete from employees where salary < 200 or salary >=300 ; 

-- �ּҰ� �����̰ų� ����� ����� �����ϼ���.
delete from employees where address in('����' , '���');

-- �ּҰ� ���빮�� ������ ������ �ٸ� ������ �����ϴ� ����� �����ϼ���.
delete from employees where address not in('���빮' , '����');

select * from employees;
rollback;

create table emp05
as
select id , name , salary , gender from employees where 1 = 2;



-- insert ... select �������� ���ڸ� emp05 ���̺� �μ�Ʈ �ϰڴ�.
insert into emp05(id , name , salary , gender)
select id , name , salary , gender 
from employees
where gender = '����';

select * from emp05;

-- ������ ������ ������� �̸�/�޿�/�ּҸ� �ű� ���̺� emp06�� �߰��ϼ���.
create table emp06
as
select name , salary ,address from employees where 1 = 2 ;

insert into emp06(name , salary ,address)
select name , salary ,address
from employees
where gender = '����';

select * from emp06;

commit;

-- 11�� 9����

-- ��� ����� ��ȸ�� ������.
-- * : all columns �ǹ�
select * from employees;

-- ��� ������� ���̵� , �̸� , �޿��� ��ȸ�� ������.
-- �������� �÷����� �޸��� ����ϸ� �ȴ�.
select id , name , salary from employees;

-- ��� ������� �̸� , �޿��� ���̵� ������� ��ȸ�غ�����.
select name , salary , id from employees;

-- ��� ������� �̸� , �޿� , 100�߰��� �޿��� ��ȸ�� ������. 
select name , salary , salary + 100 from employees;

-- ��� ������� �̸� , �޿� , ������ ��ȸ�� ������.
-- �� , ������ �޿��� 12���� �����Ѵ�.
select name , salary , 12*salary from employees;

-- �˸��ƽ�(alias)�� �Ļ� �÷��̳� �Ǵ� �������� ���ؼ� �÷� �̸��� �ѽ������� �����ϴ� ����̴�.
-- �ϸ� ��Ī�̶�� �Ѵ�.
-- �뵵 : �Ļ� �÷��̳� ��� ���� ���� ������� ���ȴ�.
-- jdbc ���α׷��ֿ����� �ݵ�� alias �� �������� �Ѵ�.
-- ��� : �÷� [as] alias�̸�

-- ��� ������� �̸��� , �޿��� 10% �λ�� �ݾװ� ������ ����� ������.
select name , salary , 1.1 * salary , 12*salary from employees;

-- ���� : "" �ֵ���ǥ
select name , salary , 1.1 * salary as newsalary, 12*salary "ann sal" from employees;

-- distinct Ű����� �ߺ��� �����Ϳ� ���ؼ� 1���� �����Ѵ�.
select gender from employees;

select distinct gender from employees;

-- ���� ������ : || 
-- ���ڿ��� ����(����)���ִ� ������
-- ȫ�浿�� �޿��� 100���Դϴ�.
select name || '�� �޿��� ' || salary || '�� �Դϴ�.' as ��� from employees;

-- �̸� : ȫ�浿 , ���� : ���� , �޿� : 100
select  '�̸� : ' || name || ', ���� : ' || gender || ', �޿� : ' || salary as ��� from employees;

-- Null
-- �޿� å���� �� �� ������� ����� ������.
select * from employees where salary is null;

-- ������ ����� ����� ������.
-- �����ڶ� manager �÷��� null�� ����� ���Ѵ�.
select * from employees where manager is null;

-- null �������� ���� ��� Ȯ���ϱ� 
-- ��� ������� �̸��� �޿� �� ������ ��ȸ�غ�����.
-- null �������� ���� ��� ���� null �̴�.
select name , salary , 12 * salary from employees;

-- ���̵� an �� ����� ��ȸ�� ������.
select * from employees where id = 'an';

-- �޿��� 230�̻��� ����� ��ȸ�� ������.
select * from employees where salary >= 230;

-- ���ڵ鸸 ��ȸ�غ�����.
select * from employees where gender = '����';


-- �޿��� 220 �̻��̰�,400 ������ ����� ��ȸ�� ������.
select * from employees where salary >= 220 and salary <=400 ;

-- where �÷� between A and B
-- A�� B�� ��� �����ϰ� , ���̿� �����ϴ� ��� ���� �����Ѵ�.
select * from employees where salary between 220 and 400;

-- ��,��,�� ���� ��ȸ
select * from employees where name between '��' and '��';

-- �޿��� 350 �̻��̰ų� 210 ������ ����� ��ȸ�غ�����.
select * from employees where salary >=350 or salary <=210;

-- inŰ���� 
-- id�� an �Ǵ� soon�� ����� �̸��� �޿��� ��ȸ�ϼ���.
select name , salary  from employees where id = 'an' or id = 'soon';

select name , salary  from employees where id in('an','soon');

-- �޿��� 215�̰ų� 230�� ������� ��ȸ�غ�����.
select * from employees where salary in(215,230);

-- �达�� ��ȸ�� ������.
select * from employees where name like '��%';

-- ���̶�� �ܾ ���Ե� ����� ��ȸ�غ�����.
select * from employees where name like '%��%';

-- �̸��� �ι�° ���ڿ� ���� ����ִ� ����� ��ȸ�غ�����.
select * from employees where name like '_��%';

-- �̸��� ���ڸ��� '��'�� ����ִ� ����� ��ȸ�غ�����.
select * from employees where name like '%��';

commit;
-- ���� �ǽ��� ���Ͽ� ������ ���� �����͸� �����ϵ��� �Ѵ�.
update employees set birth = sysdate where id in('an','soon');

update employees set birth = null where id in('queen' , 'yusin');

update employees set birth = '1988/10/10' where id in('kang' , 'lee');


-- �޿��� ���� �������� ����غ�����.
select * from employees order by salary ;

-- �̸��� ������ ������ ����غ�����.
select * from employees order by name asc;

-- �̸��� ������ �������� ����غ�����.
select * from employees order by name desc;

-- alias�� ����� ������ ���� 
-- �̸��� ������ ����ϵ� , ������ ���� ������ �����ϼ���.
select name , 12*salary as annsal from employees order by annsal desc;

-- �÷� ��ȣ�� �̿��� ������ ���� 
-- name : 1�� , 12*salary : 2�� 
select name , 12*salary as annsal from employees order by 2 desc;

-- ���̰� ���� �������� ������ ����, �޿��� ���� ������ �����Ͽ� ����غ�����.
select * from employees order by birth asc , salary asc;

-- ���ڰ� ���� ��µǵ��� �ϵ� , �޿��� ���� ������� ���� ��µǵ��� �غ�����.
select * from employees order by gender desc , salary desc;

-- ������ ���Ͽ� �������� , ��ȥ���ο� ���Ͽ� ������������ �����ϼ���.
select * from employees order by gender asc , marriage desc;

-- ������(not)
-- not in
-- not between
-- not like
-- not
-- is not null

-- �豸�� �������� ������ ��� ����� ����� ������.
select * from employees where id not in('kim9','yusin');

-- ��ȥ�� ����� ������ ��� ����� ����غ�����.
select * from employees where marriage not in('��ȥ');

-- �޿��� 220�� 230 ���̿� ���Ե��� ���� ����� ����غ�����.
-- ���ǻ������� null�� ���꿡 �ݿ��� �ȵȴ�.
select * from employees where salary not between 220 and 230;

-- ������ �达�� �ƴ� ��� ������� ����غ�����.
select * from employees where name not like '��%';

-- ���� ������ �Ϸ�� ������� ����غ�����.
select * from employees where salary is not null;

-- �����ڰ� �ƴ� �Ϲ� ��� ����� ����غ�����.
select * from employees where manager is not null;

-- ���������� ���������� ����غ��� 
-- �����̸鼭 �޿��� 230 �̸��� ������� ����غ�����.
select * from employees where gender = '����' and salary < 230 ;

-- ��ȥ�� �߿��� , ���빮�� �����ϴ� ������� ����غ�����.
select * from employees where marriage = '��ȥ' and address = '����';

-- ��ȥ�� �߿��� , ����̳� ������ �����ϴ� ������� ����غ�����.
-- �޿� ������ �������� �����ϼ���.
select * from employees where  marriage = '��ȥ' and address in('����','���')
order by salary ;

-- ������ �达 �̰ų� ������ ������� ����غ�����.
-- �̸��� ���Ͽ� �������� �����ϼ���.
select * from employees where name like '��%' or gender = '����'
order by name desc;

-- �����ڰ� �豸 �̸鼭 , ���빮�� �����ϴ� ������� ����غ�����.
select * from employees where manager = 'kim9' and address = '���빮';


-- dual ���̺�
-- dummy �÷�
select * from dual;

-- ���
select 4*3+2 from dual;
select 4*(3+2) from dual;
select 4*4*4 from dual;
select power(2,10) from dual;
select upper('abc123') from dual;
select lower('ABC123') from dual;

-- ���̵�� �̸��� ����� ������
select id, upper(id) , lower(id) , initcap(id) , name from employees;

-- concat �Լ� ����ϱ�
-- concat ���ڿ� ����(concatenation) �Լ��̴�.
select concat('���̵� : ' , name) as result from employees;

-- ����) �̸��� ȫ�浿�̰� , �޿��� 100���Դϴ�.
select concat(concat('�̸��� ' , name ), concat('�̰� , �޿��� ' , salary )) 
as result from employees;

-- substr �Լ�(1���̽�) : ���ڿ��� �κ� �����Ѵ�.
-- abc1234
-- 1234567
select substr(password , 4) from employees;
-- 4�� ���� ������ ����
select substr(password , 1, 3) from employees;
-- 1���� 3���� 
select substr(password , -5,2) from employees;
-- �ڿ��� 5��° ���� 2���� �������� 

-- ����� ���̵�� �̸��� ���� �� ���� �ΰ���?
select id ,length(id), name , length(name) from employees;

-- ����� ���̵� o�� ��� �ֳ���?
select id , name , instr(id,'o') from employees;

-- ����� ���̵� o�� ����ִ� ��� ����� ��ȸ�ض�.
select * from employees where instr(id , 'o') > 0;

-- �е� �Լ�
-- 10�ڸ��� ä��µ� ���ڶ�� '��'�� ä����
select id , lpad(id,10,'��') from employees;
select id , rpad(id,10,'��') from employees;

-- ġȯ �Լ�
-- ��� id�� o�� x�� �����غ�����.
select id , replace(id , 'o' , 'x') from employees;

-- Ʈ�� �Լ� 
-- ���� ���� ������ ������� ��� ������ ������� �ʴ´�.
select trim('   abc   123  ') from dual;
select rtrim('xxxabc123xxx','x') from dual;
select ltrim('xxxabc123xxx','x') from dual;

--����� id�� �������� id�� ��ȸ�� ������.
select id , reverse(id) from employees;

-- ������ �Լ� 
-- �ڹ� mathŬ������ �Բ� �����ϱ�
-- ������ ���� �����͸� �����ϰ� , �����ϵ��� �ϰڽ��ϴ�.
update employees set salary = 1.1 * salary;
update employees set salary = -123.4567 where id in('queen' , 'nongae');
commit;

-- abs �Լ��� ���� ���� ���� �ݴϴ�.
select id , name , salary , abs(salary) from employees;

--ceil() �Լ��� �ø� , floor() �Լ��� ���� ����� �����մϴ�.
select id , name , salary , ceil(salary) , floor(salary) from employees;

--round() �Լ��� �ݿø� , trunc() �Լ��� ���� ����� �����մϴ�.
select id , name , salary , round(salary) , trunc(salary) from employees;

--round() �Լ��� �پ��� ��� 
-- round(salary,1): �Ҽ��� 1��° ���� ǥ�� 
-- round(salary,-2) : -�� 10�� �ڸ����� �ݿø��Ѵ�. -1(�����ڸ�) , -2(�����ڸ�)
-- ��� �Ǵ� 0�� ��� �Ҽ��� ������ ���� �ڸ��� ���� �ݿø��ϼ���.
-- ������ ��� �Ҽ��� ���� �����ڸ����� �ݿø��ϼ���.
-- trunc() �Լ��� round() �Լ��� ������ ������� �ۿ��ϵ� , ������ ������ �����ϴ�.
select salary , round(salary) , round(salary,1) ,round(salary,-1) from employees;

--sqrt() �Լ��� ��Ʈ�� �����ִ� �Լ� �̴�.
select sqrt(5) from dual;
select round(sqrt(5),3) from dual;

-- ��� �޿��� ���Ͽ� ���밪���� �����ϰ� , ��Ʈ�� ���� ����� ����ϼ���.
select name ,sqrt(abs(salary)) from employees;

-- mod(n,m) �Լ��� n�� m���� ���� �������� ���� �ش�.
select mod(14,5) from dual;
select mod(1700,500) from dual;

-- where mod(salary , 10) = 0;
-- �޿��� 10�� ��� ...

-- ����� id�� ���̰� 5�� ����� ����鸸 ����ϼ���.
select * from employees where mod(length(id) , 5) = 0;

--power(a,b) �Լ��� a�� b������ �������ش�.
select power(2,3) from dual;

--sign(n) �Լ��� ���� n�� ��ȣ�� ������ش�.
select name , salary , sign(salary) from employees;

-- 11�� 10���� 

--��¥ �Լ�
select sysdate from dual;
alter session set nls_date_format = 'YYYY-MM-DD HH:MI:SS';
alter session set nls_date_format = 'YYYY/MM/DD HH';
select sysdate from dual;

-- 1�ð� = 1/24
-- 1�� = 1/24/60
-- 1�� = 1/24/60/60

alter session set nls_date_format = 'YYYY-MM-DD HH:MI:SS';

-- �Ϸ� ���� �ð��� ���غ�����.
select sysdate + 1 from dual;
-- �Ϸ� ���� �ð��� ���غ�����.
select sysdate - 1 from dual;
-- ���� �ð��� 2�ð� ������ �ð�, 5������ �ð��� ���� ������.
select sysdate , sysdate + 2/24 , sysdate - 5/24/60/60  from dual;

-- ������� �̸��� ���ϰ� ������� ��ƿ� �ϼ��� ��ȸ�غ�����.
select name , birth , round(sysdate - birth,3)as "��ƿ� ����" from employees;

select months_between(sysdate,'2020/01/01') from dual;

-- ��� ������� �̸��� ���ϰ� �� ���� ��ƿԴ� �� ��ȸ�غ�����.
select name, birth, round(months_between(sysdate, birth),3) from employees;

-- ���ݺ��� 3���� �� , 5���� ���� �ð��� ���غ�����.
select sysdate , add_months(sysdate , 3) , add_months(sysdate , -5) from dual;

-- �豸�� �������� ������ 5���� �������� �����ϼ���.
update employees set birth = add_months(birth , -5) where id = 'kim9' or id = 'general';

-- Ȳ���̿� ���������� ������ 74�� �������� �����ϼ���.
update employees set birth = birth - 74 where id = 'maria' or id = 'hwang';

-- �̹��� �ݿ����� �� ���ΰ�?
select next_day(sysdate , '��') from dual;
select next_day(sysdate , 'ȭ') from dual;

-- �̹����� ������ ��¥�� �� ���ΰ�?
select last_day(sysdate) from dual;

-- �� ���� , �̹��� 15�� ���� ���� �ð��� ��ġ�ϰ� �����Ƿ� 11/1 ��µ� 
-- �߰� 15���� ������ �Ϳ� 1���� ��µ� 
select round(sysdate , 'month') from dual;

-- �� ���� , ���� �Ϲݱ��̹Ƿ� ���� 21/1/1 ��µ� 
select round(sysdate , 'year') from dual;

-- ���Ϲݱ� �ȵ����� ������ �����ع��� 
select trunc(sysdate , 'month') from dual;
select trunc(sysdate , 'year') from dual;

-- to_char �Լ�
select sysdate, to_char(sysdate , 'yyyy-mm-dd') from dual;

-- ������� �̸��� ������ ����� ������.
-- ������ '��/��' �������� ����ؾ� �մϴ�.
select name , to_char(birth , 'mm/dd') from employees;

select name , to_char(birth , 'year month') from employees;

-- ���� ��ҿ� �������� �ʴ� �׸��� �ݵ�� �ֵ���ǥ�� �ѷ� �ξ� �Ѵ�.
-- ������� �̸��� ������ ����� ������.
-- ������ 'yyyyҴmm��dd��' �������� ����ؾ� �մϴ�.
select name , to_char(birth , 'yyyy"Ҵ" mm"��" dd"��"') as "��������" from employees;

-- �Ͻ��� ����ȯ
select 'abc'|| 123 from dual;


-- ����� ����ȯ
select 'abc'|| to_char(123) from dual;

--? 
select 100 + '100' from dual;

select 100 + to_number('100') from dual;

select 
to_char(12345,'$999,999.00') as salary01, 
to_char(12345,'$000,000.00') as salary02,
--L�� ������ȭ 
to_char(12345,'L999,999.00') as salary03,
to_char(12345,'000,000.00') as salary04 
from dual;

-- �Ϲ� �Լ� �ǽ��� ���� ���� �غ�
update employees set salary = 200.0 where id = 'nongae';
update employees set salary = 300.0 where id = 'queen';
commit;

--�տ� ���� ���� null���� �ƴ��� ����.
select nvl(null,'����') from dual;
select nvl('������','����') from dual;

--��� ������� �̸��� �޿��� ��ȸ�غ�����.
--�� , �޿��� �������� �ʴ� ����� �⺻������ 100�̶�� �����մϴ�.
select name , nvl(salary , 100) newsalary from employees;

--��� ������� �̸��� ������ ���̵� ��ȸ�غ�����.
-- �������� ������� �⺻������ '������'�̶�� ��µǾ�� �Ѵ�.
select name , nvl(manager , '������') newmanager from employees;

--��� ������� �̸��� �޿��� ������ ��ȸ�غ�����.
--�� , �޿��� �������� �ʴ� ����� �⺻������ 100�̶�� �����մϴ�.
select name , nvl(salary , 100) newsalary ,12*nvl(salary , 100) newannsal from employees;

--��� ������� �̸��� �޿��� ��ȸ�غ�����.
--�׸��� , �޿��� ���� ���ο� ���Ͽ� �ڸ�Ʈ�� �߼��ϵ��� �ϼ���.
select name , salary , nvl2(salary , '�޿� ������' , '�޿��� null��') from employees;

--��� ����� �̸��� ��ȥ���ο� ���¸� ��ȸ�Ͻÿ�.
--�� , ���´� ��ȥ ���ΰ� '��ȥ'�� ������� null������ ��ü�ϼ���.
select id , name , marriage , nullif(marriage, '��ȥ') as result
from employees;

-- manager �� ������ ����� ���� 
-- null�̸� �޿��� ������ null���� �ƴ��� ã�� 
-- ���࿡ manager�� salary ��� ���̸� '��� null' �� ó����
select name , coalesce(manager, to_char(salary) , '��� null')as result from employees;

-- case ���� 
-- manager �÷��� �̿��Ͽ� ������ ������ ����غ�����.
select id , name , manager,
case manager
when 'yusin' then '������ �屺'
when 'soon' then '������ ����'
when 'kim9' then '�豸 ������'
else '������' end as result
from employees;

-- ������� �̸��� �޿��� �ڸ�Ʈ�� ����ϼ���.
-- �Ļ������ �����ڰ� 'yusin'�̸� , �޿��� 10% �λ�� ,
-- �����ڰ� 'soon'�̸� , �޿��� 20% �λ��,
-- �����ڰ� 'kim9'�̸� , �޿��� 30% �λ��,
-- �������� �޿��� ����ؾ� �Ѵ�.
-- ��, �޿��� null�̸� �⺻ ������ 100�� �����մϴ�. 
select name , salary , manager,
case manager
when 'yusin' then nvl(salary , 100)*1.1
when 'soon' then nvl(salary , 100)*1.2
when 'kim9' then nvl(salary , 100)*1.3
else nvl(salary , 100) end as result
from employees;

-- �޿��� 200�̸��̸� 'low', 240�̸��̸� 'middle' , 240�̻��̸� 'high'�� ����غ�����.
select name , salary ,
case 
when nvl(salary,100) < 200 then 'low'
when nvl(salary,100) < 240 then 'middle'
else 'high' end as result 
from employees;

-- 4�б� 
select to_char(sysdate,'Q') from dual;

-- ? 
-- ������� �̸��� ���ϰ� �б⸦ ����� ������.
-- �� , ���� ������ �����ϵ��� �ϰ� , case ������ ����ؾ� �˴ϴ�. 
select name , to_char(nvl(birth,sysdate) ,'yyyy/mm/dd') as birth,
case  to_number(to_char(birth , 'Q'))
when 1 then '1��б�'
when 2 then '2��б�'
when 3 then '3��б�'
else '4��б�' end as quarter
from employees;

-- 11�� 11����
-- set ���� ������

create table set_a(val number);
create table set_b(val number);

insert into set_a(val) values(1);
insert into set_a(val) values(2);
insert into set_a(val) values(3);
insert into set_a(val) values(4);

insert into set_b(val) values(3);
insert into set_b(val) values(4);
insert into set_b(val) values(5);
insert into set_b(val) values(6);
commit;

select * from set_b;

-- ������
select * from set_a union select * from set_b;

-- ��� ��� ���
select * from set_a union all select * from set_b;

-- ������
select * from set_a intersect select * from set_b;

-- ������
select * from set_a minus select * from set_b;

-- ��� ���̺��� ���ڸ� �����Ͽ� ���̺� table01�� ��������.
-- �� , �豸�� �����ϵ��� �ϼ���.
-- ���ڵ� �߿��� ��ȥ�ڸ� �߰����ּ���.

create table table01
as 
select * from employees where gender = '����' and id <> 'kim9';

insert into table01
select * from employees
where gender = '����' and marriage = '��ȥ';

-- ��� ���̺��� ���ڸ� �����Ͽ� ���̺� table02�� ��������.
-- ���ڵ� �߿��� ��ȥ�ڸ� �߰����ּ���.

create table table02
as 
select * from employees where gender = '����' ;

insert into table02
select * from employees
where gender = '����' and marriage = '��ȥ';

commit;
select * from table01;
select * from table02;

select * from table01 union all select * from table02;

select id , name , address from table01 
union 
select id , name , address from table02
order by id desc;

-- ������ �ѹ��� �ϱ� 
select id , name , address from table01 
intersect
select id , name , address from table02 
order by name desc;

-- ��ȯ ��Ģ ���� x
select id , name , address from table01 
minus
select id , name  , address from table02 
order by name desc;

-- ��ȯ ��Ģ ���� x
select id , name , address from table02 
minus
select id , name , address from table01 
order by name desc;

-- �Ļ� �÷��� �����ϴ�.
-- ���� �÷��̸��� ���� --> �˸��ƽ��� ����
-- ��Ī�� ù ��° sql �������� �ۼ����ָ� �ȴ�.
select id , name , address , '�����' as remark from table01 
union
select id , name , address , '�Ż��'from table02 
order by name desc;

-- �÷��� �̸��� ù��° sql������ �̸��� ������.
-- address�� name �� �Ѵ� ���ڿ��� ���������δ� ��������
-- ������ , �������� ���� ������ ���� ������ 
select id ,address,name from table01 
union
select id , name , address from table02 ;


-- �׷�(����) �Լ�
-- ��� ����� ���� ���� ������.
select count(*) from employees;

-- �޿��� null�� �ƴ� ����� ���� ���غ�����.
select count(salary) from employees;

-- �޿��� null �� ����� ��ΰ���?
select (count(*)-count(salary))as result from employees;

-- marriage �÷��� �� �� ���ΰ���?
select count(marriage) from employees;

-- marriage �÷����� ��� ������ �����Ͱ� �ֳ���?
select count(distinct marriage) from employees;

-- �޿��� ����� ���� ������.
select avg(salary) from employees;

-- �޿��� ����� ���ϵ� , null�� ����� 100���� ġȯ�Ͽ� ����ϼ���.
select avg(nvl(salary,100)) from employees;

-- �޿��� �ѱݾ��� ���غ�����.
select sum(salary) from employees;

-- �޿��� �ѱݾ��� ���ϵ� , null�� ����� 100���� ġȯ�Ͽ� ����ϼ���.
select sum(nvl(salary,100)) from employees;

-- �ִ� �޿��� ���ΰ���?
select max(salary) from employees;

-- �ּ� �޿��� ���ΰ���?
select min(salary) from employees;

-- ���̵� �������� ���� ���� ��ȸ�Ǵ� ���̵�� �����ΰ���?
select min(id) from employees;

-- �̸��� �������� ���� ���߿� ��ȸ�Ǵ� �̸��� �����ΰ���?
select max(name) from employees;

-- �׷���(group by) 
-- group by �� ���� �÷��� �ݵ�� select ������ �����ش�.
-- ���� �� �� ���ΰ���?
select gender, count(*) as ���� from employees group by gender
order by gender;

-- ���� ���� �޿��� ���� �� �ּ� �޿��� ���غ�����.
-- �� , �޿��� null�̸� 100���� ġȯ�Ͽ� ����ؾ��Ѵ�.
select gender , sum(nvl(salary,100)) as ���� ,min(nvl(salary,100)) as �ּ� from employees group by gender;

-- ��ȥ ����(marriage �÷�)�� ���� �� ���ΰ���?
select marriage,count(marriage) as ���� from employees group by marriage;

-- ������(address �÷�) ���� �� ���� �����ϰ� �ֳ���?
select address,count(address) as ���� from employees group by address ; 

-- ����,������ ���� �� ���ΰ���?
select gender , address , count(*) as cnt from employees group by gender, address  
order by gender, address;

-- ����, ��ȥ ������ ���� �� ���ΰ���?
select gender , marriage, count(*) as cnt from employees group by gender , marriage
order by gender , marriage ;

-- ���빮�� �����ϴ� ��,��� ���� �� ���ΰ���?
select gender , count(*) as cnt from employees where address = '���빮' group by gender ;

-- ������ �����ϴ� ��ȥ���� ���ະ �޿��� �Ѿ��� ���غ�����.
select gender , sum(salary) as �Ѿ� 
from employees 
where birth is not null and marriage = '��ȥ' 
group by gender;

-- having �� 
-- ����, ��ȥ ������ ���� �� ������ ��ȸ�ϵ� , 3�� �̻� ��ȸ�ǵ��� �ϼ���.
select gender , marriage, count(*) as cnt 
from employees 
group by gender , marriage
having count(*) >=3 
order by gender , marriage;

-- ���� ���� �޿��� ���� �߿��� ������ 2000�̸��� �ุ ��ȸ�غ�����.
-- �� , �޿��� null�� ��� 100���� ġȯ�ϵ��� �Ͽ���.
select gender , sum(nvl(salary,100)) as ����
from employees
group by gender
having sum(nvl(salary,100)) < 2000;

-- ��ȥ ������ �ִ� �޿��� �ּ� �޿��� ��ȸ�� ������.
-- ��, ��ȥ ������ �ִ� �޿��� �ּ� �޿��� ���̰� 100�̻��̾���մϴ�.
select marriage , max(salary) , min(salary)
from employees
group by marriage 
having (max(salary) - min(salary))>=100 ;

-- �����ڰ� �ƴ� �Ϲ� ��� �߿��� ������ 6�� ������ �����͸� ��ȸ�غ�����.
select gender, count(*) as cnt
from employees
where manager is not null
group by gender
having count(*)<= 6;

-- �����ڰ� �ƴ� �Ϲ� ����߿��� ��ȥ ���� ���� �޿��� �Ѿ��� 1000�̻��� �ุ ��ȸ�غ�����.
select marriage , sum(salary) as sumsal
from employees
where manager is not null
group by marriage
having sum(salary) >= 1000;

-- ������ �����ΰ���?
select gender, count(*) from employees;

-- �ذ�01. gender �÷��� ���ָ� ��ü ����� ���� �ȴ�.
select count(*) from employees;

-- �ذ�02. group by ���� gender�� ����ϸ� ���� ������ �ο����� �ȴ�.
select gender, count(*) from employees group by gender;

-- �׷��Լ��� where ���� ��� �Ұ����ϴ�.
select gender, count(*) from employees 
where count(*)>10
group by gender;

-- �ذ�03. group by ���� having ���� ������ ����Ѵ�.
select gender, count(*) from employees 
group by gender
having count(*)>10;

-- ���� ���Ἲ ���� ���� ����� ��� 
-- �ݵ�� , �ڽ����̺��� �ۼ��ؾ��մϴ�.
-- alter table �ڽ����̺� �̸�
-- add constraint ���������̸� ---> �ݵ�� unique
-- foreign key(����Ű �̸�)
-- references �θ����̺��̸�(�⺻Ű �̸�)
-- [on delete cascade | set null]; ---> �θ� ���������� �ڽ��� null������ �ٲ����� : delete set null (ex.ȸ���� Ż�� �ϴ� ��� , ������ �ۼ��� �Խù��� ���⵵�� �ϰڽ��ϴ�.)
                                   ---> �ڽ��� ������ ���������� : delete cascade

-- �Խù� ���̺� �̸��� boards��� �����մϴ�.
-- boards�� �÷� ���� 
-- no(�۹�ȣ) , writer(�ۼ���) , password(��й�ȣ) , subject(������) , content(�۳���), readhit(��ȸ��) , regdate(�ۼ�����) 

alter table boards
add constraint aaa
foreign key(writer)
references employees(id)
on delete set null;

-- ��ǰ�� �������� �� , ������?
-- on delete set null;

-- �ֹ� ���̺�� �ֹ� �� ���̺��� �ִ�.
-- �ֹ� ��ҽ� �ֹ� �� ���̺���?
-- on delete cascade;


-- ������
create sequence seqtest01;

-- ���� ������ ������ ���
select * from seq;

-- ��ȣǥ�� �̾� ���ϴ�.
select seqtest01.nextval from dual;

-- ��� ����� ��ȣǥ�� Ȯ���մϴ�.
select seqtest01.currval from dual;

-- ���� 4������ ����Ǿ� �ִ� ���� �Դϴ�.

create table seqtable(
    no number primary key,
    remark varchar2(30)
);

--���̺� �����͸� �߰��մϴ�.
insert into seqtable(no,remark) values(seqtest01.nextval,'������');

commit;
select *from seqtable;

insert into seqtable(no,remark) values(seqtest01.nextval,'ȣȣȣ');
insert into seqtable(no,remark) values(seqtest01.nextval,'������');
insert into seqtable(no,remark) values(seqtest01.nextval,'ũũũ');

commit;

-- ���� ������ ������ �߻��մϴ�.
-- �Ǽ��� values ��� value�� Ÿ���� �߽��ϴ�. 
-- 9���� �����µ� ���� 
-- ����� ������ ��ȣ�� ������ ������ �ִ���, ������ ���ϰ� ��� �ȴ�.
insert into seqtable(no,remark) value(seqtest01.nextval,'������');

-- �ùٸ� ������ ������ ���� �Է� �մϴ�.
-- ����� �߰��ɱ��?
insert into seqtable(no,remark) values(seqtest01.nextval,'�󸶹�');


commit;
select * from seqtable;

-- ���� ���� 10 , ����ġ�� 10 , �ִ밪�� 60
create sequence seqtest02
start with 10 increment by 10 maxvalue 60 ;

-- 60�� �ʰ��ϸ� �����޼����� ���� 
select seqtest02.nextval from dual;

-- �ʱ� ���� 1 , ����ġ�� 2�� ������ seqtest03�� �����ϼ���.
-- seqtable �����͸� ��� �����ϰ�, ������ seqtest03�� ����Ͽ� 5�Ǹ� �߰��غ�����.
create sequence seqtest03
start with 1 increment by 2;

delete from seqtable;
insert into seqtable(no,remark) values(seqtest03.nextval,'������');
insert into seqtable(no,remark) values(seqtest03.nextval,'������');
insert into seqtable(no,remark) values(seqtest03.nextval,'�ٴٴ�');
commit;
select * from seqtable;

-- �������� ���� ���� 
alter sequence seqtest01 
increment by 100 
maxvalue 100000;

insert into seqtable(no,remark) values(seqtest01.nextval,'������');
insert into seqtable(no,remark) values(seqtest01.nextval,'�ٹٹ�');

drop sequence seqtest01;
drop sequence seqtest02;
drop sequence seqtest03;

select * from seq;
select * from seqtable;

-- ������ ������ ���� , �������Ͽ� ���� ������ ������ ���ϴ�.
select seqtest01.nextval from dual;

-- �Խù� ���̺� ����� 
-- ���� ������ �����
create sequence seqboard;

create table boards(
    no number primary key,
    writer varchar2(30),
    password varchar2(50),
    subject varchar2(50),
    content varchar2(50),
    readhit number default 0,
    regdate date default sysdate
);

-- ���� ���Ἲ �������� 
alter table boards
add constraint boards_writer_fk
foreign key(writer)
references employees(id)
on delete set null;

drop sequence seqboard;
create sequence seqboard;
delete from boards;
-- �Խù� ������ ��� 
insert into boards(no , writer , password , subject , content , readhit , regdate)
values(seqboard.nextval, 'an' , 'abc123' , '�ڹ�' , '�ʹ� �����' , default , '80/12/25');

insert into boards(no , writer , password , subject , content , readhit , regdate)
values(seqboard.nextval, 'an' , 'abc123' , 'db' , '�׷� ����' , default , '88/07/17');

insert into boards(no , writer , password , subject , content , readhit , regdate)
values(seqboard.nextval, 'an' , 'abc123' , 'jsp' , '�� ���α׷���' , default , '86/08/15');

insert into boards(no , writer , password , subject , content , readhit , regdate)
values(seqboard.nextval, 'queen' , 'abc123' , 'jdbc' , '���̵��' , default , '90/01/22');

insert into boards(no , writer , password , subject , content , readhit , regdate)
values(seqboard.nextval, 'queen' , 'abc123' , 'sql' , '����ť��' , default , '93/06/17');

insert into boards(no , writer , password , subject , content , readhit , regdate)
values(seqboard.nextval, 'maria' , 'abc123' , '�ڹ�' , 'java' , default , '00/01/22');

insert into boards(no , writer , password , subject , content , readhit , regdate)
values(seqboard.nextval, 'maria' , 'abc123' , 'sql' , 'ȣȣȣ' , default , '08/06/17');


insert into boards(no , writer , password , subject , content , readhit , regdate)
values(seqboard.nextval, null , 'abc123' , '�ڹ�' , 'java' , default , '00/01/22');

insert into boards(no , writer , password , subject , content , readhit , regdate)
values(seqboard.nextval, null , 'abc123' , 'sql' , 'ȣȣȣ' , default , '08/06/17');

select * from boards;


-- 11�� 12�� ��
-- �����ϱ�
-- �Խù��� �ۼ��� ����� �̸��� �� ������ ����� ������.

-- ����Ŭ ����
select employees.name,boards.subject
from employees,boards
where employees.id = boards.writer;

-- Ansi ����
-- ���� ǥ�� ���� ��� 
select employees.name,boards.subject
from employees join boards
on employees.id = boards.writer;

-- ��Ī�� ����ϴ� ���
-- ����Ŭ ����
-- from ���� ������ �÷����� ���δ� ��Ī���� �ٲ���� �ν��� �����ϴ�.
select e.name,b.subject
from employees e , boards b 
where e.id = b.writer;

-- Ansi ����
-- ���� ǥ�� ���� ��� 
select e.name,b.subject
from employees e join boards b
on e.id = b.writer;

-- �߰����� ������ and �����ڸ� ����ϸ� �ȴ�. 
-- ����Ŭ ����
-- from ���� ������ �÷����� ���δ� ��Ī���� �ٲ���� �ν��� �����ϴ�.
select e.name,b.subject
from employees e , boards b 
where e.id = b.writer
and e.name in('���߱�','��������');

-- Ansi ����
-- ���� ǥ�� ���� ���
-- join �̶�� ������ ����Ʈ ���� inner��. 
select e.name,b.subject
from employees e join boards b
on e.id = b.writer
and e.name in('���߱�','��������');

-- non equi join�� �ǽ��ϱ� ���Ͽ� ���� �ڵ带 �����Ѵ�. 
-- rownum : �����Ͱ� �� ���� ��ȣ�� ����ϰ� �ִ�.
--          ����Ŭ�� ���������� ������ ���� �÷��̴�.
select rownum ,id , name , salary from employees;

update employees set salary = 100 * rownum;
commit;
select * from employees;

-- �޿� �򰡿� ���̺��� �ۼ��Ѵ�.
create table grades(
    glevel  varchar2(2),
    lovsal  number,
    highsal number
);

insert into grades values('A',0,499);
insert into grades values('B',500,999);
insert into grades values('C',1000,1499);
insert into grades values('D',1500,1999);
insert into grades values('E',2000,10000);
commit;

alter table grades rename column lovsal to lowsal;
select * from grades;

-- �� ������� �̸��� �޿��� �޿� �� ����� ����ϼ���. 
-- non-equi join
select e.name , e.salary , g.glevel
from employees e , grades g 
where e.salary between g.lowsal and g.highsal;


-- ����� �̸��� �Խù��� ����� ������ ��ȸ�� ������.
-- �� , �Խù��� ������ ���� ����鵵 ���� ��ȸ�Ǿ�� �Ѵ�.
-- employees ���� , boards �� �������̶�� ������ ���� �������� ���� ��ȸ�Ǿ���� 

-- ����Ŭ�� left outer join
select e.name , b.subject , b.content
from employees e , boards b
where e.id = b.writer(+);
-- b.writer �� �� ������ ������ ������ e.id �� �ȴ�.
-- 1:�� ���� 
-- ���� lert outer join 
-- ����Ŭ ������ �׷�����..�ϰ� �Ѿ��..

-- Ansi�� left outer join
select e.name , b.subject , b.content
from employees e left outer join boards b
on e.id = b.writer;

-- ����� �̸��� �Խù��� ����� ������ ��ȸ�� ������.
-- �� , Ż���� ���� ������� ��ϵ� ���� ��ȸ�Ǿ�� �Ѵ�.
-- employees ���� , boards �� �������̶�� ������ ������ �������� ���� ��ȸ�Ǿ���� 
-- ����Ŭ�� right outer join
select e.name , b.subject , b.content
from employees e , boards b
where e.id(+) = b.writer;

-- Ansi�� right outer join
select e.name , b.subject , b.content
from employees e right outer join boards b
on e.id = b.writer;

-- full outer join 
-- ����Ŭ ���� ����� ���� .. 
-- Ansi�� full outer join
select e.name , b.subject , b.content
from employees e full outer join boards b
on e.id = b.writer;


-- self join 
-- ���� ���̺��� �����ϴ� ���
-- ���߱��� �����ڴ� �豸�Դϴ�. 
-- ���_���̺�.������_���̵� = ������_���̺�.���̵�

select emp.name || '�� �����ڴ� ' || mgr.name || '�Դϴ�.' as result
from employees emp inner join employees mgr 
on emp.manager = mgr.id;

-- ���� �������� �����ڵ� ���Եǵ��� �����غ�����.
-- �����ڴ�  '����'�̶�� ����� ������ �Ѵ�.
-- ��� ���̺��� null���� �����ڵ� ���;��ϴ� left outer join�̾�� �Ѵ�.
select emp.name || '�� �����ڴ� ' || nvl(mgr.name, '����') || '�Դϴ�.' as result
from employees emp left outer join employees mgr 
on emp.manager = mgr.id;

-- �� ������� ����� �Խù��� ���峪��?
select e.name, count(*) as cnt
from employees e join boards b
on e.id = b.writer
group by e.name;

-- �� ������� ����� �Խù��� ���峪��?
-- �Խù��� ������ ���� ����� 0���� ����غ�����.
select e.name, count(writer) as cnt
from employees e left outer join boards b
on e.id = b.writer
group by e.name;

-- ���� ����
-- �ּ� �޿��� ���ΰ���?
select min(salary) from employees;

-- �ּ� �޿��� �޴� ����� �̸��� �޿��� �ּҸ� ����غ�����.
select name , salary , address from employees where salary = 100;

-- ���� ����
-- input , output �� �ι� �̷������ , �ѹ��� ó���ϱ� ���Ͽ� ����Ѵ�.
-- ������ �켱������ ���Ͽ� �Ұ�ȣ�� �ۼ��� ��
-- �ٱ� select : main ���� , ���� select : ��������
select name , salary , address 
from employees 
where salary = (select min(salary) from employees);


-- ��պ��� ���� �޿��� �޴� ������� �̸��� �޿��� ����غ�����.
select name , salary 
from employees
where salary >= (select avg(salary) from employees);

-- �������� �̸��� �豸�� ������� ���̵� , �̸� , ������ ���̵� ����غ�����.
select id , name , manager
from employees
where manager = (select id from employees where name = '�豸');

-- �������� �̸��� �豸�� ������� ���̵� , �̸� , ������ ���̵� ����غ�����.
-- �� , �豸�� ���� ��µǾ�� �Ѵ�.
-- �߰� ������ and�� or�����ڸ� ����Ͽ� ó���ϸ� �ȴ�.

select id , name , manager
from employees
where manager = (select id from employees where name = '�豸' )
or name = '�豸';

-- ���������� �޿����� ���� �޿��� �޴� ������� �̸��� �޿��� ��ȸ�غ�����.
select name , salary
from employees
where salary < (select salary from employees where name = '��������');

-- �����ڰ� '�豸'�̸鼭 , ��� �޿� ���� ���� �޿��� �޴� ����� ���̵�, �̸� , �޿��� 
-- ��ȸ�غ�����.

select id , name , salary
from employees
where salary <= (select avg(salary) from employees )
and manager = (select id from employees where name ='�豸');

-- ������ ���� ����
-- �������� �̸��� '�豸'�̰ų� '������'�� ������� ���̵�� �̸��� ������ ���̵� ��ȸ�غ�����.
-- �豸�� ������ 2�� �� ��ȸ = ������ 
select id , name , manager 
from employees
where manager in (select id from employees where name in ('�豸' , '������'));

-- �Խù��� ���� ������� �̸��� ���ϰ� ������ ����ϼ���.
select distinct writer from boards where writer is not null;

select name , birth , gender
from employees 
where id in (select distinct writer from boards where writer is not null);


-- ��ȥ ������ ��ȥ�� �ƴ� ������� �̸��� ���ϰ� ������ ����ϼ���.
select name , birth , gender , marriage
from employees
where name in (select name from employees where marriage <> '��ȥ');


-- �����ڰ� �������� ������� ��ȸ�� ������.
select name , salary
from employees
where manager = 'soon';

-- ���� 900��, �ִ� 1600��

-- �����ڰ� �������� ��� �߿��� �ּ� �޿��� ���� ���� �޴� ������� ��ȸ�� ������.
-- any : ������
-- �ϳ��� true�� ������ �����  
select name , salary from employees
where salary > any (select salary from employees where manager = 'soon');

-- �����ڰ� �������� ��� �߿��� �ִ� �޿��� ���� ���� �޴� ������� ��ȸ�� ������.
select name , salary from employees
where salary < any (select salary from employees where manager = 'soon');

-- all : ���δ� true ���� ����� 
-- �����ڰ� �������� ��� �߿��� �ִ� �޿��� ���� ���� �޴� ������� ��ȸ�غ�����.
select name , salary from employees
where salary > all (select salary from employees where manager = 'soon');

-- �����ڰ� �������� ��� �߿��� �ּ� �޿��� ���� ���� �޴� ������� ��ȸ�غ�����.
select name , salary from employees
where salary < all (select salary from employees where manager = 'soon');

-- ������ ���� �޿����� �̸��� �޿��� ������ ���غ�����.
-- where  ���� �÷��� ������ ���� ���� �ִ�.
select gender , min(salary) from employees group by gender;

select name , salary , gender from employees 
where (gender,salary) in (select gender , min(salary) from employees group by gender);

-- ��ȥ ������ ���� �޿����� �̸��� �޿��� ��ȥ ���� �÷��� ��ȸ�غ�����.
-- ���� �Լ��� 1���� �����ϴ�.
select name , salary , marriage from employees
where (marriage ,salary) in (select marriage , min(salary) from employees group by marriage);

select min(salary) from employees group by gender;

-- 1 : 1 �����ε� ��ȸ�Ǵ� ���� 2���� 
-- ������ �����ڷ� ������ ������� �񱳸� �Ϸ��� �õ��� �� ������ ���� �޼����Դϴ�. 
select name , salary 
from employees
where salary = (select min(salary) from employees group by gender); 

-- �������� �ʴ� ��� '������'�� ��ȸ�ϸ� ���� ������ ������� null �Դϴ�.
-- ���� , ������ �߻����� �ʰ� ��ȸ�Ǵ� ����� �����ϴ�. 
select name , salary from employees
where id = (select id from employees where name = '������');

select * from employees;
