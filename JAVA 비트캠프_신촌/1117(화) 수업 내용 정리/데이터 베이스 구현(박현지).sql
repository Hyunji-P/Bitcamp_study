--11�� 17����
-- [����]

-- ����01)
-- ������� ���ǡ�
create user dori identified by oracle 
quota unlimited on users
account unlock; 

alter user dori default tablespace users;

grant create session to dori;
grant create table to dori;

-- �ᰩ���� ���ǡ�
create table members(
    id varchar2(10) primary key,
    name varchar2(30) not null,
    address varchar2(15),
    hobby varchar2(30) check (hobby in('�籸','��Ʈ','�°�')),
    salary number default 100
);

alter table members add constraint SYS_C007073 check (salary >=100);

insert into members values ('hong' , 'ȫ�浿' , '���� ����' , '�籸' , 100);
insert into members values ('park' , '�ڿ���' , '��� ����' , '��Ʈ' , 200);
insert into members values ('kim' , '��ö��' , '���� ����' , '�°�' , 300);
insert into members values ('choi' , '������' , '������' , '�°�' , 300);
commit;

select * from members;

create table boards(
    writer varchar2(10) ,
    subject varchar2(30),
    password varchar2(15),
    content varchar2(50),
    readhit number default 0
);

insert into boards values('hong','jsp�����','1234','���� �������',0);
insert into boards values('hong','� ��','1234','���� ������',5);
insert into boards values('hong','�����սô�','1234','�۸۸�',2);
insert into boards values('park','� ��','1234','������������',0);
insert into boards values('park','�����սô�','1234','��������',5);
commit;

select * from boards;

alter table boards
add constraint asdf
foreign key(writer)
references members(id);

select m.id , b.subject , b.password
from members m join boards b
on m.id = b.writer;

--------------------------------------------------------------------
-- ����02)
-- ������� ���ǡ�
create user soon identified by oracle
quota unlimited on users
account unlock;

alter user soon default tablespace users;

grant create session to soon;
grant create table to soon;
grant create sequence to soon;

-- �ᰩ���� ���ǡ�
create sequence seqtest01;

create table BranchA(
    id varchar2(10),
    name varchar2(30),
    publisher varchar(50),
    price number
);

alter table brancha modify(id number);

insert into brancha(id,name,publisher,price) 
values (seqtest01.nextval , '�߱��� ����' , '���ϸ� ������' , 1000);

insert into brancha(id,name,publisher,price) 
values (seqtest01.nextval , '���� �౸' , '���� ���ǻ�' , 2000);

insert into brancha(id,name,publisher,price) 
values (seqtest01.nextval , '�������� ����' , '���� ���ǻ�' , 3000);

commit;


create sequence seqtest02;

create table BranchB(
     id number,
     name varchar2(30),
     publisher varchar(50),
     price number
);

select seqtest02.nextval from dual;

insert into branchb(id,name,publisher,price) 
values (seqtest02.nextval , '�߱��� ����' , '���ϸ� ������' , 1000);

insert into branchb(id,name,publisher,price) 
values (seqtest02.nextval , '�籸 ����' , '���� ���ǻ�' , 4000);

insert into branchb(id,name,publisher,price) 
values (seqtest02.nextval , 'ȣ�ż�' , '���ϸ� ������' , 5000);
commit;

select * from brancha;
select * from branchb;

--------------------------------------------------------------------
-- ����03)

-- �ᰩ���� ���ǡ�
grant select on brancha to dori;
grant select on branchb to dori;

-- �ᰩ���� ���ǡ�
create table mybranch
as
select  * from soon.brancha
union 
select  * from soon.branchb;

select * from mybranch;

--------------------------------------------------------------------
-- ����04)
-- �ᰩ���� ���ǡ�
alter table members modify(address varchar2(80));
update members 
set address = '����� ������ ������ ���� ���̾� Ǫ������ 111�� 2222ȣ'
where id = (select id from members where name = '�ڿ���');

select * from user_cons_columns;

alter table members drop constraint SYS_C007071;
alter table members add constraint SYS_C007071 check (hobby in ('�籸','��Ʈ','�°�','����'));
insert into members values('lee','�̼���','���빮 ����','����',500);

alter table members drop constraint SYS_C007073;
alter table members add constraint SYS_C007073 check (salary >= 0);
insert into members values('shin','�Ż��Ӵ�','���빮 ����','����',30);

commit;
select * from members;

--------------------------------------------------------------------
-- ����05)
-- �ᰩ���� ���ǡ�
select * from user_cons_columns where table_name = 'MEMBERS';

alter table members rename constraint SYS_C007070 to members_name_nn;

alter table members rename constraint SYS_C007071 to members_hobby_ck;

alter table members rename constraint SYS_C007072 to members_id_pk;

alter table members rename constraint SYS_C007073 to members_salary_ck;


--------------------------------------------------------------------
-- ����06)
-- ������� ���ǡ�
grant create view to dori;

-- �ᰩ���� ���ǡ�
--�ñ���01
create or replace view minview
as
select name , salary , address 
from members
where salary = (select min(salary) from members);

select * from minview;

grant select on minview to soon;

--�ñ���02
create or replace view noboard
as
select m.name , m.address
from members m left outer join boards b 
on m.id = b.writer
where b.content is null;

select * from noboard;

grant select on noboard to soon;

-- �ᰩ���� ���ǡ�
--�ñ���01
select * from DORI.minview;

--�ñ���02
select * from DORI.noboard;

--------------------------------------------------------------------
-- ����07)
-- ������� ���ǡ�
create role newrole;
grant create view, create role to newrole;  
grant newrole to soon;

select * from role_sys_privs where role = 'NEWROLE' ;
select * from dba_role_privs where grantee = 'SOON' ;

-- �ᰩ���� ���ǡ�
create role soonrole;
grant select , insert on brancha to soonrole;

grant soonrole to dori;

-- �ᰩ���� ���ǡ�
select * from soon.brancha where price = 2000;

insert into soon.brancha 
values (77, '�����ͺ��̽�����' , '���� ���ǻ�' , 10000);
commit;

update soon.brancha set id = 1 where id = 77;

select * from soon.brancha;

-- �ᰩ���� ���ǡ�
select * from BranchA order by id;