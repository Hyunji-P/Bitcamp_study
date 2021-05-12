-- 2021�� 1�� 25�� ����
create table members(
	id varchar2(20) primary key,
    name varchar2(20),
	age number, 
	gender varchar2(6) 
);

insert into members values('hong', 'ȫ�浿',21,'����');
insert into members values('park', '�ڿ���',25,'����');
insert into members values('kim', '��ö��',30,'����');
insert into members values('sim', '������',40,'����');
insert into members values('kang', '������',50,'����');
insert into members values('sun', '��������',60,'����');

commit ;

drop table boards;
create table boards(
	no number,
	title varchar2(20),
	writer  varchar2(20),
	content varchar2(20),
	regdate date default sysdate,
	hitcount number
);

alter table boards
add constraint boards_writer_fk
foreign key (writer) references members(id )
on delete set null ;

insert into boards(no, title, writer, content, regdate, hitcount )
values(1, '������', 'hong', '���־��', sysdate, 5 ) ;
insert into boards(no, title, writer, content, regdate, hitcount )
values(2, 'ȣȣȣ', 'hong', '�׷���', sysdate, 10 ) ;
insert into boards(no, title, writer, content, regdate, hitcount )
values(3, '�����', 'park', '��������', sysdate, 3 ) ;
insert into boards(no, title, writer, content, regdate, hitcount )
values(4, '�̿���', 'park', '¥������', sysdate, 12 ) ;
insert into boards(no, title, writer, content, regdate, hitcount )
values(5, '�÷���', 'park', '���ܿ�', sysdate, 8 ) ;
insert into boards(no, title, writer, content, regdate, hitcount )
values(6, '����', 'park', '��⼼��', sysdate, 4 ) ;
commit ;


drop table products purge ;
create table products(
	pno number,
	pname varchar2(20),
	stock number, 
	price number
);

insert into products(pno, pname, stock, price) values(1, '���', 10, 1000) ;
insert into products(pno, pname, stock, price) values(2, '��', 20, 2000) ;
insert into products(pno, pname, stock, price) values(3, '��', 30, 3000) ;

drop sequence seqoid ;
create sequence seqoid start with 1 increment by 1 nocache ;
drop table orders purge ;

create table orders(
  oid number primary key,
  mid varchar2(10) references members(id ) on delete set null,
  pno number, 
  qty number
);
insert into orders(oid, mid, pno, qty) values(seqoid.nextval, 'park', 1, 10) ;
insert into orders(oid, mid, pno, qty) values(seqoid.nextval, 'park', 2, 20) ;
insert into orders(oid, mid, pno, qty) values(seqoid.nextval, 'kim', 3, 30) ;
insert into orders(oid, mid, pno, qty) values(seqoid.nextval, 'kim', 4, 40) ;
commit ;

-- TEST ���̺� ���� 
create sequence roseq ;

create table Rooms(  
   rono  number primary key,
   bname varchar2(150) unique,
   btype varchar2(50),
   maxp number,
   price number,
   image1 varchar2(200) default 'noimage.jpg',
   image2 varchar2(200) default 'noimage.jpg',
   image3 varchar2(200) default 'noimage.jpg',
   comments varchar2(1000) default ' '
);

insert into Rooms(rono,  bname,  btype,  maxp,  price,  comments)
values(roseq.nextval, '������', '����', 3 , 50000, 'Ŀ�÷�');

insert into Rooms(rono,  bname,  btype,  maxp,  price,  comments)
values(roseq.nextval, '����', '�⺻', 5, 70000, '������');

insert into Rooms(rono,  bname,  btype,  maxp,  price,  comments)
values(roseq.nextval, '��ȯ��', '����', 7, 90000, '������');

insert into Rooms(rono,  bname,  btype,  maxp,  price,  comments)
values(roseq.nextval, '������', '�⺻', 9, 110000, '�밡����');

insert into Rooms(rono,  bname,  btype,  maxp,  price,  comments)
values(roseq.nextval, '������', '�⺻',  3 , 50000, 'Ŀ�÷�');

insert into Rooms(rono ,  bname, btype, maxp , price, comments)
values(roseq.nextval, '����', '����', 15, 130000, 'MT��');

commit;

select * from rooms;

desc rooms;

-- 2021�� 01�� 26�� ��������
-- ���� ���� 
select m.name, p.pname, p.price, o.qty, p.price * o.qty as amount
from (members m inner join orders o
on m.id = o.mid) inner join products p
on o.pno = p.pno;

-- drop table reservations ;
-- id�� ȸ���� ����Ű
-- bname��  ���� ����Ű
-- price��  ���� ����Ű

-- drop sequence rvseq ; 
create sequence rvseq ;
create table reservations(
   rvno number primary key,
   id varchar2(50),
   bname varchar2(150) ,
   price number,
   rono number null,   
   startDate date not null,
   endDate date not null,   
   rvDate date  not null,
   addtionalService varchar2(50),   
   arrivalTime varchar2(50),
   theOther varchar2(50),
   rvName varchar2(50)
   
);

alter table reservations
add constraint aaa 
foreign key(id) references members(id)
on delete set null ;

alter table reservations
add constraint bbb 
foreign key(rono ) references Rooms(rono ) ;


alter table reservations
add constraint eee 
foreign key(bname ) references Rooms(bname ) ;


insert into reservations( rvno, id,bname,price,startDate, endDate, rvDate, addtionalService,  arrivalTime, theOther, rvName )
values (rvseq.nextval,'hong','������',110000,'2016/01/01','2016/01/05', '2016/01/01', '�Ⱦ�','����3��','����','ȫ�浿');

insert into reservations( rvno, id,bname,price,startDate, endDate, rvDate, addtionalService,  arrivalTime, theOther, rvName )
values (rvseq.nextval,'park','������',50000,'2016/01/04','2016/01/08', '2016/01/01', '�Ⱦ�','����3��','����','�ڿ���');

insert into reservations( rvno, id,bname,price,startDate, endDate, rvDate, addtionalService,  arrivalTime, theOther, rvName)
values (rvseq.nextval,'hong','����',130000,'2016/02/01','2016/02/05', '2016/01/01', '�Ⱦ�','����11��','����','ȫ�浿');

insert into reservations( rvno, id,bname,price,startDate, endDate, rvDate, addtionalService,  arrivalTime, theOther, rvName)
values (rvseq.nextval,'park','��ȯ��',90000,'2016/02/01','2016/02/05', '2016/01/01', '�Ⱦ�','����2��','����','�ڿ���');

insert into reservations( rvno, id,bname,price,startDate, endDate, rvDate, addtionalService,  arrivalTime, theOther, rvName)
values (rvseq.nextval,'kim','������',110000,'2016/02/01','2016/02/05', '2016/01/01', '�Ⱦ�','����3��','����','ȫ�浿');

commit ; 

delete from rooms;

--�ǽ�1) ���� ������ ������ ��ȸ�ϼ���.
--���α����� HashMap �� �̿��ؼ� Ǯ���. 
select m.name,m.age, rv.bname , rv.startdate , rv.enddate
from members m inner join reservations rv
on m.id = rv.id;

desc reservations;

select id,name,age,gender from members where name='ȫ�浿';

select m.id , m.name , b.title , b.content
from members m inner join boards b
on m.id = b.writer;


--2021�� 01�� 27�� ��������
drop sequence seqalbum ;

create sequence seqalbum increment by 1 start with 1;

drop table albums purge ;

-- �ٹ� ���̺��� �����Ͻÿ�.
create table albums(
	id number primary key,
	albumname varchar2(30) not null,
	song varchar2(30) not null,
	lyricist varchar2(30) not null,
	songwriter varchar2(50) not null,
	transcription varchar2(50) not null,
	writerdate date,
	image varchar2(50),
	genre varchar2(255),
	mediatype varchar2(255),	
	emailagree varchar2(30)	
);
 
insert into albums(id, albumname, song, lyricist, songwriter, transcription, writerdate, genre, mediatype, emailagree)
values(seqalbum.nextval, '�������� ��', '�Ϸ� ��', '���̳�', '�ڱ���, �赵��', '�赵��', sysdate, '�߶��', 'lp,cd', 'yes');

insert into albums(id, albumname, song, lyricist, songwriter, transcription, writerdate, genre, mediatype, emailagree)
values(seqalbum.nextval, '�������� ��', '�� �� �� �ȴ�', '������', '������', '������', sysdate, '�߶��', 'lp,cd', 'yes');

insert into albums(id, albumname, song, lyricist, songwriter, transcription, writerdate, genre, mediatype, emailagree)
values(seqalbum.nextval, 'REAL', '�̰� �ƴѵ�', '���̳�', '������', '���켮', sysdate, '�߶��', 'lp,cd', 'yes');

insert into albums(id, albumname, song, lyricist, songwriter, transcription, writerdate, genre, mediatype, emailagree)
values(seqalbum.nextval, 'REAL', '������ �ϴ� ��', '�ְ���', 'Peejay, �ο���', '������', sysdate, '�߶��', 'lp,mp3', 'yes');

insert into albums(id, albumname, song, lyricist, songwriter, transcription, writerdate, genre, mediatype, emailagree)
values(seqalbum.nextval, 'REAL', '���� ��', '���̳�', '�̹μ�', '�̹μ�', sysdate, '�߶��', 'lp,cd,mp3', 'yes');

insert into albums(id, albumname, song, lyricist, songwriter, transcription, writerdate, genre, mediatype, emailagree)
values(seqalbum.nextval, 'REAL', 'ù �̺� �׳� ��', '������', '������', '����ġ', sysdate, '�߶��', 'lp,cd,mp3,tape', 'yes');

insert into albums(id, albumname, song, lyricist, songwriter, transcription, writerdate, genre, mediatype, emailagree)
values(seqalbum.nextval, 'REAL', 'ȥ�� �ִ� ��', '�ְ���, ������', '���¿�', '���¿�', sysdate, '�߶��', 'lp,cd,mp3,tape,wav', 'yes');

commit;

select * from albums;

select count(*) from albums;


-- ���� üũ �ڽ�, ���� ��ư, �޺� �ڽ��� ���� ���̺�
drop table Checkes ;

create table Checkes(
	mykey varchar2(255),
	myvalue varchar2(255),
	module varchar2(255),
	field varchar2(255)
);

insert into Checkes values('lp', '1', 'album', 'mediatype');
insert into Checkes values('cd', '2', 'album', 'mediatype');
insert into Checkes values('mp3', '3', 'album', 'mediatype');
insert into Checkes values('tape', '4', 'album', 'mediatype');
insert into Checkes values('wav', '5', 'album', 'mediatype');

insert into Checkes values('yes', '1', 'album', 'emailagree');
insert into Checkes values('no', '2', 'album', 'emailagree');

insert into Checkes values('--- ������ �ּ���.----------', '0', 'album', 'genre');
insert into Checkes values('�߶��', '1','album', 'genre');
insert into Checkes values('Ʈ��Ʈ', '2', 'album', 'genre');
insert into Checkes values('��', '3','album', 'genre');
insert into Checkes values('����', '4', 'album', 'genre');

commit ;

desc albums;

select * from albums order by song asc;

select id , age , name , gender , 
    case age
    when age <= 30 then 'yb'
    when age <= 50 then 'mb'
    else 'ob' end as result
from members;
