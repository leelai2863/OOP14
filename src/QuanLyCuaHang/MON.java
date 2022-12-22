package QuanLyCuaHang;

import java.util.Scanner;

public class MON {
	public static MON mon;
	String tenMon;
	int gia;
	String dvt;
	int soluong;
	public MON() {
		soluong = 1;
	}
	
	public MON(String tM, int g, String DVT, int soluong) {
		tenMon = tM;
		gia = g;
		dvt = DVT;
		this.soluong = soluong;
	}
	public String getTenMon() {
		return tenMon;
	}
	public int getGia() {
		return gia*soluong;
	}
	public String getDvt() {
		return dvt;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setTenMon(String tenMon) {
		this.tenMon = tenMon;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	public void setDvt(String dvt) {
		this.dvt = dvt;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public MON getQuay() {
		int soLuong=getSoluong();
		return new MON("quẩy", 5000, "cái", soLuong);
	}
	public MON getTiet() {
		int soLuong=getSoluong();
		return new MON("tiết", 10000, "cái", soLuong);
	}
	public MON getHotGa() {
		int soLuong=getSoluong();
		return new MON("hột gà", 5000, "cái", soLuong);
	}
	public MON getBanhPhoThem() {
		int soLuong=getSoluong();
		return new MON("bánh phở thêm", 10000, "phần thêm", soLuong);
	}
	public MON getThitThem() {
		int soLuong=getSoluong();
		return new MON("thịt thêm", 25000, "chén", soLuong);
	}
	public int getSoLuong() {
		System.out.println("Nhap so luong: ");
		int soLuong= new Scanner(System.in).nextInt();
		return soLuong;
	}
	public MON getTietHotGa() {
		return new MON("quẩy", 5000, "cái", 1);
	}
	@Override
	public String toString() {
		return "\nMón [tên món=" + tenMon + ", giá=" + getGia() + ", dvt=" + dvt + ", số lượng="+ soluong + "]";
	}
	
}
