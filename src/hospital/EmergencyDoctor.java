package hospital;
/**
 * @author Shannon Munroe
 * @date October 08th 2026
 */

public class EmergencyDoctor extends Doctor implements MedicalProfessional, Billable {
	EmergencyDoctor(int personId, String name, int age, String specialization, double consultationFee) {
		super(personId, name, age, specialization, consultationFee);
	}
	public void handleEmergency() {
		System.out.println("responding to emergency call");
	}
	public void prescribeMedication(String medicationName) {
		System.out.println("perscribing "+medicationName);
	}
	public void generateBill() {
		System.out.println("creating bill");
	}
	@Override public void performDuties() {
		System.out.println("performing emergency doctor things");
	}
	
}
