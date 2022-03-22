package java_day20.board;

public class TradeBoard extends Board {
	private String image; // 제품 이미지
	private int pirce; 	  // 제품 가격

	public TradeBoard(int no, String title, String content, String author, String image, int pirce) {
		super(no, title, content, author);
		this.image = image;
		this.pirce = pirce;
	}

	@Override
	public String toString() {
		return super.toString() + ", image=" + image + ", pirce=" + pirce + "]";
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getPirce() {
		return pirce;
	}

	public void setPirce(int pirce) {
		this.pirce = pirce;
	}

}
