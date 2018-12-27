package entity;

public class Candidate {
    int candidateID;
    String firstName;
    int birtDate ;
    String address;
    int phone;
    String email;
    String candidateType;
    /**
     * 
     */
    public Candidate() {
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
    public Candidate(int candidateID, String firstName, int birtDate, String address, int phone, String email,
            String candidateType) {
        super();
        this.candidateID = candidateID;
        this.firstName = firstName;
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
