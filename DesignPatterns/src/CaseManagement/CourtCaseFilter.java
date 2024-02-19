package CaseManagement;

import CaseManagement.CourtCase;

import java.util.List;
import java.util.stream.Collectors;

class CourtCaseFilter {
    private List<CourtCase> courtCases;

    public CourtCaseFilter(List<CourtCase> courtCases) {
        this.courtCases = courtCases;
    }

    public List<CourtCase> filterByCaseType(String caseType) {
        return courtCases.stream()
                .filter(courtCase -> courtCase.getCaseType().equals(caseType))
                .collect(Collectors.toList());
    }

    public List<CourtCase> filterByCaseNumber(String caseNumber) {
        return courtCases.stream()
                .filter(courtCase -> courtCase.getCaseNumber().equals(caseNumber))
                .collect(Collectors.toList());
    }

    public List<CourtCase> filterByPartiesInvolved(List<String> partiesInvolved) {
        return courtCases.stream()
                .filter(courtCase -> courtCase.getPartiesInvolved().equals(partiesInvolved))
                .collect(Collectors.toList());
    }

    public List<CourtCase> filterByLastUpdateDay(String lastUpdateDate) {
        return courtCases.stream()
                .filter(courtCase -> courtCase.getLastUpdateDate().equals(lastUpdateDate))
                .collect(Collectors.toList());
    }
    public List<CourtCase> filterByStatus(String status) {
        return courtCases.stream()
                .filter(courtCase -> courtCase.getStatus().equals(status))
                .collect(Collectors.toList());
    }
}

