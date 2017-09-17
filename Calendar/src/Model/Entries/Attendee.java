package Model.Entries;

public class Attendee{
    private String name;
    private String email;
    private String PhoneNumber;

    public Attendee(String name, String email, String PhoneNumber){
        this.name = name;
        this.email = email;
        this.PhoneNumber =PhoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public void changeEmail(String email) {
        this.email = email;
    }

    public void changePhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}