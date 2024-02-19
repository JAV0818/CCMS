package CaseManagement;

import java.time.LocalDate;

public class Case {
    private String caseNumber = null;
    private String plaintiff = null;
    private String defendant = null;
    private String caseType = null;
    private LocalDate filingDate = null;

    public Case(String caseNumber, String plaintiff, String defendant, String caseType, LocalDate filingDate) {
        this.caseNumber = caseNumber;
        this.plaintiff = plaintiff;
        this.defendant = defendant;
        this.caseType = caseType;
        this.filingDate = filingDate;
    }

    public String toString() {
        return "Case " + caseNumber + ": " + caseType + " - " + plaintiff + " v. " + defendant;
    }

    private int id;
    private String name;
    private String email;
    private String description;

    public Case(int id, String name, String email, String description) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getDescription() {
        return description;
    }
}

