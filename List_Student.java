import java.util.*;

public class List_Student {
    private ArrayList<Student> list;

    public List_Student(ArrayList<Student> list) {
        this.list = list;
    }

    public List_Student() {
        this.list = new ArrayList<>();
    }

    public ArrayList<Student> getList() {
        return list;
    }

    public void setList(ArrayList<Student> list) {
        this.list = list;
    }

    public void AddObject(Student st) {
        this.list.add(st);
    }
// Thay đổi thông tin sinh viên theo mã nhập vào từ bàn phím
    public void ChangeIfSt(int a) {
        for (Student obj : list) {
            if (obj.getiD_Student() == a) {
                obj.InPutStudent();
            }
        }
    }
 // Xóa sinh viên theo mã nhập vào từ bàn phím
    public void RemoveIfSt(Student st) {
        this.list.remove(st);
    }
// Tìm sinh viên theo mã nhập vào từ bàn phím
    public void SeachIfStByID(int a) {
        for (Student obj : list) {
            if (obj.getiD_Student() == a) {
                System.out.println(obj);
            }
        }
    }
// Tìm sinh viên theo tên nhập vào từ bàn phím
    public void SeachIfStByName(String a) {
        for (Student obj : list) {
            if (obj.fullName.lastName.indexOf(a)>=0) {
                System.out.println(obj);
            }
        }

    }

    public void DisplaySV(){
        for (Student obj : list) {
            System.out.println(obj);
        }
    }
 // Sắp xếp sinh viên theo tên
    public void SortByName() {
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.fullName.lastName.compareTo(o2.fullName.lastName);
            }
        });
    }
}
