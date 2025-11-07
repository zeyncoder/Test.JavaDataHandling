package level4.Userrole;

public enum UserRole {
    ADMIN("Full accsess"),
    USER("Standart accsess"),
    GUEST("not accsess")
    ;
    private String message;


    UserRole(String message){
        this.message=message;
    }
    public String getMessage() {
        return message;
    }


}
