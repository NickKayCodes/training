package two;

public class PrivatePerson {
	private String name;
	private int age;
	
	//defualt no arg constructor to creatre enmpty private person obj
	public PrivatePerson() {
		name = "";
		age = 0;
	}
	//parameterized constructor to call setters for name and age
	public PrivatePerson(String name, int age) {
		setName(name);
		setAge(age);
	}
	//set name
	public void setName(String name) {
		this.name = name;
	}
	//set age
	public void setAge(int age) {
		this.age = age;
	}
	//get name
	public String getName() {
		return name;
	}
	//get age
	public int getAge() {
		return age;
	}
}
