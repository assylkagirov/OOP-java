package lab1task2;

public class Time {
	int min;
	int sec;
	public Time() {
		
	}
	public Time(int min, int sec) {
		this.min = min;
		this.sec = sec;
	}
	public String toString() {
		return this.min +":"+this.min;
	}
	public boolean equeals(Time b) {
		return this.min == b.min && this.sec == b.sec;
	}
}
