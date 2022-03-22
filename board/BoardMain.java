package java_day20.board;

public class BoardMain {
	public static void main(String[] args) {
		Board board = new Board(1, "첫번재 게시글", "1등이다", "wlgns571");
		
		System.out.println(board.toString());
		
		// 중고거래 게시판
		// 필드에 제품 이미지, 제품 가격
		TradeBoard trade = new TradeBoard(1, "나이키 신팔 팝니다", "선제시", "wlgns571", "나이키신발.jpg", 50000);
		System.out.println(trade.toString());
		
		// 동영상 게시판
		// 필드에 링크
		VideoBoard video = new VideoBoard(1, "찬웅쌤 매드무비", "펜타킬", "wlgns571", "https://www.youtube.com/");
		System.out.println(video.toString());
	}
}
