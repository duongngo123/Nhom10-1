public class HinhChuNhat 
{
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) 
    {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double tinhDienTich() 
    {
        return chieuDai * chieuRong;
    }

    public double tinhChuVi() 
    {
        return 2 * (chieuDai + chieuRong);
    }

    public void inKetQua() 
    {
        System.out.println("Dien tich: " + tinhDienTich());
        System.out.println("Chu vi: " + tinhChuVi());
    }
}
public class SinhVien 
{
    private String maSinhVien;
    private String ten;
    private String ngaySinh;
    private double diemTrungBinh;

    public SinhVien(String maSinhVien, String ten, String ngaySinh, double diemTrungBinh) 
    {
        this.maSinhVien = maSinhVien;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    public void nhapThongTin(String maSinhVien, String ten, String ngaySinh, double diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    public void inThongTin() 
    {
        System.out.println("Ma sinh vien: " + maSinhVien);
        System.out.println("Ten: " + ten);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("diem trung binh: " + diemTrungBinh);
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }
}

public class Main {
    public static void main(String[] args) {
        List<SinhVien> danhSachSinhVien = new ArrayList<>();
     
        danhSachSinhVien.add(new SinhVien("SV001", "Nguyen Van A", "01/01/2000", 8.5));
        danhSachSinhVien.add(new SinhVien("SV002", "Tran Thi B", "02/02/2000", 9.0));
        danhSachSinhVien.add(new SinhVien("SV003", "Le Van C", "03/03/2000", 7.0));

        
        danhSachSinhVien.sort((s1, s2) -> Double.compare(s2.getDiemTrungBinh(), s1.getDiemTrungBinh()));

    
        for (SinhVien sv : danhSachSinhVien) {
            sv.inThongTin();
            System.out.println("--");
        }
    }
}
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        // Nhập thông tin tài khoản
        System.out.print("Nhập số tài khoản: ");
        String soTaiKhoan = scanner.nextLine();

        System.out.print("Nhập chủ tài khoản: ");
        String chuTaiKhoan = scanner.nextLine();

        System.out.print("Nhập số dư ban đầu: ");
        double soDu = scanner.nextDouble();

        // Tạo đối tượng TaiKhoan
        TaiKhoan taiKhoan = new TaiKhoan(soTaiKhoan, chuTaiKhoan, soDu);

        // Hiển thị thông tin tài khoản
        taiKhoan.hienThiThongTin();

        // Gửi tiền
        System.out.print("Nhập số tiền cần gửi: ");
        double soTienGui = scanner.nextDouble();
        taiKhoan.guiTien(soTienGui);

        // Rút tiền
        System.out.print("Nhập số tiền cần rút: ");
        double soTienRut = scanner.nextDouble();
        taiKhoan.rutTien(soTienRut);

        // Kiểm tra số dư
        System.out.println("Số dư hiện tại: " + taiKhoan.kiemTraSoDu());

        // Đóng scanner
        scanner.close();
    }
}
class TaiKhoan {
    // Thuộc tính
    private String soTaiKhoan;
    private String chuTaiKhoan;
    private double soDu;

    // Constructor
    public TaiKhoan(String soTaiKhoan, String chuTaiKhoan, double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.chuTaiKhoan = chuTaiKhoan;
        this.soDu = soDu;
    }

    // Phương thức gửi tiền
    public void guiTien(double soTien) {
        if (soTien > 0) {
            soDu += soTien;
            System.out.println("Gửi tiền thành công: " + soTien);
        } else {
            System.out.println("Số tiền gửi không hợp lệ.");
        }
    }

    // Phương thức rút tiền
    public void rutTien(double soTien) {
        if (soTien > 0 && soTien <= soDu) {
            soDu -= soTien;
            System.out.println("Rút tiền thành công: " + soTien);
        } else {
            System.out.println("Số tiền rút không hợp lệ hoặc vượt quá số dư.");
        }
    }

    // Phương thức kiểm tra số dư
    public double kiemTraSoDu() {
        return soDu;
    }

    // Phương thức hiển thị thông tin tài khoản
    public void hienThiThongTin() {
        System.out.println("Số tài khoản: " + soTaiKhoan);
        System.out.println("Chủ tài khoản: " + chuTaiKhoan);
        System.out.println("Số dư: " + soDu);
    }
}
