--고객 ID(기본키)
--성명
--생년월일
--계약일자
--입금일자 
--입금월도
--입금회차  
--원 보험료 
-- 가상계좌 보험료  
-- 가상계좌번호 
-- 은행명  

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
values ('AAAA','20180101','20201029', '960118', '박현지', '202010', '32 ', '국민', '11111111', 15200 , 15200 ); 

insert into premium(id,contractdate,depositDate,birth,name,depositMonth,depositNumber,bank,VirtualAccount,premium,v_premium)
values ('BBBB','20180525','20201029', '730505', '유재석', '202009', '28', '우리', '22222222', 17000  , 17000);

insert into premium(id,contractdate,depositDate,birth,name,depositMonth,depositNumber,bank,VirtualAccount,premium,v_premium)
values ('CCCC','20161231','20201029', '700428', '강호동', '202010', '44', '신한', '33333333', 25000 , 25000 );

insert into premium(id,contractdate,depositDate,birth,name,depositMonth,depositNumber,bank,VirtualAccount,premium,v_premium)
values ('DDDD','20190504','20201029', '880331', '신동엽', '202008', '22', '우리', '22223333', 100000 , 100000 );

insert into premium(id,contractdate,depositDate,birth,name,depositMonth,depositNumber,bank,VirtualAccount,premium,v_premium)
values ('EEEE','20170701','20201029', '880808', '홍길동', '202007', '23', '신한', '33337777', 50000 , 50000 );

insert into premium(id,contractdate,depositDate,birth,name,depositMonth,depositNumber,bank,VirtualAccount,premium,v_premium)
values ('FFFF','20170805','20201030', '930330', '강감찬', '202007', '28', '농협', '44444444', 40000 , 40000 );

insert into premium(id,contractdate,depositDate,birth,name,depositMonth,depositNumber,bank,VirtualAccount,premium,v_premium)
values ('GGGG','20100908','20201030', '930927', '신사임당', '202010', '88', '국민', '11114444', 10000 , 10000 );

insert into premium(id,contractdate,depositDate,birth,name,depositMonth,depositNumber,bank,VirtualAccount,premium,v_premium)
values ('HHHH','20161231','20201029', '700505', '힘찬', '202010', '44', '신한', '33336666', 25000 , 25000 );

insert into premium(id,contractdate,depositDate,birth,name,depositMonth,depositNumber,bank,VirtualAccount,premium,v_premium)
values ('IIII ','20190101','20201101', '600601', '안녕안녕안', '202011', '20', '하나', '55555555', 42000 , 42000 );

commit;

-- [UPDATE 문제]
-- 1. 전체 입금일자를 오늘 날짜로 바꾸어라.
update premium set depositDate = sysdate;

-- 2.은행명이 국민은행일 때 , 가상계좌 보험료 금액을 7777원으로 변경하여라.
update premium set v_premium = 7777 where bank ='국민';

-- 3. 회차가 25회차 미만인 대상들은 생년월일을 2020-11월로 바꾸어라.
update premium set birth = 202011 where depositnumber < 25;

-- 4. 보험료 금액이 5만원 이상이고 우리은행일 경우 이름을 VIP로 바꾸어라.
update premium set name = 'VIP' where premium >=50000 and bank = '우리';

-- 5. 가상계좌 번호를 99999999로 변경 하거나 월도를 99로 변경하여라.
--    실행 후 롤백하기
update premium set virtualaccount = '99999999' , depositmonth = '99' ;
ROLLBACK;

-- 6. 이름이 안녕안녕안인 경우 안녕하세요라고 변경하여라.
update premium set name = '안녕하세요' where name = '안녕안녕안';

-- 7. 보험료가 20000원 미만 일 경우 3000원씩 더하세요.
update premium set premium = premium +  3000 where premium < 20000;

-- 8. 박현지 이거나 홍길동이면 계좌번호를 77777777로 변경하여라.(in 키워드 사용)
update premium set virtualaccount = '77777777' where name in('박현지','홍길동');

-- 9. 은행명이 우리 또는 신한이면 은행이름을 한국으로 변경하여라 .
update premium set bank = '한국' where bank in('우리','신한'); 

-- 10. 고객 보험료를 12%인상시켜라 .
update premium set premium = premium*1.12 ;



-- 롤백 하기 
rollback;

select * from premium;

--[DELETE 문제]
--1. id가 GGGG일 경우 삭제 
delete from premium where id = 'GGGG';

--2. 회차가 50회 이상이거나 , 보험료가 30000원 이하 인 경우 삭제 
delete from premium where depositnumber >= 50 or premium <= 30000;

--3. 이름이 강감찬이거나 힘찬인 경우 삭제
delete from premium where name in('강감찬','힘찬');

--4. 가상계좌 번호가 1로 시작하는 경우 삭제
delete from premium where virtualaccount like '1%';

--5. 이름이 신동엽인 경우 삭제 
delete from premium where id = 'DDDD';

--6. 은행명이 국민 중에서 회차가 10회 이상인 경우 삭제 
delete from premium where bank = '국민' and depositnumber >=10;

--7. 생년월일이 93으로 시작하고 보험료가 10000인 경우 삭제 
delete from premium where birth like '93%' and premium = 10000;

--8. 이름이 박현지를 제외한 모든 행을 삭제
delete from premium where name <> '박현지';

--9. 은행명이 국민이나 우리가 아닌 경우 모두 삭제(in 키워드 사용)
delete from premium where bank not in('국민','우리');

--10.가상계좌 보험료가 50000원 이상이고 100000만원 이하인 경우 삭제 
delete from premium where v_premium >= 50000 and v_premium<=100000;

select * from premium;

rollback;

-- [select 문제]
-- 1. 전체 조회하기
select * from premium;

-- 2. 이름이 강으로 시작하는 사람을 검색하시오.
select name from premium where name like '강%';

-- 3. name 의 보험료는 premium 원 입니다.
select name || '의 보험료는 ' || premium || '원 입니다' as 결과 from premium;

-- 4. 입금일자가 최신인 순서대로 정렬하시오.
select * from premium order by depositdate desc;

-- 5. 입금 회차는 가장 높은 것 부터 , 보험료는 가장 낮은 순으로 정렬하시오.
select * from premium order by depositnumber desc , premium asc;

-- 6. 보험료를 10%인상하며 알리아스를 사용하여 내림차순 정렬하여라.
select name , premium , 1.1 * premium as 인상률  from premium order by premium desc;

-- 7. 가상계좌 번호 중에 세번째 글자가 2인 사람을 출력하여라.
select * from premium where virtualaccount like '__2%';

-- 8. 은행명이 우리은행이거나 국민은행인 id, name , v_premium , bank 을 출력하여라.
select id , name , v_premium , bank from premium where bank in('우리','국민');

-- 9. 은행명이 우리은행이거나 국민은행이 아닌 은행의 id, name , v_premium , bank 을 출력하여라.
select id , name , v_premium , bank from premium where bank not in('우리','국민');

-- 10. 보험료 금액이 8만원 이상이거나 , 이름이 5글자인 사람을 출력하여라.
select * from premium where premium >= 80000 or length(name) = 5;



-- [문자열 관련 함수]
-- 1. name의 보험료는 premium 입니다.
select concat(concat(concat(name , '의 보험료는 '),premium),'입니다. ') as result from premium;

-- 2. id를 소문자로 출력하여라.
select lower(id) from premium;

-- 3. id를 대문자로 출력하고 , 첫글자만 대문자로 변경하여라.
select upper(id) , initcap(id) from premium;

-- 4. substr 을 이용하여 가상계좌 번호 5번째부터 추출하여라.
select substr(VirtualAccount , 5) from premium;

-- 5. substr 을 이용하여 가상계좌 뒤에서 3번째부터 1개를 추출하여라.
select substr(VirtualAccount , -3 , 1) from premium;

-- 6. 이름의 길이가 3의 배수인 정보를 추출하여라.
select * from premium where mod(length(name),3) = 0;

-- 7. 이름에 '현'이 들어가 있나요? 
select name , instr(name , '현') as 개수 from premium;

-- 8. 이름이 10개 중에 lpad 를 사용하여 공백에 ★를 채우세요.
select name , lpad(name , 10 , '★') from premium;

-- 9. 이름이 10개 중에 rpad 를 사용하여 공백에 ★를 채우세요.
select name , rpad(name , 10 , '★') from premium;

-- 10.고객 id에서 c를 a로 치환하여라.
select id , replace(id , 'C' , 'A') as result from premium;

--[숫자형 관련 함수]

update premium set premium = -100 where id in('AAAA','BBBB');

-- 1. 음수인 보험료를 양수로 취하여라.
select premium , abs(premium) as newpremium from premium ;

-- 2. 보험료의 2제곱을 출력하여라.
select name , premium , power(premium , 2) as newpremium from premium;

-- 3. sign를 사용하여 부호 값 확인 하기 
select sign(10) as 양수 , sign(0) as "0일때" , sign(-10) as 음수 from dual; 

-- 4. round 반올림 함수를 사용하여 확인 하기 
select round(17) , round(14.57,-1) , round(14.57 , 1) from dual;

-- 5. trunc 함수를 사용하여 확인 하기
select trunc(15.79 , 1) from dual;

-- [날짜 관련 함수]
alter session set nls_date_format = 'YYYY-MM-DD hh:mi:ss';

select sysdate from dual;

-- 1. 현재 날짜에서 5일을 더하여라.
select sysdate , sysdate + 5 from dual;

-- 2. 현재 시각과 5시간 이후의 시간, 30초전의 시각을 구해 보세요.
select sysdate , sysdate + 5/24 , sysdate + 30/24/60/60 from dual;

-- 3. 지금부터 3개월 뒤 , 5개월 전의 시각을 구해보세요.
select sysdate , add_months(sysdate , 3) , add_months(sysdate , -5) from dual;

-- 4. 이번달 마지막 날 
select last_day(sysdate) from dual;

-- 5. 이번주 목요일을 무슨 요일인가? 
select next_day(sysdate,'목') from dual;

-- [null과 관련된 문제]
update premium set v_premium = null where id in('AAAA', 'EEEE' , 'DDDD') ;

-- 1. 가상계좌 입금 보험료가 null 이면 5000으로 채우시오.
select v_premium , nvl(v_premium , 5000) from premium;

-- 2. 가상계좌 입금 보험료가 존재하면 존재 , null 이면 null존재로 채우시오.
select v_premium , nvl2(v_premium , '존재' , 'null존재') as 결과 from premium;

-- 3. 은행명이 국민일 경우 null값으로 대체하시오.
select bank , nullif(bank , '국민') as 결과 from premium;

-- [case 표현식 관련된 문제]
-- 1. 은행이름이 OO 이면 OO 은행입니다.로 표현해보자.
select name , bank , 
case bank 
when '국민' then '국민은행입니다.'
when '신한' then '신한은행입니다.'
when '우리' then '우리은행입니다.'
else '하나은행입니다.' end as result 
from premium;

-- 2. 입금 회차가 50 이상이면 high , 40이상이면 middle , 그 미만이면 low를 출력해보세요.
select name , depositNumber , 
case 
when depositNumber >= 50 then 'high'
when depositNumber >= 40 then 'middle'
else 'low' end as result
from premium;

drop table set_a;
drop table set_b;

-- [집합 연산 관련된 문제]
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

-- 1. 합집합 출력하기 
select * from a
union 
select * from b;

-- 2. a테이블과 b테이블 전체 값 출력하기
select * from a
union all
select * from b;

-- 3. 교집합 출력하기 
select * from a
intersect
select * from b;

-- 4. a-b 는?
select * from a
minus
select * from b;

-- 5. b-a 는?
select * from b
minus
select * from a;


-- [그룹(집계)함수 관련된 문제]
-- 1. premium 테이블의 총 개수? 
select count(*) as 개수 from premium;

-- 2. 보험료의 총합은? 
select sum(premium) as 총합 from premium;

-- 3. 은행별로 그룹핑하여 총 금액을 구하여라.
select bank, sum(premium) as 총합 from premium group by bank;

-- 4. 입금일자가 2020-10-30이고 국민은행의 총금액을 구하여라.
select depositdate, bank , sum(premium) as 총합 from premium group by bank , depositdate
having depositdate = '20201030' and bank = '국민';

-- 5. 이름이 가장 먼저 나오는 사람과 나중에 나오는 사람은?
select min(name) as 먼저 , max(name) as 나중에 from premium ;

-- 6. 입금일자별로 그룹핑하고 오름차순 정렬하여라.
select depositdate from premium group by depositdate
order by depositdate asc;

-- 7. 은행별 각각 몇 명인지 조회하되 , 2명 이상만 조회되도록 하세요.
select bank , count(*) from premium group by bank
having count(*) >= 2;

-- 8. 보험료의 총합과 평균값을 구하여라.
--    단, 평균값은 소수점 둘째자리까지만 나타내어라.
select sum(premium) as 총합 , round(avg(premium),2) as 평균값 from premium;

-- 9. 가상계좌 번호의 첫글자대로 그룹핑하세요.
select bank , VirtualAccount from premium group by  bank , VirtualAccount 
order by VirtualAccount asc;

-- 10. 가상계좌 입금 보험료의 총합은 은행별로 구하여라.
-- 단 , null값인 경우 70000원으로 치환하여라.
select bank, sum(nvl(v_premium,70000)) as 총합 from premium group by bank;


-- [조인과 관련된 문제]


select * from premium;





