package dao;

import java.util.Date;

public class DienMay extends Model {
    private String nhanHieu = "";

    public String getNhanHieu() {
        return nhanHieu;
    }

    public void setnhanHieu(String nhanHieu) {
        this.nhanHieu = nhanHieu;
    }

    public DienMay(String loaHangHoa, String maHangHoa, String tenHangHoa, int soHangHoaTonKho, int giaNhapHangHoa,
            Date ngayHangHoaNhapKho, String nhanHieu) {
        super(loaHangHoa, maHangHoa, tenHangHoa, soHangHoaTonKho, giaNhapHangHoa, ngayHangHoaNhapKho);
        this.nhanHieu = nhanHieu;
    }

    @Override
    public String toString() {
        return super.toString() + " Nhan hieu: " + this.nhanHieu;
    }
}