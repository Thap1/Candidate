package entity;

public class FresherCandidate extends Candidate{
    String graduationDate;
    String graduationRank;
    String education;
    
   
    /**
     * 
     */
    public FresherCandidate() {
        super();
    }

  
    /**
     * @param candidateID
     * @param firstName
     * @param birtDate
     * @param address
     * @param phone
     * @param email
     * @param candidateType
     * @param graduationDate
     * @param graduationRank
     * @param education
     */
    public FresherCandidate(int candidateID, String firstName, int birtDate, String address, int phone, String email,
            String candidateType, String graduationDate, String graduationRank, String education) {
        super(candidateID, firstName, birtDate, address, phone, email, candidateType);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
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


	@Override
	public String toString() {
		return "FresherCandidate [graduationDate=" + graduationDate + ", graduationRank=" + graduationRank
				+ ", education=" + education + ", candidateID=" + candidateID + ", firstName=" + firstName
				+ ", birtDate=" + birtDate + ", address=" + address + ", phone=" + phone + ", email=" + email
				+ ", candidateType=" + candidateType + "]";
	}

}
