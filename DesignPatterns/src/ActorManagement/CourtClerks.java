package ActorManagement;

public class CourtClerks extends Person {

    public Department department;

    public CourtClerks(String loginid, String pwd, String name, String role, Department dept){
        super(loginid, pwd, name, role);
        this.department = dept;
    }
    public CourtClerks(String loginid, String pwd, String role){

        super(loginid, pwd, role);
    }
}
