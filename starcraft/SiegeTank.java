package java_day20.starcraft;

public class SiegeTank extends StarUnit {
	// StarUnit을 상속받는 SiegeTank 클래스를 만드시오.
	// SiegeTank는 siegeMode라는 메소드를 가지고 있고,
	// sigeMode를 실행하면 damge가 70되고, 공격 사거리가 10이 된다.
			
	public SiegeTank() {
		super("시즈탱크", 50, 70, 5, 1.0, 70, 50);	
	}
	
	public void siegeMode() {
		System.out.println("시즈모드 변환");
		super.setName("시즈탱크(시즈모드)");
		super.setAttackRange(10);
		super.setAttackSpeed(0.5);
		super.setDamage(70);
	}
	
	@Override
	public String toString() {
		return "SiegeTank" + super.toString();
	}
}
