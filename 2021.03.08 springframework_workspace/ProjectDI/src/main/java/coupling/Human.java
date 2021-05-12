package coupling;

public class Human {
	private Sport sport;

	// 생성자를 통해서 sport라는 데이터를 집어넣어줌 
	// 이것을 생성자 주입이라고 한다. 
	public Human(Sport sport) {
		this.sport = sport;
	}

	public void play() {
		this.sport.play();
	}

	public void stop() {
		this.sport.stop();
	}
}