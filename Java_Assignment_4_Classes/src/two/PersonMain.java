package two;

public class PersonMain extends PrivatePerson {
	public static void main(String[] args) {
		PrivatePerson person = new PrivatePerson();
		person.setName("Nicky");
		person.setAge(29);
		System.out.println(person.getName() + " is " + person.getAge() +" years old.");
}
}
