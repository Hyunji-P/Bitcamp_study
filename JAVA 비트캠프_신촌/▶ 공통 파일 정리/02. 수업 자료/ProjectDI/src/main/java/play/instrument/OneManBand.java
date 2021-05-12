package play.instrument;

import java.util.Collection;

//�÷��� �߿��� Set, List�� ��� ������ �����̴�.
public class OneManBand implements Performer {
	private Collection<Instrument> abcd;

	public OneManBand() { }

	public void perform(){
		//Ȯ�� for�� �̿��Ͽ� �Ǳ���� �����Ѵ�.
		for (Instrument instrument : abcd) {
			instrument.play();
		}
	}

	public void setAaa(Collection<Instrument> instruments) {
		this.abcd = instruments; 
	}
}