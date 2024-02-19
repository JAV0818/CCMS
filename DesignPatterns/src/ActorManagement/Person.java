package ActorManagement;

public class Person {
        private String loginID;
        private String name;
        private String Password;
        private String Role;

        public Person(String loginid, String pwd, String name, String role) {
            this.loginID = loginid;
            this.name = name;
            this.Password = pwd;
            this.Role = role;
        }

        public Person(String loginid, String pwd, String role) {
            this.loginID = loginid;
            this.Password = pwd;
            this.Role = role;
        }

        public Person(String loginid) {
            this.loginID = loginid;
        }

        public String getName() {
            return this.name;
        }

        public String getRole() {
            return this.Role;
        }

        public String getLoginID() {
            return this.loginID;
        }

        public String getPassword() {
            return this.Password;
        }
    }

