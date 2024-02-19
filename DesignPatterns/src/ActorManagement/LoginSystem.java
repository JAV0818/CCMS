package ActorManagement;
import java.util.HashMap;

public class LoginSystem {
    private HashMap<String, Person> userMap;

    public LoginSystem() {
        userMap = new HashMap<>();

        Person defendant = new Person("scooter143", "pinetr33s", "AdamScott", "Defendant");
        Person judge = new Person("oldman5", "uptown411", "SallySmith", "Judge");
        Person clerk = new Person("mysterybear7", "monkey29", "JaneDoe", "CourtClerk");
        Person publicUser = new Person("statecollegePA", "PennState123", "BryanBarry", "Public");
        this.addUser(defendant);
        this.addUser(judge);
        this.addUser(clerk);
        this.addUser(publicUser);
    }

    public void addUser(Person person) {
        userMap.put(person.getLoginID(), person);
    }

    public boolean isValidUser(String username, String password) {
        if (userMap.containsKey(username)) {
            Person person = userMap.get(username);
            return person.getPassword().equals(password);
        }
        return false;
    }

    public Person getUser(String username, String password) {
        if (this.isValidUser(username, password)) {
            return userMap.get(username);
        } else return null;
    }
}
