import CaseManagement.Case;

import java.util.ArrayList;
import java.util.List;

public class MainMenu {
    private List<Case> caseList;

    public MainMenu() {
        // Initialize the list of cases
        caseList = new ArrayList<>();
        caseList.add(new Case(1, "John Doe", "johndoe@example.com", "Lorem ipsum dolor sit amet."));
        caseList.add(new Case(2, "Jane Smith", "janesmith@example.com", "Consectetur adipiscing elit."));
        caseList.add(new Case(3, "Bob Johnson", "bobjohnson@example.com", "Sed do eiusmod tempor incididunt."));
    }

    public void displayMenu() {
        System.out.println("=== Court Case Management System ===");
        System.out.println("1. View Case List");
        System.out.println("2. Search Cases");
        System.out.println("3. Add New Case");
        System.out.println("4. Quit");
    }
}
