package pkgplayer;

public enum EnumSkin {
	BLACK("������"), RED("������"), BLUE("�Ķ���"), GREEN("���");

	private String color;

	private EnumSkin(String color) {
		this.color = color;
	}
	public String getColor() {
		return this.color;
	}

}
