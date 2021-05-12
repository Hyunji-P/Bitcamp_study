package execute03;

import java.util.Scanner;

import bean.Album;
import dao.AlbumDao;

public class C05_Main1SelectOne {
	public static void main(String[] args) {
		AlbumDao dao = new AlbumDao();
		
		Scanner scan = new Scanner(System.in) ;
		
		System.out.println("한 사람 조회하기.");
		System.out.print("아이디(정수) 입력 : ");
		
		int id = scan.nextInt();
		Album alb = dao.GetAlbumByPk(id);
		
		if( alb == null ){
			System.out.println("존재하지 않는 앨범입니다.");
		}else{
			System.out.println("Bean 객체 정보 : ");
			System.out.println(alb.toString());			
		}
		
		scan.close();
	}
}