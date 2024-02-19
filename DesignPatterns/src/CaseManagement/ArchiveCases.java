package CaseManagement;

import java.util.LinkedList;
public class ArchiveCases {
    private LinkedList<String> savedCases;

    public ArchiveCases() {
        savedCases = new LinkedList<>();
    }

    public void saveCase(String caseNumber, CourtCaseAdder courtCaseAdder) {
        CaseSearch caseSearch = new CaseSearch();
        String result = caseSearch.searchCases(caseNumber, courtCaseAdder);
        if (!result.equals("That case is not stored in this system")) {
            savedCases.add(result);
        }
    }

    public LinkedList<String> getSavedCases() {
        return savedCases;
    }
}

