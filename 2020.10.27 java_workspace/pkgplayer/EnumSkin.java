package pkgplayer;

public enum EnumSkin {
	BLACK("°ËÁ¤»ö"), RED("»¡°­»ö"), BLUE("ÆÄ¶û»ö"), GREEN("³ì»ö");

	private String color;

	private EnumSkin(String color) {
		this.color = color;
	}
	public String getColor() {
		return this.color;
	}

}
