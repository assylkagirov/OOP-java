package lab1task2;

import java.util.Vector;

public class Round {
	String map;
	Pistol pistol;
	Gun gun;
	Skin skin;
	private Time time;
	Team team;
	private int id;
	static int cnt;
	static Vector<Round> rounds;

	static{
		rounds = new Vector<Round>();
	}
	{
		id = cnt++;
		rounds.add(this);
	}
	public Round(){
		
	}

	public Round(String map,Team team, Skin skin) {
		this.map = map;
		this.team = team;
		this.skin = skin;
		
	}
	public Round(String map, Team team, Skin skin, Gun gun, Pistol pistol, Time time) {
		this(map,team,skin);
		this.gun = gun;
		this.pistol = pistol;
		this.time = time;
	}
	public int getId() {
		return id;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	
	public String toString() {
		return "Round: " +id+ ", "+ map+", " +"Team: " + team+", " + "skin: " + skin+ ", "+ "Gun: " + gun +", " +"pistol: " + pistol +", "+ "Time: " + time + "\n";
	}

		
}
