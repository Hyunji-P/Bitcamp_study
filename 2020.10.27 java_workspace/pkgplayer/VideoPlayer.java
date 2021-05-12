package pkgplayer;

public class VideoPlayer extends PlayerAdapter implements Skinnable {
	private String title;// 제목
	private String grade;// 등급
	private final String VIDEO = "비디오 \'";

	public VideoPlayer() {
	}

	public VideoPlayer(String title, int showtime, String grade) {
		super(showtime);
		this.title = title;
		this.grade = grade;

		// 생성 되면서 플레이 재생 시간을 보여 준다
		String imsi = "비디오 \'" + this.title + "\'입니다.\n";
		imsi += "재생시간 : " + super.makeTime();
		System.out.println(imsi);
	}

	@Override

	public void changeSking(EnumSkin color) {
		String imsi = VIDEO + this.title + "\'의 스킨을 ";
		imsi += color.getColor() + "으로 변경합니다.";
		System.out.println(imsi);

	}

	@Override
	public void play() {
		String imsi = "비디오 \'" + this.title + "\'을(를) 재생합니다.";
		System.out.println(imsi);
	}

	@Override
	public void stop() {
		String imsi = "비디오 \'" + this.title + "\'을(를) 멈춥니다.";
		System.out.println(imsi);
	}

	@Override
	public void fast() {
		String imsi = "비디오 \'" + this.title + "\'을(를) 빨리 재생합니다.";
		System.out.println(imsi);
	}

}
