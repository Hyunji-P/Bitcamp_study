package bean;

import java.sql.Date;

public class Reservation {// 다 빈 클래스
	private int rvno;
	private String id;
	private String bname;
	private int price;
	private int rono;
	private java.sql.Date startdate;
	private java.sql.Date enddate;
	private java.sql.Date rvdate;
	private String addtionalservice;
	private String arrivaltime;
	private String theother;
	private String rvname;

	public Reservation() {
	}

	public Reservation(int rvno, String id, String bname, int price, int rono, Date startdate, Date enddate,
			Date rvdate, String addtionalservice, String arrivaltime, String theother, String rvname) {
		this.rvno = rvno;
		this.id = id;
		this.bname = bname;
		this.price = price;
		this.rono = rono;
		this.startdate = startdate;
		this.enddate = enddate;
		this.rvdate = rvdate;
		this.addtionalservice = addtionalservice;
		this.arrivaltime = arrivaltime;
		this.theother = theother;
		this.rvname = rvname;
	}

	public int getRvno() {
		return rvno;
	}

	public void setRvno(int rvno) {
		this.rvno = rvno;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRono() {
		return rono;
	}

	public void setRono(int rono) {
		this.rono = rono;
	}

	public java.sql.Date getStartdate() {
		return startdate;
	}

	public void setStartdate(java.sql.Date startdate) {
		this.startdate = startdate;
	}

	public java.sql.Date getEnddate() {
		return enddate;
	}

	public void setEnddate(java.sql.Date enddate) {
		this.enddate = enddate;
	}

	public java.sql.Date getRvdate() {
		return rvdate;
	}

	public void setRvdate(java.sql.Date rvdate) {
		this.rvdate = rvdate;
	}

	public String getAddtionalservice() {
		return addtionalservice;
	}

	public void setAddtionalservice(String addtionalservice) {
		this.addtionalservice = addtionalservice;
	}

	public String getArrivaltime() {
		return arrivaltime;
	}

	public void setArrivaltime(String arrivaltime) {
		this.arrivaltime = arrivaltime;
	}

	public String getTheother() {
		return theother;
	}

	public void setTheother(String theother) {
		this.theother = theother;
	}

	public String getRvname() {
		return rvname;
	}

	public void setRvname(String rvname) {
		this.rvname = rvname;
	}

	@Override
	public String toString() {
		return "Reservataion [rvno=" + rvno + ", id=" + id + ", bname=" + bname + ", price=" + price + ", rono=" + rono
				+ ", startdate=" + startdate + ", enddate=" + enddate + ", rvdate=" + rvdate + ", addtionalservice="
				+ addtionalservice + ", arrivaltime=" + arrivaltime + ", theother=" + theother + ", rvname=" + rvname
				+ "]";
	}

}
