package ie.cit.soft8027.saq3.domain;

public class Editor {

	private String speciality;
	private String firstName;
	private String lastName;
	private String emailAddress;
	
	
	public Editor() {
		
	}
	
	public Editor(String speciality, String firstName, String lastName, String emailAddress) {
		super();
		this.speciality = speciality;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
	}
	
	public String getSpeciality() {
		return speciality;
	}
	
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "Editor - speciality=" + speciality + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", emailAddress=" + emailAddress + "\n";
	}
	
	
	
	
}
