
import java.util.Scanner;

public class FullName {
    protected String firstName;
    protected String middleName;
    protected String lastName;
    protected String fullName;

    public FullName(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;

    }

    public FullName() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void InputName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập firstName: ");
        setFirstName(sc.nextLine());
        System.out.println("Nhập middleName: ");
        setMiddleName(sc.nextLine());
        System.out.println("Nhập lastName: ");
        setLastName(sc.nextLine());
        this.fullName = this.firstName + this.middleName + this.lastName;
    }

    @Override
    public String toString() {
        return "Họ tên: " + fullName + '\n' ;
    }
}
