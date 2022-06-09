import java.util.Scanner;

public class Dean extends  Lecturers{
    private String term;
    private String achievements;

    public Dean(FullName fullName, Adress adress, String phoneNumber, String id, String specialized, int iD_Lecturers, int yearOfExperience,
                double salary, String workplace, String term, String achievements) {
        super(fullName, adress, phoneNumber, id, specialized, iD_Lecturers, yearOfExperience, salary, workplace);
        this.term = term;
        this.achievements = achievements;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getAchievements() {
        return achievements;
    }

    public void setAchievements(String achievements) {
        this.achievements = achievements;
    }
    public void InPutDean(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin của trưởng khoa :");
        this.InPutLecturers();
        System.out.println("Nhập nhiệm kỳ đang công tác(theo năm): ");
        this.term=sc.nextLine();
        System.out.println("Nhập thành tích đã đạt được của trưởng khoa: ");
        this.achievements=sc.nextLine();
    }
}
