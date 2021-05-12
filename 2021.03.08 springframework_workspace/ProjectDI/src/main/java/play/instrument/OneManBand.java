package play.instrument;

import java.util.Collection;

// 이 클래스는 컬렉션 Set, List 를 위한 클래스 입니다. 
public class OneManBand implements Performer {
	private Collection<Instrument> abcd; // 연주할 목록

	// setter injection을 위한 메소드 입니다.
	public void setAaa(Collection<Instrument> instruments) {
		// 매개 변수 이름과 인스턴스 변수 이름이 달라도 상관 없습니다.
		this.abcd = instruments;
	}

	@Override
	public void perform() {
		System.out.println("확장 for를 이용하여 악기들을 연주합니다.");
		for (Instrument inst : abcd) {
			inst.play();
		}
	}
}
