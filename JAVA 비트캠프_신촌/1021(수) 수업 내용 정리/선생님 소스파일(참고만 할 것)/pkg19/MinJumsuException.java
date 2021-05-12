package pkg19;

public class MinJumsuException extends Exception{
	private String subject ; //과락 과목
	private int jumsu ; //과목의 시험 점수
	
	public MinJumsuException(String subject, int jumsu) {
		this.subject = subject ;
		this.jumsu = jumsu ;
	}
	@Override
	public String getMessage() {	
		return this.subject + " 공부 열심히 하세요." ;
	}
	@Override
	public String toString() {	
		return this.subject + " " + this.jumsu + "점 받으셨군요.\n좀더 분발하세요." ;
	}
}