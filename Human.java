import java.util.Scanner;

public class Human {
    protected FullName fullName;
    protected Adress adress;
    protected String phoneNumber;
    protected String id;

    public Human(FullName fullName, Adress adress, String phoneNumber, String id) {
        this.fullName = fullName;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.id = id;
    }

    public Human() {
        fullName=new FullName();
        adress=new Adress();
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void IPutHuman(){
        Scanner sc = new Scanner(System.in);
        this.fullName.InputName();
        this.adress.InPutAdress();
        System.out.println("NHập số điện thoại:");
        this.phoneNumber=sc.nextLine();
        System.out.println("NHập số CMND:");
        this.id=sc.nextLine();
    }
}
