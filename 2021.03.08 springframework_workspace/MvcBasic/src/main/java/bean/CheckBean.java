package bean;

public class CheckBean {
	private String mykey;
	private String myvalue;
	private String module;
	private String field;

	public CheckBean() {
	}

	public CheckBean(String mykey, String myvalue, String module, String field) {
		super();
		this.mykey = mykey;
		this.myvalue = myvalue;
		this.module = module;
		this.field = field;
	}

	public String getMykey() {
		return mykey;
	}

	public void setMykey(String mykey) {
		this.mykey = mykey;
	}

	public String getMyvalue() {
		return myvalue;
	}

	public void setMyvalue(String myvalue) {
		this.myvalue = myvalue;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	@Override
	public String toString() {
		return "CheckBean [mykey=" + mykey + ", myvalue=" + myvalue + ", module=" + module + ", field=" + field + "]";
	}

}
