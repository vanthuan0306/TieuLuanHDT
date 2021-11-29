package dao;

import java.util.Date;

public class ThucPham extends Model {
    private String loaiThucPham = "";

    public String getLoaiThucPham() {
        return loaiThucPham;
    }

    public void setLoaiThucPham(String loaiThucPham) {
        this.loaiThucPham = loaiThucPham;
    }

    public ThucPham(String loaHangHoa, String maHangHoa, String tenHangHoa, int soHangHoaTonKho, int giaNhapHangHoa,
            Date ngayHangHoaNhapKho, String loaiThucPham) {
        super(loaHangHoa, maHangHoa, tenHangHoa, soHangHoaTonKho, giaNhapHangHoa, ngayHangHoaNhapKho);
        this.loaiThucPham = loaiThucPham;
    }

    @Override
    public String toString() {
        return super.toString() + " Loai thuc pham: " + this.loaiThucPham;
    }
}