package dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Database {
        private static ArrayList<Model> sanPham = new ArrayList<>();

        public static ArrayList<Model> getData() throws ParseException {

                sanPham.add(new ThucPham("TP", "TP01", "Ga luoc", 15, 150000,
                                new SimpleDateFormat("dd/MM/yyyy").parse("20/11/2021"), "TP che bien"));
                sanPham.add(new ThucPham("TP", "TP02", "Vit quay Bac Kinh", 10, 185000,
                                new SimpleDateFormat("dd/MM/yyyy").parse("20/12/2021"), "TP che bien"));
                sanPham.add(new ThucPham("TP", "TP03", "Suon heo nuong", 20, 190000,
                                new SimpleDateFormat("dd/MM/yyyy").parse("20/10/2020"), "TP che bien"));
                sanPham.add(new ThucPham("TP", "TP04", "Ca rot", 100, 30000,
                                new SimpleDateFormat("dd/MM/yyyy").parse("21/10/2020"), "Rau cu qua"));
                sanPham.add(new ThucPham("TP", "TP05", "Xoai cat", 30, 45000,
                                new SimpleDateFormat("dd/MM/yyyy").parse("21/10/2020"), "Rau cu qua"));
                sanPham.add(new ThucPham("TP", "TP06", "Suon non heo", 25, 50000,
                                new SimpleDateFormat("dd/MM/yyyy").parse("20/10/2020"), "TP tuoi song"));
                sanPham.add(new ThucPham("TP", "TP07", "Bap bo Uc", 10, 250000,
                                new SimpleDateFormat("dd/MM/yyyy").parse("20/10/2020"), "TP tuoi song"));
                sanPham.add(new ThucPham("TP", "TP20", "Dui cuu", 10, 310000,
                                new SimpleDateFormat("dd/MM/yyyy").parse("20/10/2020"), "TP tuoi song"));


                sanPham.add(new SanhSu("SS", "SS08", "Bo 10 chen sanh loai 1", 19, 250000,
                                new SimpleDateFormat("dd/MM/yyyy").parse("20/10/2009"), "Nha bep"));
                sanPham.add(new SanhSu("SS", "SS09", "Chen gom loại 1", 100, 200000,
                                new SimpleDateFormat("dd/MM/yyyy").parse("20/10/2021"), "Nha bep"));
                sanPham.add(new SanhSu("SS", "SS10", "Phat thu lien hoa", 10, 430000,
                                new SimpleDateFormat("dd/MM/yyyy").parse("20/10/2020"), "Trang tri"));
                sanPham.add(new SanhSu("SS", "SS11", "Binh luu ly pha le", 10, 600000,
                                new SimpleDateFormat("dd/MM/yyyy").parse("20/10/2019"), "Trang tri"));
                sanPham.add(new SanhSu("SS", "SS19", "10 dia sanh d=15 laoi 2", 10, 120000,
                                new SimpleDateFormat("dd/MM/yyyy").parse("20/10/2019"), "Nha bep"));

                                
                sanPham.add(new DienMay("DM", "DM12", "Iphone 13 pro max 512Gb Blue ", 30, 45000000,
                                new SimpleDateFormat("dd/MM/yyyy").parse("23/01/2021"), "Dien tu"));
                sanPham.add(new DienMay("DM", "DM13", "Google Pixel 6Pro", 10, 25000000,
                                new SimpleDateFormat("dd/MM/yyyy").parse("10/10/2021"), "Dien tu"));
                sanPham.add(new DienMay("DM", "DM14", "Máy lạnh Toshiba", 18, 7000000,
                                new SimpleDateFormat("dd/MM/yyyy").parse("10/10/2021"), "Dien lanh"));
                sanPham.add(new DienMay("DM", "DM15", "May giat Philip", 22, 8300000,
                                new SimpleDateFormat("dd/MM/yyyy").parse("10/10/2021"), "Dien lanh"));
                sanPham.add(new DienMay("DM", "DM16", "Tu Lanh Shap", 17, 6000000,
                                new SimpleDateFormat("dd/MM/yyyy").parse("10/10/2021"), "Dien lanh"));
                sanPham.add(new DienMay("DM", "DM17", "Laptop Dell", 15, 22000000,
                                new SimpleDateFormat("dd/MM/yyyy").parse("10/10/2021"), "Dien tu"));
                sanPham.add(new DienMay("DM", "DM18", "Dong ho Casio", 7, 900000,
                                new SimpleDateFormat("dd/MM/yyyy").parse("10/10/2021"), "Dien tu"));

                

                return sanPham;
        }

}
