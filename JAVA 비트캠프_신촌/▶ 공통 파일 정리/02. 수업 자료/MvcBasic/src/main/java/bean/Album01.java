package bean;

import org.springframework.web.multipart.MultipartFile;

public class Album01 {
	private int id;
	private String albumname;
	private String song;
	private String lyricist;
	private String songwriter;
	private String transcription;
	private String writerdate;
	//업로드 관련 항목
	//image는 테이블의 컬럼 이름과 동일하게 ...	
	private String image ;
	
	//form 태그의 name 속성의 이름과 동일하게 ...
	private MultipartFile abcd ;
	
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
	public MultipartFile getAbcd() {
		return abcd;
	}
	public void setAbcd(MultipartFile abcd) {
		this.abcd = abcd;
	}
	public Album01() { }
	public Album01(int id, String albumname, String song, String lyricist, String songwriter, String transcription,
			String writerdate, String image) {
	}	
}