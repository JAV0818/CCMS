package CaseManagement;

import java.time.LocalDateTime;
import java.util.List;

public class CourtCase {
    private String caseNumber;

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    public void setParties(String[] parties) {
        this.parties = parties;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    public void setPartiesInvolved(List<String> partiesInvolved) {
        this.partiesInvolved = partiesInvolved;
    }

    private String[] parties;
    private String status;

//    private UserManagement um;
//    private DefendantViewCourtCase df;
    private String caseType;
    private List<String> partiesInvolved;
    private List<String> keyDates;
    private LocalDateTime lastUpdateDate;

    public CourtCase(String caseNumber, String[] parties, String status) {
        this.caseNumber = caseNumber;
        this.parties = parties;
        this.status = status;


    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Case Number: ").append(caseNumber).append("\n");
        sb.append("Parties: ");
        for (int i = 0; i < parties.length; i++) {
            sb.append(parties[i]);
            if (i != parties.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("\nStatus: ").append(status).append("\n");
        return sb.toString();
    }

    public CourtCase(String caseNumber, String caseType, List<String> partiesInvolved, List<String> keyDates, LocalDateTime lastUpdateDate, String status) {
        this.caseNumber = caseNumber;
        this.caseType = caseType;
        this.partiesInvolved = partiesInvolved;
        this.keyDates = keyDates;
        this.lastUpdateDate = lastUpdateDate;
        this.status = status;
    }
//
//    public CourtCase(UserManagement um) {
//        this.um = um;
//        this.df = (DefendantViewCourtCase) um.create();
//        df.viewCase();
//
//    }

    public String getCaseNumber() {
        return caseNumber;
    }

    public String[] getParties() {
        return parties;
    }

    public String getCaseType() {
        return caseType;
    }

    public List<String> getPartiesInvolved() {
        return partiesInvolved;
    }

    public void addKeyDate(String keyDate) {
        keyDates.add(keyDate);
    }

    public List<String> getKeyDates() {
        return keyDates;
    }

    public LocalDateTime getLastUpdateDate() {
        return lastUpdateDate;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}