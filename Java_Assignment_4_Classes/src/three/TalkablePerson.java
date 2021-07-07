package three;

public class TalkablePerson {
	private String name;
	private int age;
	public TalkablePerson() {
		name = "";
		age=0;
	}
	public void talk(String name, int age) {
		this.name = name;
		System.out.println("Hello my name is " + name);
	}
}
