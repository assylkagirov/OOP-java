package lab2problem2;

import java.util.Objects;

public class Guns extends CSGO {
	
	private String weapon;
	
	public Guns(String gun, String pistol, String weapon) {
		super(gun, pistol);
		this.weapon = weapon;
	}
	
	public boolean equals(Object o) {
		if(!super.equals(o)) {
			return false;
		}
		Guns guns = (Guns)o;
		return this.weapon.equals(guns.weapon);
	}
	
	public int hashCode() {
		return Objects.hash(super.getGun(),super.getPistol(), weapon);
	}
	
	public String toString() {
		return super.toString() + ", weapon cost: " + weapon;
	}
	
}
