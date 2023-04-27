package lab2problem2;

import java.util.Objects;

public class CSGO {
	
	private String gun;
	private String pistol;
	
	public CSGO() {
	}
	
	public CSGO(String gun, String pistol ) {
		this.gun = gun;
		this.pistol = pistol;
	}
	public String getGun() {
		return gun;
	}
	public String getPistol() {
		return pistol;
	}
	
	
	public boolean equal(Object o) {
		if(this == o) {
			return true;
		}
		if(o == null) {
			return false;
		}
		if(this.getClass() != o.getClass()) {
			return false;
		}
		CSGO csgo = (CSGO)o;
		return (pistol == csgo.pistol) && this.gun.equals(csgo.gun);	
	}
	
	
	public int hashCode() {
		return Objects.hash(gun, pistol);
	}
	
	public String toString() {
		return "Gun is " + gun + ", and Pistol is " + pistol;
	}
}
