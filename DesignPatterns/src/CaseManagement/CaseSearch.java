package CaseManagement;

import CaseManagement.CourtCase;
import CaseManagement.CourtCaseAdder;

public class CaseSearch {
    public String searchCases(String caseNumber, CourtCaseAdder courtCaseAdder) {
        for (CourtCase courtCase : courtCaseAdder.getCourtCases()) {
            if (courtCase.getCaseNumber().equals(caseNumber)) {
                return courtCase.toString();
            }
        }
        return "That case is not stored in this system";
    }

    public CourtCase findCourtCase(String caseNumber, CourtCaseAdder courtCaseAdder) {
        for (CourtCase courtCase : courtCaseAdder.getCourtCases()) {
            if (courtCase.getCaseNumber().equals(caseNumber)) {
                return courtCase;
            }
        }
        return null; // Case not found
    }
}