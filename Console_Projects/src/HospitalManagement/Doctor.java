package HospitalManagement;

public class Doctor {

	private String name;
	private int DID;
	private String specialization;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDID() {
		return DID;
	}
	public void setDID(int dID) {
		DID = dID;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	@Override
	public String toString() {
		return "Doctor [name=" + name + ", DID=" + DID + ", specialization=" + specialization + "]";
	}
	public Doctor(String name, int dID, String specialization) {
		super();
		this.name = name;
		DID = dID;
		this.specialization = specialization;
	}
	
	
}
