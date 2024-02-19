package ActorManagement;

import CaseManagement.ArchiveFacade;
import CaseManagement.CourtCase;
import CaseManagement.CourtCaseView;

import java.util.LinkedList;
import java.util.Scanner;

public class DefendentsView {



    public DefendentsView(ArchiveFacade archiveFacade) {
        boolean isValid = true;
        while (isValid) {
            System.out.println("Input the number of the action you want to achieve.");
            System.out.println("1. Search Cases");
            System.out.println("2. Archive Case");
            System.out.println("3. View Archived Cases");
            System.out.println("4. Log out");
            System.out.println("0. Exit Application");
            System.out.println("Action Number: ");
            Scanner mscan = new Scanner(System.in);
            int option = mscan.nextInt();

            switch (option) {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println("Enter case number: ");
                    String caseNum = mscan.next();
                    UserManagement um = new CourtCaseView();
                    for (CourtCase courtCase : archiveFacade.getCourtCaseAdder().getCourtCases()) {
                        if (courtCase.getCaseNumber().equals(caseNum)) {
                            System.out.println(archiveFacade.searchCases(caseNum));
                            isValid = false;
                            break;
                        }
                        else {
                            System.out.println("Please re-enter the ID");
                        }
                    }

                    break;
                case 2:
                    //Need to add a if statement for if the input is not valid
                    String caseNo = mscan.nextLine();
                    System.out.println("Enter case ID to archive:");
                    caseNo = mscan.nextLine();
                    archiveFacade.archiveCase(caseNo);
                    System.out.println("Case archived.");
                    isValid=false;
                    break;


                case 3:
                    LinkedList<String> savedCases = archiveFacade.getSavedCases();
                    if (savedCases.size() == 0) {
                        System.out.println("No cases have been archived yet.");
                    } else {
                        System.out.println("Archived cases:");
                        for (String caseStr : savedCases) {
                            System.out.println(caseStr);
                        }
                    }

                    break;

                case 4:
                    System.out.println("Logging out");
                    return;

                default:
                    System.out.println("Invalid entry");
            }
        }

    }}
