package CaseManagement;

class CourtCaseUpdateObserver implements CourtCaseObserver {
    @Override
    public void update(CourtCase courtCase) {
        System.out.println("Court case updated: " + courtCase.getCaseNumber() + ", " + courtCase.getCaseType() + ", " + courtCase.getStatus());
    }
}
