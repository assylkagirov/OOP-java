package lecture3;

public class Time {
	int hour;
	int min;
	public Time() {
		
	}
	public Time(int hour, int min) {
		this.hour = hour;
		this.min = min;
	}
	public String toString() {
		return this.hour +":"+this.min;
	}
	public boolean equeals(Time b) {
		return this.hour == b.hour && this.min == b.min;
	}
}
