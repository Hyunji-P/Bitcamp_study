package dao;

import java.util.List;

import bean.Room;

public class RoomDao extends SuperDao {
	private final String namespace = "TestRoom.";

	public int InsertData(Room room) {
		// 방 추가 관련 메소드
		int cnt = -1;
		cnt = super.sqlSession.insert(this.namespace + "InsertData", room);
		super.SqlSessionClose();
		return cnt;
		
	}

	public int UpdateData(Room room) {
		// 방 수정 관련 메소드
		int cnt = -1;
		cnt = super.sqlSession.update(this.namespace + "UpdateData", room);
		super.SqlSessionClose();
		return cnt;
	}

	public int DeleteData(String name) {
		// 방 예약 취소 관련 메소드
		int cnt = -1;
		cnt = super.sqlSession.delete(this.namespace + "DeleteData", name);
		super.SqlSessionClose();
		return cnt;
	}

	public List<Room> SelectAllData() {
		// 방 예약 목록 관련 메소드
		List<Room> lists = null;
		lists = super.sqlSession.selectList(this.namespace + "SelectAllData");
		super.SqlSessionClose();
		return lists;
	}

	public Room SelectOneData(int rono) {
		// 방 예약 조회 관련 메소드(1건)
		Room bean = new Room();
		bean = super.sqlSession.selectOne(this.namespace + "SelectOneData", rono);
		return bean;
	}

}
