package CaseManagement;

import java.util.LinkedList;

public class ArchiveFacade {
    public CourtCaseAdder getCourtCaseAdder() {
        return courtCaseAdder;
    }

    public void setCourtCaseAdder(CourtCaseAdder courtCaseAdder) {
        this.courtCaseAdder = courtCaseAdder;
    }

    public CourtCaseAdder courtCaseAdder;
    private CaseSearch caseSearch;
    private ArchiveCases archiveCases;

    public ArchiveFacade() {
        courtCaseAdder = new CourtCaseAdder();
        caseSearch = new CaseSearch();
        archiveCases = new ArchiveCases();
    }

    public void addCourtCase(String caseNumber, String[] parties, String status) {
        CourtCase courtCase = new CourtCase(caseNumber, parties, status);
        courtCaseAdder.addCourtCase(courtCase);
    }

    public void archiveCase(String caseNumber) {
        archiveCases.saveCase(caseNumber, courtCaseAdder);
    }

    public LinkedList<String> getSavedCases() {
        return archiveCases.getSavedCases();
    }

    public String searchCases(String caseNumber) {
        return caseSearch.searchCases(caseNumber, courtCaseAdder);
    }
}
