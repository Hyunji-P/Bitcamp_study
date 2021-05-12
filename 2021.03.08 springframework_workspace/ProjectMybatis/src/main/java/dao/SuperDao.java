package dao;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SuperDao {
	// 맵 설정 파일 : mybatis 관련 설정 파일
	private String mapConfigfile = null;
	private SqlSessionFactory ssf = null;

	// SqlSession : sql 문장을 이용하여 데이터베이스에게 요청하는 객체
	// 따라서 , 이러한 객체를 구하기 위해 하단 부 try 절에 코딩
	protected SqlSession sqlSession = null;

	public SuperDao() {
		this.mapConfigfile = "mybatis/mapconfigfile.xml";
		this.SessionOpenStream();
	}

	private void SessionOpenStream() {
		InputStream inputStream = null;

		try {
			inputStream = Resources.getResourceAsStream(this.mapConfigfile);
			this.ssf = new SqlSessionFactoryBuilder().build(inputStream);
			this.sqlSession = this.ssf.openSession(true);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (inputStream != null) {
					inputStream.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	public void SessionClose() {
		// sqlSession 객체를 종료해주는 메소드 
		if (this.sqlSession != null) {
			this.sqlSession.close();
		}
	}

}
