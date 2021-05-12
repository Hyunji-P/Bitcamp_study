package bean;

public class Product {
	private int pno;
	private String pname;
	private int stock;
	private int price;

	public Product() {
	}

	public Product(int pno, String pname, int stock, int price) {
		super();
		this.pno = pno;
		this.pname = pname;
		this.stock = stock;
		this.price = price;
	}

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pno=" + pno + ", pname=" + pname + ", stock=" + stock + ", price=" + price + "]";
	}

}
