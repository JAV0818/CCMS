package CaseManagement;

import java.time.LocalDate;

public class CaseBuilder {
    private String caseNumber;
    private String plaintiff;
    private String defendant;
    private String caseType;
    private LocalDate filingDate;

    public CaseBuilder withCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
        return this;
    }

    public CaseBuilder withPlaintiff(String plaintiff) {
        this.plaintiff = plaintiff;
        return this;
    }

    public CaseBuilder withDefendant(String defendant) {
        this.defendant = defendant;
        return this;
    }

    public CaseBuilder withCaseType(String caseType) {
        this.caseType = caseType;
        return this;
    }

    public CaseBuilder withFilingDate(LocalDate filingDate) {
        this.filingDate = filingDate;
        return this;
    }

    public Case build() {
        return new Case(caseNumber, plaintiff, defendant, caseType, filingDate);
    }
}
