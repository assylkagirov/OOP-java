package lecture3;

public class test {
	public static void main(String[] args) {
		Lesson oop = new Lesson("OOP", Days.TUE, new Time(12,30),Format.ONLINE);
		Lesson algo = new Lesson("ADS", Days.MON, new Time(11,30),Format.OFFLINE);
		Lesson math = new Lesson("MATH", Days.TUE, new Time(12,30),Format.OFFLINE);
	
		System.out.println(Lesson.lessons);
	}
	
}

