package dao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Model {
    private String loaiHangHoa = "";
    private String maHangHoa = "";
    private String tenHangHoa = "";
    private int soHangHoaTonKho = 0;
    private int giaNhapHangHoa = 0;
    private Date ngayHangHoaNhapKho;

    public Model(String loaHangHoa, String maHangHoa, String tenHangHoa, int soHangHoaTonKho, int giaNhapHangHoa,
            Date ngayHangHoaNhapKho) {
        this.loaiHangHoa = loaHangHoa;
        this.maHangHoa = maHangHoa;
        this.tenHangHoa = tenHangHoa;
        this.soHangHoaTonKho = soHangHoaTonKho;
        this.giaNhapHangHoa = giaNhapHangHoa;
        this.ngayHangHoaNhapKho = ngayHangHoaNhapKho;
    }

    public Model() {
    }

    public void setMaHangHoa(String maHangHoa) {
        if (maHangHoa == null || maHangHoa.isEmpty()) {
            System.out.println("Ma hang hoa khong hop le");
            return;
        }
        this.maHangHoa = maHangHoa;
    }

    public void setTenHangHoa(String tenHangHoa) {
        if (tenHangHoa == null || tenHangHoa.isEmpty()) {
            System.out.println("Ten hang hoa khong hop le");
            return;
        }
        this.tenHangHoa = tenHangHoa;
    }

    public void setSoHangHoaTonKho(int soHangHoaTonKho) {
        if (soHangHoaTonKho < 0) {
            System.out.println("So luong hang hoa khong nho hon 0.");
            return;
        }
        this.soHangHoaTonKho = soHangHoaTonKho;
    }

    public void setGiaNhapHangHoa(int giaNhapHangHoa) {
        if (giaNhapHangHoa < 0) {
            System.out.println("Gia hang hoa khong nho hon 0.");
            return;
        }
        this.giaNhapHangHoa = giaNhapHangHoa;
    }

    public void setNgayHangHoaNhapKho(Date ngayHangHoaNhapKho) {
        Date now = new Date();
        if (ngayHangHoaNhapKho.getTime() > now.getTime() || ngayHangHoaNhapKho == null) {
            System.out.println("Ngay nhap khong hop le.");
            return;
        }

        this.ngayHangHoaNhapKho = ngayHangHoaNhapKho;
    }

    public void setLoaiHangHoa(String loaiHangHoa) {
        this.loaiHangHoa = loaiHangHoa;
    }

    public String getLoaiHangHoa() {
        return loaiHangHoa;
    }

    public String getMaHangHoa() {
        return maHangHoa;
    }

    public String getTenHangHoa() {
        return tenHangHoa;
    }

    public int getSoHangHoaTonKho() {
        return soHangHoaTonKho;
    }

    public int getGiaNhapHangHoa() {
        return giaNhapHangHoa;
    }

    public Date getNgayHangHoaNhapKho() {
        return ngayHangHoaNhapKho;
    }

    @Override
    public String toString() {
        return "SanPham=> Loai hang hoa: " + loaiHangHoa + " Ma hang hoa: " + maHangHoa + " Ten hang hoa: " + tenHangHoa
                + " So hang hoa ton kho:" + soHangHoaTonKho + " Gia nhap hang hoa: " + giaNhapHangHoa
                + " Ngay nhap hang hoa: " + new SimpleDateFormat("dd/MM/yyyy").format(ngayHangHoaNhapKho);
    }
}
