package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Date {
	
	private int year;
	private int month;
	private int day;
	private boolean holiday;

	public Date(int year, int month, int day, boolean holiday) {
		this.year = year;
		this.month = month;
		this.day = day;
		this.holiday = holiday;
	}

    @Override
	public int hashCode() {
		return Objects.hash(day, holiday, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && holiday == other.holiday && month == other.month && year == other.year;
	}

	public static void main(String[] args) {		
    	Date dateOne = new Date(2023, 01, 31, true);
    	Date dateTwo = new Date(2023, 11, 31, true);
    	
    	System.out.println(dateOne);
    	System.out.println(dateTwo);
    	
    	if (dateOne.hashCode() == dateTwo.hashCode()) {
    		System.out.println("=");
    	}
    	else {
    		System.out.println("!");
    	}
    	
    	List<Date> list = new LinkedList<>();
    	list.add(dateOne);
    	list.add(dateTwo);
    	list.add(dateTwo);
    	System.out.println(list);
    	
    	HashSet<Date> set = new HashSet<Date>();
    	set.add(dateOne);
    	set.add(dateTwo);
    	set.add(dateOne);
    	System.out.println(set);
    }

    public String toString() {
    	
    	String print = "";
    	if (holiday) {
    		print = year + "/" + month + "/" + day + ", today is a holiday!";
    	}
    	else {
    		print = year + "/" + month + "/" + day + ", today is not a holiday.";
    	}
    	
    	return print;
    }
}
