package ActorManagement;

public class Defendents extends Person {

    public Department department;

    public Defendents(String loginid, String pwd, String name, String role, Department dept){
        super(loginid, pwd, name, role);
        this.department = dept;
    }
    public Defendents(String loginid, String pwd, String role){
        super(loginid, pwd, role);
    }

    public Defendents(String loginid){
        super(loginid);
    }
}
