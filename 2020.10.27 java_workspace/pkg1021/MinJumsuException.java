package pkg1021;

public class MinJumsuException extends Exception {

	public MinJumsuException(String result01) {
		super(result01);// "����"
	}

	@Override
	public String toString() {
		return "����";
	}

	@Override
	public void printStackTrace() {
		this.toString();
		super.printStackTrace();
	}

}
