package entity;

public class ExperienceCandidate extends Candidate{
    String expInYear;
    String proSkill;
    
	public ExperienceCandidate(int candidateID, String firstName, int birtDate, String address, int phone, String email,
			String candidateType, String expInYear, String proSkill) {
		super(candidateID, firstName, birtDate, address, phone, email, candidateType);
		this.expInYear = expInYear;
		this.proSkill = proSkill;
	}
	public ExperienceCandidate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ExperienceCandidate(int candidateID, String firstName, int birtDate, String address, int phone, String email,
			String candidateType) {
		super(candidateID, firstName, birtDate, address, phone, email, candidateType);
		// TODO Auto-generated constructor stub
	}
	public String getExpInYear() {
		return expInYear;
	}
	public void setExpInYear(String expInYear) {
		this.expInYear = expInYear;
	}
	public String getProSkill() {
		return proSkill;
	}
	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
	}
	@Override
	public String toString() {
		return "ExperienceCandidate [expInYear=" + expInYear + ", proSkill=" + proSkill + ", candidateID=" + candidateID
				+ ", firstName=" + firstName + ", birtDate=" + birtDate + ", address=" + address + ", phone=" + phone
				+ ", email=" + email + ", candidateType=" + candidateType + "]";
	}
    
}
