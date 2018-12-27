package entity;

public class ExperienceCandidate extends Candidate{
    String expInYear;
    String proSkill;
    /**
     * 
     */
    public ExperienceCandidate() {
        super();
        // TODO Auto-generated constructor stub
    }
    /**
     * @param candidateID
     * @param firstName
     * @param birtDate
     * @param address
     * @param phone
     * @param email
     * @param candidateType
     */
    public ExperienceCandidate(int candidateID, String firstName, int birtDate, String address, int phone, String email,
            String candidateType) {
        super(candidateID, firstName, birtDate, address, phone, email, candidateType);
        // TODO Auto-generated constructor stub
    }
}
