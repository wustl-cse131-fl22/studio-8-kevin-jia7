package studio8;

import java.util.Objects;
import java.util.Scanner;

public class Time {
	
	private int hour;
	private int minute;
	private boolean format;

	/**
	 * 
	 * @param hour: hour of the day
	 * @param minute: minute of the hour
	 * @param format: if true, use 12 hour format. if false, use 24 hour format.
	 */
	public Time(int hour, int minute, boolean format) {
		this.hour = hour;
		this.minute = minute;
		this.format = format;
	}

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	Time timeOne = new Time(23, 59, false);
    	Time timeTwo = new Time(23, 59, true);
    	
    	System.out.println(timeOne);
    	System.out.println(timeTwo);
    	
    	if (timeOne.hashCode() == timeTwo.hashCode()) {
    		System.out.println("=");
    	}
    	else {
    		System.out.println("!");
    	}
    }

    public String toString() {
    	
    	String print = "";
    	if (format) {
    		if (hour <= 12) {
    			print = "Time of the day: " + hour + "am : " + minute;
    		}
    		else {
    			print = "Time of the day: " + (hour - 12) + "pm : " + minute;
    		}
    	}
    	else {
    		print = "Time of the day: " + hour + " : " + minute;
    	}
    	return print;
    }

	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}
    
}