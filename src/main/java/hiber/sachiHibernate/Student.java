package hiber.sachiHibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int id;
	
	private String name;
	
	private int age;
	
	private String employbility_Status;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, int age, String employbility_Status) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.employbility_Status = employbility_Status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmploybility_Status() {
		return employbility_Status;
	}

	public void setEmploybility_Status(String employbility_Status) {
		this.employbility_Status = employbility_Status;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+ this.id+","+this.name+","+this.employbility_Status+","+this.age+"]";
	}
	
	

	

	

}
