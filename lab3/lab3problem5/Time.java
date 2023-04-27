package lab3problem5;

public class Time implements Comparable<Object> {
	
	private int hours;
	private int minutes;
	private int seconds;
	
	public Time(){
	}
	
	public Time(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	public double getHours() {
		return hours;
	}
	
	public double getMinutes() {
		return minutes;
	}
	
	public double getSeconds() {
		return seconds;
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if (hours > ((Time) o).getHours()){
			return 1;
		}else if (hours < ((Time) o).getHours()){
			return -1;
		}else {
			if (minutes > ((Time) o).getMinutes()) {
				return 1;
			}else if (minutes < ((Time) o).getMinutes()) {
				return -1;
			}else {
				if (seconds > ((Time) o).getSeconds()) {
					return 1;
				}else if (seconds < ((Time) o).getSeconds()) {
					return -1;
				}
			}
		}
		return 0;
	}
	
	public String toString() {
		return hours + ":" + minutes + ":" + seconds;
	}

}