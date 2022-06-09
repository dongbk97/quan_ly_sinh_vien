import java.util.Objects;
import java.util.Scanner;

public class Student extends Human implements Comparable<Student>{
    private int iD_Student;
    private int course;
    private String major;
    private String level;

    public Student(FullName fullName, Adress adress, String phoneNumber, String id, int iD_Student, int course, String major, String level) {
        super(fullName, adress, phoneNumber, id);
        this.iD_Student = iD_Student;
        this.course = course;
        this.major = major;
        this.level = level;
    }

    public Student() {
    }

    public Student(int iD_Student) {
        this.iD_Student = iD_Student;
    }

    public Student(FullName fullName, Adress adress, String phoneNumber, String id) {
        super(fullName, adress, phoneNumber, id);
    }

    public int getiD_Student() {
        return iD_Student;
    }

    public void setiD_Student(int iD_Student) {
        this.iD_Student = iD_Student;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void InPutStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin sinh viên: ");
        this.IPutHuman();
        System.out.println("Nhập ID sinh viên: ");
        this.iD_Student = sc.nextInt();
        System.out.println("Nhập khóa sinh viên: ");
        this.course = sc.nextInt();
        System.out.println("Nhập chuyên nghành sinh viên: ");
        this.major = sc.nextLine();
        System.out.println("Nhập xếp loại của sinh viên: ");
        this.level = sc.nextLine();
    }

    @Override
    public String toString() {
        return ""+fullName +'\n' +
                adress +'\n' +
                "Số đt: " + phoneNumber + '\n' +
                "Số CMND: " + id + '\n' +
                "iD_Student: " + iD_Student + '\n'+
                " course: " + course +'\n' +
                ", major='" + major + '\n' +
                ", level='" + level + '\n' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getiD_Student()-o.getiD_Student();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getiD_Student() == student.getiD_Student();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getiD_Student());
    }
}
