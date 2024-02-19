package ActorManagement;

public class Judges extends Person {

    public Department department;

    public Judges(String loginid, String pwd, String name, String role, Department dept){
        super(loginid, pwd, name, role);
        this.department = dept;
    }
    public Judges(String loginid, String pwd, String role){

        super(loginid, pwd, role);
    }


}
