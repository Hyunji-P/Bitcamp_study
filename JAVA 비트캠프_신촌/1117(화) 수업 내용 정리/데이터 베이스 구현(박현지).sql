--11월 17일차
-- [시험]

-- 문제01)
-- ■관리자 세션■
create user dori identified by oracle 
quota unlimited on users
account unlock; 

alter user dori default tablespace users;

grant create session to dori;
grant create table to dori;

-- ■갑돌이 세션■
create table members(
    id varchar2(10) primary key,
    name varchar2(30) not null,
    address varchar2(15),
    hobby varchar2(30) check (hobby in('당구','퀼트','맞고')),
    salary number default 100
);

alter table members add constraint SYS_C007073 check (salary >=100);

insert into members values ('hong' , '홍길동' , '마포 공덕' , '당구' , 100);
insert into members values ('park' , '박영희' , '용산 도원' , '퀼트' , 200);
insert into members values ('kim' , '김철수' , '강남 역삼' , '맞고' , 300);
insert into members values ('choi' , '최제우' , '세종시' , '맞고' , 300);
commit;

select * from members;

create table boards(
    writer varchar2(10) ,
    subject varchar2(30),
    password varchar2(15),
    content varchar2(50),
    readhit number default 0
);

insert into boards values('hong','jsp어려워','1234','정말 어려워요',0);
insert into boards values('hong','어떤 글','1234','정말 쉬워요',5);
insert into boards values('hong','열공합시다','1234','멍멍멍',2);
insert into boards values('park','어떤 글','1234','하하하하하하',0);
insert into boards values('park','열공합시다','1234','히히히히',5);
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
-- 문제02)
-- ■관리자 세션■
create user soon identified by oracle
quota unlimited on users
account unlock;

alter user soon default tablespace users;

grant create session to soon;
grant create table to soon;
grant create sequence to soon;

-- ■갑순이 세션■
create sequence seqtest01;

create table BranchA(
    id varchar2(10),
    name varchar2(30),
    publisher varchar(50),
    price number
);

alter table brancha modify(id number);

insert into brancha(id,name,publisher,price) 
values (seqtest01.nextval , '야구의 역사' , '데일리 스포츠' , 1000);

insert into brancha(id,name,publisher,price) 
values (seqtest01.nextval , '월간 축구' , '가나 출판사' , 2000);

insert into brancha(id,name,publisher,price) 
values (seqtest01.nextval , '스포츠의 이해' , '대한 출판사' , 3000);

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
values (seqtest02.nextval , '야구의 역사' , '데일리 스포츠' , 1000);

insert into branchb(id,name,publisher,price) 
values (seqtest02.nextval , '당구 교본' , '대한 출판사' , 4000);

insert into branchb(id,name,publisher,price) 
values (seqtest02.nextval , '호신술' , '데일리 스포츠' , 5000);
commit;

select * from brancha;
select * from branchb;

--------------------------------------------------------------------
-- 문제03)

-- ■갑순이 세션■
grant select on brancha to dori;
grant select on branchb to dori;

-- ■갑돌이 세션■
create table mybranch
as
select  * from soon.brancha
union 
select  * from soon.branchb;

select * from mybranch;

--------------------------------------------------------------------
-- 문제04)
-- ■갑돌이 세션■
alter table members modify(address varchar2(80));
update members 
set address = '서울시 마포구 공덕동 마포 래미안 푸르지오 111동 2222호'
where id = (select id from members where name = '박영희');

select * from user_cons_columns;

alter table members drop constraint SYS_C007071;
alter table members add constraint SYS_C007071 check (hobby in ('당구','퀼트','맞고','조깅'));
insert into members values('lee','이순신','서대문 신촌','조깅',500);

alter table members drop constraint SYS_C007073;
alter table members add constraint SYS_C007073 check (salary >= 0);
insert into members values('shin','신사임당','서대문 신촌','조깅',30);

commit;
select * from members;

--------------------------------------------------------------------
-- 문제05)
-- ■갑돌이 세션■
select * from user_cons_columns where table_name = 'MEMBERS';

alter table members rename constraint SYS_C007070 to members_name_nn;

alter table members rename constraint SYS_C007071 to members_hobby_ck;

alter table members rename constraint SYS_C007072 to members_id_pk;

alter table members rename constraint SYS_C007073 to members_salary_ck;


--------------------------------------------------------------------
-- 문제06)
-- ■관리자 세션■
grant create view to dori;

-- ■갑돌이 세션■
--궁금증01
create or replace view minview
as
select name , salary , address 
from members
where salary = (select min(salary) from members);

select * from minview;

grant select on minview to soon;

--궁금증02
create or replace view noboard
as
select m.name , m.address
from members m left outer join boards b 
on m.id = b.writer
where b.content is null;

select * from noboard;

grant select on noboard to soon;

-- ■갑순이 세션■
--궁금증01
select * from DORI.minview;

--궁금증02
select * from DORI.noboard;

--------------------------------------------------------------------
-- 문제07)
-- ■관리자 세션■
create role newrole;
grant create view, create role to newrole;  
grant newrole to soon;

select * from role_sys_privs where role = 'NEWROLE' ;
select * from dba_role_privs where grantee = 'SOON' ;

-- ■갑순이 세션■
create role soonrole;
grant select , insert on brancha to soonrole;

grant soonrole to dori;

-- ■갑돌이 세션■
select * from soon.brancha where price = 2000;

insert into soon.brancha 
values (77, '데이터베이스시험' , '가나 출판사' , 10000);
commit;

update soon.brancha set id = 1 where id = 77;

select * from soon.brancha;

-- ■갑순이 세션■
select * from BranchA order by id;