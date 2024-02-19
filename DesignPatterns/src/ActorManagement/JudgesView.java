package ActorManagement;

import CaseManagement.ArchiveFacade;
import CaseManagement.CourtCase;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JudgesView {

    private ArchiveFacade archiveFacade;

    public JudgesView(ArchiveFacade archiveFacade) {
        this.archiveFacade = archiveFacade;
        Scanner mscan = new Scanner(System.in);
        int option;
        boolean isValid = true;
        while (isValid == true) {
            System.out.println("Input the number of the action you want to achieve.");
            System.out.println("1. Edit a court case");
            System.out.println("2. Export Court Case to file");
            System.out.println("3. Search for a case");
            System.out.println("4. Log out");
            System.out.println("0. Exit Application");
            System.out.println("Action Number: ");
            option = mscan.nextInt();
            mscan.nextLine();

            switch (option) {
                case 0:
                    System.out.println("Exiting Application...");
                    isValid = false;
                    break;

                case 1:
                    System.out.println("Enter case number: ");
                    String caseNum = mscan.next();
                    CourtCase courtCaseToEdit = archiveFacade.getCourtCaseAdder().findCourtCase(caseNum, archiveFacade.getCourtCaseAdder());
                    if (courtCaseToEdit == null) {
                        System.out.println("Invalid case number");
                        continue;
                    }
                    System.out.println("Enter updated case ID:");
                    mscan.nextLine(); // consume newline character
                    String updatedID = mscan.nextLine();
                    courtCaseToEdit.setCaseNumber(updatedID);

                    System.out.println("Enter updated parties involved(use ',' to separate):");
                    String updatedParties = mscan.nextLine();
                    String[] splitParties = updatedParties.split(",");
                    if (splitParties.length == 1 && splitParties[0].isEmpty()) {
                        courtCaseToEdit.setParties(new String[]{});
                    } else {
                        courtCaseToEdit.setParties(splitParties);
                    }

                    System.out.println("Please update the status of the case:");
                    String updatedStatus = mscan.nextLine();
                    courtCaseToEdit.setStatus(updatedStatus);

                    System.out.println("Case updated successfully");
                    break;

                case 2:
                    System.out.println("Enter the case number to export:");
                    String exportCaseNumber = mscan.nextLine();
                    CourtCase exportCourtCase = archiveFacade.getCourtCaseAdder().findCourtCase(exportCaseNumber,archiveFacade.getCourtCaseAdder());
                    if (exportCourtCase == null) {
                        System.out.println("Case not found!");
                    } else {
                        // Export the court case to a file here
                        try {
                            String fileName = exportCaseNumber + ".txt";
                            File file = new File(fileName);
                            FileWriter writer = new FileWriter(file);
                            writer.write(exportCourtCase.toString());
                            writer.close();
                            System.out.println("Case exported to file: " + fileName);
                        } catch (IOException e) {
                            System.out.println("Error exporting case to file: " + e.getMessage());
                        }
                    }
                    break;

                case 3:
                    System.out.println("Enter case number:");
                    String caseNumber = mscan.nextLine();
                    CourtCase searchedCourtCase = archiveFacade.getCourtCaseAdder().findCourtCase(caseNumber,archiveFacade.getCourtCaseAdder());
                    if (searchedCourtCase == null) {
                        System.out.println("Case not found!");
                    } else {
                        System.out.println(searchedCourtCase);
                    }
                    break;

                case 4:
                    System.out.println("Logging out...");
                    isValid = false;
                    break;

                default:
                    System.out.println("Invalid entry");
                    break;
            }
        }
    }
}
