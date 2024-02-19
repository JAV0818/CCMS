package CaseManagement;

public class DefendentCourtCaseView implements DefendantViewCourtCase{
    @Override
    public void viewCase() {
        System.out.println("**CASE**");
        System.out.println("Case Number: 15520");
        System.out.println("Parties: John Doe (Defendent), Ben Smith (Judge)");
        System.out.println("Status: open");

}}
