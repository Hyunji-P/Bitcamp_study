-- 11월 5일차
-- sysdate : 현재 시각을 의미하는 오라클 내장 함수

-- 오라맨 세션 
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

-- 가지고 있는 테이블 목록 보기
select * from tab;

desc employees;

select * from employees;

-- '1990/12/25' 문자 -> 날짜로 바꿔서(암시적 형변환) -> birth 컬럼에 들어감
insert into employees(id , name , password , gender , birth , marriage , salary , address , manager)
values('yusin','김유신','abc1234','남자','1990/12/25','결혼',220,'용산',null);

insert into employees(id , name , password , gender , birth , marriage , salary , address , manager)
values('choi','최영','abc1234','남자','1990/12/25','결혼',220,'용산','yusin');

insert into employees(id , name , password , gender , birth , marriage , salary , address , manager)
values('kang','강감찬','abc1234','남자','1990/12/25','결혼',220,'마포','yusin');

-- 커밋 : 위에서 추가한 내용을 영구 저장한다.(= 마무리 개념)
commit;

-- CTAS 기법에 의한 테이블 생성
-- 원본은 보존하고 , 임시 형태의 테이블을 만들고자 할 때 사용 
create table emp01
as
select * from employees;

create table emp02
as
select id , name , marriage from employees;

create table emp03
as
select birth from employees;

--내용물은 관심이 없고 , 단순 구조만 복사한다.
create table emp04
as
select * from employees
--where 절을 거짓으로 작성할 시 컬럼이름만 복사됨
where 1 = 2;

desc employees ;

--휴대폰 컬럼 추가하기 
alter table employees add (hphone varchar2(15));

desc employees;

select * from employees;

-- 문제) 나이 컬럼 추가하기 (단 , age컬럼은 기본 값을 0으로 지정한다.
alter table employees add(age number default 0);
desc employees;
select * from employees;

--별칭 컬럼 추가하기 
alter table employees add(nickname varchar2(30) default '철수');
desc employees;
select * from employees;

--아이디가 최대 20자리인데 25자리를 넣으려고 하여 오류 
insert into employees(id , name , password , gender , birth , marriage , salary , address , manager)
values('yusinyusinyusinyusinyusin','김유신','abc1234','남자','1990/12/25','결혼',220,'용산',null);

--해당 컬럼의 길이를 30바이트로 늘리기
alter table employees modify (id varchar2(30));

--휴대폰을 숫자형으로 바꿔 본다.
--휴대폰 컬럼에 모두 null이 들어 있으므로 , 데이터 타입을 변경하는데 무리가 전혀 없다.
alter table employees modify (hphone number);
--닉네임을 숫자형으로 바꿔 본다.
--이미 문자열이 들어 있으므로 , 변경이 불가능하다.
--들어있는 문자열 '철수'를 모두 null로 변경 후 데이터 타입을 바꿀 수 있다.
--철수가 문자인데 숫자로 바꾸려고 하니까 오류가 남(자바에서 numberformatexception)
alter table employees modify (nickname number);

--컬럼의 이름 변경 
--hphone 컬럼의 이름이 handphone 이다.
alter table employees rename column hphone to handphone;

--문제) 'manager' 컬럼의 이름이 'mgr'으로 변경 되어야 한다.
alter table employees rename column manager to mgr;

--handphone 컬럼이 더 이상 필요하지 않습니다.
--이를 제거하도록 합니다.
--drop은 무조건 1개씩만 가능하다.
alter table employees drop column handphone;

--테이블 이름 변경하기
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

-- 11월 6일차

-- 추가 방법 01
-- 컬럼 이름 명시하지 않고 추가하는 경우에는 반드시
-- 테이블 생성 시 명시한 컬럼 순서대로 모두 입력 해줘야 한다.

insert into employees 
values ('yosin','김유신','abc1234','남자','1990/12/25','결혼',220,'용산',null); 

insert into employees 
values ('lee','이순신','abc1234','남자','1990/12/25','이혼',220,'마포','yosin');

insert into employees 
values ('choi','최영','abc1234','남자','1990/12/25','결혼',155,'강남','yosin');

insert into employees 
values ('kang','강감찬','abc1234','남자','1990/12/25','이혼',null,'서대문','yosin');



-- 추가 방법 02
-- 컬럼 이름을 명시하는 경우 , 갯수와 타입을 맞춰 줘야 한다.

insert into employees (id , name , password , gender , birth , marriage , salary , address , manager)
values ('yoon','윤봉길','abc1234','남자','1990/12/25','미혼',230,'용산','yosin');

insert into employees (id , name , password , gender , birth , marriage , salary , address , manager)
values ('kim9','김구','abc1234','남자','1990/12/25','결혼',280,'강남',null);

insert into employees (id , name , password , gender , birth , marriage , salary , address , manager)
values ('general','김좌진','abc1234','남자','1990/12/25','이혼',385,'마포','kim9');

insert into employees (id , name , password , gender , birth , marriage , salary , address , manager)
values ('an','안중근','abc1234','남자','1990/12/25','결혼',360,'서대문','kim9');


-- 추가 방법 03
-- 필요 없는 컬럼을 명시하지 않는 경우
-- 급여가 책정되지 않는 직원들 
-- 급여는 기본 값이 100으로 되어 있으므로 100이 추가된다.
-- 차후 업데이트 시 수정할 예정이다.
insert into employees (id , name , password , gender , birth , marriage , address , manager)
values ('nongae','논개','abc1234','여자','1990/12/25','미혼','강남','soon');

insert into employees (id , name , password , gender , birth , marriage , address , manager)
values ('queen','선덕여왕','abc1234','여자','1990/12/25','결혼','용산','soon');

-- 매니저가 존재 하지 않는 경우
insert into employees (id , name , password , gender , birth , marriage , salary , address )
values ('soon','유관순','abc1234','여자','1990/12/25','미혼',240,'마포');

-- 추가 방법 04
-- 컬럼 이름을 임의로 명시하는 경우
insert into employees(id , salary , manager , address , name , password , gender , birth , marriage)
values ('shin',215,'kim9','서대문','신사임당','abc1234','여자','1990/12/25','미혼');

insert into employees(id , salary , manager , address , name , password , gender , birth , marriage)
values ('hwang',155,'kim9','용산','황진이','abc1234','여자','1990/12/25','결혼');

insert into employees(id , salary , manager , address , name , password , gender , birth , marriage)
values ('myoung',340,'soon','강남','명성왕후','abc1234','여자','1990/12/25','이혼');

insert into employees(id , salary , manager , address , name , password , gender , birth , marriage)
values ('maria',390,'soon','서대문','조마리아','abc1234','여자','1990/12/25','이혼');

insert into employees(id , salary , manager , address , name , password , gender , birth , marriage)
values ('princess',185,'soon','마포','덕혜옹주','abc1234','여자','1990/12/25','결혼');

commit;
-- 행 수정하기 
-- where 절(clause): 전체 데이터에서 일부 행(row)을 선택하고자 할 때 사용하는 구문이다.
-- 관계(비교) 연산자 : =(같음) , <> (다름) , > , >= , < , <= 

-- 컬럼 1개 변경 하기 
-- 문제 ) 모든 사원들의 급여를 100으로 변경 하세요.
update employees set salary = 100 ;

-- 문제) 모든 사원들의 비번을 qwert로 변경하세요.
update employees set password = 'qwert';

-- 문제) 모든 사원들의 생일을 오늘 날짜로 변경하세요.
update employees set birth = sysdate;

-- 컬럼 여러개 변경하기 
-- 모든 사원들의 급여를 500으로 , 비번은 'abc1234'로 변경하세요.
update employees set salary = 500 , password = 'abc1234';

-- where 절 사용 하기 (프라이머리 키가 주로 사용)
update employees set salary = 400 where id = 'an';

-- 윤봉길의 결혼 여부를 '이혼' 으로 변경하세요.
update employees set marriage = '이혼' where id = 'yoon';


-- 작업한 내용들을 롤백하세요.

rollback;

-- 사원들의 급여를 10%인상 시키세요.
-- 원래 급여는 100%이고 10%인상 → 1.1
-- 단 , null 값에 연산을 해도 결과는 항상 null이다 
update employees set salary=salary*1.1;

-- 김좌진의 급여를 100 뺄셈해주세요.
update employees set salary = salary - 100 where id = 'general';

-- 황진이의 급여를 50 더하고 , 주소를 마포로 변경하세요.
update employees set salary = salary + 50 , address = '마포' where id = 'hwang';

-- 최영이 이번에 최부식으로 개명을 했고 , 서대문으로 이사 갔습니다.
update employees set name = '최부식' , address = '서대문' where id = 'choi';

rollback;
-- 관리자가 김구인 사원들의 급여를 600으로 변경 하세요.
-- 4개 행 이(가) 업데이트되었습니다. (= cnt) 
--> 예전 welfare 자바 코딩 때 업데이트 메소드 코딩 시 cnt 설정하였음
update employees set salary = 600  where manager = 'kim9';

-- 급여가 200이하인 사원들의 급여를 300으로 변경하세요.
update employees set salary = 300 where salary <= 200;

-- and(&&) / or(||) / not(!) 
-- 관리자가 김유신이고 , 급여가 250 이상인 사원들에 대하여 급여를 700으로 변경하세요.
update employees set salary = 700 where manager = 'yusin' and salary >= 250 ;

-- 김구 이거나 황진이이면 급여를 450 으로 변경하세요.
update employees set salary = 450 where id = 'kim9' or id = 'hwang';

rollback;

-- 김구 이거나 황진이이면 급여를 1000 으로 변경하되 , in 키워드 사용 하여라
update employees set salary = 1000 where id in ('kim9' , 'hwang');

-- 관리자가 김유신이거나 , 유관순인 사원들의 급여를 555으로 변경하세요.
update employees set salary = 555 where manager in('yusin','soon');

-- 결혼 여부가 미혼 또는 이혼이 아닌 사원들의 급여를 777로 변경하세요.
update employees set salary = 777 where marriage not in('미혼' , '이혼');

select * from employees;

rollback;

-- 삭제하기 
-- 모든 사원을 삭제하세요.
delete from employees;

-- 사원 안중근을 삭제하세요.
delete from employees where id = 'an';

-- 관리자가 김유신인 사원을 삭제하세요.
delete from employees where manager = 'yosin';

-- 관리자가 김유신 이거나 유관순인 사원을 삭제하세요.
delete from employees where manager in('yusin','soon');

-- 관리자가 김유신인 사원 중에서 급여가 220 이상인 사원을 삭제하세요.
delete from employees where manager = 'yusin' and salary >=220;

-- 급여가 200미만이거나 300이상인 사원을 삭제하세요.
delete from employees where salary < 200 or salary >=300 ; 

-- 주소가 마포이거나 용산인 사원을 삭제하세요.
delete from employees where address in('마포' , '용산');

-- 주소가 서대문과 강남을 제외한 다른 지역에 거주하는 사원을 삭제하세요.
delete from employees where address not in('서대문' , '강남');

select * from employees;
rollback;

create table emp05
as
select id , name , salary , gender from employees where 1 = 2;



-- insert ... select 구문으로 남자만 emp05 테이블에 인서트 하겠다.
insert into emp05(id , name , salary , gender)
select id , name , salary , gender 
from employees
where gender = '남자';

select * from emp05;

-- 성별이 여자인 사람들의 이름/급여/주소를 신규 테이블 emp06에 추가하세요.
create table emp06
as
select name , salary ,address from employees where 1 = 2 ;

insert into emp06(name , salary ,address)
select name , salary ,address
from employees
where gender = '여자';

select * from emp06;

commit;

-- 11월 9일차

-- 모든 사원을 조회해 보세요.
-- * : all columns 의미
select * from employees;

-- 모든 사원들의 아이디 , 이름 , 급여만 조회해 보세요.
-- 여러개의 컬럼들은 콤마를 사용하면 된다.
select id , name , salary from employees;

-- 모든 사원들의 이름 , 급여와 아이디 순서대로 조회해보세요.
select name , salary , id from employees;

-- 모든 사원들의 이름 , 급여 , 100추가된 급여를 조회해 보세요. 
select name , salary , salary + 100 from employees;

-- 모든 사원들의 이름 , 급여 , 연봉을 조회해 보세요.
-- 단 , 연봉은 급여의 12배라고 가정한다.
select name , salary , 12*salary from employees;

-- 알리아스(alias)는 파생 컬럼이나 또는 직관성을 위해서 컬럼 이름을 한시적으로 변경하는 기법이다.
-- 일명 별칭이라고 한다.
-- 용도 : 파생 컬럼이나 산술 연산 등의 결과물에 사용된다.
-- jdbc 프로그래밍에서는 반드시 alias 를 명시해줘야 한다.
-- 용법 : 컬럼 [as] alias이름

-- 모든 사원들의 이름과 , 급여와 10% 인상된 금액과 연봉을 출력해 보세요.
select name , salary , 1.1 * salary , 12*salary from employees;

-- 띄어쓰기 : "" 쌍따옴표
select name , salary , 1.1 * salary as newsalary, 12*salary "ann sal" from employees;

-- distinct 키워드는 중복된 데이터에 한해서 1개만 추출한다.
select gender from employees;

select distinct gender from employees;

-- 연결 연산자 : || 
-- 문자열을 연결(결합)해주는 연산자
-- 홍길동의 급여는 100원입니다.
select name || '의 급여는 ' || salary || '원 입니다.' as 결과 from employees;

-- 이름 : 홍길동 , 성별 : 남자 , 급여 : 100
select  '이름 : ' || name || ', 성별 : ' || gender || ', 급여 : ' || salary as 결과 from employees;

-- Null
-- 급여 책정이 안 된 사원들을 출력해 보세요.
select * from employees where salary is null;

-- 관리자 목록을 출력해 보세요.
-- 관리자란 manager 컬럼이 null인 사원을 말한다.
select * from employees where manager is null;

-- null 데이터의 연산 결과 확인하기 
-- 모든 사원들의 이름과 급여 및 연봉을 조회해보세요.
-- null 데이터의 연산 결과 역시 null 이다.
select name , salary , 12 * salary from employees;

-- 아이디가 an 인 사원을 조회해 보세요.
select * from employees where id = 'an';

-- 급여가 230이상인 사원을 조회해 보세요.
select * from employees where salary >= 230;

-- 남자들만 조회해보세요.
select * from employees where gender = '남자';


-- 급여가 220 이상이고,400 이하인 사원을 조회해 보세요.
select * from employees where salary >= 220 and salary <=400 ;

-- where 컬럼 between A and B
-- A와 B를 모두 포함하고 , 사이에 존재하는 모든 값을 추출한다.
select * from employees where salary between 220 and 400;

-- ㅅ,ㅇ,ㅈ 사이 조회
select * from employees where name between '사' and '자';

-- 급여가 350 이상이거나 210 이하인 사원을 조회해보세요.
select * from employees where salary >=350 or salary <=210;

-- in키워드 
-- id가 an 또는 soon인 사원의 이름과 급여를 조회하세요.
select name , salary  from employees where id = 'an' or id = 'soon';

select name , salary  from employees where id in('an','soon');

-- 급여가 215이거나 230인 사원들을 조회해보세요.
select * from employees where salary in(215,230);

-- 김씨만 조회해 보세요.
select * from employees where name like '김%';

-- 신이라는 단어가 포함된 사원을 조회해보세요.
select * from employees where name like '%신%';

-- 이름의 두번째 글자에 순이 들어있는 사원을 조회해보세요.
select * from employees where name like '_순%';

-- 이름의 끝자리가 '후'가 들어있는 사원을 조회해보세요.
select * from employees where name like '%후';

commit;
-- 정렬 실습을 위하여 다음과 같이 데이터를 수정하도록 한다.
update employees set birth = sysdate where id in('an','soon');

update employees set birth = null where id in('queen' , 'yusin');

update employees set birth = '1988/10/10' where id in('kang' , 'lee');


-- 급여가 적은 순서부터 출력해보세요.
select * from employees order by salary ;

-- 이름을 가나다 순으로 출력해보세요.
select * from employees order by name asc;

-- 이름을 가나다 역순으로 출력해보세요.
select * from employees order by name desc;

-- alias를 사용한 데이터 정렬 
-- 이름과 연봉을 출력하되 , 연봉이 높은 순으로 정렬하세요.
select name , 12*salary as annsal from employees order by annsal desc;

-- 컬럼 번호를 이용한 데이터 정렬 
-- name : 1번 , 12*salary : 2번 
select name , 12*salary as annsal from employees order by 2 desc;

-- 나이가 많은 순서부터 정렬한 다음, 급여가 적은 순으로 정렬하여 출력해보세요.
select * from employees order by birth asc , salary asc;

-- 여자가 먼저 출력되도록 하되 , 급여가 많은 사람들이 먼저 출력되도록 해보세요.
select * from employees order by gender desc , salary desc;

-- 성별에 대하여 오름차순 , 결혼여부에 대하여 내림차순으로 정렬하세요.
select * from employees order by gender asc , marriage desc;

-- 부정어(not)
-- not in
-- not between
-- not like
-- not
-- is not null

-- 김구와 김유신을 제외한 모든 사원을 출력해 보세요.
select * from employees where id not in('kim9','yusin');

-- 이혼한 사람을 제외한 모든 사원을 출력해보세요.
select * from employees where marriage not in('이혼');

-- 급여가 220과 230 사이에 포함되지 않은 사원을 출력해보세요.
-- 주의사항으로 null은 연산에 반영이 안된다.
select * from employees where salary not between 220 and 230;

-- 성씨가 김씨가 아닌 모든 사원들을 출력해보세요.
select * from employees where name not like '김%';

-- 연봉 협상이 완료된 사원들을 출력해보세요.
select * from employees where salary is not null;

-- 관리자가 아닌 일반 사원 목록을 출력해보세요.
select * from employees where manager is not null;

-- 여러가지를 복합적으로 사용해보기 
-- 남자이면서 급여가 230 미만인 사원들을 출력해보세요.
select * from employees where gender = '남자' and salary < 230 ;

-- 기혼자 중에서 , 서대문에 거주하는 사원들을 출력해보세요.
select * from employees where marriage = '결혼' and address = '마포';

-- 기혼자 중에서 , 용산이나 마포에 거주하는 사원들을 출력해보세요.
-- 급여 순으로 오름차순 정렬하세요.
select * from employees where  marriage = '결혼' and address in('마포','용산')
order by salary ;

-- 성씨가 김씨 이거나 여자인 사원들을 출력해보세요.
-- 이름에 대하여 내림차순 정렬하세요.
select * from employees where name like '김%' or gender = '여자'
order by name desc;

-- 관리자가 김구 이면서 , 서대문에 거주하는 사원들을 출력해보세요.
select * from employees where manager = 'kim9' and address = '서대문';


-- dual 테이블
-- dummy 컬럼
select * from dual;

-- 산수
select 4*3+2 from dual;
select 4*(3+2) from dual;
select 4*4*4 from dual;
select power(2,10) from dual;
select upper('abc123') from dual;
select lower('ABC123') from dual;

-- 아이디와 이름을 출력해 보세요
select id, upper(id) , lower(id) , initcap(id) , name from employees;

-- concat 함수 사용하기
-- concat 문자열 결합(concatenation) 함수이다.
select concat('아이디 : ' , name) as result from employees;

-- 예시) 이름은 홍길동이고 , 급여는 100원입니다.
select concat(concat('이름은 ' , name ), concat('이고 , 급여는 ' , salary )) 
as result from employees;

-- substr 함수(1베이스) : 문자열을 부분 추출한다.
-- abc1234
-- 1234567
select substr(password , 4) from employees;
-- 4번 부터 끝까지 추출
select substr(password , 1, 3) from employees;
-- 1부터 3까지 
select substr(password , -5,2) from employees;
-- 뒤에서 5번째 부터 2개만 가져오기 

-- 사원의 아이디와 이름이 각각 몇 글자 인가요?
select id ,length(id), name , length(name) from employees;

-- 사원의 아이디에 o가 들어 있나요?
select id , name , instr(id,'o') from employees;

-- 사원의 아이디에 o가 들어있는 모든 사원을 조회해라.
select * from employees where instr(id , 'o') > 0;

-- 패딩 함수
-- 10자리를 채우는데 모자라면 '♥'로 채워라
select id , lpad(id,10,'♥') from employees;
select id , rpad(id,10,'♥') from employees;

-- 치환 함수
-- 사원 id에 o를 x로 변경해보세요.
select id , replace(id , 'o' , 'x') from employees;

-- 트림 함수 
-- 좌측 우측 공백이 사라지나 가운에 공백은 사라지지 않는다.
select trim('   abc   123  ') from dual;
select rtrim('xxxabc123xxx','x') from dual;
select ltrim('xxxabc123xxx','x') from dual;

--사원의 id와 뒤집어진 id를 조회해 보세요.
select id , reverse(id) from employees;

-- 숫자형 함수 
-- 자바 math클래스와 함께 공부하기
-- 다음과 같이 데이터를 변경하고 , 진행하도록 하겠습니다.
update employees set salary = 1.1 * salary;
update employees set salary = -123.4567 where id in('queen' , 'nongae');
commit;

-- abs 함수는 절대 값을 구해 줍니다.
select id , name , salary , abs(salary) from employees;

--ceil() 함수는 올림 , floor() 함수는 버림 기능을 수행합니다.
select id , name , salary , ceil(salary) , floor(salary) from employees;

--round() 함수는 반올림 , trunc() 함수는 절삭 기능을 수행합니다.
select id , name , salary , round(salary) , trunc(salary) from employees;

--round() 함수의 다양한 기법 
-- round(salary,1): 소수점 1번째 까지 표시 
-- round(salary,-2) : -는 10의 자리에서 반올림한다. -1(일의자리) , -2(십의자리)
-- 양수 또는 0인 경우 소수점 오른쪽 지정 자리수 까지 반올림하세요.
-- 음수인 경우 소수점 왼쪽 지정자리에서 반올림하세요.
-- trunc() 함수는 round() 함수와 동일한 방식으로 작용하되 , 무조건 절삭해 버립니다.
select salary , round(salary) , round(salary,1) ,round(salary,-1) from employees;

--sqrt() 함수는 루트를 구해주는 함수 이다.
select sqrt(5) from dual;
select round(sqrt(5),3) from dual;

-- 모든 급여에 대하여 절대값으로 변경하고 , 루트를 씌운 결과를 출력하세요.
select name ,sqrt(abs(salary)) from employees;

-- mod(n,m) 함수는 n을 m으로 나눈 나머지를 구해 준다.
select mod(14,5) from dual;
select mod(1700,500) from dual;

-- where mod(salary , 10) = 0;
-- 급여가 10의 배수 ...

-- 사원의 id의 길이가 5의 배수인 사원들만 출력하세요.
select * from employees where mod(length(id) , 5) = 0;

--power(a,b) 함수는 a의 b제곱을 수행해준다.
select power(2,3) from dual;

--sign(n) 함수는 숫자 n의 부호를 출력해준다.
select name , salary , sign(salary) from employees;

-- 11월 10일차 

--날짜 함수
select sysdate from dual;
alter session set nls_date_format = 'YYYY-MM-DD HH:MI:SS';
alter session set nls_date_format = 'YYYY/MM/DD HH';
select sysdate from dual;

-- 1시간 = 1/24
-- 1분 = 1/24/60
-- 1초 = 1/24/60/60

alter session set nls_date_format = 'YYYY-MM-DD HH:MI:SS';

-- 하루 뒤의 시각을 구해보세요.
select sysdate + 1 from dual;
-- 하루 전의 시각을 구해보세요.
select sysdate - 1 from dual;
-- 현재 시각과 2시간 이후의 시간, 5초전의 시각을 구해 보세요.
select sysdate , sysdate + 2/24 , sysdate - 5/24/60/60  from dual;

-- 사원들의 이름과 생일과 현재까지 살아온 일수를 조회해보세요.
select name , birth , round(sysdate - birth,3)as "살아온 날수" from employees;

select months_between(sysdate,'2020/01/01') from dual;

-- 모든 사원들의 이름과 생일과 몇 개월 살아왔는 지 조회해보세요.
select name, birth, round(months_between(sysdate, birth),3) from employees;

-- 지금부터 3개월 뒤 , 5개월 전의 시각을 구해보세요.
select sysdate , add_months(sysdate , 3) , add_months(sysdate , -5) from dual;

-- 김구와 김좌진의 생일을 5개월 이전으로 변경하세요.
update employees set birth = add_months(birth , -5) where id = 'kim9' or id = 'general';

-- 황진이와 조마리아의 생일을 74일 이전으로 변경하세요.
update employees set birth = birth - 74 where id = 'maria' or id = 'hwang';

-- 이번주 금요일은 몇 일인가?
select next_day(sysdate , '금') from dual;
select next_day(sysdate , '화') from dual;

-- 이번달의 마지막 날짜는 몇 일인가?
select last_day(sysdate) from dual;

-- 달 기준 , 이번달 15일 전에 현재 시간이 위치하고 있으므로 11/1 출력됨 
-- 중간 15일을 지나면 익월 1일이 출력됨 
select round(sysdate , 'month') from dual;

-- 년 기준 , 현재 하반기이므로 내년 21/1/1 출력됨 
select round(sysdate , 'year') from dual;

-- 상하반기 안따지고 무조건 절삭해버림 
select trunc(sysdate , 'month') from dual;
select trunc(sysdate , 'year') from dual;

-- to_char 함수
select sysdate, to_char(sysdate , 'yyyy-mm-dd') from dual;

-- 사원들의 이름과 생일을 출력해 보세요.
-- 생일은 '월/일' 형식으로 출력해야 합니다.
select name , to_char(birth , 'mm/dd') from employees;

select name , to_char(birth , 'year month') from employees;

-- 형식 요소에 존재하지 않는 항목은 반드시 쌍따옴표로 둘러 싸야 한다.
-- 사원들의 이름과 생일을 출력해 보세요.
-- 생일은 'yyyy年mm月dd日' 형식으로 출력해야 합니다.
select name , to_char(birth , 'yyyy"年" mm"月" dd"日"') as "생일정보" from employees;

-- 암시적 형변환
select 'abc'|| 123 from dual;


-- 명시적 형변환
select 'abc'|| to_char(123) from dual;

--? 
select 100 + '100' from dual;

select 100 + to_number('100') from dual;

select 
to_char(12345,'$999,999.00') as salary01, 
to_char(12345,'$000,000.00') as salary02,
--L은 지역통화 
to_char(12345,'L999,999.00') as salary03,
to_char(12345,'000,000.00') as salary04 
from dual;

-- 일반 함수 실습을 위한 사전 준비
update employees set salary = 200.0 where id = 'nongae';
update employees set salary = 300.0 where id = 'queen';
commit;

--앞에 식을 보고 null인지 아닌지 본다.
select nvl(null,'하하') from dual;
select nvl('가나다','하하') from dual;

--모든 사원들의 이름과 급여를 조회해보세요.
--단 , 급여가 존재하지 않는 사원은 기본값으로 100이라고 가정합니다.
select name , nvl(salary , 100) newsalary from employees;

--모든 사원들의 이름과 관리자 아이디를 조회해보세요.
-- 관리자인 사원들은 기본값으로 '관리자'이라고 출력되어야 한다.
select name , nvl(manager , '관리자') newmanager from employees;

--모든 사원들의 이름과 급여와 연봉을 조회해보세요.
--단 , 급여가 존재하지 않는 사원은 기본값으로 100이라고 가정합니다.
select name , nvl(salary , 100) newsalary ,12*nvl(salary , 100) newannsal from employees;

--모든 사원들의 이름과 급여를 조회해보세요.
--그리고 , 급여의 존재 여부에 대하여 코멘트를 잘성하도록 하세요.
select name , salary , nvl2(salary , '급여 존재함' , '급여가 null임') from employees;

--모든 사원의 이름과 결혼여부와 상태를 조회하시오.
--단 , 상태는 결혼 여부가 '미혼'인 사원들은 null값으로 대체하세요.
select id , name , marriage , nullif(marriage, '미혼') as result
from employees;

-- manager 이 있으면 제대로 나옴 
-- null이면 급여를 가지고 null인지 아닌지 찾음 
-- 만약에 manager와 salary 모두 널이면 '모두 null' 로 처리됨
select name , coalesce(manager, to_char(salary) , '모두 null')as result from employees;

-- case 구문 
-- manager 컬럼을 이용하여 관리자 정보를 출력해보세요.
select id , name , manager,
case manager
when 'yusin' then '김유신 장군'
when 'soon' then '유관순 누나'
when 'kim9' then '김구 선생님'
else '관리자' end as result
from employees;

-- 사원들의 이름과 급여와 코멘트를 출력하세요.
-- 파생결과는 관리자가 'yusin'이면 , 급여의 10% 인상액 ,
-- 관리자가 'soon'이면 , 급여의 20% 인상액,
-- 관리자가 'kim9'이면 , 급여의 30% 인상액,
-- 나머지는 급여를 출력해야 한다.
-- 단, 급여가 null이면 기본 값으로 100을 지정합니다. 
select name , salary , manager,
case manager
when 'yusin' then nvl(salary , 100)*1.1
when 'soon' then nvl(salary , 100)*1.2
when 'kim9' then nvl(salary , 100)*1.3
else nvl(salary , 100) end as result
from employees;

-- 급여가 200미만이면 'low', 240미만이면 'middle' , 240이상이면 'high'를 출력해보세요.
select name , salary ,
case 
when nvl(salary,100) < 200 then 'low'
when nvl(salary,100) < 240 then 'middle'
else 'high' end as result 
from employees;

-- 4분기 
select to_char(sysdate,'Q') from dual;

-- ? 
-- 사원들의 이름과 생일과 분기를 출력해 보세요.
-- 단 , 다음 문장을 참조하도록 하고 , case 구문을 사용해야 됩니다. 
select name , to_char(nvl(birth,sysdate) ,'yyyy/mm/dd') as birth,
case  to_number(to_char(birth , 'Q'))
when 1 then '1사분기'
when 2 then '2사분기'
when 3 then '3사분기'
else '4사분기' end as quarter
from employees;

-- 11월 11일차
-- set 집합 연산자

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

-- 합집합
select * from set_a union select * from set_b;

-- 모든 결과 출력
select * from set_a union all select * from set_b;

-- 교집합
select * from set_a intersect select * from set_b;

-- 차집합
select * from set_a minus select * from set_b;

-- 사원 테이블에서 남자만 추출하여 테이블 table01을 만들어보세요.
-- 단 , 김구는 제외하도록 하세요.
-- 여자들 중에서 미혼자만 추가해주세요.

create table table01
as 
select * from employees where gender = '남자' and id <> 'kim9';

insert into table01
select * from employees
where gender = '여자' and marriage = '미혼';

-- 사원 테이블에서 여자만 추출하여 테이블 table02을 만들어보세요.
-- 남자들 중에서 기혼자만 추가해주세요.

create table table02
as 
select * from employees where gender = '여자' ;

insert into table02
select * from employees
where gender = '남자' and marriage = '결혼';

commit;
select * from table01;
select * from table02;

select * from table01 union all select * from table02;

select id , name , address from table01 
union 
select id , name , address from table02
order by id desc;

-- 정렬은 한번만 하기 
select id , name , address from table01 
intersect
select id , name , address from table02 
order by name desc;

-- 교환 법칙 성립 x
select id , name , address from table01 
minus
select id , name  , address from table02 
order by name desc;

-- 교환 법칙 성립 x
select id , name , address from table02 
minus
select id , name , address from table01 
order by name desc;

-- 파생 컬럼도 가능하다.
-- 실제 컬럼이름은 없음 --> 알리아스로 지정
-- 별칭은 첫 번째 sql 구문에만 작성해주면 된다.
select id , name , address , '구사원' as remark from table01 
union
select id , name , address , '신사원'from table02 
order by name desc;

-- 컬럼의 이름은 첫번째 sql구문의 이름을 따른다.
-- address와 name 은 둘다 문자여서 문법적으로는 문제없음
-- 하지만 , 논리적으로 보면 데이터 값이 문제됨 
select id ,address,name from table01 
union
select id , name , address from table02 ;


-- 그룹(집계) 함수
-- 모든 사원의 수를 구해 보세요.
select count(*) from employees;

-- 급여가 null이 아닌 사원의 수를 구해보세요.
select count(salary) from employees;

-- 급여가 null 인 행수는 몇개인가요?
select (count(*)-count(salary))as result from employees;

-- marriage 컬럼은 총 몇 행인가요?
select count(marriage) from employees;

-- marriage 컬럼에는 몇가지 유형의 데이터가 있나요?
select count(distinct marriage) from employees;

-- 급여의 평균을 구해 보세요.
select avg(salary) from employees;

-- 급여의 평균을 구하되 , null인 사원은 100으로 치환하여 계산하세요.
select avg(nvl(salary,100)) from employees;

-- 급여의 총금액을 구해보세요.
select sum(salary) from employees;

-- 급여의 총금액을 구하되 , null인 사원은 100으로 치환하여 계산하세요.
select sum(nvl(salary,100)) from employees;

-- 최대 급여는 얼마인가요?
select max(salary) from employees;

-- 최소 급여는 얼마인가요?
select min(salary) from employees;

-- 아이디를 기준으로 가장 먼저 조회되는 아이디는 무엇인가요?
select min(id) from employees;

-- 이름을 기준으로 가장 나중에 조회되는 이름은 무엇인가요?
select max(name) from employees;

-- 그룹핑(group by) 
-- group by 에 적은 컬럼은 반드시 select 절에도 적어준다.
-- 남녀 각 몇 명인가요?
select gender, count(*) as 개수 from employees group by gender
order by gender;

-- 남녀 각각 급여의 총합 및 최소 급여를 구해보세요.
-- 단 , 급여가 null이면 100으로 치환하여 계산해야한다.
select gender , sum(nvl(salary,100)) as 총합 ,min(nvl(salary,100)) as 최소 from employees group by gender;

-- 결혼 유형(marriage 컬럼)은 각각 몇 명인가요?
select marriage,count(marriage) as 개수 from employees group by marriage;

-- 지역별(address 컬럼) 각각 몇 명이 거주하고 있나요?
select address,count(address) as 개수 from employees group by address ; 

-- 성별,지역별 각각 몇 명인가요?
select gender , address , count(*) as cnt from employees group by gender, address  
order by gender, address;

-- 성별, 결혼 유무별 각각 몇 명인가요?
select gender , marriage, count(*) as cnt from employees group by gender , marriage
order by gender , marriage ;

-- 서대문에 거주하는 남,녀는 각각 몇 명인가요?
select gender , count(*) as cnt from employees where address = '서대문' group by gender ;

-- 생일이 존재하는 기혼자의 남녀별 급여의 총액을 구해보세요.
select gender , sum(salary) as 총액 
from employees 
where birth is not null and marriage = '결혼' 
group by gender;

-- having 절 
-- 성별, 결혼 유무별 각각 몇 명인지 조회하되 , 3명 이상만 조회되도록 하세요.
select gender , marriage, count(*) as cnt 
from employees 
group by gender , marriage
having count(*) >=3 
order by gender , marriage;

-- 남녀 각각 급여의 총합 중에서 총합이 2000미만인 행만 조회해보세요.
-- 단 , 급여가 null인 경우 100으로 치환하도록 하여라.
select gender , sum(nvl(salary,100)) as 총합
from employees
group by gender
having sum(nvl(salary,100)) < 2000;

-- 결혼 유무별 최대 급여와 최소 급여를 조회해 보세요.
-- 단, 결혼 유무별 최대 급여와 최소 급여의 차이가 100이상이어야합니다.
select marriage , max(salary) , min(salary)
from employees
group by marriage 
having (max(salary) - min(salary))>=100 ;

-- 관리자가 아닌 일반 사원 중에서 성별로 6명 이하인 데이터만 조회해보세요.
select gender, count(*) as cnt
from employees
where manager is not null
group by gender
having count(*)<= 6;

-- 관리자가 아닌 일반 사원중에서 결혼 유무 별로 급여의 총액이 1000이상인 행만 조회해보세요.
select marriage , sum(salary) as sumsal
from employees
where manager is not null
group by marriage
having sum(salary) >= 1000;

-- 무엇이 문제인가요?
select gender, count(*) from employees;

-- 해결01. gender 컬럼을 없애면 전체 사원의 수가 된다.
select count(*) from employees;

-- 해결02. group by 절에 gender를 명시하면 성별 각각의 인원수가 된다.
select gender, count(*) from employees group by gender;

-- 그룹함수는 where 절에 사용 불가능하다.
select gender, count(*) from employees 
where count(*)>10
group by gender;

-- 해결03. group by 절에 having 절로 조건을 명시한다.
select gender, count(*) from employees 
group by gender
having count(*)>10;

-- 참조 무결성 제약 조건 만드는 방법 
-- 반드시 , 자식테이블에서 작성해야합니다.
-- alter table 자식테이블 이름
-- add constraint 제약조건이름 ---> 반드시 unique
-- foreign key(포린키 이름)
-- references 부모테이블이름(기본키 이름)
-- [on delete cascade | set null]; ---> 부모가 지워졌을때 자식이 null값으로 바껴야함 : delete set null (ex.회원이 탈퇴를 하는 경우 , 이전에 작성한 게시물은 남기도록 하겠습니다.)
                                   ---> 자식이 완전히 지워져야함 : delete cascade

-- 게시물 테이블 이름을 boards라고 가정합니다.
-- boards의 컬럼 구성 
-- no(글번호) , writer(작성자) , password(비밀번호) , subject(글제목) , content(글내용), readhit(조회수) , regdate(작성일자) 

alter table boards
add constraint aaa
foreign key(writer)
references employees(id)
on delete set null;

-- 상품이 지워졌을 때 , 매출은?
-- on delete set null;

-- 주문 테이블과 주문 상세 테이블이 있다.
-- 주문 취소시 주문 상세 테이블은?
-- on delete cascade;


-- 시퀀스
create sequence seqtest01;

-- 내가 보유한 시퀀스 목록
select * from seq;

-- 번호표를 뽑아 냅니다.
select seqtest01.nextval from dual;

-- 방금 추출된 번호표를 확인합니다.
select seqtest01.currval from dual;

-- 현재 4번까지 추출되어 있는 상태 입니다.

create table seqtable(
    no number primary key,
    remark varchar2(30)
);

--테이블에 데이터를 추가합니다.
insert into seqtable(no,remark) values(seqtest01.nextval,'하하하');

commit;
select *from seqtable;

insert into seqtable(no,remark) values(seqtest01.nextval,'호호호');
insert into seqtable(no,remark) values(seqtest01.nextval,'히히히');
insert into seqtable(no,remark) values(seqtest01.nextval,'크크크');

commit;

-- 다음 문장은 오류가 발생합니다.
-- 실수로 values 대신 value를 타이핑 했습니다. 
-- 9번이 뽑혔는데 폐기됨 
-- 추출된 시퀀스 번호는 문장의 오류가 있더라도, 사용되지 못하고 폐기 된다.
insert into seqtable(no,remark) value(seqtest01.nextval,'가나다');

-- 올바른 문장을 다음과 같이 입력 합니다.
-- 몇번이 추가될까요?
insert into seqtable(no,remark) values(seqtest01.nextval,'라마바');


commit;
select * from seqtable;

-- 시작 값은 10 , 증감치는 10 , 최대값은 60
create sequence seqtest02
start with 10 increment by 10 maxvalue 60 ;

-- 60을 초과하면 오류메세지가 나옴 
select seqtest02.nextval from dual;

-- 초기 값은 1 , 증감치는 2인 시퀀스 seqtest03을 생성하세요.
-- seqtable 데이터를 모두 삭제하고, 시퀀스 seqtest03를 사용하여 5건만 추가해보세요.
create sequence seqtest03
start with 1 increment by 2;

delete from seqtable;
insert into seqtable(no,remark) values(seqtest03.nextval,'가가가');
insert into seqtable(no,remark) values(seqtest03.nextval,'나나나');
insert into seqtable(no,remark) values(seqtest03.nextval,'다다다');
commit;
select * from seqtable;

-- 시퀀스의 내용 변경 
alter sequence seqtest01 
increment by 100 
maxvalue 100000;

insert into seqtable(no,remark) values(seqtest01.nextval,'마마마');
insert into seqtable(no,remark) values(seqtest01.nextval,'바바바');

drop sequence seqtest01;
drop sequence seqtest02;
drop sequence seqtest03;

select * from seq;
select * from seqtable;

-- 접속을 종료한 다음 , 재접속하여 다음 문장을 수행해 봅니다.
select seqtest01.nextval from dual;

-- 게시물 테이블 만들기 
-- 관련 시퀀스 만들기
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

-- 참조 무결성 제약조건 
alter table boards
add constraint boards_writer_fk
foreign key(writer)
references employees(id)
on delete set null;

drop sequence seqboard;
create sequence seqboard;
delete from boards;
-- 게시물 데이터 등록 
insert into boards(no , writer , password , subject , content , readhit , regdate)
values(seqboard.nextval, 'an' , 'abc123' , '자바' , '너무 어려워' , default , '80/12/25');

insert into boards(no , writer , password , subject , content , readhit , regdate)
values(seqboard.nextval, 'an' , 'abc123' , 'db' , '그룹 바이' , default , '88/07/17');

insert into boards(no , writer , password , subject , content , readhit , regdate)
values(seqboard.nextval, 'an' , 'abc123' , 'jsp' , '웹 프로그래밍' , default , '86/08/15');

insert into boards(no , writer , password , subject , content , readhit , regdate)
values(seqboard.nextval, 'queen' , 'abc123' , 'jdbc' , '제이디비씨' , default , '90/01/22');

insert into boards(no , writer , password , subject , content , readhit , regdate)
values(seqboard.nextval, 'queen' , 'abc123' , 'sql' , '에스큐엘' , default , '93/06/17');

insert into boards(no , writer , password , subject , content , readhit , regdate)
values(seqboard.nextval, 'maria' , 'abc123' , '자바' , 'java' , default , '00/01/22');

insert into boards(no , writer , password , subject , content , readhit , regdate)
values(seqboard.nextval, 'maria' , 'abc123' , 'sql' , '호호호' , default , '08/06/17');


insert into boards(no , writer , password , subject , content , readhit , regdate)
values(seqboard.nextval, null , 'abc123' , '자바' , 'java' , default , '00/01/22');

insert into boards(no , writer , password , subject , content , readhit , regdate)
values(seqboard.nextval, null , 'abc123' , 'sql' , '호호호' , default , '08/06/17');

select * from boards;


-- 11월 12일 차
-- 조인하기
-- 게시물을 작성한 사람의 이름과 글 제목을 출력해 보세요.

-- 오라클 조인
select employees.name,boards.subject
from employees,boards
where employees.id = boards.writer;

-- Ansi 조인
-- 국제 표준 조인 방법 
select employees.name,boards.subject
from employees join boards
on employees.id = boards.writer;

-- 별칭을 사용하는 경우
-- 오라클 조인
-- from 절을 제외한 컬럼명을 전부다 별칭으로 바꿔줘야 인식이 가능하다.
select e.name,b.subject
from employees e , boards b 
where e.id = b.writer;

-- Ansi 조인
-- 국제 표준 조인 방법 
select e.name,b.subject
from employees e join boards b
on e.id = b.writer;

-- 추가적인 조건은 and 연산자를 사용하면 된다. 
-- 오라클 조인
-- from 절을 제외한 컬럼명을 전부다 별칭으로 바꿔줘야 인식이 가능하다.
select e.name,b.subject
from employees e , boards b 
where e.id = b.writer
and e.name in('안중근','조마리아');

-- Ansi 조인
-- 국제 표준 조인 방법
-- join 이라고 적으면 디폴트 값이 inner다. 
select e.name,b.subject
from employees e join boards b
on e.id = b.writer
and e.name in('안중근','조마리아');

-- non equi join을 실습하기 위하여 다음 코드를 실행한다. 
-- rownum : 데이터가 들어간 순서 번호를 기억하고 있다.
--          오라클이 내부적으로 관리를 위한 컬럼이다.
select rownum ,id , name , salary from employees;

update employees set salary = 100 * rownum;
commit;
select * from employees;

-- 급여 평가용 테이블을 작성한다.
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

-- 각 사원들의 이름과 급여와 급여 평가 결과를 출력하세요. 
-- non-equi join
select e.name , e.salary , g.glevel
from employees e , grades g 
where e.salary between g.lowsal and g.highsal;


-- 사원의 이름과 게시물의 제목과 내용을 조회해 보세요.
-- 단 , 게시물을 남기지 않은 사원들도 같이 조회되어야 한다.
-- employees 왼쪽 , boards 가 오른쪽이라고 했을때 왼쪽 기준으로 전부 조회되어야함 

-- 오라클의 left outer join
select e.name , b.subject , b.content
from employees e , boards b
where e.id = b.writer(+);
-- b.writer 가 더 내용이 많지만 기준은 e.id 가 된다.
-- 1:다 관계 
-- 따라서 lert outer join 
-- 오라클 조인은 그러려니..하고 넘어가자..

-- Ansi의 left outer join
select e.name , b.subject , b.content
from employees e left outer join boards b
on e.id = b.writer;

-- 사원의 이름과 게시물의 제목과 내용을 조회해 보세요.
-- 단 , 탈퇴한 이전 사원들의 목록도 같이 조회되어야 한다.
-- employees 왼쪽 , boards 가 오른쪽이라고 했을때 오른쪽 기준으로 전부 조회되어야함 
-- 오라클의 right outer join
select e.name , b.subject , b.content
from employees e , boards b
where e.id(+) = b.writer;

-- Ansi의 right outer join
select e.name , b.subject , b.content
from employees e right outer join boards b
on e.id = b.writer;

-- full outer join 
-- 오라클 조인 방법은 없음 .. 
-- Ansi의 full outer join
select e.name , b.subject , b.content
from employees e full outer join boards b
on e.id = b.writer;


-- self join 
-- 같은 테이블끼리 조인하는 방법
-- 안중근의 관리자는 김구입니다. 
-- 사원_테이블.관리자_아이디 = 관리자_테이블.아이디

select emp.name || '의 관리자는 ' || mgr.name || '입니다.' as result
from employees emp inner join employees mgr 
on emp.manager = mgr.id;

-- 위의 문제에서 관리자도 포함되도록 수정해보세요.
-- 관리자는  '본인'이라고 출력해 보도록 한다.
-- 사원 테이블의 null값인 관리자도 나와야하니 left outer join이어야 한다.
select emp.name || '의 관리자는 ' || nvl(mgr.name, '본인') || '입니다.' as result
from employees emp left outer join employees mgr 
on emp.manager = mgr.id;

-- 각 사원들은 몇건의 게시물을 남겼나요?
select e.name, count(*) as cnt
from employees e join boards b
on e.id = b.writer
group by e.name;

-- 각 사원들은 몇건의 게시물을 남겼나요?
-- 게시물을 남기지 않은 사원은 0으로 출력해보세요.
select e.name, count(writer) as cnt
from employees e left outer join boards b
on e.id = b.writer
group by e.name;

-- 서브 쿼리
-- 최소 급여는 얼마인가요?
select min(salary) from employees;

-- 최소 급여를 받는 사원의 이름과 급여와 주소를 출력해보세요.
select name , salary , address from employees where salary = 100;

-- 서브 쿼리
-- input , output 이 두번 이루어질때 , 한번에 처리하기 위하여 사용한다.
-- 연산자 우선순위로 인하여 소괄호를 작성할 것
-- 바깥 select : main 쿼리 , 안쪽 select : 서브쿼리
select name , salary , address 
from employees 
where salary = (select min(salary) from employees);


-- 평균보다 많은 급여를 받는 사원들의 이름과 급여를 출력해보세요.
select name , salary 
from employees
where salary >= (select avg(salary) from employees);

-- 관리자의 이름이 김구인 사원들의 아이디 , 이름 , 관리자 아이디를 출력해보세요.
select id , name , manager
from employees
where manager = (select id from employees where name = '김구');

-- 관리자의 이름이 김구인 사원들의 아이디 , 이름 , 관리자 아이디를 출력해보세요.
-- 단 , 김구도 같이 출력되어야 한다.
-- 추가 조건은 and나 or연산자를 사용하여 처리하면 된다.

select id , name , manager
from employees
where manager = (select id from employees where name = '김구' )
or name = '김구';

-- 선덕여왕의 급여보다 적은 급여를 받는 사원들의 이름과 급여를 조회해보세요.
select name , salary
from employees
where salary < (select salary from employees where name = '선덕여왕');

-- 관리자가 '김구'이면서 , 평균 급여 보다 적은 급여를 받는 사원의 아이디, 이름 , 급여를 
-- 조회해보세요.

select id , name , salary
from employees
where salary <= (select avg(salary) from employees )
and manager = (select id from employees where name ='김구');

-- 다중행 서브 쿼리
-- 관리자의 이름이 '김구'이거나 '유관순'인 사원들의 아이디와 이름과 관리자 아이디를 조회해보세요.
-- 김구와 유관순 2개 행 조회 = 다중행 
select id , name , manager 
from employees
where manager in (select id from employees where name in ('김구' , '유관순'));

-- 게시물을 남긴 사원들의 이름과 생일과 성별을 출력하세요.
select distinct writer from boards where writer is not null;

select name , birth , gender
from employees 
where id in (select distinct writer from boards where writer is not null);


-- 결혼 유무가 이혼이 아닌 사원들의 이름과 생일과 성별을 출력하세요.
select name , birth , gender , marriage
from employees
where name in (select name from employees where marriage <> '이혼');


-- 관리자가 유관순인 사원들을 조회해 보세요.
select name , salary
from employees
where manager = 'soon';

-- 최저 900원, 최대 1600원

-- 관리자가 유관순인 사원 중에서 최소 급여자 보다 많이 받는 사원들을 조회해 보세요.
-- any : 임의의
-- 하나라도 true가 나오면 추출됨  
select name , salary from employees
where salary > any (select salary from employees where manager = 'soon');

-- 관리자가 유관순인 사원 중에서 최대 급여자 보다 적게 받는 사원들을 조회해 보세요.
select name , salary from employees
where salary < any (select salary from employees where manager = 'soon');

-- all : 전부다 true 여야 추출됨 
-- 관리자가 유관순인 사원 중에서 최대 급여자 보다 많이 받는 사원들을 조회해보세요.
select name , salary from employees
where salary > all (select salary from employees where manager = 'soon');

-- 관리자가 유관순인 사원 중에서 최소 급여자 보다 적게 받는 사원들을 조회해보세요.
select name , salary from employees
where salary < all (select salary from employees where manager = 'soon');

-- 성별로 최저 급여자의 이름과 급여와 성별을 구해보세요.
-- where  절에 컬럼은 여러개 적을 수도 있다.
select gender , min(salary) from employees group by gender;

select name , salary , gender from employees 
where (gender,salary) in (select gender , min(salary) from employees group by gender);

-- 결혼 유무별 최저 급여자의 이름과 급여와 결혼 유무 컬럼을 조회해보세요.
-- 집계 함수는 1개만 가능하다.
select name , salary , marriage from employees
where (marriage ,salary) in (select marriage , min(salary) from employees group by marriage);

select min(salary) from employees group by gender;

-- 1 : 1 관계인데 조회되는 값은 2개임 
-- 단일행 연산자로 다중행 결과물과 비교를 하려고 시도할 때 나오는 오류 메세지입니다. 
select name , salary 
from employees
where salary = (select min(salary) from employees group by gender); 

-- 존재하지 않는 사원 '심형래'를 조회하면 서브 쿼리의 결과물은 null 입니다.
-- 따라서 , 오류는 발생하지 않고 조회되는 결과는 없습니다. 
select name , salary from employees
where id = (select id from employees where name = '심형래');

select * from employees;
