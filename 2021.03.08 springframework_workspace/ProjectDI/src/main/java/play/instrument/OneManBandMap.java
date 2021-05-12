package play.instrument;

import java.util.Map;
import java.util.Set;

//이 클래스는 컬렉션 Map 를 위한 클래스 입니다. 
public class OneManBandMap implements Performer {
	private Map<String, Instrument> abcd;

	// setter injection을 위한 메소드 입니다.
	public void setCcc(Map<String, Instrument> instruments) {
		// 매개 변수 이름과 인스턴스 변수 이름이 달라도 상관 없습니다.
		this.abcd = instruments;
	}

	@Override
	public void perform() {
		System.out.println("맵 구조를 반복하여 악기들을 연주합니다.");
		Set<String> multi =  abcd.keySet();
		for (String key : multi) {
			Instrument inst = abcd.get(key);
			System.out.print(key + " : ");
			inst.play();
		}
	}
}
