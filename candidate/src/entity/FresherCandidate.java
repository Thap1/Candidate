package entity;

public class FresherCandidate extends Candidate{
    String graduationDate;
    String graduationRank;
    String education;
	public FresherCandidate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FresherCandidate(int candidateID, String firstName, String lastName, int birtDate, String address, int phone,
			String email, String candidateType, String graduationDate, String graduationRank, String education) {
		super(candidateID, firstName, lastName, birtDate, address, phone, email, candidateType);
		this.graduationDate = graduationDate;
		this.graduationRank = graduationRank;
		this.education = education;
	}
	@Override
	public String toString() {
		return "FresherCandidate [candidateID=" + candidateID + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", birtDate=" + birtDate + ", address=" + address + ", phone=" + phone
				+ ", email=" + email + ", candidateType=" + candidateType + ", graduationDate=" + graduationDate + ", graduationRank=" + graduationRank
						+ ", education=" + education +   "]";
	}
	public String getGraduationDate() {
		return graduationDate;
	}
	public void setGraduationDate(String graduationDate) {
		this.graduationDate = graduationDate;
	}
	public String getGraduationRank() {
		return graduationRank;
	}
	public void setGraduationRank(String graduationRank) {
		this.graduationRank = graduationRank;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}


}
