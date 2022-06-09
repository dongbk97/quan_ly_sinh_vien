import java.io.FileOutputStream;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        List_Student list = new List_Student();
        List_Lecturers list_lecturers = new List_Lecturers();
        Scanner sc = new Scanner(System.in);
        int luachonTT =0;
        do {
            System.out.println("Chọn thao tác: \n" +
                    "1. Sinh viên \n" +
                    "2. Giảng viên \n" +
                    "Nhập vào số bất kỳ để thoát");
             luachonTT =Integer.parseInt(sc.nextLine());
            if (luachonTT == 1) {
                System.out.println("___________Sinh viên_________");
                int luaChon = 0;
                do {
                    System.out.println("____________MENU_______________");
                    System.out.println("Mời bạn chọn các chức năng \n"
                            + "1. Thêm thông tin sinh viên \n"
                            + "2. Thay đổi thông tin sinh viên theo mã \n"
                            + "3. Xóa sinh viên \n"
                            + "4. Tìm sinh viên theo ID\n"
                            + "5. Tìm sinh viên theo tên \n"
                            + "6. Sắp xếp sinh viên theo tên ");
                    luaChon =Integer.parseInt(sc.nextLine());
                    if (luaChon == 1) {
                        Student st = new Student();
                        st.InPutStudent();
                        list.AddObject(st);
                    } else if (luaChon == 2) {
                        System.out.println("Nhập mã Sv cần thay đổi");
                        int a =Integer.parseInt(sc.nextLine());
                        list.ChangeIfSt(a);
                        list.DisplaySV();
                    } else if (luaChon == 3) {
                        System.out.println("Nhập mã Sv cần xóa");
                        int a =Integer.parseInt(sc.nextLine());
                        Student st1 = new Student(a);
                        list.RemoveIfSt(st1);
                        list.DisplaySV();
                    } else if (luaChon == 4) {
                        System.out.println("Nhập mã Sv cần tìm");
                        int a = Integer.parseInt(sc.nextLine());
                        list.SeachIfStByID(a);
                    } else if (luaChon == 5) {
                        System.out.println("Nhập tên Sv cần tìm");
                        String a = sc.nextLine();
                        list.SeachIfStByName(a);
                    } else if (luaChon == 6) {
                        list.SortByName();
                        list.DisplaySV();
                    }

                } while (luaChon != 0);
            } else if (luachonTT == 2) {
                System.out.println("___________Giảng viên_________");
                int luaChon = 0;
                do {
                    System.out.println("____________MENU_______________");
                    System.out.println("Mời bạn chọn các chức năng \n"
                            + "1. Thêm thông tin giảng viên \n"
                            + "2. Thay đổi thông tin giảng viên theo mã \n"
                            + "3. Xóa giảng viên \n"
                            + "4. Tìm giảng viên theo ID\n"
                            + "5. Tìm giảng viên theo tên \n"
                            + "6. Sắp xếp giảng viên theo tên ");
                    luaChon = Integer.parseInt(sc.nextLine());
                    if (luaChon == 1) {
                        Lecturers gv = new Lecturers();
                        gv.InPutLecturers();
                        list_lecturers.AddObject(gv);
                    } else if (luaChon == 2) {
                        System.out.println("Nhập mã Gv cần thay đổi");
                        int a = Integer.parseInt(sc.nextLine());
                        list_lecturers.ChangeIfSt(a);
                        list_lecturers.DisplayGV();
                    } else if (luaChon == 3) {
                        System.out.println("Nhập mã Gv cần xóa");
                        int a = Integer.parseInt(sc.nextLine());
                        Lecturers st1 = new Lecturers(a);
                        list_lecturers.RemoveIfSt(st1);
                        list_lecturers.DisplayGV();
                    } else if (luaChon == 4) {
                        System.out.println("Nhập mã Gv cần tìm");
                        int a =Integer.parseInt(sc.nextLine());
                        list_lecturers.SeachIfStByID(a);
                    } else if (luaChon == 5) {
                        System.out.println("Nhập tên Gv cần tìm");
                        String a = sc.nextLine();
                        list_lecturers.SeachIfStByName(a);

                    } else if (luaChon == 6) {
                        list_lecturers.SortByName();
                        list_lecturers.DisplayGV();
                    }
                } while (luaChon != 0);
            }

        } while (luachonTT == 1||luachonTT == 2);
        System.out.println("Bạn đã thoát chương trình \n" +
                " Thanks, Bye!");
    }
}
