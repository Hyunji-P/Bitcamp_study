package bean;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

public class Order {

	private int or_no;

	@NotEmpty(message = "아이디는 필수 입력 사항입니다.")
	private String or_id;

	private String or_rnum;

	@NotEmpty(message = "좌석 번호는 필수 입력 사항입니다.")
	private String or_seat;

	@NotNull(message = "예약일자는 필수 입력 사항입니다.")
	@Pattern(regexp = "\\d{4}[/]\\d{2}[/]\\d{2}", message = "날짜는 yyyy/MM/dd 형식 입니다.")
	private String or_date;

	@Min(value = 1 , message = "시간을 선택해주세요." )
	private int or_stime;

	@Min(value = 1 , message = "시간을 선택해주세요." )
	private int or_etime;

	private int or_hour;

	private int or_price;

	private String or_pday;
	private String remark;

	public Order() {
	}

	public int getOr_no() {
		return or_no;
	}

	public void setOr_no(int or_no) {
		this.or_no = or_no;
	}

	public String getOr_id() {
		return or_id;
	}

	public void setOr_id(String or_id) {
		this.or_id = or_id;
	}

	public String getOr_rnum() {
		return or_rnum;
	}

	public void setOr_rnum(String or_rnum) {
		this.or_rnum = or_rnum;
	}

	public String getOr_seat() {
		return or_seat;
	}

	public void setOr_seat(String or_seat) {
		this.or_seat = or_seat;
	}

	public String getOr_date() {
		return or_date;
	}

	public void setOr_date(String or_date) {
		this.or_date = or_date;
	}

	public int getOr_stime() {
		return or_stime;
	}

	public void setOr_stime(int or_stime) {
		this.or_stime = or_stime;
	}

	public int getOr_etime() {
		return or_etime;
	}

	public void setOr_etime(int or_etime) {
		this.or_etime = or_etime;
	}

	public int getOr_hour() {
		return or_hour;
	}

	public void setOr_hour(int or_hour) {
		this.or_hour = or_hour;
	}

	public int getOr_price() {
		return or_price;
	}

	public void setOr_price(int or_price) {
		this.or_price = or_price;
	}

	public String getOr_pday() {
		return or_pday;
	}

	public void setOr_pday(String or_pday) {
		this.or_pday = or_pday;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
