-- 2021년 1월 25일 수업
create table members(
	id varchar2(20) primary key,
    name varchar2(20),
	age number, 
	gender varchar2(6) 
);

insert into members values('hong', '홍길동',21,'남자');
insert into members values('park', '박영희',25,'여자');
insert into members values('kim', '김철수',30,'남자');
insert into members values('sim', '심형래',40,'남자');
insert into members values('kang', '강감찬',50,'남자');
insert into members values('sun', '선덕여왕',60,'여자');

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
values(1, '하하하', 'hong', '잼있어요', sysdate, 5 ) ;
insert into boards(no, title, writer, content, regdate, hitcount )
values(2, '호호호', 'hong', '그래요', sysdate, 10 ) ;
insert into boards(no, title, writer, content, regdate, hitcount )
values(3, '사랑해', 'park', '질투나요', sysdate, 3 ) ;
insert into boards(no, title, writer, content, regdate, hitcount )
values(4, '미워해', 'park', '짜증나요', sysdate, 12 ) ;
insert into boards(no, title, writer, content, regdate, hitcount )
values(5, '시러해', 'park', '웃겨요', sysdate, 8 ) ;
insert into boards(no, title, writer, content, regdate, hitcount )
values(6, '송해', 'park', '즐기세요', sysdate, 4 ) ;
commit ;


drop table products purge ;
create table products(
	pno number,
	pname varchar2(20),
	stock number, 
	price number
);

insert into products(pno, pname, stock, price) values(1, '사과', 10, 1000) ;
insert into products(pno, pname, stock, price) values(2, '배', 20, 2000) ;
insert into products(pno, pname, stock, price) values(3, '감', 30, 3000) ;

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

-- TEST 테이블 생성 
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
values(roseq.nextval, '덕선이', '스파', 3 , 50000, '커플룸');

insert into Rooms(rono,  bname,  btype,  maxp,  price,  comments)
values(roseq.nextval, '택이', '기본', 5, 70000, '가족룸');

insert into Rooms(rono,  bname,  btype,  maxp,  price,  comments)
values(roseq.nextval, '정환이', '스파', 7, 90000, '가족룸');

insert into Rooms(rono,  bname,  btype,  maxp,  price,  comments)
values(roseq.nextval, '정봉이', '기본', 9, 110000, '대가족룸');

insert into Rooms(rono,  bname,  btype,  maxp,  price,  comments)
values(roseq.nextval, '동룡이', '기본',  3 , 50000, '커플룸');

insert into Rooms(rono ,  bname, btype, maxp , price, comments)
values(roseq.nextval, '선우', '스파', 15, 130000, 'MT룸');

commit;

select * from rooms;

desc rooms;

-- 2021년 01월 26일 수업내용
-- 다중 조인 
select m.name, p.pname, p.price, o.qty, p.price * o.qty as amount
from (members m inner join orders o
on m.id = o.mid) inner join products p
on o.pno = p.pno;

-- drop table reservations ;
-- id는 회원의 포린키
-- bname은  방의 포린키
-- price은  방의 포린키

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
values (rvseq.nextval,'hong','정봉이',110000,'2016/01/01','2016/01/05', '2016/01/01', '픽업','오후3시','없음','홍길동');

insert into reservations( rvno, id,bname,price,startDate, endDate, rvDate, addtionalService,  arrivalTime, theOther, rvName )
values (rvseq.nextval,'park','덕선이',50000,'2016/01/04','2016/01/08', '2016/01/01', '픽업','오후3시','없음','박영희');

insert into reservations( rvno, id,bname,price,startDate, endDate, rvDate, addtionalService,  arrivalTime, theOther, rvName)
values (rvseq.nextval,'hong','선우',130000,'2016/02/01','2016/02/05', '2016/01/01', '픽업','오전11시','없음','홍길동');

insert into reservations( rvno, id,bname,price,startDate, endDate, rvDate, addtionalService,  arrivalTime, theOther, rvName)
values (rvseq.nextval,'park','정환이',90000,'2016/02/01','2016/02/05', '2016/01/01', '픽업','오후2시','없음','박영희');

insert into reservations( rvno, id,bname,price,startDate, endDate, rvDate, addtionalService,  arrivalTime, theOther, rvName)
values (rvseq.nextval,'kim','정봉이',110000,'2016/02/01','2016/02/05', '2016/01/01', '픽업','오후3시','없음','홍길동');

commit ; 

delete from rooms;

--실습1) 고객과 예약한 정보를 조회하세요.
--조인구문과 HashMap 을 이용해서 풀어본다. 
select m.name,m.age, rv.bname , rv.startdate , rv.enddate
from members m inner join reservations rv
on m.id = rv.id;

desc reservations;

select id,name,age,gender from members where name='홍길동';

select m.id , m.name , b.title , b.content
from members m inner join boards b
on m.id = b.writer;


--2021년 01월 27일 수업내용
drop sequence seqalbum ;

create sequence seqalbum increment by 1 start with 1;

drop table albums purge ;

-- 앨범 테이블을 생성하시오.
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
values(seqalbum.nextval, '스무살의 봄', '하루 끝', '김이나', '박근태, 김도훈', '김도훈', sysdate, '발라드', 'lp,cd', 'yes');

insert into albums(id, albumname, song, lyricist, songwriter, transcription, writerdate, genre, mediatype, emailagree)
values(seqalbum.nextval, '스무살의 봄', '그 애 참 싫다', '김은수', '심은지', '심은지', sysdate, '발라드', 'lp,cd', 'yes');

insert into albums(id, albumname, song, lyricist, songwriter, transcription, writerdate, genre, mediatype, emailagree)
values(seqalbum.nextval, 'REAL', '이게 아닌데', '김이나', '김형석', '윤우석', sysdate, '발라드', 'lp,cd', 'yes');

insert into albums(id, albumname, song, lyricist, songwriter, transcription, writerdate, genre, mediatype, emailagree)
values(seqalbum.nextval, 'REAL', '느리게 하는 일', '최갑원', 'Peejay, 민웅식', '김진훈', sysdate, '발라드', 'lp,mp3', 'yes');

insert into albums(id, albumname, song, lyricist, songwriter, transcription, writerdate, genre, mediatype, emailagree)
values(seqalbum.nextval, 'REAL', '좋은 날', '김이나', '이민수', '이민수', sysdate, '발라드', 'lp,cd,mp3', 'yes');

insert into albums(id, albumname, song, lyricist, songwriter, transcription, writerdate, genre, mediatype, emailagree)
values(seqalbum.nextval, 'REAL', '첫 이별 그날 밤', '윤종신', '윤종신', '조정치', sysdate, '발라드', 'lp,cd,mp3,tape', 'yes');

insert into albums(id, albumname, song, lyricist, songwriter, transcription, writerdate, genre, mediatype, emailagree)
values(seqalbum.nextval, 'REAL', '혼자 있는 방', '최갑원, 아이유', '전승우', '전승우', sysdate, '발라드', 'lp,cd,mp3,tape,wav', 'yes');

commit;

select * from albums;

select count(*) from albums;


-- 폼의 체크 박스, 라디오 버튼, 콤보 박스를 위한 테이블
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

insert into Checkes values('--- 선택해 주세요.----------', '0', 'album', 'genre');
insert into Checkes values('발라드', '1','album', 'genre');
insert into Checkes values('트로트', '2', 'album', 'genre');
insert into Checkes values('댄스', '3','album', 'genre');
insert into Checkes values('힙합', '4', 'album', 'genre');

commit ;

desc albums;

select * from albums order by song asc;

select id , age , name , gender , 
    case age
    when age <= 30 then 'yb'
    when age <= 50 then 'mb'
    else 'ob' end as result
from members;
