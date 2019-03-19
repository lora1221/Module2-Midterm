public interface ISinhVienTest {
    void inputStudent();
    void showListOfStudents();
    void sortSum();
    SinhVien findStudentByID(int studentID);
    void editStudent(int studentID);
    void removeStudent(int studentID);
    boolean checkExistance(int StudentID);
}
