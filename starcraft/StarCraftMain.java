package java_day20.starcraft;

import java.util.ArrayList;

public class StarCraftMain {
	public static void main(String[] args) {
		Zealot zealot = new Zealot();
		System.out.println(zealot.toString());

		HighTemplar highTemplar = new HighTemplar();
		System.out.println(highTemplar.toString());

		highTemplar.psionicStorm();

		Marine marine = new Marine();
		System.out.println(marine.toString());

		Zealot zealot2 = new Zealot();
		Zealot zealot3 = new Zealot();
		Zealot zealot4 = new Zealot();
		Zealot zealot5 = new Zealot();
		Zealot zealot6 = new Zealot();
		Zealot zealot7 = new Zealot();

		// 질럿들 드래그로 선택
		ArrayList<Zealot> zealotList = new ArrayList<Zealot>();

		zealotList.add(zealot);
		zealotList.add(zealot2);
		zealotList.add(zealot3);
		zealotList.add(zealot4);
		zealotList.add(zealot5);
		zealotList.add(zealot6);
		zealotList.add(zealot7);

		// 선택된 질럿들 이동명령 내리기
		for (int i = 0; i < zealotList.size(); i++) {
			zealotList.get(i).move(20, 30);
		}

		// 다형성
		// 하나의 객체가 여러 가지 타입을 가질 수 있는 것
		// 부모 클래스 타입의 참조 변수로(ProtossUnit, StarUnit)
		// 자식 클래스 타입의 인스턴스(zealot 객체)를 참조 할 수 있는 것

		// 자식 객체에서 부모 객체로는 형변환이 가능하다
		ProtossUnit protossUnit = zealot; // 자동 형변환
		// long longVal = 304030; <- 비슷한 느낌 (인트가 인트 롱값으로 형변환)
		ProtossUnit proUnit = (ProtossUnit) zealot; // 강제 형변환

		// 자식 객체에서 조부모 객체로 형변환이 가능하다
		StarUnit starunit = zealot;

		// 드래그 선택
		ArrayList<StarUnit> starList = new ArrayList<StarUnit>();

		starList.add(zealot);
		starList.add(zealot2);
		starList.add(zealot3);
		starList.add(zealot4);
		starList.add(zealot5);
		starList.add(zealot6);
		starList.add(zealot7);
		starList.add(highTemplar);

		for (int i = 0; i < starList.size(); i++) {
			starList.get(i).move(5, 15);
		}

		// HighTemplar ht = starList.get(7); <- 상위 객체를 하위 객체로 형변환하기에 오류발생
		StarUnit su = starList.get(7);
		System.out.println(starList.get(7).getName());

		// 상위객체를 하위객체의 생성자를 사용하기위해 ((해당객체)변수명)을 이용한다.
		((HighTemplar) su).psionicStorm();
		
		StarUnit puma = new StarUnit("퓨마", 0, 40, 0, 0, 0, 0);
		
		// 일반적으로 부모객체는 자식객체로 형변환 할 수 없다.
		System.out.println(puma instanceof ProtossUnit);
		System.out.println(puma instanceof Zealot);
		
		// 자식객체는 부모객체로 형변환이 가능하다/
		System.out.println(highTemplar instanceof ProtossUnit);
		System.out.println(highTemplar instanceof StarUnit);
		
		// 부모객체로 형변환 되었던 자식객체는 다시 자식객체로 형변환이 가능하다.
		System.out.println(starunit instanceof Zealot);
		System.out.println(starunit instanceof HighTemplar);
		
		for (int i = 0; i < starList.size(); i++) {
			// 하이템플러인지 체크 후 사이오닉 스톰 메소드 실행
			// if (starList.get(i).getName().equals("하이템플러")) {
			//	((HighTemplar)starList.get(i)).psionicStorm();
			// }
			
			if (starList.get(i) instanceof HighTemplar) {
				((HighTemplar)starList.get(i)).psionicStorm();
			}
		}
		
		// StarUnit을 상속받는 SiegeTank 클래스를 만드시오.
		// SiegeTank는 siegeMode라는 메소드를 가지고 있고,
		// sigeMode를 실행하면 damge가 70되고, 공격 사거리가 10이 된다.
		SiegeTank siegeTank = new SiegeTank();
		
		System.out.println(siegeTank.toString());
		System.out.println();
		siegeTank.siegeMode();
		System.out.println(siegeTank.toString());
	}
}
