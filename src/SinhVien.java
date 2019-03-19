
public class SinhVien {
    private int masv;
    private String hoten;
    private int gioiTinh;
    private double diemtoan;
    private double diemly;
    private double diemhoa;

    public SinhVien(){
    };

    public SinhVien(int masv, String hoten, int gioiTinh, double diemtoan, double diemly, double diemhoa) {
        this.masv = masv;
        this.hoten = hoten;
        this.gioiTinh = gioiTinh;
        this.diemtoan = diemtoan;
        this.diemly = diemly;
        this.diemhoa = diemhoa;
    }

    public int getMasv() {
        return masv;
    }

    public void setMasv(int masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioitinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public double getDiemtoan() {
        return diemtoan;
    }

    public void setDiemtoan(double diemtoan) {
        this.diemtoan = diemtoan;
    }

    public double getDiemly() {
        return diemly;
    }

    public void setDiemly(double diemly) {
        this.diemly = diemly;
    }

    public double getDiemhoa() {
        return diemhoa;
    }

    public void setDiemhoa(double diemhoa) {
        this.diemhoa = diemhoa;
    }

    public double getTongDiem() {
        return this.getDiemhoa() + this.getDiemly() + this.getDiemtoan();
    }

    public String toString(){
        return "Student ID: " + this.getMasv()+ "\n\tName: " + this.getHoten() + "\n\tGender (1 is male and 0 is female): "
                + this.getGioiTinh() + "\n\tMath: " + this.getDiemhoa() + "\n\tPhysics: " + this.getDiemly() + "\n\tChemistry:"
                + this.getDiemhoa() + "\n\tSum: " + this.getTongDiem();
    }

}
