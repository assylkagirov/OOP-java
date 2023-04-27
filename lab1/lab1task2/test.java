package lab1task2;

public class test {
	public static void main(String[] args) {
		
		Round Mirage = new Round("Mirage", Team.CounterTerrorist,Skin.CTboy,Gun.AWP,Pistol.DeserEagle, new Time(3,00));
		Round Dust2 = new Round("Dust2",Team.Terrorist,Skin.Tgirl,Gun.M4A1,Pistol.USP, new Time(1,31));
		
		
		System.out.println(Round.rounds );
	}
} 