package hospital;
/**
 * @author Shannon Munroe
 * @date October 08th 2026
 */

public class Person {
	int personId;
	String name;
	int age;
	Person (int personId,String name,int age) {
		this.personId = personId;
		this.name = name;
		this.age = age;
	}
	public void performDuties() {
		System.out.println("performing hospital things");
	}
}
