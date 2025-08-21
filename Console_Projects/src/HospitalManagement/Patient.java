package HospitalManagement;

public class Patient {
       
	private String name;
	private int PID;
	private int age;
	private String Disease;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPID() {
		return PID;
	}
	public void setPID(int pID) {
		PID = pID;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDisease() {
		return Disease;
	}
	public void setDisease(String disease) {
		Disease = disease;
	}
	public Patient(String name, int pID, int age, String disease) {
		super();
		this.name = name;
		PID = pID;
		this.age = age;
		Disease = disease;
	}
	
	@Override
	public String toString() {
		return "Patient [name=" + name + ", PID=" + PID + ", age=" + age + ", Disease=" + Disease + "]";
	}
	
	
	
}
