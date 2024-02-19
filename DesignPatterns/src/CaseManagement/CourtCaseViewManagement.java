package CaseManagement;

import ActorManagement.UserManagement;

public class CourtCaseViewManagement {

    private UserManagement userManagement;
    private DefendantViewCourtCase defendantViewCourtCase;

    public CourtCaseViewManagement(UserManagement userManagement) {
        this.userManagement = userManagement;
        this.defendantViewCourtCase = userManagement.create();
        defendantViewCourtCase.viewCase();
    }
}
