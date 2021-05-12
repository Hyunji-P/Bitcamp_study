package pkg1021;

public class FailedException extends Exception {

	public FailedException(String result02) {
		super(result02);
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	@Override
	public void printStackTrace() {
		this.toString();
		super.printStackTrace();
	}

}
