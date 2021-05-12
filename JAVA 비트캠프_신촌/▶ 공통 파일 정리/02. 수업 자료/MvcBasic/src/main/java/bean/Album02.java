package bean;

import org.springframework.web.multipart.MultipartFile;

public class Album02 {
	private int id;
	private String albumname;
	private String song;
	private String lyricist;
	private String songwriter;
	private String transcription;
	private String writerdate;
	
	//업로드 관련 항목
	// image는 테이블의 컬럼 이름과 동일하게 작성해야 합니다.
	// 그림 이름을 저장할 문자열입니다.
	private String image ;
	
	//form 태그의 name 속성의 이름과 동일하게 ...
	// 변수 abcd는 멀티 파트 파일 객체입니다. 
	// 주의 사항으로 폼의 name 속성의 값과 Bean 클래스의 MultipartFile 변수의 이름이 동일해야 합니다.
	private MultipartFile abcd ;
	
	public MultipartFile getAbcd() {
		return abcd;
	}
	public void setAbcd(MultipartFile abcd) {
		this.abcd = abcd;
		
		// 업로드가 잘 되었다면 널이 아닙니다.
		if( this.abcd != null){ 
			this.image = this.abcd.getOriginalFilename();
		}		
	}	
	
	// setter, getter, 생성자 등을 구현합니다.
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAlbumname() {
		return albumname;
	}
	public void setAlbumname(String albumname) {
		this.albumname = albumname;
	}
	public String getSong() {
		return song;
	}
	public void setSong(String song) {
		this.song = song;
	}
	public String getLyricist() {
		return lyricist;
	}
	public void setLyricist(String lyricist) {
		this.lyricist = lyricist;
	}
	public String getSongwriter() {
		return songwriter;
	}
	public void setSongwriter(String songwriter) {
		this.songwriter = songwriter;
	}
	public String getTranscription() {
		return transcription;
	}
	public void setTranscription(String transcription) {
		this.transcription = transcription;
	}
	public String getWriterdate() {
		return writerdate;
	}
	public void setWriterdate(String writerdate) {
		this.writerdate = writerdate;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	public Album02() { }
	public Album02(int id, String albumname, String song, String lyricist, String songwriter, String transcription,
			String writerdate, String image) {
	}	
}