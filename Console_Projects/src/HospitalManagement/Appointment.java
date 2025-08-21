package HospitalManagement;

import java.time.LocalDate;

public class Appointment {

	private int patientID;
	private int doctorID;
	private LocalDate date;
	public int getPatientID() {
		return patientID;
	}
	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}
	public int getDoctorID() {
		return doctorID;
	}
	public void setDoctorID(int doctorID) {
		this.doctorID = doctorID;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Appointment(int patientID, int doctorID, LocalDate date) {
		super();
		this.patientID = patientID;
		this.doctorID = doctorID;
		this.date = date;
	}
	@Override
	public String toString() {
		return "Appointment [patientID=" + patientID + ", doctorID=" + doctorID + ", date=" + date + "]";
	}
	
}
