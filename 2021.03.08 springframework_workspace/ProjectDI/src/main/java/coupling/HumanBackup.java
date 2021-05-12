package coupling;

public class HumanBackup {
	private BaseballBackup baseball;

	public HumanBackup() {
		this.baseball = new BaseballBackup();
	}

	public void play() {
		baseball.play();
	}

	public void stop() {
		baseball.stop();
	}

}
