package java_day20.starcraft;

public class Marine extends StarUnit{

	public Marine() {
		super("마린", 6, 40, 4, 1.0, 50, 0);	
	}
	
	public void steamPack() {
		super.setAttackSpeed(0.5);
		super.setHp(super.getHp() - 10);
	}
	
	@Override
	public String toString() {
		return "Marine [name=" + getName() + ", damage=" + getDamage() + ", hp=" + getHp() + ", attackRange=" + getAttackRange()
				+ ", attackSpeed=" + getAttackSpeed() + ", mineral=" + getMineral() + ", gas=" + getGas() + "]";
	}
}
