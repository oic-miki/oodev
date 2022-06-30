package oodev;

import java.util.Date;

public abstract class Student {
	
	private final Date birthday;
	private String name;
	
	public Student(final Date birthday) {
		
		this(birthday, "");
		
	}
	
	public Student(final Date birthday, final String name) {
		
		this.birthday = birthday;
		setName(name);
		
	}
	
	public Date getBirthday() {
		
		return birthday;
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
	public String setName(final String name) {
		
		this.name = name;
		
		return name;
		
	}
	
}
