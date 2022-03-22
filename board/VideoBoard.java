package java_day20.board;

public class VideoBoard extends Board {
	private String link; // 동영상 링크

	public VideoBoard(int no, String title, String content, String author, String link) {
		super(no, title, content, author);
		this.link = link;
	}

	@Override
	public String toString() {
		return super.toString() + ", link=" + link + "]";
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

}
