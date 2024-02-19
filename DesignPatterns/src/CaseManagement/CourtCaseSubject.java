package CaseManagement;

public interface CourtCaseSubject {
    public void registerObserver(CourtCaseObserver observer);
    public void removeObserver(CourtCaseObserver observer);
    public void notifyObservers(CourtCase courtCase);
}
