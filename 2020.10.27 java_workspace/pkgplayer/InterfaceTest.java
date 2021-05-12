package pkgplayer;

public class InterfaceTest {

	public static void main(String[] args) {
		DvdPlayer dvd01 = new DvdPlayer("영웅본색", 7200);// 제목 , 상영시간(초)
		dvd01.fast();
		dvd01.slow();
		dvd01.reverse();
		System.out.println();

		Mp3Player mp301 = new Mp3Player("이선희", "j에게", 210);// 가수 , 노래 , 재생시간(초)
		mp301.fast();
		mp301.reverse();
		System.out.println();
//		mp301.play(); --> 어떻게 바라보는지 볼 것 

		// 인터페이스는 추상클래스의 확장개념
		// 자생력이 없지만 배열정의는 가능
		Player[] myplayer = new Player[3];
		myplayer[0] = new DvdPlayer("기생충", 7400);
		myplayer[1] = new Mp3Player("나훈아", "고향역", 240);
		myplayer[2] = new VideoPlayer("담보", 300, "15세 이상 관람가");

		// main메소드에서 showInfo 메소드를 보여주라
		showInfo(myplayer);

	}

	private static void showInfo(Player[] player) {
		for (int i = 0; i < player.length; i++) {
			player[i].play();
			player[i].fast();
			player[i].stop();

			if (player[i] instanceof DvdPlayer) {
				DvdPlayer dvd = (DvdPlayer) player[i];

				dvd.slow();
				dvd.autoreverse();
				// player[i].slow();
				// player[i].autoreverse();
				// 오류 , 왜? slow(),autoreverse()에 관련있는 클래스는
				// DvdPlayer 클래스이고 ,
				// Player는 수퍼클래스 이므로 접근하려면 강등을 해야한다.

			} else if (player[i] instanceof VideoPlayer) {
				VideoPlayer video = (VideoPlayer) player[i];
				video.changeSking(EnumSkin.GREEN);
			}

			System.out.println();
		}

	}

}
