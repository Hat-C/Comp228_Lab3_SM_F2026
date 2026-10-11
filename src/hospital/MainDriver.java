package hospital;
/**
 * @author Shannon Munroe
 * @date October 08th 2026
 */

public class MainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Demonstrate polymorphism using a Person reference: the list type is Person
		Person[] peopleList = {
				new Person(1,"Avery",21),
				new Doctor(2,"Britanny",39, "dermatology", 25.00),
				new Nurse(3,"Catherine",56,"chemo",3,true),
				new Surgeon(4,"Dianna",47,"orthrapedics", 40.00, "reconstruction",5),
				new EmergencyDoctor(5,"Emile", 34, "cardiology", 15.00)
		};
		for(int i=0; i<peopleList.length; i++) {
			peopleList[i].performDuties();
		}
		new Doctor(2,"Britanny",39, "dermatology", 25.00).diagnosePatient();
		new Nurse(3,"Catherine",56,"chemo",3,true).assistPatient();
		new Surgeon(4,"Dianna",47,"orthrapedics", 40.00, "reconstruction",5).performSurgery();
		EmergencyDoctor temp = new EmergencyDoctor(5,"Emile", 34, "cardiology", 15.00);
		temp.handleEmergency();
		temp.prescribeMedication("{MEDICATION NAME}");
		temp.generateBill();
	}

}
