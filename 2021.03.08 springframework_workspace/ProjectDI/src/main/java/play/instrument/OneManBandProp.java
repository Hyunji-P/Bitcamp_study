package play.instrument;

import java.util.Enumeration;
import java.util.Properties;

public class OneManBandProp implements Performer {
	private Properties abcd;

	public void setBbb(Properties inst) {
		this.abcd = inst;
	}

	@Override
	public void perform() {
		System.out.println("Enumeration 인터페이스를 사용하여 반복 출력합니다.");
		Enumeration<Object> enu = this.abcd.keys();
		while (enu.hasMoreElements()) {
			Object key = enu.nextElement();
			String value = abcd.getProperty(key.toString());
			System.out.println(key + " | " + value);
		}
	}
}
