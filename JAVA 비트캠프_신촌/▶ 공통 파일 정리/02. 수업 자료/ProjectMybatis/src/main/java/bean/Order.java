package bean;

public class Order {
	private int oid ;
	private String name ;
	private int pno ;
	private int qty ;
	
	// getter, setter 및 생성자, toString() 등을 구현합니다.
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}	
}