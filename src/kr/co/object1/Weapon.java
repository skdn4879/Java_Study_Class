package kr.co.object1;

public class Weapon {
	private String name;
	private int damage;
	private int inchant = 1;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getInchant() {
		return inchant;
	}
	public void setInchant(int inchant) {
		this.inchant = inchant;
	}
	@Override
	public String toString() {
		return "Weapon [name=" + name + ", damage=" + damage + ", inchant=" + inchant + "]";
	}
	
}
