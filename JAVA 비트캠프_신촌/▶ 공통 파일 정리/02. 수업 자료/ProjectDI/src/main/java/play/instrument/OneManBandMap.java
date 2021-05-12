package play.instrument;

import java.util.Map;
//�÷��� �߿��� Map�� ��� ������ �����̴�.
public class OneManBandMap implements Performer {
	private Map<String, Instrument>  abcd;

	public OneManBandMap() { }

	public void perform() {
		for (String key : abcd.keySet() ) {
			Instrument instrument = abcd.get(key) ;
			System.out.print( key + " : " );
			instrument.play();
		}
	}
	public void setCcc(Map<String, Instrument> instruments) {
		this.abcd = instruments; 
	}
}