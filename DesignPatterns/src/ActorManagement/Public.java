package ActorManagement;

public class Public extends Person{

    public Department department;

    public Public(String loginid, String pwd, String name, String role, Department dept){
        super(loginid, pwd, name, role);
        this.department = dept;
    }
    public Public(String loginid, String pwd, String role){

        super(loginid, pwd, role);
    }
}
