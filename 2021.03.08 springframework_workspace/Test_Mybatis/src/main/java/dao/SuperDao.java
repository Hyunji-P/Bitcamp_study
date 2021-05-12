package dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SuperDao {
	// 1. 맵 설정파일(xml) 불러 올 준비
	private String mapConfigfile = null;
	// 2. sqlSession 객체 만들 준비
	private SqlSessionFactory ssf = null;
	// 3. sql 문장을 이용하여 DB에게 요청하는 객체 ( JDBC 에 pstmt 객체와 비슷)
	protected SqlSession sqlSession = null;

	// 생성자에 경로 지정
	public SuperDao() {
		this.mapConfigfile = "fileDirection/mapconfigfile.xml";
		this.SqlSessionOpen();
	}

	// xml 파일 열기
	private void SqlSessionOpen() {
		InputStream inputStream = null;

		try {
			// 1. Resources 클래스를 이용하여 스프링 설정 파일을 읽어옴
			inputStream = Resources.getResourceAsStream(this.mapConfigfile);
			// 2. SqlSession 은 혼자서 객체를 생성 할 수 없기 때문에 , SqlSessionFactory 클래스의 도움을 받음
			this.ssf = new SqlSessionFactoryBuilder().build(inputStream);
			// 3. SqlSessionFactory 클래스의 도움으로 sqlSession 객체를 구함
			this.sqlSession = this.ssf.openSession(true);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (inputStream != null) {
					inputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void SqlSessionClose() {
		// sqlSession 객체를 종료해주는 메소드 
		if (this.sqlSession != null) {
			this.sqlSession.close();
		}
	}

}
