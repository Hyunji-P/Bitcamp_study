create table books (
	bookid number(2) primary key,
	bookname varchar2(40),
	publisher varchar2(40),
	price  number(8) 
);

create table  customers (
	custid number(2) primary key,  
	name   varchar2(40),
	address  varchar2(50),
	phone  varchar2(20)
);

create table orders (
	orderid number(2) primary key,
	custid  number(2) REFERENCES customers(custid),
	bookid  number(2) REFERENCES books(bookid),
	saleprice number(8) ,
	orderdate date
);

-- books, customers, orders 데이터 생성
insert into books values(1, '축구의 역사', '굿스포츠', 7000);
insert into books values(2, '축구아는 여자', '나무수', 13000);
insert into books values(3, '축구의 이해', '대한미디어', 22000);
insert into books values(4, '골프 바이블', '대한미디어', 35000);
insert into books values(5, '피겨 교본', '굿스포츠', 8000);
insert into books values(6, '역도 단계별기술', '굿스포츠', 6000);
insert into books values(7, '야구의 추억', '이상미디어', 20000);
insert into books values(8, '야구를 부탁해', '이상미디어', 13000);
insert into books values(9, '올림픽 이야기', '삼성당', 7500);
insert into books values(10, 'Olympic Champions', 'Pearson', 13000);

insert into customers values(1, '박지성', '영국 맨체스타', '000-5000-0001');
insert into customers values(2, '김연아', '대한민국 서울', '000-6000-0001');  
insert into customers values(3, '장미란', '대한민국 강원도', '000-7000-0001');
insert into customers values(4, '추신수', '미국 클리블랜드', '000-8000-0001');
insert into customers values(5, '박세리', '대한민국 대전',  NULL);

-- 주문(orders) 테이블의 책값은 할인 판매를 가정함
insert into orders values(1, 1, 1, 6000, to_date('2014-07-01','yyyy-mm-dd')); 
insert into orders values(2, 1, 3, 21000, to_date('2014-07-03','yyyy-mm-dd'));
insert into orders values(3, 2, 5, 8000, to_date('2014-07-03','yyyy-mm-dd')); 
insert into orders values(4, 3, 6, 6000, to_date('2014-07-04','yyyy-mm-dd')); 
insert into orders values(5, 4, 7, 20000, to_date('2014-07-05','yyyy-mm-dd'));
insert into orders values(6, 1, 2, 12000, to_date('2014-07-07','yyyy-mm-dd'));
insert into orders values(7, 4, 8, 13000, to_date( '2014-07-07','yyyy-mm-dd'));
insert into orders values(8, 3, 10, 12000, to_date('2014-07-08','yyyy-mm-dd')); 
insert into orders values(9, 2, 10, 7000, to_date('2014-07-09','yyyy-mm-dd')); 
insert into orders values(10, 3, 8, 13000, to_date('2014-07-10','yyyy-mm-dd'));

-- 여기는 3장에서 사용되는 Imported_book 테이블

create table Imported_book (
	bookid number ,
	bookname  VARCHAR(40),
	publisher VARCHAR(40),
	price  number(8)
);
insert into Imported_book values(21, 'Zen Golf', 'Pearson', 12000);
insert into Imported_book values(22, 'Soccer Skills', 'Human Kinetics', 15000);

commit ;




select bookname,price from books;

select bookname , price * (1.0-0.1) from books;

select * from books order by price asc;

select bookname as "책_이름" , price as "가격" from books;

select * from books where price is null;

select * from books where bookid in(1,3,5);

select * from books where bookname like '%구%';

select * from books where bookname like '%기';

select * from books where bookid between 3 and 5;

select * from books
where bookname between '시' and '지';

alter table books add ( aaa varchar(100));
alter table books add(bbb number default 100);
alter table books modify(aaa varchar(100));
alter table books rename column aaa to ccc;
alter table books drop column bbb;
select * from books;
