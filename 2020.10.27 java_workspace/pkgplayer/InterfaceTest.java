package pkgplayer;

public class InterfaceTest {

	public static void main(String[] args) {
		DvdPlayer dvd01 = new DvdPlayer("��������", 7200);// ���� , �󿵽ð�(��)
		dvd01.fast();
		dvd01.slow();
		dvd01.reverse();
		System.out.println();

		Mp3Player mp301 = new Mp3Player("�̼���", "j����", 210);// ���� , �뷡 , ����ð�(��)
		mp301.fast();
		mp301.reverse();
		System.out.println();
//		mp301.play(); --> ��� �ٶ󺸴��� �� �� 

		// �������̽��� �߻�Ŭ������ Ȯ�尳��
		// �ڻ����� ������ �迭���Ǵ� ����
		Player[] myplayer = new Player[3];
		myplayer[0] = new DvdPlayer("�����", 7400);
		myplayer[1] = new Mp3Player("���ƾ�", "���⿪", 240);
		myplayer[2] = new VideoPlayer("�㺸", 300, "15�� �̻� ������");

		// main�޼ҵ忡�� showInfo �޼ҵ带 �����ֶ�
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
				// ���� , ��? slow(),autoreverse()�� �����ִ� Ŭ������
				// DvdPlayer Ŭ�����̰� ,
				// Player�� ����Ŭ���� �̹Ƿ� �����Ϸ��� ������ �ؾ��Ѵ�.

			} else if (player[i] instanceof VideoPlayer) {
				VideoPlayer video = (VideoPlayer) player[i];
				video.changeSking(EnumSkin.GREEN);
			}

			System.out.println();
		}

	}

}
