package model;

public class AwesomePerson extends Person{
	
	public void talk() {
		Person person = new Person();
		System.out.println("My name is " +person.name+ " and I am "+person.age);
	}
}
