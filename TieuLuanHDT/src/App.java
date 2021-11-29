import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import controller.EventListener;
import controller.HandleEvent;
import dao.Database;

public class App {

    private static String cas;

    public static void main(String[] args) throws Exception {
        EventListener listener = new HandleEvent();

        listener.setData(Database.getData());
        Scanner input = new Scanner(System.in);
        showCase(input);

        switch (cas) {
        case "1": {
            System.out.println("Loai hang hoa:");
            String loaHangHoa = input.nextLine();
            System.out.println("Ma so:");
            String maHangHoa = input.nextLine();
            System.out.println("Ten:");
            String tenHangHoa = input.nextLine();
            System.out.println("So luong:");
            int soHangHoaTonKho = input.nextInt();
            System.out.println("Gia nhap:");
            int giaNhapHangHoa = input.nextInt();
            System.out.println("ngay dd/mm/yyyy:");
            input.nextLine();
            String ngayHangHoaNhapKho = input.nextLine();
            System.out.println("Loai(Loai TP, Loai SS, Nhan hieu DM):");
            String loai = input.nextLine();
            listener.them(loaHangHoa, maHangHoa, tenHangHoa, soHangHoaTonKho, giaNhapHangHoa,
                    new SimpleDateFormat("dd/MM/yyyy").parse(ngayHangHoaNhapKho), loai);
            break;
        }
        case "2": {
            System.out.println("Ma so:");
            String maSo = input.nextLine();

            listener.xoa(maSo);
        }
            break;
        case "3": {
            System.out.println("Ma so can sua:");
            String maHangHoa = input.nextLine();
            listener.showEachData(maHangHoa);

            System.out.println("Ten hang hoa moi:");
            String tenHangHoa = input.nextLine();
            System.out.println("So luong:");
            int soHangHoaTonKho = input.nextInt();
            System.out.println("Gia:");
            int giaNhapHangHoa = input.nextInt();
            System.out.println("Ngay:");
            String ngayHangHoaNhapKho = input.nextLine();
            Date formatter = new SimpleDateFormat("dd/MM/yyyy").parse(ngayHangHoaNhapKho);
            listener.sua(tenHangHoa, soHangHoaTonKho, giaNhapHangHoa, formatter);
        }
            break;
        case "4": {
            System.out.println("1: Tim kiem theo loai; 2: Tim kiem theo ngay nhap; 3: Khoang gia can tim:");
            String timKiem = input.nextLine();
            switch (timKiem) {
            case "1": {
                System.out.println("Loai hang hoa can tim:");
                String loaiHangHoa = input.nextLine();

                listener.timKiemLoaiHangHoa(loaiHangHoa);
            }
                break;
            case "2": {
                System.out.println("Ngay bat dau dd/mm/yyyy:");
                String ngayBatDau = input.nextLine();
                System.out.println("Ngay ket thuc dd/mm/yyyy:");
                String ngayKetThuc = input.nextLine();
                listener.timKiemNgay(new SimpleDateFormat("dd/MM/yyyy").parse(ngayBatDau),new SimpleDateFormat("dd/MM/yyyy").parse(ngayKetThuc));
            }
                break;
            case "3": {
                System.out.println("Gia bat dau:");
                int giaBatDau = input.nextInt();
                System.out.println("Gia ket thuc:");
                int giaKetThuc = input.nextInt();

                listener.timKiemKhoangGia(giaBatDau, giaKetThuc);
            }
                break;
            }
        }
            break;
        case "5": {
            System.out.println("1: Sap xep theo gia nhap; 2: Sap xep theo ngay nhap:");
            String sapXep = input.nextLine();
            switch (sapXep) {
            case "1": {
                System.out.println("1: Sap xep tang dan; 2: Sap xep theo giam dan:");
                int aBoolean = input.nextInt();
                if (aBoolean == 1) {
                    listener.sapXepTheoGia(true);
                } else if (aBoolean == 2) {
                    listener.sapXepTheoGia(false);
                }
            }
                break;
            case "2": {
                System.out.println("1: Sap xep tang dan; 2: Sap xep theo giam dan:");
                int aBoolean = input.nextInt();
                if (aBoolean == 1) {
                    listener.sapXepTheoNgay(true);
                } else if (aBoolean == 2) {
                    listener.sapXepTheoNgay(false);
                }
            }
                break;
            }
        }
            break;
        case "6": {
            System.out.println(
                    "1:Thong ke tong so luong hang hoa; 2: Thong ke tong gia tri nhap kho; 3: Thong ke so luong tung loai hang:");
            int thongKe = input.nextInt();
            if (thongKe > 0 && thongKe < 4) {
                switch (thongKe) {
                case 1: {
                    listener.thongKeTongSoLuongHangHoa();
                }
                    break;
                case 2: {
                    listener.thongKeGiaTriNhapKho();
                }
                    break;
                case 3: {
                    listener.thongKeSoLuongTungLoaiHang();
                }
                }
            }

        }
        }

    }

    private static void showCase(Scanner input) {

        System.out.print("Menu:\n1: Them; 2: Xoa; 3: Sua; 4: Tim kiem; 5: Sap xep; 6: Thong Ke: \nMoi ban nhap: ");
        cas = input.nextLine();
    }
}
