package entity;

public class ExperienceCandidate extends Candidate{
    String expInYear;
    String proSkill;
	public ExperienceCandidate() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param candidateID
	 * @param firstName
	 * @param lastName
	 * @param birtDate
	 * @param address
	 * @param phone
	 * @param email
	 * @param candidateType
	 * @param expInYear
	 * @param proSkill
	 */
	public ExperienceCandidate(int candidateID, String firstName, String lastName, int birtDate, String address,
			int phone, String email, String candidateType, String expInYear, String proSkill) {
		super(candidateID, firstName, lastName, birtDate, address, phone, email, candidateType);
		this.expInYear = expInYear;
		this.proSkill = proSkill;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ExperienceCandidate [ candidateID=" + candidateID
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", birtDate=" + birtDate + ", address="
				+ address + ", phone=" + phone + ", email=" + email + ", candidateType=" + candidateType + ", expInYear=" + expInYear + ", proSkill=" + proSkill + "]";
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
    
}
