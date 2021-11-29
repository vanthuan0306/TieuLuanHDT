package dao;

import java.util.Date;

public class SanhSu extends Model {
    private String loaiSS = "";

    public String getloaiSS() {
        return loaiSS;
    }

    public void setloaiSS(String loaiSS) {
        this.loaiSS = loaiSS;
    }

    public SanhSu(String loaHangHoa, String maHangHoa, String tenHangHoa, int soHangHoaTonKho, int giaNhapHangHoa,
            Date ngayHangHoaNhapKho, String loaiSS) {
        super(loaHangHoa, maHangHoa, tenHangHoa, soHangHoaTonKho, giaNhapHangHoa, ngayHangHoaNhapKho);
        this.loaiSS = loaiSS;
    }

    @Override
    public String toString() {
        return super.toString() + " Loai sanh su: " + this.loaiSS;
    }
}