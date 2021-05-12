package pkgplayer;

import java.text.DecimalFormat;

public class DvdPlayer implements Extplayer {
	private String title;// 제목
	private int showtime;// 상영시간(단위_초)
	private final String DVD = "DVD \'";

	public DvdPlayer() {
	}

	public DvdPlayer(String title, int showtime) {
		this.title = title;
		this.showtime = showtime;
		// 생성 되면서 플레이 재생 시간을 보여 준다
		String imsi = DVD + this.title + "입니다.\n";
		imsi += "재생시간 : " + this.makeTime();
		System.out.println(imsi);
	}

	@Override
	public void play() {
		String imsi = DVD + this.title + "\'을 재생합니다.";
		System.out.println(imsi);

	}

	@Override
	public void stop() {
		String imsi = DVD + this.title + "\'을(를) 멈춥니다.";
		System.out.println(imsi);

	}

	@Override
	public void fast() {
		String imsi = DVD + this.title + "\'을(를) 빨리 재생합니다.";
		System.out.println(imsi);
	}

	@Override
	public void reverse() {
		String imsi = DVD + this.title + "\'을 역순으로 되감기합니다.";
		System.out.println(imsi);

	}

	@Override
	public void slow() {
		String imsi = DVD + this.title + "\'을 천천히 재생합니다.";
		System.out.println(imsi);

	}

	@Override
	public void autoreverse() {
		String imsi = DVD + this.title + "\'을 역순으로 재생합니다.";
		System.out.println(imsi);

	}

	private String makeTime() {
		String pattern = "00";
		DecimalFormat df = new DecimalFormat(pattern);

		String result = "";
		int hour = this.showtime / 3600;
		int minute = (this.showtime - hour * 3600) / 60;
		int second = this.showtime % 60;

		result = df.format(hour) + "시간 " + df.format(minute) + "분 " + df.format(second) + "초";
		return result;

	}

}
