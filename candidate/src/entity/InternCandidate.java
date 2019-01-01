package entity;

public class InternCandidate extends Candidate {
    String majors;
    String semester;
    String universityName;
	
	/**
	 * @param candidateID
	 * @param firstName
	 * @param lastName
	 * @param birtDate
	 * @param address
	 * @param phone
	 * @param email
	 * @param candidateType
	 * @param majors
	 * @param semester
	 * @param universityName
	 */
	public InternCandidate(int candidateID, String firstName, String lastName, int birtDate, String address, int phone,
			String email, String candidateType, String majors, String semester, String universityName) {
		super(candidateID, firstName, lastName, birtDate, address, phone, email, candidateType);
		this.majors = majors;
		this.semester = semester;
		this.universityName = universityName;
	}
	public InternCandidate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMajors() {
		return majors;
	}
	public void setMajors(String majors) {
		this.majors = majors;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	@Override
	public String toString() {
		return "InternCandidate [ candidateID=" + candidateID + ", firstName=" + firstName + ", lastName=" + lastName + ", birtDate="
				+ birtDate + ", address=" + address + ", phone=" + phone + ", email=" + email + ", candidateType="
				+ candidateType + ", majors=" + majors + ", semester=" + semester + ", universityName=" + universityName
						+  "]";
	}
	
    
}
