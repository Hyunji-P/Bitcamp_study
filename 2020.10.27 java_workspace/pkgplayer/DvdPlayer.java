package pkgplayer;

import java.text.DecimalFormat;

public class DvdPlayer implements Extplayer {
	private String title;// ����
	private int showtime;// �󿵽ð�(����_��)
	private final String DVD = "DVD \'";

	public DvdPlayer() {
	}

	public DvdPlayer(String title, int showtime) {
		this.title = title;
		this.showtime = showtime;
		// ���� �Ǹ鼭 �÷��� ��� �ð��� ���� �ش�
		String imsi = DVD + this.title + "�Դϴ�.\n";
		imsi += "����ð� : " + this.makeTime();
		System.out.println(imsi);
	}

	@Override
	public void play() {
		String imsi = DVD + this.title + "\'�� ����մϴ�.";
		System.out.println(imsi);

	}

	@Override
	public void stop() {
		String imsi = DVD + this.title + "\'��(��) ����ϴ�.";
		System.out.println(imsi);

	}

	@Override
	public void fast() {
		String imsi = DVD + this.title + "\'��(��) ���� ����մϴ�.";
		System.out.println(imsi);
	}

	@Override
	public void reverse() {
		String imsi = DVD + this.title + "\'�� �������� �ǰ����մϴ�.";
		System.out.println(imsi);

	}

	@Override
	public void slow() {
		String imsi = DVD + this.title + "\'�� õõ�� ����մϴ�.";
		System.out.println(imsi);

	}

	@Override
	public void autoreverse() {
		String imsi = DVD + this.title + "\'�� �������� ����մϴ�.";
		System.out.println(imsi);

	}

	private String makeTime() {
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
