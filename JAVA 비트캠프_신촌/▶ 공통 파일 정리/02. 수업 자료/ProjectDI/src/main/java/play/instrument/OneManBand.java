package play.instrument;

import java.util.Collection;

//컬렉션 중에서 Set, List에 사용 가능한 예시이다.
public class OneManBand implements Performer {
	private Collection<Instrument> abcd;

	public OneManBand() { }

	public void perform(){
		//확장 for를 이용하여 악기들을 연주한다.
		for (Instrument instrument : abcd) {
			instrument.play();
		}
	}

	public void setAaa(Collection<Instrument> instruments) {
		this.abcd = instruments; 
	}
}