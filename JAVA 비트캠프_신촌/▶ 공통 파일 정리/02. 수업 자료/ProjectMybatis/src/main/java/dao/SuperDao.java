package dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SuperDao {
	// SqlSession : 실제 SQL 구문을 이용하여 데이터 베이스에게 요청을 실행하는 객체입니다.
	protected SqlSession sqlSession = null ;	
	private SqlSessionFactory sqlSessionFactory;
	private String mapConfigFile = null ;

	public SuperDao() {
		this.mapConfigFile = "mybatis/mapconfigfile.xml" ; 
		this.SessionOpenStream() ;
	}	
	private void SessionOpenStream(){
		InputStream inputStream = null ;
		try {
			inputStream =  Resources.getResourceAsStream(this.mapConfigFile) ;
			this.sqlSessionFactory = new SqlSessionFactoryBuilder().build( inputStream ) ;
			this.sqlSession = this.sqlSessionFactory.openSession( true ) ; 
			
		} catch (IOException e) {			 
			e.printStackTrace();
		} finally{
			try {
				if( inputStream != null ){ inputStream.close();  }	
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		// return this.sqlSession  ;
	}
	public void SessionClose(){
		// sqlSession 객체를 종료해주는 메소드
		if( this.sqlSession != null ){ this.sqlSession.close(); }
	}		
}