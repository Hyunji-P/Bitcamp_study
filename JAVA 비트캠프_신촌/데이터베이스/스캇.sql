create table emp01 (
    EMPNO number(4),
    ENAME varchar2(10)default '안녕',
    JOB varchar2(9),
    MGR number(4)
);

insert into emp01(EMPNO,ENAME,JOB,MGR) values (1,'강감찬','학생',null);
insert into emp01(EMPNO,ENAME,JOB,MGR) values(2,'김유신','선생님',1);
insert into emp01(EMPNO,ENAME,JOB,MGR) values(3,'박현지','판매원',null);






alter table emp01 drop column job;

create table dept01
as
select *from dept;

desc dept01;

alter table emp01 add(hiredate date);
alter table emp01 add(job VARCHAR2(10));
alter table emp01 modify(job VARCHAR2(20));
alter table emp01 drop column mgr;

desc emp01;
select * from emp01;

rename emp01 to emp02;

drop table emp02;


