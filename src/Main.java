import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SinhVienTest test = new SinhVienTest();
        Scanner keyboard = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n\n\n------MENU------");
            System.out.println("1.Nhap mot sinh vien moi.");
            System.out.println("2.Xem danh sach sinh vien.");
            System.out.println("3.Sap xep danh sach theo thu tu tang dan theo tong diem.");
            System.out.println("4.Tim kiem tuyen tinh theo masv.");
            System.out.println("5.Sua thong tin sinh vien co ma duoc nhap tu ban phim.");
            System.out.println("6.Xoa sinh vien co ma nhap tu ban phim.");
            System.out.println("0.Ket thuc\n");
            System.out.println("\t\tEnter your option: ");
            choice = keyboard.nextInt();
            if (choice == 1) {
                test.inputStudent();
            } else if (choice == 2) {
                test.showListOfStudents();
            } else if (choice == 3) {
                test.sortSum();
            } else if (choice == 4) {
                System.out.println("Enter student ID: ");
                int id = keyboard.nextInt();
                SinhVien st = test.findStudentByID(id);
                System.out.println(st.toString());
            } else if (choice == 5) {
                System.out.println("Enter student ID: ");
                int id = keyboard.nextInt();
                test.editStudent(id);
            } else if (choice == 6) {
                System.out.println("Enter student ID: ");
                int id = keyboard.nextInt();
                test.removeStudent(id);
            }
        } while (choice != 0);
    }

}
