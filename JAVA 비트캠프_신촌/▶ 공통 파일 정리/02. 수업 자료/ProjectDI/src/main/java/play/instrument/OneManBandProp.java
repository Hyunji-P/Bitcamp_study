package play.instrument;

import java.util.Enumeration;
import java.util.Properties;
//컬렉션 중에서 Map에 사용 가능한 예시이다.
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