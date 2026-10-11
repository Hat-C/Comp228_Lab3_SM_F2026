package hospital;
/**
 * @author Shannon Munroe
 * @date October 08th 2026
 */

public class Nurse extends Person {
	String department;
	boolean isNightShift;
	int shift;
	Nurse(int personId, String name, int age, String department, int shift, boolean isNight) {
		super(personId, name, age);
		this.department = department;
		this.shift = shift;
		this.isNightShift = isNight;
	}
	public void assistPatient() {
		System.out.println("changing patient bags");
	}
	@Override public void performDuties() {
		System.out.println("performing nurse things");
	}
}
