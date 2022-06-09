import java.util.Scanner;

public class Adress {
    protected String homeNumber;
    protected String streetName;
    protected String adress;

    public Adress(String homeNumber, String streetName, String adress) {
        this.homeNumber = homeNumber;
        this.streetName = streetName;
        this.adress = adress;
    }

    public Adress() {
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
    public void InPutAdress(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số nhà: ");
        setHomeNumber(sc.nextLine());
        System.out.println("Nhập Tên đường: ");
        setStreetName(sc.nextLine());
        System.out.println("Nhập quê quán: ");
        setAdress(sc.nextLine());
    }

    @Override
    public String toString() {
        return "Adress" +
                "Số nhà :" + homeNumber + '\n' +
                "Tên Đường: " + streetName + '\n' +
                "Quê quán='" + adress + '\n';
    }
}
