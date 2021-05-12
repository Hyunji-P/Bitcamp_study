package pkgplayer;

//Mp3Player : 일반 클래스
public class Mp3Player extends PlayerAdapter {
	private String singer; // 가수
	private String title; // 노래

	public Mp3Player() {
	}

	public Mp3Player(String singer, String title, int showtime) {
		super(showtime);
		this.singer = singer;
		this.title = title;

		// 생성 되면서 플레이 재생 시간을 보여 준다
		String imsi = "노래 \'" + this.title + "\'입니다.\n";
		imsi += "재생시간 : " + super.makeTime();
		System.out.println(imsi);
	}

	@Override
	public void fast() {
		String imsi = "노래 \'" + this.title + "\'을(를) 빨리 재생합니다.";
		System.out.println(imsi);
	}

	@Override
	public void reverse() {
		String imsi = "노래 \'" + this.title + "\'을(를) 거꾸로 되감기 합니다.";
		System.out.println(imsi);
	}

	@Override
	public void play() {
		super.play();
		String imsi = "노래 \'" + this.title + "\'을(를) 재생합니다.";
		System.out.println(imsi);
	}

	@Override
	public void stop() {
		String imsi = "노래 \'" + this.title + "\'을(를) 멈춥니다.";
		System.out.println(imsi);
	}

}
