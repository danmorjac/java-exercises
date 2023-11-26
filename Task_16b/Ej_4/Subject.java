package Task_16b.Ej_4;

public class Subject implements Comparable<Subject> {
	// Attributes
	private String name;
	private int week_hours;
	// Constructors
	public Subject(String name, int week_hours) {
		this.name = name;
		this.week_hours = week_hours;
	}
	// Getters
	public int getWeek_hours() {return week_hours;}
	// Methods
	@Override
	public boolean equals(Object obj) {
		boolean isEq = false;
		if (obj instanceof Subject) {
			Subject other = (Subject) obj;
			isEq = this.name.equals(other.name) &&this.week_hours == other.week_hours;
		}
		return isEq;
	}
	@Override
	public int compareTo(Subject obj) {
		return this.name.compareTo(obj.name);
	}
	@Override
	public String toString() {
		return "Subject [name: " + name + ", week_hours: " +week_hours + "]";
	}
}
