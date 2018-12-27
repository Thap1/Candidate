package entity;

public class InternCandidate extends Candidate {
    String majors;
    String semester;
    String universityName;
	public InternCandidate(int candidateID, String firstName, int birtDate, String address, int phone, String email,
			String candidateType, String majors, String semester, String universityName) {
		super(candidateID, firstName, birtDate, address, phone, email, candidateType);
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
		return "InternCandidate [majors=" + majors + ", semester=" + semester + ", universityName=" + universityName
				+ ", candidateID=" + candidateID + ", firstName=" + firstName + ", birtDate=" + birtDate + ", address="
				+ address + ", phone=" + phone + ", email=" + email + ", candidateType=" + candidateType + "]";
	}
	
    
}
