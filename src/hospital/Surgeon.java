package hospital;
/**
 * @author Shannon Munroe
 * @date October 08th 2026
 */

public class Surgeon extends Doctor {
	String surgeryType;
	int operatingRoom;
	Surgeon(int personId, String name, int age, String specialization, double consultationFee, String surgeryType, int operatingRoom) {
		super(personId, name, age, specialization, consultationFee);
		this.surgeryType = surgeryType;
		this.operatingRoom = operatingRoom;
	}
	public void performSurgery() {
		System.out.println("beginning pre-surgery briefing");
	}
	@Override public void performDuties() {
		System.out.println("performing surgeon things");
	}
}
