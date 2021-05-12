package dao;

import java.util.HashMap;
import java.util.List;

public class MemberDao extends SuperDao {
	private final String namespace = "TestMember.";
	
	public MemberDao() {
		super();
	}

	public List<HashMap<String, Object>> SelectJoinData() {
		List<HashMap<String, Object>> mli = null;
		
		mli = super.sqlSession.selectList(this.namespace + "SelectJoinData");
		System.out.println(mli);
		super.SqlSessionClose();
		
		return mli;
	}

}
