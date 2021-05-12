package pkgplayer;

import java.text.DecimalFormat;

//PlayerAdapter : �Ϲ� Ŭ����
public class PlayerAdapter implements Player {
	private int showtime;// �󿵽ð�(����_��)

	public PlayerAdapter() {
	}

	public PlayerAdapter(int showtime) {
		this.showtime = showtime;
	}

	// Player �������̽��� ���� �߻� �޼ҵ带 ��� �������̵� �ߴ�.
	// Mp3Player Ŭ������ fast() �� reverse()�޼ҵ常 �����Ϸ��� �����Ƿ�,
	// �� �޼ҵ�鸸 �ٽ� �������̵� �ϸ� �ȴ�.
	// �ٷ� ���� ����ϸ� �޼ҵ� �������̵��� ���� �ʿ�������
	// �߰��� ��ġ�� Adapter �Ϲ� Ŭ������ ������ �ʿ��� �κи� ������ ���� ����

	// �Ϲ�ȭ��Ŵ
	@Override
	public void play() {
		System.out.println("PlayerAdapter play() ȣ���");

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fast() {
		// TODO Auto-generated method stub

	}

	@Override
	public void reverse() {
		// TODO Auto-generated method stub

	}

	public String makeTime() {
		String pattern = "00";
		DecimalFormat df = new DecimalFormat(pattern);

		String result = "";
		int hour = this.showtime / 3600;
		int minute = (this.showtime - hour * 3600) / 60;
		int second = this.showtime % 60;

		result = df.format(hour) + "�ð� " + df.format(minute) + "�� " + df.format(second) + "��";
		return result;

	}

}
