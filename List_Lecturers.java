import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;

public class List_Lecturers {


    private ArrayList<Lecturers> list;

    public List_Lecturers(ArrayList<Lecturers> list) {
        this.list = list;
    }

    public List_Lecturers() {
        this.list = new ArrayList<>();
    }

    public ArrayList<Lecturers> getList() {
        return list;
    }

    public void setList(ArrayList<Lecturers> list) {
        this.list = list;
    }

    public void AddObject(Lecturers st) {
        this.list.add(st);
    }

    // Thay đổi thông tin giảng viên theo mã nhập vào từ bàn phím
    public void ChangeIfSt(int a) {
        for (Lecturers obj : list) {
            if (obj.getiD_Lecturers() == a) {
                obj.InPutLecturers();
            }
        }
    }

    // Xóa giảng viên theo mã nhập vào từ bàn phím
    public void RemoveIfSt(Lecturers st) {
        this.list.remove(st);
    }

    // Tìm giảng viên theo mã nhập vào từ bàn phím
    public void SeachIfStByID(int a) {
        for (Lecturers obj : list) {
            if (obj.getiD_Lecturers() == a) {
                System.out.println(obj);
            }
        }
    }

    // Tìm giảng viên theo tên nhập vào từ bàn phím
    public void SeachIfStByName(String a) {
        for (Lecturers obj : list) {
            if (obj.fullName.lastName.indexOf(a) >= 0) {
                System.out.println(obj);
            }
        }

    }

    public void DisplayGV() {
        for (Lecturers obj : list) {
            System.out.println(obj);
        }
    }

    // Sắp xếp giảng viên theo tên
    public void SortByName() {
        Collections.sort(list, new Comparator<Lecturers>() {
            @Override
            public int compare(Lecturers o1, Lecturers o2) {
                return o1.fullName.lastName.compareTo(o2.fullName.lastName);
            }
        });
    }
}

