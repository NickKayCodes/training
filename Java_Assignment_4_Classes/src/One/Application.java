package One;

public class Application extends Person {
	public Application(int age, String name) {
		super(age, name);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Person person = new Person();
		person.name = "Mike";
		person.age = 12;
		
		System.out.println(person.name);
	}
}
