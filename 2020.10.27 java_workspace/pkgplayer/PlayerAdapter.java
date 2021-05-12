package pkgplayer;

import java.text.DecimalFormat;

//PlayerAdapter : 일반 클래스
public class PlayerAdapter implements Player {
	private int showtime;// 상영시간(단위_초)

	public PlayerAdapter() {
	}

	public PlayerAdapter(int showtime) {
		this.showtime = showtime;
	}

	// Player 인터페이스에 대한 추상 메소드를 모두 오버라이딩 했다.
	// Mp3Player 클래스는 fast() 와 reverse()메소드만 구현하려고 했으므로,
	// 이 메소드들만 다시 오버라이딩 하면 된다.
	// 바로 위로 상속하면 메소드 오버라이딩이 전부 필요하지만
	// 중간을 걸치는 Adapter 일반 클래스가 있으면 필요한 부분만 끄집어 낼수 있음

	// 일반화시킴
	@Override
	public void play() {
		System.out.println("PlayerAdapter play() 호출됨");

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

		result = df.format(hour) + "시간 " + df.format(minute) + "분 " + df.format(second) + "초";
		return result;

	}

}
