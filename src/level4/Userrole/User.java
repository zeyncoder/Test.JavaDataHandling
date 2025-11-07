package level4.Userrole;

public class User {
    public static void main(String[] args) {
        for (UserRole role : UserRole.values()) {
            System.out.println(role + " "+ role.getMessage());
        }
    }
}
