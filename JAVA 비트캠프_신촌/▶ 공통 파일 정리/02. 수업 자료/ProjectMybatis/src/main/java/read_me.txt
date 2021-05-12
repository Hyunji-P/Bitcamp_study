참조 사이트 : http://cafe.naver.com/jjdev/254   

구현 순서는 다음과 같습니다.
1) dbscript1.txt 파일을 사용하여 데이터 베이스 테이블을 생성합니다.
2) Bean 클래스를 작성합니다.
3) 맵핑과 관련된 설정 파일을 작성합니다.
<typeAliases> : 타입에 대한 별칭을 작성합니다.
<dataSource> dataSource 소스에 대한 출처를 명시합니다.
<mappers> 매퍼 파일들의 위치 정보를 작성합니다.
4) 매퍼 파일을 작성합니다.
네임 스페이스의 이름을 결정합니다.
6) SuperDao 클래스를 작성합니다. 
맵 설정 파일(mapConfigFile)을 이용하여 sqlSession 객체를 구해 주는 메소드를 구현합니다.
sqlSession 객체를 닫아 주는 메소드를 구현합니다.
7) 서브Dao 클래스를 작성합니다.
SuperDao 클래스를 상속 받습니다.
네임 스페이스의 이름과 입력해야 할 데이터 및 mapperid를 이용하여 메소드를 호출합니다.
매퍼 파일에 대한 코딩(resultType, parameterType 속성 등등을 사용하여)도 병행합니다.
8) main 자바 클래스 파일을 작성합니다.








3. DAO(Data Access Object)
	mypkg.MemberDao.java 파일
		SqlSessionFactory 객체 생성
	
4. 맵 설정 파일 작성(/src/mybatis-config.xml)
	루트 태그는 반드시 <configuration>으로 작성해야 한다.
	
	1) <environments> 태그를 이용하여 환경 설정을 한다. 
		(1) transactionManager 설정
		(2) <dataSource> 설정 
	2) <mappers> 태그를 이용하여 맵핑 파일의 위치를 지정한다.

5. 맵핑 파일(/src/MyMapper.xml)
	루트 태그는 반드시 <mapper>으로 작성해야 한다.

	1) 각각의 로직에 필요한 sql 문장 작성
	참고로 namespace는 "MyNamespace"이다.

6. 테스트를 위한 메인 파일 작성
	1) 각각의 로직에 필요한 파일을 작성하도록 한다.