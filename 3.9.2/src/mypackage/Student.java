package mypackage;

public class Student {
	private String name;
	private String subject;
	private int rating;
	public boolean hasBeen;

	Student(String name, String subject, int rating) {
		this.name = name;
		this.subject = subject;
		this.rating = rating;
		this.hasBeen = false;
	}

	public String getName() {
		return this.name;
	}
	public String getSubject() {
		return this.subject;
	}

	public int getRating() {
		return this.rating;
	}
}
