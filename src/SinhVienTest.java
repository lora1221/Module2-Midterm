import java.util.ArrayList;
import java.util.Scanner;
public class SinhVienTest implements ISinhVienTest {
    ArrayList<SinhVien> students = new ArrayList();
    Scanner keyboard = new Scanner(System.in);


    @Override
    public void inputStudent() {
        SinhVien st = new SinhVien();
        System.out.print("Enter student id: ");
        int id = keyboard.nextInt();
        while(checkExistance(id)) {
            System.out.println("ID is already existed. Re-enter student id: ");
            id = keyboard.nextInt();
        }
        st.setMasv(id);
        keyboard.nextLine();
        System.out.print("Enter name of student: ");
        st.setHoten(keyboard.nextLine());
        System.out.print("Enter student gender (Male: 1 or Female: 0): ");
        st.setGioitinh(keyboard.nextInt());
        System.out.print("Enter Math score: ");
        st.setDiemtoan(keyboard.nextDouble());
        System.out.print("Enter Physics score: ");
        st.setDiemly(keyboard.nextDouble());
        System.out.print("Enter Chemistry score: ");
        st.setDiemhoa(keyboard.nextDouble());
        students.add(st);
    }

    @Override
    public void showListOfStudents() {
        for (SinhVien i:students
             ) {
            System.out.println(i.toString());
        }
    }

    @Override
    public void sortSum() {
        int n = students.size();
        for (int i = 0; i< n-1; i++) {
            for (int j = 0; j < n-i-1; j ++) {
                SinhVien st1 = students.get(j);
                SinhVien st2 = students.get(j+1);
                if (st1.getTongDiem() > st2.getTongDiem()) {
                    students.set(j, st2);
                    students.set(j+1, st1);
                }
            }
        }
    }

    @Override
    public SinhVien findStudentByID(int studentID) {
        SinhVien st = null;
        int n = students.size();
        if (checkExistance(studentID)) {
            for (int i= 0; i <n; i++) {
                st = students.get(i);
                if (st.getMasv() == studentID) {
                    return st;
                }
            }
        }
        return st;
    }

    @Override
    public void editStudent(int studentID) {
        SinhVien st = findStudentByID(studentID);
        if (st == null) {
            System.out.println("No student found");
        } else {
            System.out.print("Edit name: ");
            keyboard.nextLine();
            st.setHoten(keyboard.nextLine());
            System.out.print("Edit gender (Male: 1 or Female : 0): ");
            st.setGioitinh(keyboard.nextInt());
            System.out.print("Edit Mark score: ");
            st.setDiemtoan(keyboard.nextDouble());
            System.out.print("Edit Physics score: ");
            st.setDiemly(keyboard.nextDouble());
            System.out.print("Edit Chemistry score: ");
            st.setDiemhoa(keyboard.nextDouble());
        }

    }

    @Override
    public void removeStudent(int studentID) {
        SinhVien st = findStudentByID(studentID);
        if (st == null) {
            System.out.println("No student found");
        } else {
            students.remove(st);
        }
    }

    @Override
    public boolean checkExistance(int studentID) {
        SinhVien st = null;
        int n = students.size();
        for (int i= 0; i <n; i++) {
            st = students.get(i);
            if (st.getMasv() == studentID) {
                return true;
            }
        }
        return false;
    }
}
