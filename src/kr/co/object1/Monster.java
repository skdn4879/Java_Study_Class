package kr.co.object1;

public class Monster {
	private String name;
	private int level;
	private int hp;
	private Weapon weapon;
	public Weapon getWeapon() {
		return weapon;
	}
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	@Override
	public String toString() {
		return "Monster [name=" + name + ", level=" + level + ", hp=" + hp + ", weapon=" + weapon + "]";
	}
	
	
}
