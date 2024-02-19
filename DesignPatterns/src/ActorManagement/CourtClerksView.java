package ActorManagement;

import CaseManagement.ArchiveFacade;
import CaseManagement.CourtCase;
import CaseManagement.CourtCaseManager;

import java.util.Objects;
import java.util.Scanner;

public class CourtClerksView {
    private CourtCaseManager courtCaseManager;

    public CourtClerksView(CourtCaseManager courtCaseManager) {
        this.courtCaseManager = courtCaseManager;
    }

    public CourtClerksView(ArchiveFacade archiveFacade) {
        Scanner scanner = new Scanner(System.in);
        ArchiveFacade copy = new ArchiveFacade();
        boolean defbool = true;

        while (defbool) {
            System.out.println("\nInput the number of the action you want to achieve.\n" +
                    "1. Add a case to the system\n" +
                    "2. Search for a case in the system\n" +
                    "3. Log out\n" +
                    "0. Exit the program\n" + "Action Number: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("How many cases would you like to add?");
                    int numCases = scanner.nextInt();
                    scanner.nextLine(); // consume the newline character

                    for (int i = 0; i < numCases; i++) {
                        System.out.println("Enter case ID:");
                        String caseNumber = scanner.nextLine();

                        System.out.println("Enter number of parties:");
                        int numParties = scanner.nextInt();
                        scanner.nextLine(); // consume the newline character

                        String[] parties = new String[numParties];
                        for (int j = 0; j < numParties; j++) {
                            System.out.println("Enter name of party " + (j + 1) + ":");
                            parties[j] = scanner.nextLine();
                        }

                        System.out.println("Enter case status:");
                        String status = scanner.nextLine();

                        archiveFacade.addCourtCase(caseNumber, parties, status);
                        System.out.println("Case added to system.");
                    }

                    break;

                case 2:
                    System.out.println("Enter case ID:");
                    String caseNumber = scanner.nextLine();
                    String caseInfo = archiveFacade.searchCases(caseNumber);
                    System.out.println(Objects.requireNonNullElse(caseInfo, "Couldn't find a case with that ID - try again."));

                    break;

                case 3:
                    System.out.println("Logging out");
                    return;

                case 0:
                    System.out.println("Exiting program.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }
    }

    public int CourtClerksView(){
        System.out.println("1. Edit a court case");
        System.out.println("2. Add a court case");
        System.out.println("3. View all court cases");
        System.out.println("0. Exit Application");
        Scanner mscan = new Scanner(System.in);
        return mscan.nextInt();
    }

    public void addCourtCase() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter case number:");
        String caseNumber = scanner.nextLine();
        System.out.println("Enter parties involved (comma-separated):");
        String[] parties = scanner.nextLine().split(",");
        System.out.println("Enter status:");
        String status = scanner.nextLine();
        CourtCase courtCase = new CourtCase(caseNumber, parties, status);
        courtCaseManager.addCourtCase(courtCase);
        System.out.println("Court case added.");
    }

    public void editCourtCase() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter case number:");
        String caseNumber = scanner.nextLine();
        System.out.println("Enter new status:");
        String status = scanner.nextLine();
        courtCaseManager.editCourtCase(caseNumber, status);
        System.out.println("Court case edited.");
    }

    public void viewAllCourtCases() {
        courtCaseManager.printAllCourtCases();
    }
}
