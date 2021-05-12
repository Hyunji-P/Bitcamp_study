package play.instrument;

import java.util.Enumeration;
import java.util.Properties;
//�÷��� �߿��� Map�� ��� ������ �����̴�.
public class OneManBandProp implements Performer {
	private Properties abcd;
	
	public OneManBandProp() { }

	public void perform() {
		Enumeration<Object> enu = abcd.keys() ;
		
		while(enu.hasMoreElements()){
			Object key = enu.nextElement() ;
			String value = abcd.getProperty((String)key) ;
			System.out.println( key + "/" + value);
		}
  }
	public void setBbb(Properties instruments) {
		this.abcd = instruments; 
	}
}