package pkg1021;

public class MinJumsuException extends Exception {

	public MinJumsuException(String result01) {
		super(result01);// "과락"
	}

	@Override
	public String toString() {
		return "과락";
	}

	@Override
	public void printStackTrace() {
		this.toString();
		super.printStackTrace();
	}

}
