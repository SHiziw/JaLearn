package learnclass;

public class learnExtends {

	public static void main(String[] args) {
		Student liHua = new Student();
		liHua.say();

	}
	

}

class People {
	public int age;
	public String name;

	void say() {
		System.out.println("I am a human!");
	}

}

class Student extends People {
	public double scole;

	void say() {
		super.say();
		System.out.println("and I am a Student.");

	}

}
