package level4.PhoneNumber;

public class PhoneNumber {
    public static void main(String[] args) {
        String phoneNumber="+994517085129";
        String regex="^\\+994\\d{9}$";
        if(phoneNumber.matches(regex)){
            System.out.println("Nomre duzgundur");
        }
        else{
            System.out.println("Yalnis");
        }
    }
}
