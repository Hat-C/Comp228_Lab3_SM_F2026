package hospital;
/**
 * @author Shannon Munroe
 * @date October 08th 2026
 */

public class Doctor extends Person {
	String specialization;
	double consultationFee;
	Doctor(int personId, String name, int age, String specialization, double consultationFee) {
		super(personId, name, age);
		this.specialization = specialization;
		this.consultationFee = consultationFee;
	}
	public void diagnosePatient() {
		System.out.println("diagnosing patient");
	}
	@Override public void performDuties() {
		System.out.println("performing doctor things");
	}
}
