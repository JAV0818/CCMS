package CaseManagement;

import ActorManagement.UserManagement;

public class CourtCaseView implements UserManagement {

    @Override
    public DefendantViewCourtCase create() {
        return new DefendentCourtCaseView();
    }
}
