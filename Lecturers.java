import java.util.Objects;
import java.util.Scanner;

public class Lecturers extends Human implements Comparable<Lecturers> {
    protected String specialized;
    protected int iD_Lecturers;
    protected int yearOfExperience;
    protected double salary;
    protected String workplace;

    public Lecturers() {
    }

    public Lecturers(FullName fullName, Adress adress, String phoneNumber, String id,
                     String specialized, int iD_Lecturers, int yearOfExperience, double salary, String workplace) {
        super(fullName, adress, phoneNumber, id);
        this.specialized = specialized;
        this.iD_Lecturers = iD_Lecturers;
        this.yearOfExperience = yearOfExperience;
        this.salary = salary;
        this.workplace = workplace;
    }

    public Lecturers(FullName fullName, Adress adress, String phoneNumber, String id) {
        super(fullName, adress, phoneNumber, id);
    }

    public Lecturers(int iD_Lecturers) {
        this.iD_Lecturers = iD_Lecturers;
    }

    public String getSpecialized() {
        return specialized;
    }

    public void setSpecialized(String specialized) {
        this.specialized = specialized;
    }

    public int getiD_Lecturers() {
        return iD_Lecturers;
    }

    public void setiD_Lecturers(int iD_Lecturers) {
        this.iD_Lecturers = iD_Lecturers;
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public void InPutLecturers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin giảng viên: ");
        this.IPutHuman();
        System.out.println("Nhập ID của giảng viên: ");
        this.iD_Lecturers = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập chuyên ngành của giảng viên: ");
        this.specialized = sc.nextLine();
        System.out.println("Nhập Số năm kinh nghiệm của giảng viên: ");
        this.yearOfExperience = sc.nextInt();
        System.out.println("Nhập mức lương của giảng viên: ");
        this.salary = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhập vị trí đang công tác của giảng viên: ");
        this.workplace = sc.nextLine();
    }

    @Override
    public String toString() {
        return "" + fullName  +
                adress  +
                "Số đt: " + phoneNumber + '\n' +
                "Số CMND: " + id + '\n' +
                "iD_Lecturers: " + iD_Lecturers + '\n' +
                "Chuyên Ngành: " + specialized + '\n' +
                "Số năm kinh nghiệm: " + yearOfExperience + '\n' +
                "Salary: " + salary + '\n' +
                "Workplace: " + workplace + '\n' +
                '}';
    }

    @Override
    public int compareTo(Lecturers o) {
        return this.getiD_Lecturers() - o.getiD_Lecturers();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lecturers)) return false;
        Lecturers lecturers = (Lecturers) o;
        return getiD_Lecturers() == lecturers.getiD_Lecturers();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getiD_Lecturers());
    }
}
