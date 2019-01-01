package entity;

public class Candidate {
    int candidateID;
    String firstName;
    String lastName;
    int birtDate ;
    String address;
    int phone;
    String email;
    String candidateType;
	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Candidate(int candidateID, String firstName, String lastName, int birtDate, String address, int phone,
			String email, String candidateType) {
		super();
		this.candidateID = candidateID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birtDate = birtDate;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.candidateType = candidateType;
	}
	public int getCandidateID() {
		return candidateID;
	}
	public void setCandidateID(int candidateID) {
		this.candidateID = candidateID;
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
	public int getBirtDate() {
		return birtDate;
	}
	public void setBirtDate(int birtDate) {
		this.birtDate = birtDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCandidateType() {
		return candidateType;
	}
	public void setCandidateType(String candidateType) {
		this.candidateType = candidateType;
	}
	
}
