package java_day20.starcraft;

public class Zealot extends ProtossUnit {

	public Zealot() {
		super("질럿", 16, 100, 1, 1.5, 100, 0, 60);
	}

	@Override
	public String toString() {
		return "Zealot [name=" + getName() + ", damage=" + getDamage() + ", hp=" + getHp() + ", shield=" + getShield()
				+ ", attackRange=" + getAttackRange() + ", attackSpeed=" + getAttackSpeed() + ", mineral="
				+ super.getMineral() + ", gas=" + getGas() + "]";
	}
}
