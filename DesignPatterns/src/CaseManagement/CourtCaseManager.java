package CaseManagement;

import CaseManagement.CourtCase;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CourtCaseManager implements CourtCaseSubject {
    private List<CourtCase> courtCases;
    private List<CourtCaseObserver> observers = new ArrayList<>();

    public CourtCaseManager() {
        courtCases = new ArrayList<>();
    }

    public void addCourtCase(CourtCase courtCase) {

        courtCases.add(courtCase);
        notifyObservers(courtCase);
    }

    public void editCourtCase(String caseNumber, String status) {
        for (CourtCase courtCase : courtCases) {
            if (courtCase.getCaseNumber().equals(caseNumber)) {
                courtCase.setStatus(status);
                notifyObservers(courtCase);
                return;
            }
        }
        System.out.println("Court case not found.");
    }

    public void printAllCourtCases() {
        System.out.println("Court Cases:");
        for (CourtCase courtCase : courtCases) {
            System.out.println("Case Number: " + courtCase.getCaseNumber() + ", Parties: " + Arrays.toString(courtCase.getParties()) + ", Status: " + courtCase.getStatus());
        }
    }

    public List<CourtCase> filterCourtCasesByType(String caseType) {
        List<CourtCase> filteredCases = new ArrayList<>();
        for (CourtCase courtCase : courtCases) {
            if (courtCase.getCaseType().equals(caseType)) {
                filteredCases.add(courtCase);
            }
        }
        return filteredCases;
    }

    @Override
    public void registerObserver(CourtCaseObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(CourtCaseObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(CourtCase courtCase) {
        for (CourtCaseObserver observer : observers) {
            observer.update(courtCase);
        }
    }

    public List<CourtCase> filterCourtCasesByDate(LocalDate date) {
        List<CourtCase> filteredCases = new ArrayList<>();
        for (CourtCase courtCase : courtCases) {
            List<String> keyDates = courtCase.getKeyDates();
            for (String keyDate : keyDates) {
                LocalDate localKeyDate = LocalDate.parse(keyDate);
                if (localKeyDate.isAfter(date)) {
                    filteredCases.add(courtCase);
                    break;
                }
            }
        }
        return filteredCases;
    }

    public List<CourtCase> getCourtCasesSortedByUpdateDate() {
        List<CourtCase> sortedCases = new ArrayList<>(courtCases);
        sortedCases.sort(Comparator.comparing(CourtCase::getLastUpdateDate).reversed());
        return sortedCases;
    }
}