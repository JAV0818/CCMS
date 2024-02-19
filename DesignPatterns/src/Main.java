import ActorManagement.*;
import CaseManagement.ArchiveFacade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArchiveFacade archiveFacade = new ArchiveFacade();
        LoginSystem loginSystem = new LoginSystem();

        while (true) {
            System.out.println("Type your username: ");
            String username = scanner.next();
            System.out.println("Type your password: ");
            String password = scanner.next();

            if (!loginSystem.isValidUser(username, password)) {
                System.out.println("Invalid username or password.");
                continue;
            }

            Person person = loginSystem.getUser(username, password);
            System.out.println("Login successful!");
            System.out.println("Welcome, " + person.getName() + " (" + person.getRole() + ")" + '\n');

            switch (person.getRole()) {
                case "CourtClerk" -> {
                    CourtClerksView view = new CourtClerksView(archiveFacade);
                }
                case "Defendant" -> {
                    DefendentsView view = new DefendentsView(archiveFacade);
                }
                case "Judge" -> {
                    JudgesView view = new JudgesView(archiveFacade);
                }
                case "Public" -> {
                    PublicView view = new PublicView(archiveFacade);
                }
                default -> System.out.println("Invalid, try again");
            }
        }
    }
}
