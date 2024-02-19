package CaseManagement;

import java.util.LinkedList;
public class CourtCaseAdder {



    public static LinkedList<CourtCase> courtCases;

    public CourtCaseAdder() {
        courtCases = new LinkedList<CourtCase>();
    }

    public void addCourtCase(CourtCase courtCase) {
        courtCases.add(courtCase);
    }

    public static LinkedList<CourtCase> getCourtCases() {
        return courtCases;
    }

    public void setCourtCases(LinkedList<CourtCase> courtCases) {
        this.courtCases = courtCases;
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
